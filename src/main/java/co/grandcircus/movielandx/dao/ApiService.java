package co.grandcircus.movieland.dao;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component // <- identify this as an autowirable Spring bean
	public class ApiService {

		private RestTemplate restTemplate;
		
		// This is an instance initialization block. It runs when a new instance of the class is created--
		// right before the constructor.
		{
		    // This configures the restTemplateWithUserAgent to include a User-Agent header with every HTTP
			// request. Some of the APIs in this demo have a bug where User-Agent is required.
			ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
		        request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
		        return execution.execute(request, body);
		    };
		    restTemplate = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
		}
		
//		public List<Card> draw2() {
//			// 1. Select the API endpoint URL
//			String deckId = "y4reyem569oy";
//			int count = 2;
//			String url = "https://deckofcardsapi.com/api/deck/" + deckId + "/draw/?count=" + count;
//			
//			// 2. Get the entire response from the API.
//			CardsResponse response = restTemplate.getForObject(url, CardsResponse.class);
//			
//			// 3. Optionally dig into the response and return only the part you need.
//			return response.getCards();
//		}


}
