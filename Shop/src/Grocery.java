
public class Grocery extends Goods {

	private double weight;
	
	public Grocery(String name, int price, String description, double weight) {
		super(name, price, description);
		this.weight = weight;		
	}
	
	
	public double getWeight() {
		return weight;
	}


	@Override
	public String showInfor(){
		return this.getName() + "'s price: " + this.getPrice() + ", description: " + this.getDescription() + ", weight: " + weight;
	}

}
