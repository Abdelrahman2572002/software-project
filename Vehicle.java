package xdd;

import java.util.*;


public class Vehicle
{
private String ModelName;
private int IdNumber;
private int ModelYear;
private int length;
private int width;
public static int counter=0;
protected ArrayList<Vehicle>v=new ArrayList<Vehicle>();
public Vehicle(String ModelName, int IdNumber, int ModelYear, int length, int width) {
    this.ModelName = ModelName;
    this.IdNumber = IdNumber;
    this.ModelYear = ModelYear;
    this.length = length;
    this.width = width;
    counter++;
}
public Vehicle() {}

protected void addVehicle(Vehicle m)
{
	v.add(m);
}

public String getModelName() {
    return ModelName;
}

public void setModelName(String ModelName) {
    this.ModelName = ModelName;
}

public int getIdNumber() {
    return IdNumber;
}

public void setIdNumber(int IdNumber) {
    this.IdNumber = IdNumber;
}

public int getModelYear() {
    return ModelYear;
}

public void setModelYear(int ModelYear) {
    this.ModelYear = ModelYear;
}

public int getLength() {
    return length;
}

public void setLength(int length) {
    this.length = length;
}

public int getWidth() {
    return width;
}

public void setWidth(int width) {
    this.width = width;
}
public int NumOfVehicles()
{
	return counter;
}




}
