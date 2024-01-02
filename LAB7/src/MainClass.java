import java.util.Arrays;
import java.awt.Color;

public class MainClass {

	public static void main(String[] args) {
//		Complex c1 = new Complex(2, 3);
//		Complex c2 = new Complex(4, 7);
//		Complex rez1 = c1.adunare(c2);
//		//System.out.println(rez1);
//		
//		Fractie f1 = new Fractie(1, 5);
//		Fractie f2 = new Fractie(3, 6);
//		Fractie rez2 = f1.scadere(f2);
//		//System.out.println(rez2);
//		
//		Matrice m1 = new Matrice(2, 2);
//		m1.matrice[0][0] = new Complex(2, 3);
//		m1.matrice[0][1] = new Complex(1, 4);
//		m1.matrice[1][0] = new Complex(5, 1);
//		m1.matrice[1][1] = new Complex(3, 2);
//		for(int i = 0; i<2; i++){
//			for(int j = 0; j<2; j++) {
//				//System.out.print("(" + m1.matrice[i][j] + ")" + " ");
//			}
//			//System.out.println();
//		}
//		
//		//System.out.println();
//		//System.out.println();
//		
//		Matrice m2 = new Matrice(2, 2);
//		m2.matrice[0][0] = new Complex(5, 2);
//		m2.matrice[0][1] = new Complex(2, 1);
//		m2.matrice[1][0] = new Complex(3, 3);
//		m2.matrice[1][1] = new Complex(1, 4);
//		for(int i = 0; i<2; i++){
//			for(int j = 0; j<2; j++) {
//				//System.out.print("(" + m2.matrice[i][j] + ")" + " ");
//			}
//			//System.out.println();
//		}
//		
//		//System.out.println();
//		//System.out.println();
//		
//		Matrice rez3 = new Matrice(2, 2);
//		rez3 = m1.inmultire(m2);
//		for(int i = 0; i<2; i++){
//			for(int j = 0; j<2; j++) {
//				//System.out.print("(" + rez3.matrice[i][j] + ")" + " ");
//			}
//			//System.out.println();
//		}
//		
//		Matrice m3 = new Matrice(2, 2);
//		m3.matrice[0][0] = new Fractie(2, 3);
//		m3.matrice[0][1] = new Fractie(1, 4);
//		m3.matrice[1][0] = new Fractie(5, 1);
//		m3.matrice[1][1] = new Fractie(3, 2);
//		for(int i = 0; i<2; i++){
//			for(int j = 0; j<2; j++) {
//				System.out.print("(" + m3.matrice[i][j] + ")" + " ");
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		System.out.println();
//		
//		Matrice m4 = new Matrice(2, 2);
//		m4.matrice[0][0] = new Fractie(5, 2);
//		m4.matrice[0][1] = new Fractie(2, 1);
//		m4.matrice[1][0] = new Fractie(3, 3);
//		m4.matrice[1][1] = new Fractie(1, 4);
//		for(int i = 0; i<2; i++){
//			for(int j = 0; j<2; j++) {
//				System.out.print("(" + m4.matrice[i][j] + ")" + " ");
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		System.out.println();
//		
//		Matrice rez4 = new Matrice(2, 2);
//		rez4 = m3.scadere(m4);
//		for(int i = 0; i<2; i++){
//			for(int j = 0; j<2; j++) {
//				System.out.print("(" + rez4.matrice[i][j] + ")" + " ");
//			}
//			System.out.println();
//		}
		
//		Persoana[] pers = new Persoana[5];
//		
//		pers[0] = new Persoana("Pop", "Vasile", 35);
//		pers[1] = new Persoana("Muntean", "Andrei", 21);
//		pers[2] = new Persoana("Andris", "Denis", 15);
//		pers[3] = new Persoana("Botea", "Razvan", 19);
//		pers[4] = new Persoana("Zoran", "Elena", 12);
//		
//		System.out.println("Inainte de sortare:");
//		for(int i = 0; i<5; i++)
//			System.out.println(pers[i]);
//		
//		Arrays.sort(pers);
//		
//		System.out.println();
//		System.out.println("Dupa sortare:");
//		for(int i = 0; i<5; i++)
//			System.out.println(pers[i]);
		
		Masina m = new Masina("Audi", Color.BLUE);
		Student s = new Student("Catruna", "Porfirie", m);
		
		Student s1;
		s1 = s.clone();
		
		s1.getMasina().revopsire(Color.BLACK);
		
		System.out.println(s);
		System.out.println(s1);
	}
}
