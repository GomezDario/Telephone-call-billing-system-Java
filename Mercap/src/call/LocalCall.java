package call;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class LocalCall implements Call{

	private int callDuration; //it's in minutes
	private LocalDateTime dateAndTime;
	
	
	public LocalCall(int callDuration, LocalDateTime dateAndTime) {
		super();
		this.callDuration = callDuration;
		this.dateAndTime = dateAndTime;
	}
 

	@Override
	public Double callCost() {
		// TODO Auto-generated method stub
		
		if(this.isAWorkingDayFrom8to20(dateAndTime)) {
			
			return 0.20d * this.getCallDuration() ;
			
		}
		
		
		return 0.10d * this.getCallDuration();
		
	}


	private boolean isAWorkingDayFrom8to20(LocalDateTime dateAndTime) {
		// TODO Auto-generated method stub

		int hour = dateAndTime.getHour();
		
		boolean isWorkingDay = dateAndTime.getDayOfWeek().getValue() <= 5;
		
		
		return isWorkingDay && hour > 8 && hour < 20;

	}

	public int getCallDuration() {
		return callDuration;
	}


	private void setCallDuration(int callDuration) {
		this.callDuration = callDuration;
	}


	public LocalDateTime getDateAndTime() {
		return dateAndTime;
	}


	private void setDateAndTime(LocalDateTime dateAndTime) {
		this.dateAndTime = dateAndTime;
	}
	
	
}
