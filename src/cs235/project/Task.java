/*
 * Task Class
 * Written by Trevor J Hoglund
 * trewbot@phene.co
 * 2016.04.24
 */

package cs235.project;
public class Task extends Appointment {
	private double duration;
	private int day;
	public Task(String label, String note, double duration, int day) throws InvalidDayException, InvalidDurationException{
		super(label, note);
		if(duration < 0) throw new InvalidDurationException();
		this.duration = duration;
		if(day < 0 || day > 6) throw new InvalidDayException();
		this.day = day;
	}
	public double getDuration(){return duration;}
	public int getWeekDay(){return day;}
	public String toString(){
		return this.getLabel() + "(" + this.getNote() + ")\n\tDuration: " + this.duration;
	}
}
