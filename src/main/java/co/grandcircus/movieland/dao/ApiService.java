package co.grandcircus.movieland.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.movieland.entities.Movie;
import co.grandcircus.movieland.entities.Result;

@Component
public class ApiService {

	private RestTemplate restTemplate;
	@Value("${movieDB.API_KEY}")
	private String API_KEY;

	{
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
			request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
			return execution.execute(request, body);
		};
		restTemplate = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}

//	public List<Movie> getMovies() {
//		String url = "https://api.themoviedb.org/3/movie?api_key=" + API_KEY;
//		Result response = restTemplate.getForObject(url, Result.class);
//		return response.getResults();
//	}
	
	public String getMovieById(Long id) {
		String url = "https://api.themoviedb.org/3/movie/" + id + "?api_key=" + API_KEY;
	
		Movie response = restTemplate.getForObject(url, Movie.class);
		return response.getTitle();
	}
	
	public List<Movie> getMovieList() {
		String url = "https://api.themoviedb.org/3/discover/movie?api_key=" + API_KEY + "&page=200";
		Result results = restTemplate.getForObject(url, Result.class);
		return results.getResults();
	}

}
