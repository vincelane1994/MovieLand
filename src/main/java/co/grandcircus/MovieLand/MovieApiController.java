package co.grandcircus.movieland;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.movieland.dao.MovieRepository;
import co.grandcircus.movieland.entities.Movie;

@RestController
public class MovieApiController {

	@Autowired
	MovieRepository dao;

//	@GetMapping("/")
//	public ModelAndView redirect() {
//		return new ModelAndView("redirect:/movies");
//	}
//	
//	GetMapping filterable by; length, genre and rating.
//	@GetMapping("/movies")
//	public List<Movie> listMovies(
//			@RequestParam(value="length", required=false)Integer length,
//			@RequestParam(value="genre", required=false)String genre,
//			@RequestParam(value="rating", required=false)Double rating){
//		
//	}
}
