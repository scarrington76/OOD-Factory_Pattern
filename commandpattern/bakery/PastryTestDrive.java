package bakery;

public class PastryTestDrive {
 
	public static void main(String[] args) {
		PastryStore cakeStore = new CakeStore();
		PastryStore cookieStore = new CookieStore();
		RemoteControl remoteControl = new RemoteControl();
		Light light = new Light("Living Room");
		Oven oven = new Oven();
		
		LightOnCommand lightOn = new LightOnCommand(light);
		OvenOnCommand ovenOn = new OvenOnCommand(oven);
		LightOffCommand lightOff = new LightOffCommand(light);
		OvenOffCommand ovenOff = new OvenOffCommand(oven);

		Command[] kitchenOn = { lightOn, ovenOn};
		Command[] kitchenOff = { lightOff, ovenOff};
		MacroCommand kitchenOnMacro = new MacroCommand(kitchenOn);
		MacroCommand kitchenOffMacro = new MacroCommand(kitchenOff);
		remoteControl.setCommand(0, kitchenOnMacro, kitchenOffMacro);
		  
		System.out.println("--- Turning Kitchen On ---");
		remoteControl.onButtonWasPushed(0);
		Bakedgood bakedgood = cakeStore.orderBakedgood("birthday");
		System.out.println("Susan ordered a " + bakedgood + "\n");
		
		
 
		bakedgood = cookieStore.orderBakedgood("birthday");
		System.out.println("Scott ordered a " + bakedgood + "\n");

		bakedgood = cakeStore.orderBakedgood("wedding");
		System.out.println("Susan ordered a " + bakedgood + "\n");
 
		bakedgood = cookieStore.orderBakedgood("wedding");
		System.out.println("Thomas ordered a " + bakedgood + "\n");
		System.out.println("--- Turning Kitchen Off ---");
		remoteControl.offButtonWasPushed(0);

	}
}
