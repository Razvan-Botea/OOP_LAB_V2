
public class ExceptieCustom extends Exception {
	public String sir;
	
	public ExceptieCustom(String s) {
		this.sir = s;
	}
	
	public String getSir() {
		return sir;
	}
}
