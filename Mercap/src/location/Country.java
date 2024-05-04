package location;

public enum Country {
	
	
	Argentina(50d), Uruguay(30d), Chile(20d);

	private Double cost;
	
	
	Country(Double costo) {
	
		this.cost = costo;
		
	}

	public Double getCost() {
		return cost;
	}
	
	

}
