import java.awt.*;
import java.awt.event.*;

public class RadioButtonExample extends Frame implements ActionListener {

    RadioButton rb1, rb2;
    Label label;

    public RadioButtonExample() {
        setTitle("Radio Button Example");
        setLayout(new FlowLayout());

        rb1 = new RadioButton("Option 1");
        rb2 = new RadioButton("Option 2");
        
        // Create a ButtonGroup to ensure only one radio button can be selected at a time
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        label = new Label("Selected Option: ");

        // Add ActionListener to each radio button
        rb1.addActionListener(this);
        rb2.addActionListener(this);

        add(rb1);
        add(rb2);
        add(label);

        setSize(300, 200);
        setVisible(true);
    }

    // Implement the actionPerformed method to handle the selection change
    public void actionPerformed(ActionEvent e) {
        if (rb1.isSelected()) {
            label.setText("Selected Option: Option 1");
        } else if (rb2.isSelected()) {
            label.setText("Selected Option: Option 2");
        }
    }

    public static void main(String args[]) {
        new RadioButtonExample();
    }
}