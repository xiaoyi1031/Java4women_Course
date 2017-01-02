
public class Clothes extends Goods implements HasShippingCost {
	
	private int size;
	
	public Clothes(String name, int price, String description, int size) {
		super(name, price, description);
		this.size = size;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String showInfor(){
		return this.getName() + "'s price: " + this.getPrice() + ", description: " + this.getDescription() + ", size: " + this.size;
	}
	
	@Override
	public double calculateCost(double distance) {
		
		return distance * costPerMile / 2;
	}

}
