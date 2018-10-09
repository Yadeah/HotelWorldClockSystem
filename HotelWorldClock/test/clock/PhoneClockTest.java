package clock;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PhoneClockTest {
	private HotelWorldClockSystem hotelWorldClockSystem;
	private PhoneClock phoneClock;
	
	@BeforeEach
	public void setUp() throws Exception {
		this.hotelWorldClockSystem = new HotelWorldClockSystem();
		this.phoneClock = new PhoneClock(8,this.hotelWorldClockSystem);
		
	}
	
	@AfterEach
	public void tearDown() throws Exception {
		this.hotelWorldClockSystem.setUtcTime(0);
	}

	@Test
	public void the_time_of_clock_London_should_be_1_after_the_phone_clock_is_set_to_9_Beijing_time() {
		CityClock londonClock = new CityClock("London",0);
		this.hotelWorldClockSystem.addClock(londonClock);
		
		this.phoneClock.setLocalTime(9);
		
		assertEquals(1,londonClock.getLocalTime());
	}
	
	@Test
	public void the_time_of_clock_NewYork_should_be_20_after_the_phone_clock_is_set_to_9_Beijing_time() {
		CityClock newYorkClock = new CityClock("New York",-5);
		this.hotelWorldClockSystem.addClock(newYorkClock);
		
		this.phoneClock.setLocalTime(9);
		
		assertEquals(20,newYorkClock.getLocalTime());
	}

}
