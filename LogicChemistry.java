package Lec54;
import java.util.*;
public class LogicChemistry {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		//N1V1=N2V2
		// String Element=sc.next();
		// System.out.println(Element);
		// Element array will be converted into drop down list in the gui 
		String Element = {NaOH}
		double n1=sc.nextDouble();
		if(n1<=5 || n1>=0.01)
		{
			double v1=sc.nextDouble();
			double minmoles=0.01;
			double maxmoles=5;
			float n2= (float) (Math.random() * (maxmoles-minmoles+1)+minmoles);
			System.out.println(n2);
			double v2=0;
			while(n1*v1!=(int)(n2*v2))
			{
				System.out.println((int)(n2*v2));
				v2+=0.0001;
			}
			System.out.println(v2);
		}
	}
}
