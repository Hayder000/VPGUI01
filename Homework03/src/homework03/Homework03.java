import javax.swing.JOptionPane;

public class Homework03 {
    public static void main(String[] args) {


        String numText = JOptionPane.showInputDialog("Enter a number:");
        double num = Double.parseDouble(numText);


        String menu = "Choose a conversion:\n"
                + "1. Inch to cm\n"
                + "2. Cm to inch\n"
                + "3. Feet to meter\n"
                + "4. Meter to feet\n"
                + "5. Donom to hectare\n"
                + "6. Hectare to donom\n"
                + "7. Celsius to Fahrenheit";
        String choiceText = JOptionPane.showInputDialog(menu);
        int choice = Integer.parseInt(choiceText);

        double result = 0;
        String message = "";

        switch (choice) {
            case 1:
                result = num * 2.54;
                message = num + " inch = " + result + " cm";
                break;
            case 2:
                result = num / 2.54;
                message = num + " cm = " + result + " inch";
                break;
            case 3:
                result = num * 0.3048;
                message = num + " feet = " + result + " meter";
                break;
            case 4:
                result = num / 0.3048;
                message = num + " meter = " + result + " feet";
                break;
            case 5:

                result = num * 0.1;
                message = num + " donom = " + result + " hectare";
                break;
            case 6:
                result = num / 0.1;
                message = num + " hectare = " + result + " donom";
                break;
            case 7:
                result = num * 1.8 + 32;
                message = num + " C = " + result + " F";
                break;
            default:
                message = "Invalid choice!";
        }

        JOptionPane.showMessageDialog(null, message);
    }
}