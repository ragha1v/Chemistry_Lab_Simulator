
import java.util.*;
import java.text.DecimalFormat;
import java.util.Random;
public class Main {
public static void calculate()
	{
		Scanner sc=new Scanner(System.in);
	        //Enter moles of N1
            System.out.println("Enter N1 moles");
			double n1 = sc.nextDouble();
			//if it is in range that is 0.01 to 5
			if(n1>=0.01 && n1<=5.00)
			{
				//Enter V1
				System.out.println("Enter volumes of element choosen");
				double v1 = sc.nextDouble(); 
				//generate random value for N2 between 0.01 to 5 and upto two decimal palces
				Random random = new Random();
                double n2 = 0.01 + (5.00 - 0.01) * random.nextDouble();
                DecimalFormat decimalFormat = new DecimalFormat("0.00");
                String t=decimalFormat.format(n2);
                n2 = Double.parseDouble(t);
                System.out.println(n2);
                //V2 will be calculated based on the formula of (n1*v1)/n2
                double v2=0.00;                
				String t1 =decimalFormat.format((n1*v1)/n2);
				double sa = Double.parseDouble(t1);
				//Counter will be keep on increaing by 0.01 till we do not get the required volume
				System.out.println("Counter");	
				//calculate v2 and displaying the final result 			
                while(v2<sa)
                {
                    v2=v2+0.01;
					String z = decimalFormat.format(v2);
					System.out.println(z);
					v2 = Double.parseDouble(z);
                }
				System.out.println("\n"+ "Required value of v2 is " + v2);
			}
			//if n1 is not in the range it will display error 
				else{
					System.out.println("Invalid input enter N1 moles again");
				} 
	}
	public static void main(String [] args) {
		
	Scanner sc=new Scanner(System.in);
		String Reaction[] = {"HCl + NaOH",
"CH3COOH + NaOH",
"H2SO4 + NaOH",
"HNO3 + NaOH",
"Oxalic acid + NaOh",
"HCl + KOH",
"CH3COOH + KOH",
"H2SO4 + KOH",
"HNO3 + KOH",
"Oxalic acid + KOH",
"NaOH + HCl",
"NaOH + CH3COOH",
"NaOH + H2SO4",
"NaOH + HNO3",
"NaOH + Oxalic acid",
"KOH	+ HCl",
"KOH + CH3COOH",
"KOH + H2SO4",
"KOH + HNO3",
"KOH + Oxalic acid",
"HCl + NH4OH",
"H2SO4 + NH4OH",
"HNO3 + NH4OH",
"HCl + KOH",
"H2SO4 + KOH",
"HNO3 + KOH",
"HCl + NaOH",
"H2SO4 + NaOH",
"HNO3 + NaOH",
"HCl + KOH",
"H2SO4 + KOH",
"HNO3 + KOH",
"HCl + NaOH",
"H2SO4 + NaOH",
"HNO3 + NaOH",
"KOH + HCl",
"KOH + H2SO4",
"KOH + HNO3",
"NaOH + HCl",
"NaOH + H2SO4",
"NaOH + HNO3"
};
	
		
		for(int i=0;i<Reaction.length;i++)
		{
			System.out.println(i+1+" "+Reaction[i]);
		}
		System.out.println("Make choice of the reaction to conduct by pressing the number mentioned");
        int element_choice = sc.nextInt(); 
		switch(element_choice)
		{
			
			case 1:
			{calculate();
			}
		}

	}
}