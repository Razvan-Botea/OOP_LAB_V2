
public class MainClass {

	public static void main(String[] args) {
		Matrice a = new Matrice(2, 2);
		Matrice b = new Matrice(2, 2);
		
		for(int i = 0; i<2; i++) {
			for(int j = 0; j<2; j++) {
				a.matrice[i][j] = new Complex(i+1, j+1);
				b.matrice[i][j] = new Complex(i+2, j+2);
			}
		}
		
		for(int i = 0; i<2; i++) {
			for(int j = 0; j<2; j++) {
				System.out.print("(" + a.matrice[i][j] + ")" + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i<2; i++) {
			for(int j = 0; j<2; j++) {
				System.out.print("(" + b.matrice[i][j] + ")" + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		Matrice s = a.inmultireMatrice(b, 2);
		
		for(int i = 0; i<2; i++) {
			for(int j = 0; j<2; j++) {
				System.out.print("(" + s.matrice[i][j] + ")" + " ");
			}
			System.out.println();
		}
	}
}
