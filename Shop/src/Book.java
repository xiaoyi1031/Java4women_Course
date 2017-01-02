
public class Book extends Goods implements HasShippingCost{
	
	private String author;
	
	public Book(String name, int price, String description, String author) {
		super(name, price, description);
		this.author = author;
	}

	
	public String getAuthor() {
		return author;
	}


	@Override
	public String showInfor(){
		return this.getName() + "'s price: " + this.getPrice() + ", description: " + this.getDescription() + ", author: " + this.author;
	}


	@Override
	public double calculateCost(double distance) {		
		return distance * costPerMile;
	}
}
