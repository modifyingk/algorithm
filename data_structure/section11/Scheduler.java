package section11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Scheduler {
	
	public ArrayList<Event> events = new ArrayList<>();
	private Scanner kb;
	
	public void processCommand() {
		kb = new Scanner(System.in);
		while(true) {
			System.out.print("$ ");
			String command = kb.next();
			if(command.equals("addevent")) {
				String type = kb.next();
				if(type.equalsIgnoreCase("oneday"))
					handleAddOneDayEvent();
				else if(type.equalsIgnoreCase("duration"))
					handleAddDurationEvent();
				else if(type.equalsIgnoreCase("deadline"))
					handleAddDeadlinedEvent();
			} else if(command.equals("list")) {
				handleList();
			} else if(command.equals("show")) {
				handleShow();
			} else if(command.equals("sort")) {
				Collections.sort(events);
			} else if(command.equals("exit"))
				break;
		}
		kb.close();
	}
	
	private void addEvent(Event ev) {
		events.add(ev);
	}
	
	private MyDate parseDateString(String dateString) {
		String[] tokens = dateString.split("/");
		int year = Integer.parseInt(tokens[0]);
		int month = Integer.parseInt(tokens[1]);
		int day = Integer.parseInt(tokens[2]);
		
		MyDate d = new MyDate(year, month, day);
		return d;
	}
	
	private void handleAddOneDayEvent() {
		System.out.print("   when: ");
		String dateString = kb.next();

		System.out.print("   title: ");
		String title = kb.next();

		MyDate date = parseDateString(dateString);
		OneDayEvent ev = new OneDayEvent(title, date);
		
		addEvent(ev);
	}

	private void handleAddDurationEvent() {
		System.out.print("   begin: ");
		String beginString = kb.next();

		System.out.print("   end: ");
		String endString = kb.next();
		
		System.out.print("   title: ");
		String title = kb.next();
		
		MyDate begin = parseDateString(beginString);
		MyDate end = parseDateString(endString);
		DurationEvent ev = new DurationEvent(title, begin, end);
		
		addEvent(ev);
	}
	
	private void handleAddDeadlinedEvent() {
		System.out.print("   until: ");
		String dateString = kb.next();

		System.out.print("   title: ");
		String title = kb.next();

		MyDate date = parseDateString(dateString);
		DeadlinedEvent ev = new DeadlinedEvent(title, date);
		
		addEvent(ev);
	}

	private void handleList() {
		for(Event ev : events) { // enhanced for loop
			System.out.println("   " + ev.toString());
		}
	}

	private void handleShow() {
		String dateString = kb.next();
		MyDate theDate = parseDateString(dateString);
		for(Event ev : events) {
			if(ev.isRelevant(theDate))
				System.out.println(ev.toString());
		}
	}
	
	public static void main(String[] args) {
		Scheduler app = new Scheduler();
		app.processCommand();
	}
	
}
