public class Matrice {
	Complex[][] matrice;
	
	public Matrice(int row, int col) {
		matrice = new Complex[row][col];
	}
	
	public Matrice adunare(Matrice x, int n) {
		Matrice rez = new Matrice(n, n);
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				rez.matrice[i][j] = this.matrice[i][j].adunare(x.matrice[i][j]);
			}
		}
		return rez;
	}
	
	public Matrice scadere(Matrice x, int n) {
		Matrice rez = new Matrice(n, n);
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				rez.matrice[i][j] = this.matrice[i][j].scadere(x.matrice[i][j]);
			}
		}
		return rez;
	}
	
	public Matrice inmultireScal(int n, int k) {
		Matrice rez = new Matrice(n, n);
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				rez.matrice[i][j] = this.matrice[i][j].inmultireScalar(k);
			}
		}
		return rez;
	}
	
	public Matrice inmultireMatrice(Matrice x, int n) {
		Matrice rez = new Matrice(n, n);
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				rez.matrice[i][j] = matrice[i][j].scadere(matrice[i][j]);
				for(int k = 0; k<n; k++) {
					rez.matrice[i][j] = rez.matrice[i][j].adunare(x.matrice[i][k].inmultire(matrice[k][j]));
				}
			}
		}
		return rez;
	}
}
