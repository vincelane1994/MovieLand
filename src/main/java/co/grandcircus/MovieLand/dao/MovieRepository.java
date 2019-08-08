package co.grandcircus.movieland.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.movieland.entities.Movie;




public interface MovieRepository extends JpaRepository<Movie, Long>{

}
