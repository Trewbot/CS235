/*
 * Schedule Class
 * Written by Trevor J Hoglund
 * trewbot@phene.co
 * 2016.04.24
 */

package cs235.project;
import java.io.*;
import java.util.*;
public class Schedule {
	public static final String[] DAYS = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	List<Appointment>[] appointments;
	@SuppressWarnings("unchecked")
	public Schedule(){
		appointments = new List[7];
		for(int i = 0; i < 7; i++)
			appointments[i] = new ArrayList<Appointment>();
	}
	public void loadFile(String filename) throws FileNotFoundException, NumberFormatException, InvalidDayException, InvalidDurationException{
		Scanner in = new Scanner(new FileInputStream(filename));
		while(in.hasNext()){
			String[] parts = in.nextLine().split("#");
			this.addAppointment(parts[0].equalsIgnoreCase("task")
				? new Task(parts[1],parts[2],Double.parseDouble(parts[4]),Integer.parseInt(parts[3]))
				: (parts[0].equalsIgnoreCase("daily")
					? new DailyAppointment(parts[1],parts[2],parts[3],parts[4])
					: new WeeklyAppointment(parts[1],parts[2],parts[3],parts[4],Integer.parseInt(parts[5]))));
		}
		in.close();
	}
	public void saveFile(String filename) throws FileNotFoundException{
		PrintWriter out = new PrintWriter(new FileOutputStream(filename));
		for(int i = 0; i < appointments.length; i++){
			for(Appointment j: appointments[i]){
				if(j instanceof Task) out.println("task#" + j.getLabel() + "#" + j.getNote() + "#" + j.getWeekDay() + "#" + ((Task)j).getDuration());
				if(j instanceof WeeklyAppointment) out.println("weekly#" + j.getLabel() + "#" + j.getNote() + "#" + ((WeeklyAppointment)j).getLocation() + "#" + ((WeeklyAppointment)j).getTime() + "#" + ((WeeklyAppointment)j).getWeekDay());
				if(i == 0 && j instanceof DailyAppointment) out.println("daily#" + j.getLabel() + "#" + j.getNote() + "#" + ((DailyAppointment)j).getLocation() + "#" + ((DailyAppointment)j).getTime());
			}
		}
		out.close();
	}
	public void addAppointment(Appointment appointment){
		if(appointment instanceof DailyAppointment)
			for(int i = 0; i < appointments.length; i++)
				appointments[i].add(appointment);
		else appointments[appointment.getWeekDay()].add(appointment);
	}
	public void removeAppointment(String label){
		for(int i = 0; i < appointments.length; i++)
			for(Appointment a : appointments[i])
				if(a.getLabel().equalsIgnoreCase(label)) appointments[i].remove(a);
	}
	public void removeAppointment(int day, int index){
		appointments[day].remove(index);
	}
	public void printDailySchedule(int day){
		Object[] appts = appointments[day].toArray();
		for(int i = 0; i < appts.length; i++)
			System.out.println("[" + i + "] " + appts[i]);
	}
	public void printWeeklySchedule(){
		for(int i = 0; i < appointments.length; i++){
			System.out.println(DAYS[i] + ":");
			printDailySchedule(i);
			System.out.println();
		}
	}
}
