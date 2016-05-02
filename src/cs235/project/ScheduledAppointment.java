/*
 * Scheduled Appointment Super Class
 * Written by Trevor J Hoglund
 * trewbot@phene.co
 * 2016.04.24
 */

package cs235.project;
public abstract class ScheduledAppointment extends Appointment {
	String location, time;
	public ScheduledAppointment(String label, String note, String location, String time){
		super(label,note);
		this.location = location;
		this.time = time;
	}
	public String getLocation(){return location;}
	public String getTime(){return time;}
	public String toString(){
		return this.getLabel() + "(" + this.getNote() + ")\n\tWhere: " + this.location + "\n\tWhen: " + this.time;
	}
}
