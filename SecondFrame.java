import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Paint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.*;
import javax.swing.Timer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Graphics;

public class SecondFrame {
	public static JFrame mainframe = new JFrame("Chemistry Workstation");

	public static Circle content;
	Scanner sc=new Scanner(System.in);
	static double fn1=-1;
	static double fv1=-1;

	

	public SecondFrame() {

		ImageIcon img1 = new ImageIcon("background.png");
    	mainframe.setIconImage(img1.getImage());

		JLabel n1l=new JLabel("Enter n1");
		JLabel v1l=new JLabel("Enter v1");
		// JLabel reqv =new JLabel("\n"+ "Required value of v2 is ");
		
		n1l.setBounds(20, 30, 70, 30);
		v1l.setBounds(20, 65, 70, 30);
		// reqv.setBounds(20, 95, 70, 30);
		
		final JTextField n1=new JTextField();
		n1.setBounds(100, 30, 130, 30);

		final JTextField n2=new JTextField();
		n2.setBounds(100, 65, 130, 30);

		JButton button = new JButton("Get V2");
		button.setBounds(0,388,595,35);
		button.setFocusable(false);
    	button.setBackground(Color.lightGray);
    	button.setBorder(BorderFactory.createEtchedBorder());
    	button.setForeground(Color.black);
    	button.setFont(new Font("DialogInput" , Font.BOLD,12));
		
		// JButton jb=new JButton("Get V2");
		// jb.setBounds(0,388,595,35);

		mainframe.add(n1);
		// mainframe.add(reqv);
		mainframe.add(n2);
		mainframe.add(n1l);
		mainframe.add(v1l);

		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((dimension.getWidth() - mainframe.getWidth()) / 2);
		int y = (int) ((dimension.getHeight() - mainframe.getHeight()) / 2);
		mainframe.setLocation(x, y);


		// Timer timer = new Timer(500);

		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String n1s= n1.getText();
				String n2s= n2.getText();
				System.out.println(n1s+" "+n2s);
				fn1=Double.parseDouble(n1s);
				fv1=Double.parseDouble(n2s);
				calculate(fn1, fv1);	
            	Circle.isToDraw = true;
            	content.paintImmediately(content.getBounds());
            	Circle.isToDraw = false;


				// content.setBorder(BorderFactory.createLineBorder(Color.pink));
				content.setBackground(Color.pink);
    			content.setBounds(265, 200, 55, 90);
			}
		});

		mainframe.add(button);

		JLabel selectedLabel1 = new JLabel("Selected Item: ");

		String[] items = {"HCl + NaOH",
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
"NaOH + HNO3"};

        // Create a dropdown list and add it to the content pane
        JComboBox<String> dropdownList = new JComboBox<>(items);
        // contentPane.add(dropdownList);

		dropdownList.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get the selected item from the JComboBox
                String selected = (String) dropdownList.getSelectedItem();

				selectedLabel1.setText("Selected Burette + Flask : " + selected);
            }

			// r1.setBounds(50, 280, 40, 30);
        });

        // Set the frame properties
        // dropdownList.setName("Dropdown");
        // dropdownList.setSize(90, 50);
		// dropdownList.setBounds(50,270,40,30);
		// selectedLabel1.setBounds(50,290,40,30);
        // dropdownList.setLocationRelativeTo(null);

		JLabel selectedLabel2 = new JLabel("Indicator : ");

		String[] items1 = {"Phenolphthalein",
"Phenolphthalein",
"Phenolphthalein",
"Phenolphthalein",
"Phenolphthalein",
"Phenolphthalein",
"Phenolphthalein",
"Phenolphthalein",
"Phenolphthalein",
"Phenolphthalein",
"Phenolphthalein",
"Phenolphthalein",
"Phenolphthalein",
"Phenolphthalein",
"Phenolphthalein",
"Phenolphthalein",
"Phenolphthalein",
"Phenolphthalein",
"Phenolphthalein",
"Phenolphthalein",
"Methly orange",
"Methly orange",
"Methly orange",
"Methly orange",
"Methly orange",
"Methly orange",
"Methly orange",
"Methly orange",
"Methly orange",
"Bromothymol Blue",
"Bromothymol Blue",
"Bromothymol Blue",
"Bromothymol Blue",
"Bromothymol Blue",
"Bromothymol Blue",
"Bromothymol Blue",
"Bromothymol Blue",
"Bromothymol Blue",
"Bromothymol Blue",
"Bromothymol Blue",
"Bromothymol Blue"
};

        // Create a dropdown list and add it to the content pane
        JComboBox<String> dropdownList1 = new JComboBox<>(items1);
        // contentPane.add(dropdownList);

		dropdownList1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get the selected item from the JComboBox
                String selected2 = (String) dropdownList1.getSelectedItem();

				selectedLabel2.setText("Indicator: " + selected2);
            }
        });

		// dropdownList1.setName("Dropdown");
        // dropdownList1.setSize(90, 50);
		// dropdownList1.setBounds(50,320,40,30);
		// selectedLabel2.setBounds(50,280,40,30);

		content =new Circle();

    	content.setBounds(265, 200, 55, 90);
		// content.add(dropdownList1);
		// content.add(selectedLabel2);

		GroupLayout lay = new GroupLayout(mainframe.getContentPane());
    	mainframe.getContentPane().setLayout(lay);
    	mainframe.getContentPane().add(button);
		mainframe.getContentPane().add(content);
		// mainframe.getContentPane().add(dropdownList);

    	JPanel p1 = new JPanel();
    	p1.setBounds(0,100,600,250);
    	p1.setBackground(Color.WHITE);

		dropdownList.setSize(90, 50);
		dropdownList.setBounds(50,270,40,30);
		selectedLabel1.setBounds(50,290,40,30);

		dropdownList1.setSize(90, 50);
		dropdownList1.setBounds(50,320,40,30);
		selectedLabel2.setBounds(50,280,40,30);

		p1.add(dropdownList);
		p1.add(dropdownList1);
		p1.add(selectedLabel1);
		p1.add(selectedLabel2);

    	mainframe.add(p1);
		// mainframe.add(dropdownList);


		mainframe.setVisible(true);

		mainframe.setSize(595,460);
		mainframe.setResizable(false);
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}
	public static void calculate(double n1, double v1)
	{
			if(n1>=0.01 && n1<=5.00)
			{
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
				String s = "";		
                while(v2<sa)
                {
                    v2=v2+0.01;
					String z = decimalFormat.format(v2);
					System.out.println(z);
					v2 = Double.parseDouble(z);

					s = "Required value of v2 is "+ v2;

                }
				System.out.println("\n"+ "Required value of v2 is " + v2);
				JButton button1 = new JButton(s);
				button1.setBounds(180,300,230,35);
				button1.setFocusable(false);
    			button1.setBackground(Color.WHITE);
    			button1.setBorder(BorderFactory.createEtchedBorder());
    			// button1.setForeground(Color.black);
    			button1.setFont(new Font("DialogInput" , Font.BOLD,12));
				mainframe.add(button1);
				
				return;
			}
			//if n1 is not in the range it will display error 
				else{
					System.out.println("Invalid input enter N1 moles again");
				}
	}
}


class Circle extends JPanel{
	public static Boolean isToDraw = false;

	public void paintComponent(Graphics arg0) {
    	if (isToDraw) {
        	arg0.setColor(Color.magenta);
			// arg0.fillOval(20, 100, 50, 50);
    	} else {
        	super.paintComponent(arg0);
    	}
	}
}
