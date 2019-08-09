package co.grandcircus.movieland;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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


	@Autowired
	ApiService api;
	
	@RequestMapping("/release-year")
	public ModelAndView releaseYear() {
		List<Movie> bigList = new ArrayList<>();
		String string1 = "testing";
		int pageSize = 20;
		ModelAndView mv = new ModelAndView("release-year");
		for (int counter = 1; counter < pageSize; counter++) {
			bigList.addAll(api.getMovieList(counter, 2000));
		}
			mv.addObject("movies", bigList);
			System.out.println(bigList);
		mv.addObject("movies", bigList);
		return mv;
	}

	
	@RequestMapping("/movie")
	public ModelAndView listMovie(@RequestParam(value = "title", required = true) String title){
		ModelAndView mv = new ModelAndView ("title");
		mv.addObject("title", api.getTitle(title));
		
		return mv;
	}
		
	
	@RequestMapping("/movie/detail")
	public ModelAndView movieDetail(
			@RequestParam("id") int id) {
		ModelAndView mv = new ModelAndView("detail");
		mv.addObject("movies", api.movieDetail(id));
		return mv;

	}	

	

}
