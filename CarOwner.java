package xdd;

public class CarOwner extends Person {
	
	private int money;
	private Vehicle vehicle;

	
	
	
	public CarOwner(String name, int age, int iD,int money,Vehicle vehicle) {
		super(name,age,iD);
		this.money=money;
		this.vehicle=vehicle;
		Vehicle s=new Vehicle();
		s.addVehicle(vehicle);
	}
	
	public void payment(int money)
	{
		Fees s=new Fees();
		if(money<s.calculatePrice())
		{
			System.out.println("the addminstrtor blocked you because you don't have the proper money");
			
		}
		else {
			System.out.println("the transaction has been successfully");
		}
	}
	
	
}
