package co.grandcircus.movieland;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MovieApiController {


	@Autowired
	ApiService api;


	@RequestMapping("/")
	public ModelAndView index() {
		System.out.println("Movie " + api.getMovieByTitle("Rocky"));
		return new ModelAndView("index", "movie", api.getMovieByTitle("Rocky"));
	}
	
}
