/*
 * Appointment Class
 * Written by Trevor J Hoglund
 * trewbot@phene.co
 * 2016.04.24
 */

package cs235.project;
public class Appointment {
	private String label, note;
	public Appointment(String label, String note){
		this.label = label;
		this.note = note;
	}
	public String getLabel(){return label;}
	public String getNote(){return note;}
	public int getWeekDay(){return -1;}
}
