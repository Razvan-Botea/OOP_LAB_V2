
public class Matrice implements Numeric{
	public Numeric[][] matrice;
	
	public Matrice(int row, int col) {
		matrice = new Numeric[row][col];
	}
	
	public Matrice adunare(Numeric n) {
		Matrice m = (Matrice) n;
		Matrice rez = new Matrice(2, 2);
		for(int i = 0; i<2; i++) {
			for(int j = 0; j<2; j++) {
				rez.matrice[i][j] = matrice[i][j].adunare(m.matrice[i][j]);
			}
		}
		return rez;
	}
	
	public Matrice scadere(Numeric n) {
		Matrice m = (Matrice) n;
		Matrice rez = new Matrice(2, 2);
		for(int i = 0; i<2; i++) {
			for(int j = 0; j<2; j++) {
				rez.matrice[i][j] = matrice[i][j].scadere(m.matrice[i][j]);
			}
		}
		return rez;
	}
	
	public Matrice inmultire(Numeric n) {
		Matrice m = (Matrice) n;
		Matrice rez = new Matrice(2, 2);
		for(int i = 0; i<2; i++) {
			for(int j = 0; j<2; j++) {
				rez.matrice[i][j] = matrice[i][j].scadere(matrice[i][j]);
				for(int k = 0; k<2; k++) {
					rez.matrice[i][j] = rez.matrice[i][j].adunare(m.matrice[i][k].inmultire(matrice[k][j]));
				}
			}
		}
		return rez;
	}
}
