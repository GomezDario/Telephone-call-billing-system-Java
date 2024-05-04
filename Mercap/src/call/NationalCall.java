package call;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

import location.Location;

public class NationalCall implements Call {

	private Location location;
	
	private int callDuration; //it's in minutes
	
	
	
	public NationalCall(Location location, int callDuration) {
		super();
		
		this.location = location;
		this.callDuration = callDuration;
		
	}

	
	@Override
	public Double callCost() {
		// TODO Auto-generated method stub
		return this.getLocation().getCost() * this.getCallDuration();
	}


	public Location getLocation() {
		return location;
	}


	private void setLocation(Location localidad) {
		this.location = localidad;
	}


	public int getCallDuration() {
		return callDuration;
	}


	private void setCallDuration(int callDuration) {
		this.callDuration = callDuration;
	}

	

}
