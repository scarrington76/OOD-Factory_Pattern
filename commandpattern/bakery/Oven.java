package bakery;

public class Oven {
	public static final int BAKE = 350;
	public static final int OFF = 0;
	int temp;
 

	public void high() {
		// turns the ceiling fan on to high
		temp = BAKE;
		System.out.println("Oven is set to " + temp + " degrees");
	} 

 
	public void off() {
		// turns the ceiling fan off
		temp = OFF;
		System.out.println("Oven is turned off");
	}
 
	public int getTemp() {
		return temp;
	}
}
