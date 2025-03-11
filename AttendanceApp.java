import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AttendanceApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Attendance Management");
        JLabel label = new JLabel("Student Name:");
        JTextField nameField = new JTextField(20);
        JButton saveButton = new JButton("Save Attendance");

        label.setBounds(20, 30, 100, 20);
        nameField.setBounds(130, 30, 200, 20);
        saveButton.setBounds(130, 270, 150, 30);//button position
		
		JLabel label1 = new JLabel("year");
		JTextField yearfield = new JTextField(10);
		label1.setBounds(20,90,100,20);
		yearfield.setBounds(130,90,200,20);
		
		JLabel label2 = new JLabel("Roll No");
		JTextField rollfield = new JTextField(10);
		label2.setBounds(20,150,100,20);
		rollfield.setBounds(130,150,200,20);
		
		JLabel label3 = new JLabel("Date");
		JFormattedTextField datefield = new JFormattedTextField(new SimpleDateFormat("yyyy-MM-dd"));
		label3.setBounds(20,210,100,20);
		datefield.setBounds(130,210,200,20);
		
        frame.add(label);
        frame.add(nameField);
		frame.add(label1);
		frame.add(yearfield);
		frame.add(label2);
		frame.add(rollfield);
		frame.add(label3);
		frame.add(datefield);
		
        frame.add(saveButton);

        saveButton.addActionListener(e -> {
            String name = nameField.getText();
			String year = yearfield.getText();
			String roll = rollfield.getText();
			String date = datefield.getText();
            if (!name.isEmpty()) {
                saveAttendance(name,year,roll,date);
                JOptionPane.showMessageDialog(frame, "Attendance saved for " + name);
                nameField.setText("");
				yearfield.setText("");
				rollfield.setText("");
				datefield.setText("");
            } else {
                JOptionPane.showMessageDialog(frame, "Enter a valid detail.");
            }
        });

        frame.setSize(400, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private static void saveAttendance(String name,String year,String roll,String date) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance_db", "root", "root");
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO attendances (student_name,Student_year,Student_roll,Date) VALUES (?,?,?,?)")) {
            stmt.setString(1, name);
			stmt.setString(2, year);
			stmt.setString(3, roll);
			stmt.setString(4, date);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}