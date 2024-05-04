package mercap;

import java.time.LocalDateTime;

import call.InternationalCall;
import call.LocalCall;
import call.NationalCall;
import location.Country;
import location.Location;

public class MainBilling {

	public static void main(String[] args) {

		
		Billing billing = new Billing(); // 100
		
		LocalCall locationCall_1 = new LocalCall(5, LocalDateTime.of(2024, 5, 02, 13, 22));
		// 1
		
		LocalCall locationCall_2 = new LocalCall(5, LocalDateTime.of(2024, 5, 02, 22, 35));
		// 0.5
		
		InternationalCall internationalCall1 = new InternationalCall(Country.Argentina, 8);
		// 400
		
		
		NationalCall nationalCall = new NationalCall(Location.Berazategui, 6);
		// 60
		
		
		
		billing.addCall(locationCall_1);
		billing.addCall(internationalCall1);
		billing.addCall(nationalCall);
		billing.addCall(locationCall_2);
		
		billing.print();
		
		
	}
	
	
}
