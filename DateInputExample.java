import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.*;
public class DateInputExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Date Input Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JFormattedTextField dateField = new JFormattedTextField(new SimpleDateFormat("yyyy-MM-dd"));
        frame.add(new JLabel("Enter Date (yyyy-MM-dd):"));
        frame.add(dateField);

        JButton button = new JButton("Get Date");
        button.addActionListener(e -> {
            Date date = (Date) dateField.getValue();
            if (date != null) {
                JOptionPane.showMessageDialog(frame, "Entered Date: " + date);
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid Date Format");
            }
        });

        frame.add(button);
        frame.pack();
        frame.setVisible(true);
    }
}