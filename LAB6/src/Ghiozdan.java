public class Ghiozdan {
	Rechizita[] lista;
	int n = 0;
	
	public Ghiozdan(int n) {
		lista = new Rechizita[n];
	}
	
	public void addCaiet(Caiet c) {
		lista[n] = c;
		n++;
	}
	
	public void addManual(Manual m) {
		lista[n] = m;
		n++;
	}
	
	public void listItems() {
		for(int i=0; i<n; i++)
			System.out.println(lista[i].getNume());
	}
	
	public void listManual() {
		for(int i = 0; i<n; i++) {
			if(lista[i] instanceof Manual)
				System.out.println(lista[i].getNume());
		}
	}
	
	public void listCaiet() {
		for(int i = 0; i<n; i++) {
			if(lista[i] instanceof Caiet)
				System.out.println(lista[i].getNume());
		}
	}
	
	public void getNrRechizite() {
		int nrRec = 0;
		for(int i = 0; i<n; i++) {
			nrRec++;
		}
		System.out.println(nrRec);
	}
	
	public void getNrCaiete() {
		int nrCaiete = 0;
		for(int i = 0; i<n; i++) {
			if(lista[i] instanceof Caiet) {
				nrCaiete++;
			}
		}
		System.out.println(nrCaiete);
	}
	
	public void getNrManuale() {
		int nrManuale = 0;
		for(int i = 0; i<n; i++) {
			if(lista[i] instanceof Manual) {
				nrManuale++;
			}
		}
		System.out.println(nrManuale);
	}
}
