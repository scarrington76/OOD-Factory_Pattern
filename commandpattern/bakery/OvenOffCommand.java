package bakery;

public class OvenOffCommand implements Command {
	Oven oven;
	int prevTemp;

	public OvenOffCommand(Oven oven) {
		this.oven = oven;
	}
	public void execute() {
		prevTemp = oven.getTemp();
		oven.off();
	}
	public void undo() {
		switch (prevTemp) {
			case Oven.BAKE: 	oven.high(); break;
			default: 				oven.off(); break;
		}
	}
}
