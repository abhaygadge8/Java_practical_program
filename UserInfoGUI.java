import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class UserInfoGUI extends JFrame implements ActionListener{
	JTextField namefield,classfield;
	JCheckBox musicCheck,sportCheck,travelCheck,boldCheck,italicCheck,underlineCheck;
	JRadioButton fyButton,syButton,tyButton;
	JComboBox<String> fontComboBox, sizeComboBox;
	JTextArea resultArea;
	JButton applybutton;
	ButtonGroup classGroup;
	
	public UserInfoGUI(){
		setTitle("Student Information form");
		setSize(400,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(7,2,10,10));
		setVisible(true);
		
		JLabel namelabel= new JLabel("Your Name : ");
		namefield = new JTextField(20);
		add(namelabel);
		add(namefield);
		//Hobbies
		JLabel hobbieslabel = new JLabel("Your Hobbies");
		JPanel hobbiespanel = new JPanel();
		musicCheck = new JCheckBox("Music");
		sportCheck = new JCheckBox("Sport");
		travelCheck = new JCheckBox("Travelling");
		hobbiespanel.add(musicCheck);
		hobbiespanel.add(sportCheck);
		hobbiespanel.add(travelCheck);
		add(hobbieslabel);
		add(hobbiespanel);
		//Font
		JLabel fontlabel = new JLabel("Font Sytle :");
		JPanel fontpanel = new JPanel();
		boldCheck = new JCheckBox("Bold");
		italicCheck = new JCheckBox("Italic");
		underlineCheck = new JCheckBox("Underline");
		fontpanel.add(boldCheck);
		fontpanel.add(italicCheck);
		fontpanel.add(underlineCheck);
		add(fontlabel);
		add(fontpanel);
		//class
		JLabel classlabel = new JLabel("Your Class : ");
		JPanel classpanel = new JPanel();
		fyButton = new JRadioButton("FY");
		syButton = new JRadioButton("SY");
		tyButton = new JRadioButton("TY");
		classGroup = new ButtonGroup();
		classGroup.add(fyButton);
		classGroup.add(syButton);
		classGroup.add(tyButton);
		classpanel.add(fyButton);
		classpanel.add(syButton);
		classpanel.add(tyButton);
		add(classlabel);
		add(classpanel);
		
		//font Options
		JLabel fonttypelabel = new JLabel("Font type :");
		fontComboBox = new JComboBox<>(new String[] {"Arial","Serif","Sansserif","Times new Roman"});
		add(fonttypelabel);
		add(fontComboBox);
		//font size option
		JLabel sizelabel = new JLabel("Font size :");
		sizeComboBox = new JComboBox<>(new String[] {"8","10","12","14","16","18","20","25","60"});
		add(sizelabel);
		add(sizeComboBox);
		//result area
		resultArea = new JTextArea(5,40);
		resultArea.setEditable(false);
		JScrollPane scrollpane = new JScrollPane(resultArea);
		add(new JLabel("Display All content : "));
		add(scrollpane);
		
		applybutton = new JButton("apply change");
		applybutton.addActionListener(this);
		add(applybutton);
	}
	public void actionPerformed(ActionEvent e){
		String name = namefield.getText();
		//get class
		String className="";
		if(fyButton.isSelected()){
			className="FY";
		}else if(syButton.isSelected()){
			className ="SY";
		}else if(tyButton.isSelected()){
			className="TY";
		}
		//get hobbies
		StringBuilder hobbies=new StringBuilder();
		if(musicCheck.isSelected()){
			hobbies.append("Music ");
		}
		if(sportCheck.isSelected()){
			hobbies.append("Sport ");
		}
		if(travelCheck.isSelected()){
			hobbies.append("travelling ");
		}
		//get font style
		StringBuilder style= new StringBuilder();
		if(boldCheck.isSelected()){
			style.append("BOld ");
		}
		if(italicCheck.isSelected()){
			style.append("Italic ");
		}
		if(underlineCheck.isSelected()){
			style.append("Underline ");
		}
		//font type and size
		String fontype= (String) fontComboBox.getSelectedItem();
		String fontsize= (String) sizeComboBox.getSelectedItem();
		
		//display result
		resultArea.setText("Name : "+name+"\nClass : "+className+ "\nHobbies : "+hobbies.toString() +
			"\nFont : "+ fontype +" "+fontsize+ "\n"+ style.toString());
	}
	public static void main(String[] args){
		new UserInfoGUI();
	}
	
}