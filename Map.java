package xdd;

public class Map {

	
	Map(){};
	public void showActiveSlots()
	{
		
		Slot slot=new Slot();
			for(int i=0;i<slot.NumOfSlots();i++)
			{
				if(!slot.s.get(i).active())
				{
					System.out.println(slot.s.get(i).getSlotID());
					System.out.println(slot.s.get(i).getLengthOfSlot());
					System.out.println(slot.s.get(i).getWidthOfSlot());
				}
			}
		
	}
}
