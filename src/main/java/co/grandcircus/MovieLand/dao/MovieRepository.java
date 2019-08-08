package co.grandcircus.movieland.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.movieland.entities.Movie;




public interface MovieRepository extends JpaRepository<Movie, Long>{
	List<Movie> findByGenreContainsIgnoreCase(String genre);
	List<Movie> findByLength(Integer length);
	
}
