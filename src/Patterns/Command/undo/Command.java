package Patterns.Command.undo;

public interface Command {
	public void execute();
	public void undo();
}
