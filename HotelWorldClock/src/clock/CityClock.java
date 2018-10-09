package clock;

public class CityClock extends Clock{
	
	private String city;
	
	private int localTime;

	public CityClock(String city, int deltaTime) {
		super(deltaTime);
		
		this.city = city;
	}
	
	private void setTimeToAvailable() {
		if(localTime < 0) {
			localTime += 24;
		}
		else if(localTime >= 24) {
			localTime -= 24;
		}
	}

	public int getLocalTime() {
		return localTime;
	}

	@Override
	public void setLocalTime(int localTime) {
		this.localTime = localTime;
		setTimeToAvailable();
	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public void printTime() {
		System.out.println(city + ": " + localTime + ".");
	}
	
	
}
