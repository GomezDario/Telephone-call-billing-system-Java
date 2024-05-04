package mercap;

import java.util.List;

import call.Call;

import java.util.ArrayList;

public class Billing {

	/*Clase Facturacion*/
	
	private Double basicMonthlyPass = 100d;
	private List<Call> callList = new ArrayList<Call>();
	

	public void addCall(Call call) {
		
		this.getCallList().add(call);
		
	}
	
	
	public Double calculationTotalCost() {
		
		return callList.stream().mapToDouble(l->l.callCost()).sum() + this.getBasicMonthlyPass();
		
	}


	public Double getBasicMonthlyPass() {
		return basicMonthlyPass;
	}


	private List<Call> getCallList() {
		return callList;
	}

	public void print() {
		
		System.out.println("=============================");
		System.out.println("Telephone call billing system");
		System.out.println("=============================");
		
		
		System.out.println("========================");
		
		System.out.println("Basic monthly pass: " + this.getBasicMonthlyPass().toString());
		
		System.out.println("========================");
		
		System.out.println("Number of calls made: " + this.getCallList().size());
		
		
		System.out.println("========================");
		
		System.out.println("Total call cost: " + this.calculationTotalCost().toString());
		
		System.out.println("========================");
	}
	
	
}
