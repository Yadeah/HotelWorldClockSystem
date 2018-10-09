package clock;

public class PhoneClock extends Clock{
	
	private HotelWorldClockSystem hotelWorldClockSystem;
	
	private int localTime;

	public PhoneClock(int deltaTime, HotelWorldClockSystem hotelWorldClockSystem) {
		super(deltaTime);

		this.hotelWorldClockSystem = hotelWorldClockSystem;
	}
	
	private void setTimeToAvailable() {
		if(localTime < 0) {
			localTime += 24;
		}
		else if(localTime >= 24) {
			localTime -= 24;
		}
	}
	
	@Override
	public void setLocalTime(int localTime) {
		this.localTime = localTime;
		setTimeToAvailable();
		hotelWorldClockSystem.setUtcTime(localTime -  deltaTime);
	}
}
