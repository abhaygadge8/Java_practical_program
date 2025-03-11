import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class CalFrame extends JFrame implements ActionListener{
	JLabel l1,l2,l3;
	JTextField t1,t2;
	JButton b1,b2,b3,b4,b5,b6;
	public CalFrame(){
		setTitle("MY NEW CAlCULATOR");
		setSize(400,500);
		setLocation(200,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new GridLayout(4,3,10,10));
		l1=new JLabel("Enter first Number");
		t1=new JTextField(" ");
		//l1.setBounds(150,150,80,80);
		//t1.setBounds(250,150,80,80);
		add(l1);
		add(t1);
		l2=new JLabel("Enter Second Number");
		t2= new JTextField(" ");
		//l2.setBounds(150,200,80,80);
		//t2.setBounds(250,200,80,80);
		add(l2);
		add(t2);
		l3=new JLabel("");
		//l3.setBounds(500,600,80,80);
		add(l3);
		b1=new JButton("Add");
		//b1.setBounds(150,250,70,70);
		add(b1);
		b2=new JButton("sub");
		//b2.setBounds(300,250,70,70);
		add(b2);
		b3=new JButton("MUl");
		//b3.setBounds(400,250,70,70);
		add(b3);
		b4=new JButton("Div");
		//b4.setBounds(150,300,70,70);
		add(b4);
		b5=new JButton("clear");
		//b5.setBounds(300,300,70,70);
		add(b5);
		b6=new JButton("Exit");
		//b6.setBounds(400,300,70,70);
		add(b6);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
			int num1=Integer.parseInt(t1.getText().trim());
			int num2=Integer.parseInt(t2.getText().trim());
			int sum=num1+num2;
			l3.setText("Result = "+sum);
		}else if(e.getSource()==b2){
			int num1=Integer.parseInt(t1.getText().trim());
			int num2=Integer.parseInt(t2.getText().trim());
			int sub=num1-num2;
			l3.setText("Result = "+sub);
		}else if(e.getSource()==b3){
			int num1=Integer.parseInt(t1.getText().trim());
			int num2=Integer.parseInt(t2.getText().trim());
			int mul=num1*num2;
			l3.setText("Result = "+mul);
		}else if(e.getSource()==b4){
			int num1=Integer.parseInt(t1.getText().trim());
			int num2=Integer.parseInt(t2.getText().trim());
			int div=num1/num2;
			l3.setText("Result = "+div);
		}else if(e.getSource()==b5){
			t1.setText(" ");
			t2.setText(" ");
		}else if(e.getSource()==b6){
			System.exit(0);
		}
	}
	public static void main(String[] args){
		new CalFrame();
	}
}