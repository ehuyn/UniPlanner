import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class subjectPlanner extends JFrame{
    private JPanel subjectPlanner;
    private JButton back;

    public subjectPlanner() {
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        setTitle("subject planner");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Dispose the window instead of exiting the application
        setVisible(true); // Make the window visible
        setContentPane(subjectPlanner);
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Set the JFrame to be maximized
    }
}
