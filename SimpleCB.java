import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SimpleCB extends JFrame implements ActionListener 
{
JCheckBox musicCheck, sportsCheck, travelCheck;
JTextField classField;
JButton applyButton;
public SimpleCB() {
        // Set up the frame
        setTitle("Check Box Form");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 3, 10, 10));
		classField = new JTextField("");
		// Your Hobbies
        JLabel hobbiesLabel = new JLabel("Your Hobbies :");
        JPanel hobbiesPanel = new JPanel();
        musicCheck = new JCheckBox("Music");
        sportsCheck = new JCheckBox("Sports");
        travelCheck = new JCheckBox("Traveling");
        hobbiesPanel.add(musicCheck);
        hobbiesPanel.add(sportsCheck);
        hobbiesPanel.add(travelCheck);
        add(hobbiesLabel);
        add(hobbiesPanel);
		
		applyButton = new JButton("Apply Changes");
        applyButton.addActionListener(this);
        add(applyButton);
		add(classField);
		setVisible(true);
		}//constructor
		@Override
		public void actionPerformed(ActionEvent e) {
        
		// Get hobbies
        StringBuilder hobbies = new StringBuilder();
        if (musicCheck.isSelected()) {
            hobbies.append("Music ");
        }
        if (sportsCheck.isSelected()) {
            hobbies.append("Sports ");
        }
        if (travelCheck.isSelected()) {
            hobbies.append("Traveling ");
        }
		
		classField.setText(hobbies.toString());
		}

		public static void main(String[] args)
			{
				new SimpleCB();
			}
	}

