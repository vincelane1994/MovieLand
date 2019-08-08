package co.grandcircus.movieland;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

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
//	GetMapping filterable by; find all, length, genre and rating.
//	@GetMapping("/movies")
//	public List<Movie> listMovies(
//			@RequestParam(value="length", required=false)Integer length,
//			@RequestParam(value="genre", required=false)String genre,
//			@RequestParam(value="rating", required=false)Double rating){
//		
//	}
	
//	GetMapping for the watchlist
//	@GetMapping("/watchlist")
//	public List<Movie> showWatchlist(){
//		
//	}
	
//	GetMapping to display details of an individual movie
//  @GetMapping("/details")
//	public Movie showMovieDetail(){
//	
//  }
	
//	PutMapping for adding to watchlist
//	@PutMapping("/watchlist-add")
//	public Movie addToWatchlist() {
//		
//	}

//	DeleteMapping to delete from watchlist
//	@DeleteMapping("/watchlist-delete")
//	public Movie removeFromWatchlist() {
//		
//	}
	
	
}
