package info.inetslov;
import java.io.*;
public class Student implements Serializable
{
	private int rollNo;
	private String name;
	private Double marks;
	private boolean result;
	public void setRollNo(int rollNo){
		this.rollNo=rollNo;
}
public int getRollNo(){
	return rollNo;
}
	public void setName(String name){
		this.name=name;
}
public String getName(){
	return name;
}
	public void setMarks(Double marks){
		this.marks=marks;
}
public Double getMarks(){
	return marks;
}
	public void setResult(boolean result){
		this.result=result;
}
public boolean getResult()
	{
	return result;
}
}
