package clock;

import java.util.ArrayList;

public class HotelWorldClockSystem {
	private int utcTime;
	private ArrayList<Clock> clocks;
	
	public HotelWorldClockSystem() {
		clocks = new ArrayList<Clock>();
		utcTime = 0;
	}
	
	public void addClock(Clock clock) {
		clock.setLocalTime(utcTime + clock.deltaTime);
		clocks.add(clock);
	}
	
	public void removeClock(Clock clock) {
		clocks.remove(clock);
	}
	
	public void setUtcTime(int utcTime) {
		this.utcTime = utcTime;
		for(int i = 0; i < clocks.size(); i++) {
			Clock currentClock = clocks.get(i);
			currentClock.setLocalTime(this.utcTime + currentClock.getDeltaTime());
		}
	}
	
	public int getUtcTime() {
		return utcTime;
	}
}
