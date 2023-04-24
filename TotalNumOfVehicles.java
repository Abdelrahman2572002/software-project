package xdd;

public class TotalNumOfVehicles {

	public int countVehicles()
	{
		ComingFirst c=new ComingFirst();
		BestFit b=new BestFit();
		return c.counter+b.counter;
	}

}
