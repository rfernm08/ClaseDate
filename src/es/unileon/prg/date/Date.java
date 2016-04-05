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
	
	String monthName(){
		String mes="";
		switch(this.month){
			case 1: 
				mes = "Enero";
				break;
			case 2:
				mes = "Febrero";
				break;
			case 3:
				mes = "Marzo";
				break;			
			case 4:
				mes = "Abril";
				break;
			case 5:
				mes = "Mayo";
				break;
			case 6:
				mes = "Junio";
				break;
			case 7: 
				mes = "Julio";
				break;
			case 8:
				mes = "Agosto";
				break;
			case 9:
				mes = "Septiembre";
				break;
			case 10:
				mes = "Octubre";
				break;
			case 11:
				mes = "Noviembre";
				break;
			case 12:
				mes = "Diciembre";
				break;
		}
}
