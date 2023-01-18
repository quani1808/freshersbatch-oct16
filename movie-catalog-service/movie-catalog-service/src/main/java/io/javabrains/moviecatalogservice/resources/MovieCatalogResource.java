package io.javabrains.moviecatalogservice.resources;

import java.util.Arrays;
import java.util.Collections;
//import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.netflix.discovery.DiscoveryClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import io.javabrains.moviecatalogservice.models.CatalogItem;
import io.javabrains.moviecatalogservice.models.Movie;
import io.javabrains.moviecatalogservice.models.Rating;
import io.javabrains.moviecatalogservice.models.UserRating;
import io.javabrains.moviecatalogservice.services.MovieInfo;
import io.javabrains.moviecatalogservice.services.UserRatingInfo;

@RestController  
@RequestMapping("/catalog")
public class MovieCatalogResource {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	MovieInfo movieInfo;
	
	@Autowired
	UserRatingInfo userRatingInfo;
	
	//private DiscoveryClient discoveryClient;
	
	//@Autowired
	//private WebClient.Builder webClientBuilder;
	
	@RequestMapping("/{userId}")
	//@HystrixCommand(fallbackMethod="getFallbackCatalog")
	public List<CatalogItem> getCatalog(@PathVariable("userId")String userId) 
	{
		//WebClient.Builder builder = WebClient.builder();
		//RestTemplate restTemplate = new RestTemplate();
		
		/*List<Rating> ratings= Arrays.asList(
				new Rating("1234",4),
				new Rating("5678",4)
		);*/
		//List<Rating> 
		//UserRating userRatings = restTemplate.getForObject("http://ratings-data-service/ratingsdata/users/"+userId,UserRating.class);
		//UserRating userRating = getUserRating(userId);
		

		   //return ratings.getUserRating().stream().map(rating -> {
			 //for each movie id,call movie info service and get details
		
		
		UserRating userRating =userRatingInfo. getUserRating(userId);
		return userRating.getUserRating().stream()
				.map(rating ->movieInfo. getCatalogItem(rating))
				.collect(Collectors.toList());
	
		
			/*Movie movie = webClientBuilder.build() //webClient
			.get() //RequestHeadersUrispec<capture of ?>
			.uri("http://localhost:2020/movies/" + rating.getMovieId()) //capture of ?>
			.retrieve() //ResponseSpec
			.bodyToMono(Movie.class)//Mono<movie>
			.block();
			*/
			
			//put them all together
			//return new CatalogItem(movie.getName() ,"Desc",rating.getRating());
		/*.collect(Collectors.toList());
				}*/
	
		/*return Collections.singletonList(
				new CatalogItem("Transformes","Test",4)
				);*/
		
	}
	 
	

}
