package co.grandcircus.movieland.entities;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class MovieDetails {


	@Entity
	@Table(name="movies")
	public class Movie implements Serializable{
		
		private static final long serialVersionUID = 1L;
		
		private String posterPath;
		private Boolean adult;
		private String overview;
		private String releaseDate;
		private Integer[] genreIds;
		@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
		private String originalTitle;
		private String originalLanguage;
		private String title;
		private String backdropPath;
		private Double popularity;
		private Long voteCount;
		private Boolean video;
		private Double voteAverage;
}
}
