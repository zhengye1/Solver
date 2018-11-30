package solver.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
// Using AWT event classes and listener interfaces
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

// Using Swing components and containers
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import solver.crosssum.CrossSumSolver;
import solver.exception.NoSolutionException;

// A Swing GUI application inherits from top-level container javax.swing.JFrame
public class CrossSumSolverGUI extends JFrame { // JFrame instead of Frame
    /**
     * 
     */
    private static final long serialVersionUID = -6599464702854337999L;
    private JTextField num1, h1s1, num2, h1s2, num3, h1; // Use Swing's JTextField instead of AWT's
                                                         // TextField
    private JTextField num4, h2s1, num5, h2s2, num6, h2;
    private JTextField num7, h3s1, num8, h3s2, num9, h3;
    private JTextField empty1, empty2, empty3, empty4, empty5, empty6, empty7, empty8, empty9, empty10, empty11,
        empty12, empty13, empty14, empty15, empty16;
    private JTextField equalsh1 = new JTextField("=");
    private JTextField equalsh2 = new JTextField("=");
    private JTextField equalsh3 = new JTextField("=");
    private JTextField equalsv1 = new JTextField("=");
    private JTextField equalsv2 = new JTextField("=");
    private JTextField equalsv3 = new JTextField("=");
    private JTextField v1s1, v1s2, v1, v2s1, v2s2, v2, v3s1, v3s2, v3;
    private JTextField[] numFields = new JTextField[9];
    private JButton btnCount; // Using Swing's JButton instead of AWT's Button

