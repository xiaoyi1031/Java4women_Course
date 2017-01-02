
public class makeupShop implements Customer {
	private int Id;
	private String Name;
	private String Address;
	private String favoriteBrand;
	
	
	
	public makeupShop(int id, String name, String address, String favoriteBrand) {
		//super();
		this.Id = id;
		this.Name = name;
		this.Address = address;
		this.favoriteBrand = favoriteBrand;
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
	
	public String getFavoriteBrand() {
		// TODO Auto-generated method stub
		return this.favoriteBrand;
	}
	

}
