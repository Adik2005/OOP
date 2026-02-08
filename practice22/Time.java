package practice22;

public class Time {
	
	private int hour;
	private int minute;
	private int second;
	
	public Time(int hour, int minute, int second) {
		if (hour >= 0 && hour < 24 && minute >= 0 && minute < 60 && second >= 0 && second < 60) {
			this.hour = hour;
			this.minute = minute;
			this.second = second;
		} else {
			this.hour = 0;
			this.hour = 0;
			this.hour = 0;
		}
	}
	
	public String toUniversal() {
	    return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	public String toStandard() {
	    String amPm = (hour < 12) ? "AM" : "PM";

	    int standardHour = hour % 12;
	    if (standardHour == 0) {
	        standardHour = 12;
	    }

	    return String.format("%02d:%02d:%02d %s", standardHour, minute, second, amPm);
	}
	
	public void add(Time t) {
	    this.second += t.second;
	    this.minute += t.minute;
	    this.hour += t.hour;

	    if (this.second >= 60) {
	        this.minute += this.second / 60;
	        this.second = this.second % 60;
	    }

	    if (this.minute >= 60) {
	        this.hour += this.minute / 60;
	        this.minute = this.minute % 60;
	    }

	    if (this.hour >= 24) {
	        this.hour = this.hour % 24;
	    }
	}
}
