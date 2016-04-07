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

	public Date(int day, int month, int year) throws DateException{
		StringBuffer msg = new StringBuffer();
		if((month<1)||(month>12)){
			msg.append("El mes "+month+" introducido no es valido.\n");
		}
		if((day<1)||(day>31)){
			msg.append("El día "+day+" introducido no es valido.\n");
		}
		if(year<0){
			msg.append("No se permiten años negativos.\n");
		}
		if(day>daysOfMonth(this.month)){
			msg.append("Error entre el dia y el mes.\n");
		}
		if(msg.length()!=0){
			throw new DateException(msg.toString());
		}
		else{
			this.day = day;
			this.month = month;
			this.year = year;
		}
	}
	
	public Date(Date aux){
		this.day = aux.getDay();
		this.month = aux.getMonth();
		this.year = aux.getYear();
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
		return((this.year == other.getYear()) && (this.month == other.getMonth()) && (this.day == other.getDay()));
	}
	
	public String monthName(int month){
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
	
	public String seasonName(){
		String season="";
		switch(this.month){
			case 1: //next
			case 2: //next
			case 3:
				if(this.day<=20){
					season = "Invierno";
				}
				else{
					season = "Primavera";
				}
				break;			
			case 4: //next
			case 5: //next
			case 6:
				if(this.day<=20){
					season = "Primavera";
				}
				else{
					season = "Verano";
				}
				break;
			case 7: //next
			case 8: //next
			case 9:
				if(this.day<=20){
				 season = "Verano";
				}
				else{
					season = "Otoño";
				}
				break;
			case 10: //next
			case 11: //next
			case 12: //next
				if(this.day<=20){
				season = "Otoño";
				}
				else{
					season = "Invierno";
				}
				break;
			}
			return season;
		}
		public String monthsLeft(){
			StringBuffer months = new StringBuffer();
			Date fecha = new Date(this);
			for(int i=this.month;i<=12;i++){
				fecha.setMonth(fecha.getMonth()+1);
				months.append(fecha.monthName());
			}
			return months.toString();
		}
		
		public String printDate(){
			String fecha="";
			fecha = "La fecha es "+this.day+"/"+this.month+"/"+this.year+".";
			return fecha;
		}

		public int daysOfMonth(int month){
			int numberOfDays;
			if((this.month=1)||(this.month=3)||(this.month=5)||(this.month=7)||(this.month=8)||(this.month=10)||(this.month=12)){
				numberOfDays=31;
			}
			if((this.month=4)||(this.month=6)||(this.month=9)||(this.month=11)){
				numberOfDays=30;
			}
			if(this.month=2){
				numberOfDays=28;
			}
			return numberOfDays;
		}
		
		public String datesEndMonth(){
			StringBuffer fechas = new StringBuffer();
			for(int i=this.day;i<daysOfMonth(int month);i++){
				fechas.append(this.day+"/"+this.month+"/"+this.year+"\n");
			}
			return fechas.toString();
		}
		
		public String printMonthSameDays(){
			StringBuffer monthSameDays = new StringBuffer();
			for(int i=0;i<12;i++){
				if(daysOfMonth(this.month)==daysOfMonth(i)){
				monthSameDays.append(monthName(i));
				}
			}
		return monthSameDays;
		}
		
		public int countDays(){
			int days;
			for(int i=0;i<this.month;i++){
				days=days+daysOfMonth(i);
			}
			days=days+this.day;
			return days;
		}

		public int numberAttemps(Date other){
			double randMonth = Math.random()*12+1;
			double randDay = Math.random()*daysOfMonth(randMonth)+1;
			Date randDate = new Date(randDay, randMonth, other.getYear());
			int attemps;
			while(randDate!=other){
				attemps++;
			}
		return attemps;
		}
	
		public String weekDay(Date givenDate, int firstDay){
			StringBuffer weekDay = new StringBuffer();
			int cont=0;
			for(int i=0;i!=givenDate.getDay();i++){
				cont=(firstDay+i)%7;
			}
			switch(cont){
				case 0:
					weekDay.append("Domingo");
					break;
				case 1:
					weekDay.append("Lunes");
					break;
				case 2:
					weekDay.append("Martes");
					break;
				case 3:
					weekDay.append("Miercoles");
					break;
				case 4:
					weekDay.append("Jueves");
					break;
				case 5:
					weekDay.append("Viernes");
					break;
				case 6:
					weekDay.append("Sabado");
					break;
			}
			return weekDay.toString();
			}
		
}
