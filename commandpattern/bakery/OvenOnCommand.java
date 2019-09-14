package bakery;

public class OvenOnCommand implements Command {
	Oven oven;
	int prevTemp;

	public OvenOnCommand(Oven oven) {
		this.oven = oven;
	}
	public void execute() {
		prevTemp = oven.getTemp();
		oven.high();
	}
	public void undo() {
		switch (prevTemp) {
			case Oven.BAKE: 	oven.high(); break;
			default: 				oven.off(); break;
		}
	}
}
