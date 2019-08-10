package co.grandcircus.movieland.entities;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class MovieDetails {

	private String posterPath;
	private Boolean adult;
	private String overview;
	private String releaseDate;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String originalTitle;
	private String originalLanguage;
	private String title;
	private String backdropPath;
	private Double popularity;
	private Long voteCount;
	private Boolean video;
	private Double voteAverage;
	private String tagline;
	private String status;
	private Integer revenue;
	private Integer runtime;
	private Integer budget;
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
	public String getTagline() {
		return tagline;
	}
	public void setTagline(String tagline) {
		this.tagline = tagline;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getRevenue() {
		return revenue;
	}
	public void setRevenue(Integer revenue) {
		this.revenue = revenue;
	}
	public Integer getRuntime() {
		return runtime;
	}
	public void setRuntime(Integer runtime) {
		this.runtime = runtime;
	}
	public Integer getBudget() {
		return budget;
	}
	public void setBudget(Integer budget) {
		this.budget = budget;
	}
	@Override
	public String toString() {
		return "MovieDetails [posterPath=" + posterPath + ", adult=" + adult + ", overview=" + overview
				+ ", releaseDate=" + releaseDate + ", id=" + id + ", originalTitle=" + originalTitle
				+ ", originalLanguage=" + originalLanguage + ", title=" + title + ", backdropPath=" + backdropPath
				+ ", popularity=" + popularity + ", voteCount=" + voteCount + ", video=" + video + ", voteAverage="
				+ voteAverage + ", tagline=" + tagline + ", status=" + status + ", revenue=" + revenue + ", runtime="
				+ runtime + ", budget=" + budget + "]";
	}
	
}