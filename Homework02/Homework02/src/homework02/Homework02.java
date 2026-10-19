package homework02;

/**
 *
 * @author Hayder
 */
import javax.swing.JOptionPane;

public class Homework02 {

    public static void main(String[] args) {
        String first = JOptionPane.showInputDialog("Enter the first number:");
        String second = JOptionPane.showInputDialog("Enter the second number:");

        double a = Double.parseDouble(first);
        double b = Double.parseDouble(second);

        double sum = a + b;

        JOptionPane.showMessageDialog(null, "Sum = " + sum);
        
        System.exit(0);
    }
}
