import javax.swing.*;
import java.awt.event.*;

public class frame extends JFrame implements ActionListener {

    ExpenseManager manager = new ExpenseManager();

    JLabel l1, l2, l3, l4, l5;
    JTextField tf1, tf2, tf3, tf4;
    JTextArea output;
    JButton createBtn, showBtn;
    JComboBox<String> cb;

    public Frame()
	{
		super("Daily Expense Tracker");
        this.setSize(400, 450);
        this.setLayout(null);

        l1 = new JLabel("Description:");
        l1.setBounds(20, 20, 100, 20);
		this.add(l1);
        tf1 = new JTextField();
        tf1.setBounds(120, 20, 200, 20);
		this.add(tf1);

        l2 = new JLabel("Amount:");
        l2.setBounds(20, 50, 100, 20);
        tf2 = new JTextField();
        tf2.setBounds(120, 50, 200, 20);
		this.add(l2);
		this.add(tf2);

        l3 = new JLabel("Date:");
        l3.setBounds(20, 80, 100, 20);
        tf3 = new JTextField();
        tf3.setBounds(120, 80, 200, 20);
		this.add(l3);
		this.add(tf3);

        l4 = new JLabel("Type:");
        l4.setBounds(20, 110, 100, 20);
        String[] types = {"Food", "Transport"};
        cb = new JComboBox<>(types);
        cb.setBounds(120, 110, 200, 20);
		this.add(cb);
		this.add(l4);
		

        l5 =new JLabel("Category:");
        l5.setBounds(20, 140, 100, 20);
        tf4 = new JTextField();
        tf4.setBounds(120, 140, 200, 20);
		this.add(tf4);
		this.add(l5);

        createBtn = new JButton("Create Expense");
        createBtn.setBounds(120, 170, 200, 25);
		createBtn.addActionListener(this);

        showBtn = new JButton("Show All Expenses");
        showBtn.setBounds(120, 200, 200, 25);
		showBtn.addActionListener(this);

        output = new JTextArea();
        output.setBounds(20, 240, 350, 150);
        output.setEditable(false);
		
		this.add(createBtn);
        this.add(showBtn);
        this.add(output);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
		
	}

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == createBtn) {
            try {

                String desc = tf1.getText();
                double amount = Double.parseDouble(tf2.getText());
                String date = tf3.getText();
                String type = (String) cb.getSelectedItem();
                String cat = tf4.getText();

                if (type.equals("Food")) {
                    manager.addExpense(new FoodExpense(desc, amount, date, cat));
                } else {
                    manager.addExpense(new TransportExpense(desc, amount, date, cat));
                }
                JOptionPane.showMessageDialog(this, "Expense Added!");
                tf1.setText("");
                tf2.setText("");
                tf3.setText("");
                tf4.setText("");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Invalid input: " + ex.getMessage());
            }
        } else if (e.getSource() == showBtn) {
            output.setText("   ssss");
        }
    }
}