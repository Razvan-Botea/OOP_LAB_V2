
public class TestClass {
	int[] v = {1, 2, 3, 4, 5};
	
	void main() throws Exception{
		try {
			int c = v[6];
		}
		catch(Exception e){
			System.out.println("Exceptie");;
		}
	}
}
