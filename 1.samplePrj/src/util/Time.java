package util;

public class Time {

	private int hour;
	private int minute;
	private int second;
	private boolean am = true; // am pm

	public Time() {

	}

	public Time(int hour, int minute, int second) {

		// this.hour=hour;
		// this.minute=minute;
		// this.second = second;

		this.setHour(hour);
		this.setMinute(minute);
		this.setSecond(second);
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour < 0 || hour > 23) {
			return;
		}
		if (hour >= 12) {
			am = false;
		}
		this.hour = hour;
	}

	public int getMinute() {

		return minute;
	}

	public void setMinute(int minute) {
		if (minute < 0 || minute >= 60) {
			return;
		}
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second < 0 || second >= 60) {
			return;
		}
		this.second = second;
	}

	public void display() {
		String d = "Time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
		System.out.println(d);
	}

}
