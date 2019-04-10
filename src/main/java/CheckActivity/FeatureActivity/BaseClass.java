package CheckActivity.FeatureActivity;

import java.io.PrintStream;

public class BaseClass {

	public static void main(String args []) {
		
		int rowCount=5;
		
		for (int i=1;i<=rowCount;++i) {
			for (int j=1;j<=i;++j) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
}
