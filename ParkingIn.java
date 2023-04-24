package xdd;
import java.time.*;

public class ParkingIn {
	private int arrival; 
	
	
	public void setArrival() {
		LocalTime obj=LocalTime.now();
		arrival=obj.getHour();
}
	public int getArrival() {
		return arrival;
	}
}
