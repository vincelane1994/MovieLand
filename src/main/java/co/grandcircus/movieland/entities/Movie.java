package co.grandcircus.movieland.entities;

import java.text.NumberFormat;

import java.util.Arrays;
import java.util.List;
import java.util.Arrays;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "movies")
public class Movie {

	@JsonProperty("poster_path")

	private String posterPath;
	private Boolean adult;
	private String overview;
	@JsonProperty("release_date")
	private String releaseDate;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long movieId;
	@JsonProperty("original_title")
	private String originalTitle;
	@JsonProperty("original_language")
	private String originalLanguage;
	private String title;
	@JsonProperty("backdrop_path")
	private String backdropPath;
	private Double popularity;
	@JsonProperty("vote_count")
	private Long voteCount;
	private Boolean video;
	@JsonProperty("vote_average")
	private Double voteAverage;
	private Integer runtime;
	private String revenue;
	private String homepage;
	private String budget;
	private Long id;
	
	
	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public Movie(String posterPath, Boolean adult, String overview, String releaseDate, Long id, String originalTitle,
			String originalLanguage, String title, String backdropPath, Double popularity, Long voteCount,
			Boolean video, Double voteAverage, Integer runtime, String revenue, String homepage, String budget) {
		super();
		this.posterPath = posterPath;
		this.adult = adult;
		this.overview = overview;
		this.releaseDate = releaseDate;
		this.id = id;
		this.originalTitle = originalTitle;
		this.originalLanguage = originalLanguage;
		this.title = title;
		this.backdropPath = backdropPath;
		this.popularity = popularity;
		this.voteCount = voteCount;
		this.video = video;
		this.voteAverage = voteAverage;
		this.runtime = runtime;
		this.revenue = revenue;
		this.homepage = homepage;
		this.budget = budget;
	}
	
	public Movie() {};
	public String getPosterPath() {
		return posterPath;
	}
	public void setPosterPath(String posterPath) {
		this.posterPath = posterPath;
	}
	public Boolean getAdult() {
		return adult;
	}
	public void setAdult(Boolean adult) {
		this.adult = adult;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOriginalTitle() {
		return originalTitle;
	}
	public void setOriginalTitle(String originalTitle) {
		this.originalTitle = originalTitle;
	}
	public String getOriginalLanguage() {
		return originalLanguage;
	}
	public void setOriginalLanguage(String originalLanguage) {
		this.originalLanguage = originalLanguage;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBackdropPath() {
		return backdropPath;
	}
	public void setBackdropPath(String backdropPath) {
		this.backdropPath = backdropPath;
	}
	public Double getPopularity() {
		return popularity;
	}
	public void setPopularity(Double popularity) {
		this.popularity = popularity;
	}
	public Long getVoteCount() {
		return voteCount;
	}
	public void setVoteCount(Long voteCount) {
		this.voteCount = voteCount;
	}
	public Boolean getVideo() {
		return video;
	}
	public void setVideo(Boolean video) {
		this.video = video;
	}
	public Double getVoteAverage() {
		return voteAverage;
	}
	public void setVoteAverage(Double voteAverage) {
		this.voteAverage = voteAverage;
	}
	public Integer getRuntime() {
		return runtime;
	}
	public void setRuntime(Integer runtime) {
		this.runtime = runtime;
	}
	public String getRevenue() {
		return revenue;
	}
	public void setRevenue(String revenue) {
		this.revenue = revenue;
	}
	public String getHomepage() {
		return homepage;
	}
	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}
	public String getBudget() {
		return budget;
	}
	public void setBudget(String budget) {
		this.budget = budget;
	}
	@Override
	public String toString() {
		return "Movie [posterPath=" + posterPath + ", adult=" + adult + ", overview=" + overview + ", releaseDate="
				+ releaseDate + ", id=" + id + ", originalTitle=" + originalTitle + ", originalLanguage="
				+ originalLanguage + ", title=" + title + ", backdropPath=" + backdropPath + ", popularity="
				+ popularity + ", voteCount=" + voteCount + ", video=" + video + ", voteAverage=" + voteAverage
				+ ", runtime=" + runtime + ", revenue=" + revenue + ", homepage=" + homepage + ", budget=" + budget
				+ "]";
	}

}