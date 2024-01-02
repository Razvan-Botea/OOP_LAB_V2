
public class Lucrator {
	private String nume;
	private CalendarLucru calendar;
	
	public Lucrator(String n, CalendarLucru c) {
		this.nume = n;
		this.calendar = c;
	}
	
	public void lucreaza(String s) throws ExceptieZiNelucratoare{
		int ok = 0;
		for(int i = 0; i < 7; i++) {
			if(s == calendar.getZi(i) && calendar.getLucratoare(i)) {
				ok = 1;
				System.out.println("Lucratorul " + nume + " lucreaza " + s);
			}
			else if(s == calendar.getZi(i) && !calendar.getLucratoare(i)) {
				ok = 1;
				throw new ExceptieZiNelucratoare("lucru in zi nelucratoare");
			}
		}
		if(ok == 0) {
			System.out.println(s + " nu este o zi a saptamanii");
		}
	}
}
