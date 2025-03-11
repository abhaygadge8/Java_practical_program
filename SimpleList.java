import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class SimpleList extends JFrame implements ActionListener 
{
JList<String> cityList;
JTextField classField;
JButton applyButton;
public SimpleList() {
        // Set up the frame
        setTitle("Check Box Form");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 3, 10, 10));
		classField = new JTextField("");
		
		JLabel cityTypeLabel = new JLabel("City:");
        cityList = new JList<>(new String[]{"Pune", "Latur", "Amravati","Mumbai","Solapur"});
        cityList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(cityTypeLabel);
        add(cityList);
		
		applyButton = new JButton("Apply Changes");
        applyButton.addActionListener(this);
        add(applyButton);
		add(classField);
		setVisible(true);
		}//constructor
		@Override
		public void actionPerformed(ActionEvent e) {
        
		List<String> myList = cityList.getSelectedValuesList();
		
		classField.setText(myList.toString());
		}

		public static void main(String[] args)
			{
				new SimpleList();
			}
	}

