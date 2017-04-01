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
		StringBuffer message = new StringBuffer();
		if((month<1)||(month>12)){
			message.append("El mes "+month+" introducido no es valido.\n");
		}
		if((day<1)||(day>31)){
			message.append("El día "+day+" introducido no es valido.\n");
		}
		if(year<0){
			message.append("No se permiten años negativos.\n");
		}
		if(day>this.daysOfMonth(month)){
			message.append("Error entre el dia y el mes.\n");
		}
		if(message.length()!=0){
			throw new DateException(message.toString());
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
	
	public void setYear(int year) throws DateException{
		if ( year < 0) {
			throw new DateException("Los años negativos no están permitidos.\n");			
		} 
		else {
			this.year = year;
		}
	}

	public void setMonth(int month) throws DateException{
		if ( month <= 0) {
			throw new DateException("Los meses negativos no estan permitidos.\n");		
		} else {
			if ( month > 12 ){
				throw new DateException("Solo hay 12 meses, el mes introducido no es valido.\n");
			} 
			else {
				this.month = month;
			}
		}
	}
	public void setDay(int day)throws DateException{
		if(day<=0){
			throw new DateException("Los dias negativos no están permitidos.\n");
		}
		else{
			if(!isRightDay() ){
				throw new DateException("Error en la combinacion de mes y dia.\n");
			}
			else{
				this.day = day;
			}
		}
	}

	public int getYear(){
		return year;
	}
	public int getMonth(){
		return month;
	}
	public int getDay(){
		return day;
	}
	
	public Date tomorrow(){
		Date tomorrow = null;
		int d, m, y;
				
		d = this.day;
		m = this.month;
		y = this.year;
		
		d++;
		if ( d > this.daysOfMonth(month) ) {
			d = 1;
			m++;
			if ( m > 12 ) {
				m = 1;
				y++;
			}	
		}
		
		try{
			tomorrow = new Date(d, m, y);
		} catch (DateException e){
			System.err.println("Date.tomorrow: " + e.getMessage());
		}

		return tomorrow;
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
			try{
				for(int i=this.month;i<=12;i++){
					fecha.setMonth(i);
					months.append(fecha.monthName(this.month)+ " ");
				}
			} catch (DateException e){
				System.err.println("Date.monthsLeft: "+e.getMessage());
			}
			return months.toString();
		}
		
		public String printDate(){
			String fecha="";
			fecha = "La fecha es "+this.day+"/"+this.month+"/"+this.year+".";
			return fecha;
		}

		public int daysOfMonth(int month){
			int numberOfDays=0;
			if((month==1)||(month==3)||(month==5)||(month==7)||(month==8)||(month==10)||(month==12)){
				numberOfDays=31;
			}
			if((month==4)||(month==6)||(month==9)||(month==11)){
				numberOfDays=30;
			}
			if(month==2){
				numberOfDays=28;
			}
			return numberOfDays;
		}
		
		public String datesEndMonth(){
			StringBuffer fechas = new StringBuffer();
			for(int i=this.day;i<daysOfMonth(month);i++){
				fechas.append(this.day+"/"+this.month+"/"+this.year+"\n");
			}
			return fechas.toString();
		}
		
		public StringBuffer printMonthSameDays(){
			StringBuffer monthSameDays = new StringBuffer();
			for(int i=0;i<12;i++){
				if(daysOfMonth(this.month)==daysOfMonth(i)){
				monthSameDays.append(monthName(i));
				}
			}
		return monthSameDays;
		}
		
		public int countDays(){
			int days=0;
			for(int i=0;i<this.month;i++){
				days=days+daysOfMonth(i);
			}
			days=days+this.day;
			return days;
		}

		public int numberAttemps(Date other){
			double randMonth = Math.random()*12+1;
			double randDay = Math.random()*daysOfMonth((int)randMonth)+1;
			Date randDate = new Date();
			try{
				randDate = new Date((int)randDay, (int)randMonth, other.getYear());
			} catch (DateException e){
				System.err.println("randDate: " + e.getMessage());
			}
			int attemps=0;
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
