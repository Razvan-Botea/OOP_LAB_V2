public abstract class Piesa {
	public String numePiesa;
	public int coordX;
	public int coordY;
	
	public Piesa(String n, int x, int y) {
		numePiesa = n;
		coordX = x;
		coordY = y;
	}
	
	public abstract void mutaPiesa(int x, int y) ;
}
