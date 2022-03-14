import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingGUI extends JFrame{
    private JPanel mainPanel;
    private JTextField IncLossTextField;
    private JButton calculateButton;
    private JLabel IncLossLabel;
    private JLabel UltLossLabel;

    public SwingGUI(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // grab the text from the text field
                // convert to a double
                // update the label
                int ultLoss= (int)((Double.parseDouble(IncLossTextField.getText()))*1.8+32);
                UltLossLabel.setText(("Ultimate Loss is $"+ultLoss));
            }
        });
    }

    public static void main(String[] args){
        JFrame frame=new SwingGUI("My Calculator");
        frame.setVisible(true);

    }
}
