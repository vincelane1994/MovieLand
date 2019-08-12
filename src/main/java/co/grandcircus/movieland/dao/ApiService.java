package co.grandcircus.movieland.dao;

import java.util.List;
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

	{
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
			request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
			return execution.execute(request, body);
		};
		restTemplate = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}

	public List<Movie> getMovieList(String url) {
		Result results = restTemplate.getForObject(url, Result.class);
		return results.getResults();
	}

	public Movie movieDetail(int id, String url) {
		Movie movie = restTemplate.getForObject(url, Movie.class);
		System.out.println(movie);
		return movie;
	}
	public Movie movieDetail(Long id, String url) {
		Movie movie = restTemplate.getForObject(url, Movie.class);
		System.out.println(movie);
		return movie;
	}
}
