package xdd;

public class ComingFirst {
	
	public int counter=0;
public	void pickFirstSlot(Vehicle vehicle)
{
	Slot slot=new Slot();
    
	
	for(int i=0;i<slot.NumOfSlots();i++)
	{
	   if(!slot.s.get(i).active()&&vehicle.getLength()<=slot.getLengthOfSlot()&&vehicle.getWidth()<=slot.getWidthOfSlot())
	   {
		   slot.s.get(i).setStatus(true);
		   counter++;
		   
	   }
	}
	
}
}