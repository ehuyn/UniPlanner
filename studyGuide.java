import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class studyGuide extends JFrame {
    private JPanel panel1;
    private JButton essayButton;
    private JButton projectButton;
    private JButton subjectButton;
    private JButton financeButton;
    private JTabbedPane tabbedPane1;
    private JButton backButton;


    public studyGuide() {


        setSize(1200, 1000);
        setContentPane(panel1);
        setTitle("study-guide");
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Set the JFrame to be maximized
        essayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                essayPlanner essayPlanner=new essayPlanner();





            }
        });
        projectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                projectPlanner projectPlanner=new projectPlanner();

            }
        });
        subjectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                subjectPlanner n=new subjectPlanner();

            }
        });
        financeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                financialPlanner f=new financialPlanner();

            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();

            }
        });
    }
}
