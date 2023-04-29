package UML;

public class Time {
private int hour,minute,second;
public int getHour() {
	return hour;
}
public void setHour(int hour) {
	this.hour = hour;
}
public int getMinute() {
	return minute;
}
public void setMinute(int minute) {
	this.minute = minute;
}
public int getSecond() {
	return second;
}
public void setSecond(int second) {
	this.second = second;
}
public Time(int hour,int minute,int second) {
	this.hour=hour;
	this.minute=minute;
	this.second=second;
}
public String toString() {
	return hour+":"+minute+":"+second;
	//System.out.println("Time : "+hour+":"+minute+":"+second);
}
public String prevSecond() {
	int sec=second-1,min=minute,h=hour;
	if(sec==-1) {
		min--;
		sec=59;
		if(min==-1) {
			h--;
			min=59;
			if(h==0) {
				h=23;
			}
		}
	}
	return h+":"+min+":"+sec;
}
public String nextSecond() {
	int sec=second+1,min=minute+1,h=hour+1;
	if(sec==60) {
		sec=0;
		if(min==60) {
			min=0;
			if(h==24) {
				h=0;
			}
		}
	}
	return h+":"+min+":"+sec;
}
}
