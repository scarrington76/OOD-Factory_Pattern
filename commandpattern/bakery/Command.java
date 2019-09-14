package bakery;

public interface Command {
	public void execute();
	public void undo();
}
