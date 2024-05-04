package location;

public enum Location {

	Berazategui(10d), Quilmes(20d), Bernal(30d);

	private Double cost;
	
	Location(Double costo) {
		// TODO Auto-generated constructor stub
		this.cost = costo;
		
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}
	
	
}
