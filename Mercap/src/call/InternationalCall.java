package call;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

import location.Country;

public class InternationalCall implements Call{

	private Country country;
	
	
	private int callDuration; //es en minutos
	

	public InternationalCall(Country country, int callDuration) {
		super();
		this.country = country;
		this.callDuration = callDuration;
		
	}


	@Override
	public Double callCost() {
		// TODO Auto-generated method stub
		
		return this.getCountry().getCost() * this.getCallDuration();
	}

	public Country getCountry() {
		return country;
	}


	public int getCallDuration() {
		return callDuration;
	}



}
