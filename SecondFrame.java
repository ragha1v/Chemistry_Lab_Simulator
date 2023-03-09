import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Paint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Graphics;

public class SecondFrame {
	private JFrame mainframe = new JFrame("Chemistry Workstation");

	public static Circle content;
	Scanner sc=new Scanner(System.in);
	static double fn1=-1;
	static double fv1=-1;

	

	public SecondFrame() {

		ImageIcon img1 = new ImageIcon("background.png");
    	mainframe.setIconImage(img1.getImage());

		JLabel n1l=new JLabel("Enter n1");
		JLabel v1l=new JLabel("Enter v1");
		
		n1l.setBounds(20, 30, 70, 30);
		v1l.setBounds(20, 65, 70, 30);
		
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
		mainframe.add(n2);
		mainframe.add(n1l);
		mainframe.add(v1l);

		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((dimension.getWidth() - mainframe.getWidth()) / 2);
		int y = (int) ((dimension.getHeight() - mainframe.getHeight()) / 2);
		mainframe.setLocation(x, y);


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



		content =new Circle();

    	content.setBounds(265, 200, 55, 90);

		GroupLayout lay = new GroupLayout(mainframe.getContentPane());
    	mainframe.getContentPane().setLayout(lay);
    	mainframe.getContentPane().add(button);
		mainframe.getContentPane().add(content);

    	JPanel p1 = new JPanel();
    	p1.setBounds(0,100,600,250);
    	p1.setBackground(Color.WHITE);
    	mainframe.add(p1);


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
                while(v2<sa)
                {
                    v2=v2+0.01;
					String z = decimalFormat.format(v2);
					System.out.println(z);
					v2 = Double.parseDouble(z);
                }
				System.out.println("\n"+ "Required value of v2 is " + v2);
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
