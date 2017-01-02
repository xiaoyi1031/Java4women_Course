import java.util.List;

import java.util.ArrayList;

public class Main { 

	public static void main(String[] args) {
		//define the list of Customer object
		List<Customer> customers = new ArrayList<Customer>();
		
		makeupShop m1 = new makeupShop(1, "Anna", "Solna", "Mac");
		makeupShop m2 = new makeupShop(2, "Sofina", "Stockholm", "Dior");
		
		kiosk k1 = new kiosk(1, "Ella", "Täby", true);
		kiosk k2 = new kiosk(2, "Badia", "Soll", false);

		customers.add(m1);
		customers.add(m2);
		customers.add(k1);
		customers.add(k2);
		
		for (Customer i : customers){
			System.out.println(i.getName());
			}
		
		checkSize(customers);
		
		StringWorker<makeupShop, kiosk> sw = new StringWorker<makeupShop, kiosk>(m1, k1);
		System.out.println(sw.toString());
		
		}
		
	public static void checkSize(List<Customer> someList) {
	//public static void checkSize(List<? extends Customer> someList) {
		if (someList.size() > 100) {
			System.out.println("This is a big list");
		}
		else {
			System.out.println("This is a small list");
		}
	}

		
//		Iterator<Customer> iterator = customers.iterator();
//		while (iterator.hasNext()) {
//			Customer nextCustomer = (Customer)iterator.next();
//			System.out.println(nextCustomer.getName());
//		}
//		
//		StringWorker<String, Integer> sw = new StringWorker<String, Integer>("Hello", 123);
//		System.out.println(sw.toString());
//	}

}
