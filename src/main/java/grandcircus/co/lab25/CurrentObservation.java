package grandcircus.co.lab25;

public class CurrentObservation {
	
	private String id;
	private String name;
	private String elev;
	private String latitude;
	private String longitude;
	private String Date;
	private String Temp;
	private String Dewp;
	private String Relh;
	private String Winds;
	private String Weather;
	private String Weatherimage;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getElev() {
		return elev;
	}
	public void setElev(String elev) {
		this.elev = elev;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getTemp() {
		return Temp;
	}
	public void setTemp(String temp) {
		Temp = temp;
	}
	public String getDewp() {
		return Dewp;
	}
	public void setDewp(String dewp) {
		Dewp = dewp;
	}
	public String getRelh() {
		return Relh;
	}
	public void setRelh(String relh) {
		Relh = relh;
	}
	public String getWinds() {
		return Winds;
	}
	public void setWinds(String winds) {
		Winds = winds;
	}
	public String getWeather() {
		return Weather;
	}
	public void setWeather(String weather) {
		Weather = weather;
	}
	public String getWeatherimage() {
		return Weatherimage;
	}
	public void setWeatherimage(String weatherimage) {
		Weatherimage = weatherimage;
	}

	@Override
	public String toString() {
		return "CurrentObservation [id=" + id + ", name=" + name + ", elev=" + elev + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", Date=" + Date + ", Temp=" + Temp + ", Dewp=" + Dewp + ", Relh=" + Relh
				+ ", Winds=" + Winds + ", Weather=" + Weather + ", Weatherimage=" + Weatherimage + "]";
	}
	
	

}
