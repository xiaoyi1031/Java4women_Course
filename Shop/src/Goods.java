
public abstract class Goods {
	private String name;
	private int price;
	private String description;
	
	public Goods(String name, int price, String description) {
		this.name = name;
		this.price = price;
		this.description = description;
	}
	
	
	
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public String getDescription() {
		return description;
	}

	public String showInfor(){
		return this.name + "'s price: " + this.price + ", description: " + this.description;
	}
}
