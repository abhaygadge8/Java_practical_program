import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class CheckBox extends JFrame implements ActionListener{
	JCheckBox checkjava,checkphp,checkcpp,checkc;
	JTextField subjectfield;
	JButton applybuttom;
	CheckBox(){
		setTitle("Choose the Subject");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(4,3,10,10));
		setVisible(true);
		subjectfield = new JTextField(" ");
		JLabel subjectlabel= new JLabel("your subject");
		JPanel subjectpanel= new JPanel();
		checkjava=new JCheckBox("JAVA");
		checkphp= new JCheckBox("PHP");
		checkcpp= new JCheckBox("C++");
		checkc= new JCheckBox("C");
		subjectpanel.add(checkjava);
		subjectpanel.add(checkphp);
		subjectpanel.add(checkcpp);
		subjectpanel.add(checkc);
		add(subjectlabel);
		add(subjectpanel);
		applybuttom = new JButton("apply change");
		applybuttom.addActionListener(this);
		add(applybuttom);
		add(subjectfield);		
	}
	public void actionPerformed(ActionEvent e){
			StringBuilder subject= new StringBuilder();
			if(checkjava.isSelected()){
				subject.append("JAVA ");
			}
			if(checkphp.isSelected()){
				subject.append("PHP ");
			}
			if(checkcpp.isSelected()){
				subject.append("C++ ");
			}
			if(checkc.isSelected()){
				subject.append("C ");
			}
			subjectfield.setText(subject.toString());
	}
	public static void main(String[] args){
		new CheckBox();
	}
}