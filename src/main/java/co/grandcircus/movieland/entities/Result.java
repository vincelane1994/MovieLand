package co.grandcircus.movieland.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Result {
	
	private Integer page;
	private List<Movie> results;
	private Integer totalResults;
	private Integer totalPages;
	private Movie result;

	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public List<Movie> getResults() {
		return results;
	}
	public Movie getResult() {
		return result;
	}
	public void setResults(List<Movie> results) {
		this.results = results;
	}
	public Integer getTotalResults() {
		return totalResults;
	}
	public void setTotalResults(Integer totalResults) {
		this.totalResults = totalResults;
	}
	public Integer getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}
	@Override
	public String toString() {
		return "Result [page=" + page + ", results=" + results + ", totalResults=" + totalResults + ", totalPages="
				+ totalPages + "]";
	}

	
	
}
