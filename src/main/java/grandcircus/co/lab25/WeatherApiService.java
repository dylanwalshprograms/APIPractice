package grandcircus.co.lab25;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherApiService {
	private RestTemplate rest = new RestTemplate();
	
	public Data getData(String lat, String lon) {
			
			String url = "https://forecast.weather.gov/MapClick.php?lat={lat}&lon={lon}&FcstType=json";
			WeatherResponse response = rest.getForObject(url, WeatherResponse.class, lat, lon);
			return response.getData();
	}
	public Time getTime(String lat, String lon) {
		String url = "https://forecast.weather.gov/MapClick.php?lat={lat}&lon={lon}&FcstType=json";
		WeatherResponse response = rest.getForObject(url, WeatherResponse.class, lat, lon);
		return response.getTime();
		
	}

}
