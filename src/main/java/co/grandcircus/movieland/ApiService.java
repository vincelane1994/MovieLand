package co.grandcircus.movieland;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.movieland.entities.Movie;

@Component
public class ApiService {

	private RestTemplate restTemplate;
//	@Value("${movieDB.API_KEY}")
//	private String API_KEY;
	private String API_KEY = "8a74085b81c83cc34680aeef8529213a";

	{
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
			request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
			return execution.execute(request, body);
		};
		restTemplate = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}

	public String getMovieByTitle(String title) {
		String url = "https://api.themoviedb.org/3/movie/76340?api_key=" + API_KEY + "&query=" + title;
	
		Movie response = restTemplate.getForObject(url, Movie.class);
		return response.getTitle();
	}
	
//	public List<Movie> getTopRated() {
//		String url = "https://api.themoviedb.org/3/movie/top_rated?api_key=" + API_KEY + "&language=en-US&page=1";
//		Movie response = restTemplate.getForObject(url, Movie.class);
//		return response;
//	}

}
