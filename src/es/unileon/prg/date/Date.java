package es.unileon.prg.date;
public class Date{
	
	private int day;
	private int month;
	private int year;

	public Date(){
		this.day=1;
		this.month=1;
		this.year=2016;
	}

	public Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public Date(Date aux){
		this.day = aux.getDay;
		this.month = aux.getMonth;
		this.year = aux.getYear;
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
	
	boolean isSameYear(Date other){
		return(this.year == other.getYear());
	}

	boolean isSameMonth(Date other){
		return(this.month == other.getMonth());
	}

	boolean isSameDay(Date other){
		return(this.day == other.getDay());
	}

	boolean isSame(Date other){
		return((this.year == other.getYear()) && (this.month == other.getMonth()) && (this.day == other.getDay()))
	}
	
	public String monthName(){
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
		return mes;
	}
		
	public boolean isRightDay(){
		boolean daysOfMonth = true;
		switch(this.day){
			case 1: //next
			case 3: //next
			case 5: //next
			case 7: //next
			case 8: //next
			case 10: //next
			case 12:
				if(this.day<1||this.day>31){
					daysOfMonth = false;
				}
				break;
			case 4: //next
			case 6: //next
			case 9: //next
			case 11:
				if(this.day<1||this.day>30){
					daysOfMonth = false;
				}
				break;
			case 2:
				if(this.day<1||this.day>28){
					daysOfMonth = false;
				}
				break;
			}
			return daysOfMonth;
	}
	
	public String monthName(){
		String seasson="";
		switch(this.month){
			case 1: //next
			case 2: //next
			case 3:
				if(this.day<=20){
					seasson = "Invierno";
				}
				else{
					seasson = "Primavera";
				}
				break;			
			case 4: //next
			case 5: //next
			case 6:
				if(this.day<=20){
					seasson = "Primavera";
				}
				else{
					seasson = "Verano";
				}
				break;
			case 7: //next
			case 8: //next
			case 9:
				if(this.day<=20){
				 seasson = "Verano";
				}
				else{
					seasson = "Otoño";
				}
				break;
			case 10: //next
			case 11: //next
			case 12: //next
				if(this.day<=20){
				seasson = "Otoño";
				}
				else{
					seasson = "Invierno";
				}
				break;
			}
			return seasson;
		}
		public String monthsLeft(){
			StringBuffer months = new Stringbuffer();
			Date fecha = new Date(this);
			for(int i=this.month;i<=12;i++){
				fecha.setMonth(fecha.getMonth()+1);
				months.append(fecha.monthName());
			}
			return months.toString();
		}
		
		public String printDate(){
			StringBuffer fecha = new StringBuffer;
			fecha = "La fecha es "+this.day+"/"+this.month+"/"this.year".";
			return fecha.toString();
		}

		public int daysOfMonth(){
			int numberOfDays;
			if((this.month=1)||(this.month=3)||(this.month=5)||(this.month=7)||(this.month=8)||(this.month=10)||(this.month=12)){
				numberOfDays=31;
			}
			if((this.month=4)||(this.month=6)||(this.month=9)||(this.month=11)){
				numberOfDays=30
			}
			if(this.month=2){
				numberOfDays=28;
			}
			return numberOfDays;
		}
		
		public String datesEndMonth(){
			StringBuffer fechas = new StringBuffer;
			for(int i=day;i<daysOfMonth;i++){
				
}
