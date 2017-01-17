
public class kiosk implements Customer {
	private int Id;
	private String Name;
	private String Address;
	private boolean goldenCustomer;
	
	
	public kiosk(int id, String name, String address, boolean goldenCustomer) {
		//super();
		Id = id;
		Name = name;
		Address = address;
		this.goldenCustomer = goldenCustomer;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.Id;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.Name;
	}

	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return this.Address;
	}
	
	public boolean getGoldenCustomer(){
		return goldenCustomer;
	}
	

}
