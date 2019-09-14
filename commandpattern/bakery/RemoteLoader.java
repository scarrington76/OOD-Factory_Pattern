package bakery;

public class RemoteLoader {

	public static void main(String[] args) {

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
  
		System.out.println(remoteControl);
		System.out.println("--- Pushing Macro On---");
		remoteControl.onButtonWasPushed(0);
		System.out.println("--- Pushing Macro Off---");
		remoteControl.offButtonWasPushed(0);
	}
}
