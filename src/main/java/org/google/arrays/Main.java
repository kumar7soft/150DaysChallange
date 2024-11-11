package org.google.arrays;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        new Seat();
    }
}

class Seat {
    JFrame seatFrame = new JFrame();
    private JPanel frame = new JPanel(); // Initialize your JPanel here
    private JTable table1;
    private JTextField name;
    private JTextField rollno;
    private JButton GETSEATButton;
    private JComboBox<String> classDetail;
    ArrayList<String> seat = new ArrayList<>();

    public Seat() {
        // Setup frame properties and components
        frame.setLayout(new BorderLayout());

        // Add your components to the frame
        name = new JTextField();
        rollno = new JTextField();
        GETSEATButton = new JButton("Get Seat");
        classDetail = new JComboBox<>(new String[]{"Class A", "Class B", "Class C"});
        table1 = new JTable();

        frame.add(name, BorderLayout.NORTH);
        frame.add(rollno, BorderLayout.CENTER);
        frame.add(GETSEATButton, BorderLayout.SOUTH);
        frame.add(new JScrollPane(table1), BorderLayout.EAST);
        frame.add(classDetail, BorderLayout.WEST);

        // Now set it as the content pane
        seatFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        seatFrame.setContentPane(frame);
        seatFrame.pack();
        seatFrame.setLocationRelativeTo(null);
        seatFrame.setVisible(true);

        declareSeats();
        tableData();

        GETSEATButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (name.getText().equals("") || rollno.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please fill all record to get seat.");
                } else {
                    try {
                        Random rn = new Random();
                        String seatNo = "";
                        if (seat.size() == 0) {
                            JOptionPane.showMessageDialog(null, "THERE ARE NO SEATS AVAILABLE");
                        } else {
                            seatNo = seat.get(rn.nextInt(seat.size()));
                        }
                        String sql = "insert into seat" + "(NAME,ROLL_NO,CLASS,SEAT)" + "values (?,?,?,?)";
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/intern", "root", "root");
                        PreparedStatement statement = connection.prepareStatement(sql);
                        statement.setString(1, name.getText());
                        statement.setString(2, rollno.getText());
                        statement.setString(3, "" + classDetail.getSelectedItem());
                        statement.setString(4, seatNo);
                        seat.remove(seatNo);
                        statement.executeUpdate();
                        JOptionPane.showMessageDialog(null, "RECORD ADDED SUCCESSFULLY");
                        name.setText("");
                        rollno.setText("");
                        for (String i : seat) {
                            System.out.println(i);
                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                    tableData();
                }
            }
        });
    }

    public void declareSeats() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 10; j++) {
                String s = "R" + i + "S" + j;
                seat.add(s);
            }
        }
        try {
            String a = "Select SEAT from seat";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/intern", "root", "root");
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(a);
            while (rs.next()) {
                seat.remove(rs.getString(1));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void tableData() {
        try {
            String a = "Select * from seat";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/intern", "root", "root");
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(a);
            table1.setModel(buildTableModel(rs));
        } catch (Exception ex1) {
            JOptionPane.showMessageDialog(null, ex1.getMessage());
        }
    }

    public static DefaultTableModel buildTableModel(ResultSet rs) throws SQLException {
        ResultSetMetaData metaData = rs.getMetaData();
        Vector<String> columnNames = new Vector<String>();
        int columnCount = metaData.getColumnCount();
        for (int column = 1; column <= columnCount; column++) {
            columnNames.add(metaData.getColumnName(column));
        }
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        while (rs.next()) {
            Vector<Object> vector = new Vector<Object>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                vector.add(rs.getObject(columnIndex));
            }
            data.add(vector);
        }
        return new DefaultTableModel(data, columnNames);
    }
}
