package carlxuan.util.time;

public enum TimeZone {
	JP_Tokyo("JP/Tokyo"),
	CN_China("CN/China"),
	UK_London("UK/London"),
	US_NewYork("US/NewYork");
	
	private String name;
	private TimeZone(String name) {
		this.name = name;
	}
}
