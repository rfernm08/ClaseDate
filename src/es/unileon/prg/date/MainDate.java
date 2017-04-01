package es.unileon.prg.date;

public class MainDate{

	public static void main(String[] args) {
		try {
			Date today = new Date(1, 4, 2017);
			System.out.println(today);
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
