
public class MainClass {

	public static void main(String[] args) throws ExceptieCustom /*throws ExceptieZiNelucratoare */ {
//		CalendarLucru c1 = new CalendarLucru();
//		
//		Lucrator l1 = new Lucrator("Vasile", c1);
//		
//		l1.lucreaza("Luni");
//		l1.lucreaza("masina");
//		l1.lucreaza("Duminica");
		
//		String text = null;
//		
//		try {
//			int length = text.length();
//			System.out.println(length);
//		}
//		catch(Exception e) {
//			System.out.println("Exceptie NullPointerException: " + e.getMessage());
//		}
//		
//		TestClass2 t = new TestClass2();
//		t.main1();
		
		ExceptieCustom e = new ExceptieCustom("Mesaj custom");
		
		try {
			throw e;
		}
		catch(Exception ex) {
			System.out.println(e.getSir());
		}
	}

}
