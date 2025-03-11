import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SimpleCBB extends JFrame implements ActionListener 
{
JComboBox<String> cityComboBox;
JTextField classField;
JButton applyButton;
public SimpleCBB() {
        // Set up the frame
        setTitle("Check Box Form");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 3, 10, 10));
		classField = new JTextField("");
		
		JLabel cityTypeLabel = new JLabel("City:");
        cityComboBox = new JComboBox<>(new String[]{"Pune", "Latur", "Amravati","Mumbai","Solapur"});
        add(cityTypeLabel);
        add(cityComboBox);
		
		applyButton = new JButton("Apply Changes");
        applyButton.addActionListener(this);
        add(applyButton);
		add(classField);
		setVisible(true);
		}//constructor
		@Override
		public void actionPerformed(ActionEvent e) {
        
		String myCity = (String) cityComboBox.getSelectedItem();
		
		classField.setText(myCity);
		}

		public static void main(String[] args)
			{
				new SimpleCBB();
			}
	}

