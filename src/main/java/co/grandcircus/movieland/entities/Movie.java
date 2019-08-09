package co.grandcircus.movieland.entities;

import java.text.NumberFormat;


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
	private Long id;
	@JsonProperty("original_title")
	private String originalTitle;
	@JsonProperty("original_language")
	private String originalLanguage;
	private Genre[] genres;
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
	


	public String getBudget() {
		return budget;
	}

	public void setBudget(String budget) {
		this.budget = budget;
	}

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public String getRevenue() {
		return revenue;
	}

	public void setRevenue(int revenue) {
		NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
		this.revenue = defaultFormat.format(revenue);
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

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

	public Genre[] getGenres() {
		return genres;
	}

	public void setGenres(Genre[] genres) {
		this.genres = genres;
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

	@Override
	public String toString() {
		return "Movie [posterPath=" + posterPath + ", adult=" + adult + ", overview=" + overview + ", releaseDate="
				+ releaseDate + ", id=" + id + ", originalTitle=" + originalTitle + ", originalLanguage="
				+ originalLanguage + ", genres=" + Arrays.toString(genres) + ", title=" + title + ", backdropPath="
				+ backdropPath + ", popularity=" + popularity + ", voteCount=" + voteCount + "]";
	}

}