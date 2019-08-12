package co.grandcircus.movieland.dao;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.movieland.entities.Movie;




public interface MovieRepository extends JpaRepository<Movie, Long>{
	void deleteByMovieId(Long movieId);
}
