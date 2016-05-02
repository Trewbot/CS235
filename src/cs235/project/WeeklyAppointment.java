/*
 * Weekly Appointment Class
 * Written by Trevor J Hoglund
 * trewbot@phene.co
 * 2016.04.24
 */

package cs235.project;
public class WeeklyAppointment extends ScheduledAppointment {
	private int day;
	public WeeklyAppointment(String label, String note, String location, String time, int day) throws InvalidDayException {
		super(label, note, location, time);
		if(day < 0 || day > 6) throw new InvalidDayException();
		this.day = day;
	}
	public int getWeekDay(){return day;}
}
