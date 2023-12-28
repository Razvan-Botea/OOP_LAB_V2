public class CreareTabla {
	public void creare(Piesa[] p, int n) {
		for (int i = 0; i < 7; ++i) {
		    if (i == 0) {
		        System.out.print("  |");
		        for (int j = 0; j < 8; ++j) {
		        	int ok = 0;
			    	for(int k = 0; k<n; k++) {
		        		if(i == p[k].coordY && j == p[k].coordX) {
		        			System.out.print(p[k].numePiesa + "|");
		        			ok = 1;
		        		}
		        			
		        	}
			    	if(ok == 0)
			    		System.out.print(" " + " " + "|"); // in loc de j se pune numarul piesei care intra in acel patrat
		        }
		        System.out.print("\n--+");
		        for (int j = 0; j < 8; ++j) {
		            System.out.print("--+");
		        }
		        System.out.println();
		    }
		    else {
			    System.out.print("  |");
		
			    for (int j = 0; j < 8; ++j) {
			    	int ok = 0;
			    	for(int k = 0; k<n; k++) {
		        		if(i == p[k].coordY && j == p[k].coordX) {
		        			System.out.print(p[k].numePiesa + "|");
		        			ok = 1;
		        		}
		        			
		        	}
			    	if(ok == 0)
			    		System.out.print(" " + " " + "|"); // in loc de j se pune numarul piesei care intra in acel patrat
			    }
			    System.out.print("\n--+");
			    for (int j = 0; j < 8; ++j) {
			        System.out.print("--+");
			    }
			    System.out.println();
			}
		}
		System.out.println();
		System.out.println();
	}
}
