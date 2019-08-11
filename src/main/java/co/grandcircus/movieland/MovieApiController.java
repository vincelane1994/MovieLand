package co.grandcircus.movieland;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.movieland.entities.*;
import co.grandcircus.movieland.dao.ApiService;
import co.grandcircus.movieland.entities.Movie;

@Controller
public class MovieApiController {

	@Value("${movieDB.API_KEY}")
	private String API_KEY;
	private String runtimeGT = "&with_runtime.gte=";
	private String runtimeLT = "&with_runtime.lte=";
	private String releaseYear = "&primary_release_year=";
	private String listBase = "https://api.themoviedb.org/3/discover/movie?api_key=";
	private String listMiddle = "&language=en-US&sort_by=popularity.desc&include_adult=false&include_video=false&page=";
	private String titleBase = "https://api.themoviedb.org/3/search/movie?api_key=";
	private String titleMiddle = "&language=en-US&query=";
	private String detailBase = "https://api.themoviedb.org/3/movie/";
	private String detailMiddle = "?api_key=";
	private String detailEnd = "&language=en-US";

	@Autowired
	ApiService api;

	@RequestMapping("/index")
	public ModelAndView index() {
		return new ModelAndView("index");
	}

	@RequestMapping("/release-year")
	public ModelAndView releaseYear1(@RequestParam("year") int year) {
		List<Movie> bigList = new ArrayList<>();
		int pageSize = 30;
		ModelAndView mv = new ModelAndView("results");
		for (int counter = 1; counter < pageSize; counter++) {
			String url = listBase + API_KEY + listMiddle + counter + releaseYear + year;
			bigList.addAll(api.getMovieList(url));
		}
		mv.addObject("movies", bigList);
		System.out.println(bigList);
		mv.addObject("movies", bigList);
		return mv;
	}

	@RequestMapping("/runtime")
	public ModelAndView runtime(@RequestParam("lessThan") int lessThan, @RequestParam("greaterThan") int greaterThan) {
		List<Movie> bigList = new ArrayList<>();
		String url = "";
		if (lessThan > 0 && greaterThan > 0) {
			url += listBase + API_KEY + listMiddle + runtimeGT + greaterThan + runtimeLT + lessThan;
		} else if (lessThan > 0) {
			url += listBase + API_KEY + listMiddle + runtimeLT + lessThan;
		} else
			url += listBase + API_KEY + listMiddle + runtimeGT + greaterThan;
		int pageSize = 20;
		ModelAndView mv = new ModelAndView("results");
		for (int counter = 1; counter < pageSize; counter++) {
			bigList.addAll(api.getMovieList(url));
		}
		System.out.println(url);
		mv.addObject("movies", bigList);
		mv.addObject("movies", bigList);
		return mv;
	}

	@RequestMapping("/title")
	public ModelAndView listMovie(@RequestParam(value = "name", required = true) String title) {
		List<Movie> bigList = new ArrayList<>();
		ModelAndView mv = new ModelAndView("results");
		String url = titleBase + API_KEY + titleMiddle + title;
		bigList.addAll(api.getMovieList(url));
		System.out.println(url);
		mv.addObject("movies", bigList);
		return mv;
	}

	@RequestMapping("/detail")
	public ModelAndView movieDetail(@RequestParam("id") int id) {
		ModelAndView mv = new ModelAndView("detail");
		String url = detailBase + id + detailMiddle + API_KEY + detailEnd;
		System.out.println(url);
		mv.addObject("movies", api.movieDetail(id, url));
		return mv;
	}

}
