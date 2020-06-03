package grandcircus.co.lab25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ApiController {
	
	@Autowired
	private WeatherApiService service;
	
	@RequestMapping("/")
	public String home(@RequestParam(required = false) String lat, @RequestParam(required = false) String lon, Model model) {
		if (lat == null || lon == null) {
			lat = "38";
			lon = "-83";
		}
		Data data = service.getData(lat, lon);
		Time time = service.getTime(lat, lon);
		List<String> days = time.getStartPeriodName();
		List<String> highTemps = data.getTemperature();
		List<DailyWeather> forecasts = new ArrayList<>();
		for (int i = 0; i < days.size(); i++) {
			DailyWeather weather = new DailyWeather(days.get(i), highTemps.get(i));
			forecasts.add(weather);
		}
		model.addAttribute("forecasts", forecasts);
	return "home";
	}
	public static class DailyWeather {
		private String day;
		private String highTemp;

		public DailyWeather(String day, String highTemp) {
			super();
			this.day = day;
			this.highTemp = highTemp;
		}

		public String getDay() {
			return day;
		}

		public void setDay(String day) {
			this.day = day;
		}

		public String getHighTemp() {
			return highTemp;
		}

		public void setHighTemp(String highTemp) {
			this.highTemp = highTemp;
		}

		@Override
		public String toString() {
			return "DailyWeather [day=" + day + ", highTemp=" + highTemp + "]";
		}

	}
	

}
