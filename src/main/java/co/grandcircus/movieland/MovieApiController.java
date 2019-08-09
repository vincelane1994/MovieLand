package co.grandcircus.movieland;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.movieland.dao.ApiService;

@Controller
public class MovieApiController {


	@Autowired
	ApiService api;


//	@RequestMapping("/")
//	public ModelAndView index() {
//		System.out.println("Movie " + api.getMovieById(2343));
//		ModelAndView mv = new ModelAndView("index");
//		mv.addObject("movie", api.getMovieById(3242));
//		
//		return mv;
//	}
	
	@RequestMapping("/")
	public ModelAndView indexPost(){
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("movies", api.getMovieList(30));
		System.out.println(api.getMovieList(30));
		return mv;
	}
		
	
//	@RequestMapping("/title-search")
//	public ModelAndView index() {
//		System.out.println("Movie " + api.getMovieByTitle("Rocky"));
//		return new ModelAndView("title-search", "movie", api.getMovieByTitle("Rocky"));
//	}
}
