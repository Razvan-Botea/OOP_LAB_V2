import java.util.*;
public class MainClass {

	public static void main(String[] args) {
//		Integer[][] m1 = new Integer[][] {{1, 2, 3}, {4, 5, 6}, {1, 1, 1}};
//		Integer[][] m2 = new Integer[][] {{1, 1, 1}, {2, 2, 2}, {0, 0, 0}};
//		
//		IntegerMatrix integerMatrix = new IntegerMatrix();
//		
//		System.out.println("\nm1 + m2 is ");
//		GenericMatrix.printResult(m1, m2, integerMatrix.addMatrix(m1,  m2), '+');
//		
//		System.out.println("\nm1 * m2 is ");
//		GenericMatrix.printResult(m1, m2, integerMatrix.multiplyMatrix(m1,  m2), '*');
		
		List <String> cars = new ArrayList<String>();
		ListIterator<String> carsIt = cars.listIterator();
		
		cars.add("Dacia");
		cars.add("Renault");
		cars.add("Toyota");
		
		for(int i = 0; i < 3; i++)
			System.out.println(cars.get(i));
		
		System.out.println();
		
		for(int i = 0; i < 3; i++)
			if(cars.get(i) == "Dacia")
				cars.set(i ,"Logan");
		
		for(String car: cars)
			System.out.println(car);
		
		while(carsIt.hasNext()) {
			//if(carsIt.next() == "Toyota") {
				
			}
		}
		String[] chat = {"Buna", "Buna", "ce", "mai", "faci"};
		
		HashMap<String, Integer> myHash = new HashMap<>();
		
		for(String i: chat) {
			if(myHash.containsKey(i)) {
				myHash.put(i, myHash.get(i) + 1);
			}
			else {
				myHash.put(i, 1);
			}
		}
		
		for(Map.Entry<String, Integer> entry: myHash.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
