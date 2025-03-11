import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SimpleRB extends JFrame implements ActionListener 
{
JRadioButton fyButton, syButton, tyButton;
ButtonGroup classGroup;
JTextField classField;
JButton applyButton;
public SimpleRB() {
        // Set up the frame
        setTitle("Radio Button Form");
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 3, 10, 10));
		classField = new JTextField("");
		// Your Class
        JLabel classLabel = new JLabel("Your Class:");
        JPanel classPanel = new JPanel();
        fyButton = new JRadioButton("FY");
        syButton = new JRadioButton("SY");
        tyButton = new JRadioButton("TY");
        classGroup = new ButtonGroup();
        classGroup.add(fyButton);
        classGroup.add(syButton);
		classGroup.add(tyButton);
        classPanel.add(fyButton);
        classPanel.add(syButton);
        classPanel.add(tyButton);
        add(classLabel);
        add(classPanel);
		
		applyButton = new JButton("Apply Changes");
        applyButton.addActionListener(this);
        add(applyButton);
		add(classField);
		setVisible(true);
		}//constructor
		@Override
		public void actionPerformed(ActionEvent e) {
        
			
        // Get class
        String className = "";
        if (fyButton.isSelected()) {
            {
				className = "FY";
			}
        } else if (syButton.isSelected()) {
            className = "SY";
        } else if (tyButton.isSelected()) {
            className = "TY";
        }
		
		classField.setText(className);
		}

		public static void main(String[] args)
			{
				new SimpleRB();
			}
	}

