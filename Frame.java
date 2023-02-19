import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class frame {
  frame(){
    
    Font myfont=new Font("Times New Roman",Font.BOLD , 25);
    JFrame f1 = new JFrame("Chemistry WorkStation");
    f1.setSize(595, 460);
    f1.setLayout(new FlowLayout());

    Cursor mycursor = new Cursor(Cursor.HAND_CURSOR);

    ImageIcon img1 = new ImageIcon("background.png");
    f1.setIconImage(img1.getImage());

    ImageIcon img2 = new ImageIcon("upes_logo.jpg");
    JLabel l2 = new JLabel("University Of Petroleum and Energy Studies" , img2 , JLabel.CENTER);
    l2.setVerticalTextPosition(JLabel.BOTTOM);
    l2.setHorizontalTextPosition(JLabel.CENTER);
    // l2.setText("UPES");
    l2.setBounds(4,3,600,100);
    f1.add(l2);

    ImageIcon img3 = new ImageIcon("2.jpg");
    JLabel l3 = new JLabel(".",img3,JLabel.CENTER);
    l3.setBounds(0,-8,600,500);
    f1.add(l3);

    ImageIcon img4 = new ImageIcon("start.jpg");
    JButton b1 = new JButton("START -->");
    b1.setBounds(0,388,595,35);
    b1.setFocusable(false);
    b1.setBackground(Color.lightGray);
    b1.setBorder(BorderFactory.createEtchedBorder());
    b1.setForeground(Color.black);
    b1.setFont(new Font("DialogInput" , Font.BOLD,12));
    b1.setCursor(mycursor);

    b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				f1.dispose();
				new SecondFrame();
			}
		});

    f1.add(b1);

    GroupLayout lay = new GroupLayout(f1.getContentPane());
    f1.getContentPane().setLayout(lay);
    f1.getContentPane().add(b1);

    JPanel p1 = new JPanel();
    p1.setBounds(0,100,600,250);
    p1.setBackground(Color.WHITE);
    f1.add(p1);

    f1.setVisible(true);
    f1.setResizable(false);
    f1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
  }


  public static void main(String args[]){
     frame obj = new frame();
  }
}