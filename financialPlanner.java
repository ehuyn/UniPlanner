import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class financialPlanner extends JFrame {
    private JPanel financialPlanner;
    private JButton back;

    public financialPlanner() {
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        setTitle("financial Planner");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Dispose the window instead of exiting the application
        setVisible(true); // Make the window visible
        setContentPane(financialPlanner);
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Set the JFrame to be maximized
    }
}
