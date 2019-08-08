package co.grandcircus.MovieLand.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.movieapi.entities.Movie;



public interface MovieRepository extends JpaRepository<Movie, Long>{

}
