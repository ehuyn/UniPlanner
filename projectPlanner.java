import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class projectPlanner extends JFrame {
    private JPanel projectPlanner;
    private JButton back2;

    public projectPlanner() {
        back2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        setTitle("Project Planner");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Dispose the window instead of exiting the application
        setVisible(true); // Make the window visible
        setContentPane(projectPlanner);
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Set the JFrame to be maximized
    }

}

