package section8;

public class DeadlinedEvent extends Event {
	public MyDate deadline;
	
	public DeadlinedEvent(String title, MyDate date) {
		super(title);
		deadline = date;
	}
	
	public String toString() {
		return title + ", " + deadline.toString();
	}
}
