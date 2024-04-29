import javax.swing.*;

public class Cars {
    private JPanel Cars;
    private JButton rentButton;
    private JComboBox comboBox1;
    private JTextField JTextField;
    private JComboBox comboBox2;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Car rental");
        frame.setContentPane(new Cars().Cars);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500, 350);

}}
