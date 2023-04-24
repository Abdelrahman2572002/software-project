package xdd;

import java.time.LocalTime;

public class ParkingOut {

	private int departure;
	
	public void setDeparture() {
		LocalTime obj=LocalTime.now();
		departure=obj.getHour();
	}
	public int getDeparture() {
		return departure;
	}
	

}
