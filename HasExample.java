package Exception;
import java.util.*;
class car{
	private int carID;
	private String carModel;
	private engine eng;
	public engine getEng() {
		return eng;
	}
	public void setEng(engine eng) {
		this.eng = eng;
	}
	public int getCarID() {
		return carID;
	}
	public void setCarID(int carID) {
		this.carID = carID;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String setEngModel() {
		// TODO Auto-generated method stub
		return null;
	}
}
class engine{
	private int engID;
	private String engModel;
	public Object set;
	public int getEngID() {
		return engID;
	}
	public void setEngID(int engID) {
		this.engID = engID;
	}
	public String getEngModel() {
		return engModel;
	}
	public void setEngModel(String engModel2) {
		this.engModel = engModel2;
	}
}
public class HasExample {
	public static car createStatemt()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter car ID");
		int carID=sc.nextInt();
		System.out.println("Enter car Model");
		String carModel=sc.next();
		System.out.println("Enter engine ID");
		int engID=sc.nextInt();
		System.out.println("Enter engine Model");
		String engModel=sc.next();
		car c=new car();
		engine e=new engine();
		c.setCarID(carID);
		c.setCarModel(carModel);
		e.setEngID(engID);
		e.setEngModel(engModel);
		return c;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c1=createStatemt();
		
		System.out.println("Car Details");
		System.out.println("Car ID" + c1.getCarID());
		System.out.println("Car Model" + c1.getCarModel());
		System.out.println("Engine ID" + c1.getEng().getEngID());
		System.out.println("Engine Model" + c1.getEng().getEngModel());
	}
	
}
