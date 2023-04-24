package xdd;

public class Fees {
	int price=5;
	public void setPrice(int price)
	{
		this.price=price;
	}
	int getprice()
	{
		return price;
	}
	public int calculatePrice()
	{
		ParkingIn arrival=new ParkingIn();
		ParkingOut departure=new ParkingOut();
		
		return (departure.getDeparture()-arrival.getArrival())*getprice();
		
		
		
	}
	
}
