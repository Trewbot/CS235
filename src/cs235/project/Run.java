package cs235.project;
import java.io.*;
import java.util.*;
public class Run {
	public static void main(String[] args) throws NumberFormatException, InvalidDayException, InvalidDurationException, FileNotFoundException{
		Schedule schedule = new Schedule();
		String filename;
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to the schedule app.");
		while(true){
			System.out.print("Please enter the name of an existing schedule file: ");
			try{
				filename = in.nextLine();
				schedule.loadFile(filename);
				break;
			}catch(FileNotFoundException e){
				System.out.println("File reader error!");
				System.out.println("Please check the filename and try again.");
				System.out.println();
			}
		}
		while(true){
			System.out.println("\nYou may view a [W]eekly or [D]aily schedule,");
			System.out.println("[A]dd a new appointment, [R]emove an appointment,");
			System.out.println("[S]ave the schedule, or [Q]uit the program.\n");
			System.out.print("Enter a command: ");
			String cmd = in.next();
			System.out.println();
			       if(cmd.equalsIgnoreCase("d")){
				System.out.print("What day? [0 = Sunday, 6 = Saturday]: ");
				int cmd2 = in.nextInt();
				System.out.println();
				schedule.printDailySchedule(cmd2);
			} else if(cmd.equalsIgnoreCase("w"))
				schedule.printWeeklySchedule();
			  else if(cmd.equalsIgnoreCase("a")){
				System.out.print("[D]aily, [W]eekly, or [T]ask? ");
				String type = in.next();
				if(type.equalsIgnoreCase("d")){
					in.nextLine();	// Debug line
					System.out.print("What is the label of the new appointment? ");
					String label = in.nextLine();
					System.out.print("Enter notes: ");
					String note = in.nextLine();
					System.out.print("Where is the appointment? ");
					String location = in.nextLine();
					System.out.print("What time? ");
					String time = in.nextLine();
					schedule.addAppointment(new DailyAppointment(label, note, location, time));
				} else if(type.equalsIgnoreCase("w")){
					in.nextLine();	// Debug line
					System.out.print("What is the label of the new appointment? ");
					String label = in.nextLine();
					System.out.print("Enter notes: ");
					String note = in.nextLine();
					System.out.print("Where is the appointment? ");
					String location = in.nextLine();
					System.out.print("What time? ");
					String time = in.nextLine();
					System.out.print("What day? ");
					int day = in.nextInt();
					schedule.addAppointment(new WeeklyAppointment(label, note, location, time, day));
				} else if(type.equalsIgnoreCase("t")){
					in.nextLine();	// Debug line
					System.out.print("What is the label of the new appointment? ");
					String label = in.nextLine();
					System.out.print("Enter notes: ");
					String note = in.nextLine();
					System.out.print("How many minutes will the task take? ");
					double duration = in.nextDouble();
					System.out.print("What day? ");
					int day = in.nextInt();
					schedule.addAppointment(new Task(label, note, duration, day));
				} else System.out.println("Unknown appointment type.\n");
			} else if(cmd.equalsIgnoreCase("r")){
				System.out.print("What is the day of the appointment you want to remove? ");
				int cmd2 = in.nextInt();
				System.out.println();
				schedule.printDailySchedule(cmd2);
				System.out.print("Remove which appointment? [Give the number, -1 to cancel] ");
				int cmd3 = in.nextInt();
				if(cmd3 >= 0){
					schedule.removeAppointment(cmd2,cmd3);
					System.out.println("Appointment was removed successfully.");
				}else System.out.println("Remove action cancelled.");
			} else if(cmd.equalsIgnoreCase("s")){
				schedule.saveFile(filename);
				System.out.println("Saved " + filename);
			} else if(cmd.equalsIgnoreCase("q")){
				System.out.print("Goodbye.");
				break;
			} else System.out.println("Unknown command " + cmd);
		}
		
		in.close();
	}
}