    // Constructor to setup the GUI components and event handlers
    public CrossSumSolverGUI() {
        // Retrieve the content-pane of the top-level container JFrame
        // All operations done on the content-pane
        JPanel topPanel = new JPanel();
        GridLayout gridLayout = new GridLayout(7, 7);
        topPanel.setLayout(gridLayout);
        List<JTextField> fields = new ArrayList<>();
        num1 = new JTextField("");
        h1s1 = new JTextField("");
        num2 = new JTextField("");
        h1s2 = new JTextField("");
        num3 = new JTextField("");
        equalsh1.setEditable(false);
        h1 = new JTextField("");
        fields.add(num1);
        fields.add(h1s1);
        fields.add(num2);
        fields.add(h1s2);
        fields.add(num3);
        fields.add(equalsh1);
        fields.add(h1);

        v1s1 = new JTextField("");
        empty1 = new JTextField();
        empty1.setBackground(Color.black);
        v2s1 = new JTextField("");
        empty2 = new JTextField();
        empty2.setBackground(Color.black);
        v3s1 = new JTextField("");
        empty3 = new JTextField();
        empty3.setBackground(Color.black);
        empty4 = new JTextField();
        empty4.setBackground(Color.black);

        fields.add(v1s1);
        fields.add(empty1);
        fields.add(v2s1);
        fields.add(empty2);
        fields.add(v3s1);
        fields.add(empty3);
        fields.add(empty4);

        num4 = new JTextField("");
        h2s1 = new JTextField("");
        num5 = new JTextField("");
        h2s2 = new JTextField("");
        num6 = new JTextField("");
        equalsh2.setEditable(false);
        h2 = new JTextField("");

        fields.add(num4);
        fields.add(h2s1);
        fields.add(num5);
        fields.add(h2s2);
        fields.add(num6);
        fields.add(equalsh2);
        fields.add(h2);

        v1s2 = new JTextField("");
        empty5 = new JTextField();
        empty5.setBackground(Color.black);
        v2s2 = new JTextField("");
        empty6 = new JTextField();
        empty6.setBackground(Color.black);
        v3s2 = new JTextField("");
        empty7 = new JTextField();
        empty7.setBackground(Color.black);
        empty8 = new JTextField();
        empty8.setBackground(Color.black);

        fields.add(v1s2);
        fields.add(empty5);
        fields.add(v2s2);
        fields.add(empty6);
        fields.add(v3s2);
        fields.add(empty7);
        fields.add(empty8);

        num7 = new JTextField("");
        h3s1 = new JTextField("");
        num8 = new JTextField("");
        h3s2 = new JTextField("");
        num9 = new JTextField("");
        equalsh3.setEditable(false);
        h3 = new JTextField("");

        fields.add(num7);
        fields.add(h3s1);
        fields.add(num8);
        fields.add(h3s2);
        fields.add(num9);
        fields.add(equalsh3);
        fields.add(h3);

        equalsv1.setEditable(false);
        empty9 = new JTextField();
        empty9.setBackground(Color.black);
        equalsv2.setEditable(false);
        empty10 = new JTextField();
        empty10.setBackground(Color.black);
        equalsv3.setEditable(false);
        empty11 = new JTextField();
        empty11.setBackground(Color.black);
        empty12 = new JTextField();
        empty12.setBackground(Color.black);
        fields.add(equalsv1);
        fields.add(empty9);
        fields.add(equalsv2);
        fields.add(empty10);
        fields.add(equalsv3);
        fields.add(empty11);
        fields.add(empty12);

        v1 = new JTextField("");
        empty13 = new JTextField();
        empty13.setBackground(Color.black);
        v2 = new JTextField("");
        empty14 = new JTextField();
        empty14.setBackground(Color.black);
        v3 = new JTextField("");
        empty15 = new JTextField();
        empty15.setBackground(Color.black);
        empty16 = new JTextField();
        empty16.setBackground(Color.black);

        fields.add(v1);
        fields.add(empty13);
        fields.add(v2);
        fields.add(empty14);
        fields.add(v3);
        fields.add(empty15);
        fields.add(empty16);

        numFields[0] = num1;
        numFields[1] = num2;
        numFields[2] = num3;
        numFields[3] = num4;
        numFields[4] = num5;
        numFields[5] = num6;
        numFields[6] = num7;
        numFields[7] = num8;
        numFields[8] = num9;

        Font f = new Font("Verdana", Font.BOLD, 30);
        for (JTextField tf : fields) {
            tf.setFont(f);
            tf.setForeground(Color.BLUE);
            tf.setHorizontalAlignment(JTextField.CENTER);
        }

        for (JTextField tf : fields) {
            topPanel.add(tf);
        }

        JPanel bottonPanel = new JPanel(new BorderLayout());
        btnCount = new JButton("Solve");
        bottonPanel.add(btnCount, BorderLayout.CENTER);

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(topPanel, BorderLayout.CENTER);
        cp.add(bottonPanel, BorderLayout.SOUTH);

        // Allocate an anonymous instance of an anonymous inner class that
        // implements ActionListener as ActionEvent listener
        btnCount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                System.out.println("Construct the arg string");
                String args = "";
                args += h1s1.getText() + " " + h1s2.getText() + " " + h1.getText() + " ";
                args += h2s1.getText() + " " + h2s2.getText() + " " + h2.getText() + " ";
                args += h3s1.getText() + " " + h3s2.getText() + " " + h3.getText() + " ";
                args += v1s1.getText() + " " + v1s2.getText() + " " + v1.getText() + " ";
                args += v2s1.getText() + " " + v2s2.getText() + " " + v2.getText() + " ";
                args += v3s1.getText() + " " + v3s2.getText() + " " + v3.getText() + " ";
                args = args.trim();

                System.out.println("Solving.... ");
                Integer[] solution;
                try {
                    solution = CrossSumSolver.solve(args);
                    if (solution != null) {
                        for (int i = 0; i < 9; i++) {
                            numFields[i].setText(Integer.toString(solution[i]));
                        }

                    } else {
                        throw new NoSolutionException("No Solution");
                    }
                } catch (NoSolutionException e) {
                    JOptionPane.showMessageDialog(null, "No Solution!", "No Solution", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    JOptionPane.showMessageDialog(null, "Exception occur", "Exception", JOptionPane.ERROR_MESSAGE);
                }

            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit program if close-window button clicked
        setTitle("Cross Sum Solver"); // "super" JFrame sets title
        setSize(500, 500); // "super" JFrame sets initial size
        setVisible(true); // "super" JFrame shows
    }

    // The entry main() method
    public static void main(String[] args) {
        // Run the GUI construction in the Event-Dispatching thread for thread-safety
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CrossSumSolverGUI(); // Let the constructor do the job
            }
        });
    }
}
