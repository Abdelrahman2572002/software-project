package xdd;

import java.util.*;

public class Slot {
private int lengthOfSlot, widthOfSlot;
private boolean status;
private int SlotID;
private static int counter=0;
public ArrayList<Slot>s=new ArrayList<Slot>();


public Slot(int lengthOfSlot, int widthOfSlot, Boolean status, int SlotID) {
	this.lengthOfSlot = lengthOfSlot;
	this.widthOfSlot = widthOfSlot;
	this.status = status;
	this.SlotID = SlotID;
	counter++;	
}
public Slot(){}
public void addSlot(Slot m)
{
	s.add(m);
}
 

public boolean available()
{
	boolean isfound=false;
	for(int i=0;i<counter;i++)
	{
		if(s.get(i).active())
		{
			return true;
		}
	}
	return isfound;
}
public int getLengthOfSlot() {
	return lengthOfSlot;
}
public void setLengthOfSlot(int lengthOfSlot) {
	this.lengthOfSlot = lengthOfSlot;
}
public int getWidthOfSlot() {
	return widthOfSlot;
}
public void setWidthOfSlot(int widthOfSlot) {
	this.widthOfSlot = widthOfSlot;
}
public boolean active() {
	return status==true;
}

public  void setStatus(Boolean status) {
	this.status = status;
}
public int getSlotID() {
	return SlotID;
}
public void setSlotID(int slotID) {
	SlotID = slotID;
}
public int NumOfSlots()
{
	return counter;
}

    
}

