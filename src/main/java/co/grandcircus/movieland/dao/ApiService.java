package co.grandcircus.movieland.dao;

import java.util.List;

import javax.tools.JavaFileObject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.movieland.entities.Genre;
import co.grandcircus.movieland.entities.Movie;
import co.grandcircus.movieland.entities.Result;

@Component
public class ApiService {

	private RestTemplate restTemplate;
	@Value("${movieDB.API_KEY}")
	private String API_KEY;
	private String runtimeGT = "&with_runtime.gte=";
	private String runtimeLT = "&with_runtime.lte=";


	{
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
			request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
			return execution.execute(request, body);
		};
		restTemplate = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}

	
	public String getMovieById(Long id) {
		String url = "https://api.themoviedb.org/3/movie/" + id + "?api_key=" + API_KEY;
		Movie response = restTemplate.getForObject(url, Movie.class);
		return response.getTitle();
	}
	

	public List<Movie> getMovieList(int page, int year) {
		String url = "https://api.themoviedb.org/3/discover/movie?api_key=8a74085b81c83cc34680aeef8529213a&language=en-US&sort_by=popularity.desc&include_adult=false&include_video=false&page=" + page + "&primary_release_year=" + year;
		Result results = restTemplate.getForObject(url, Result.class);
		return results.getResults();
	}
	
	public List<Movie> getRTGT(int page, int runtime) {
		String url = "https://api.themoviedb.org/3/discover/movie?api_key=8a74085b81c83cc34680aeef8529213a&language=en-US&sort_by=popularity.desc&include_adult=false&include_video=false&page=" + page + runtimeGT + runtime;
		Result results = restTemplate.getForObject(url, Result.class);
		return results.getResults();
	}
	
//	///add runtime param field search
//	public List<Movie> getMovieList(int page, int length) {
//		String url = "https://api.themoviedb.org/3/discover/movie?api_key=8a74085b81c83cc34680aeef8529213a&language=en-US&sort_by=popularity.desc&include_adult=false&include_video=false&page=" + page + "&primary_release_year=" + year;
//		Result results = restTemplate.getForObject(url, Result.class);
//		return results.getResults();
//	}
	
	
	public Movie movieDetail(int id) {
		String url = "https://api.themoviedb.org/3/movie/" + id + "?api_key=" + API_KEY + "&language=en-US";
		Movie movie = restTemplate.getForObject(url, Movie.class);
		System.out.println(movie);
		return movie;
	}
	
	public List<Movie> getTitle(String title){
		String url = "https://api.themoviedb.org/3/search/movie?api_key=" + API_KEY+"&language=en-US&query=" +title;
		Result result = restTemplate.getForObject(url, Result.class);
		return result.getResults();
	}

}
