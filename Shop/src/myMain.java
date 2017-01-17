import java.util.ArrayList;

public class myMain {
	static ArrayList<HasShippingCost> shippingCost = new ArrayList<>();
	
	public static void main(String[] args) {
		Grocery g1 = new Grocery("necklace", 150, "silver", 0.2);
		Grocery g2 = new Grocery("ring", 200, "silver", 0.1);
		
		Clothes c1 = new Clothes("top", 400, "cottion", 38);
		Clothes c2 = new Clothes("bottom", 350, "high weist", 38);
		
		Book b1 = new Book("Learn Java", 160, "good", "Bardia");
		Book b2 = new Book("Learn better Java", 260, "better", "Bita");
		
		shippingCost.add(c1);
		shippingCost.add(c2);
		shippingCost.add(b1);
		shippingCost.add(b2);
		
		int sum = 0;
		for(HasShippingCost i : shippingCost) {
			sum += i.calculateCost(10);
		}
		
		System.out.println("Totoal shipping cost is:" + sum);
		

	}

}
