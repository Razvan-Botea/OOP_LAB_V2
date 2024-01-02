
public class TestClass2 {
	int[] v = {1, 2, 3, 4, 5};
	
	void main1() throws Exception{
		Exception e = new Exception("Mesaj");
		try {
			throw e;
		}
		catch(Exception ex) {
			System.out.println("Exceptie: " + e.getMessage());
		}
		finally {
			System.out.println("S-a ajuns la final");
		}
	}
}
