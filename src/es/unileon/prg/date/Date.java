package es.unileon.prg.date;
public class Date{
	
	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	void setYear(int year){
		this.year = year;
	}
	void setMonth(int month){
		this.month = month;
	}
	void setDay(int day){
		this.day = day;
	}

	int getYear(){
		return this.year;
	}
	int getMonth(){
		return this.month;
	}
	int getDay(){
		return this.day;
	}
	
	boolean isSameYear(date other){
		return(this.year == other.getYear());
	}

	boolean isSameMonth(date other){
		return(this.month == other.getMonth());
	}

	boolean isSameDay(date other){
		return(this.day == other.getDay());
	}
	boolean isSame(date other){
		return((this.year == other.getYear()) && (this.month == other.getMonth()) && (this.day == other.getDay()))
	}
}