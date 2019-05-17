import javafx.scene.shape.Circle;

import javax.swing.JOptionPane;

public class Main {
public static void main (String[] args){

        String userInputString;
        double coordinateX;
        double coordinateY;
        double userRadius;
        String userOutputString;


        userInputString = JOptionPane.showInputDialog("Please enter the circles radius: ");
        userRadius = Double.parseDouble(userInputString);
        userInputString = JOptionPane.showInputDialog("Please enter the coordinateX: ");
        coordinateX = Double.parseDouble(userInputString);
        userInputString = JOptionPane.showInputDialog("Please enter the coordinateY: ");
        coordinateY = Double.parseDouble(userInputString);

        Circles circles1 = new Circles();

        circles1.setRadius(userRadius);

        userOutputString = String.format("Area: %.2f\nDiameter: %.2f\nCircumference: %.2f", circles1.getArea(), circles1.getDiameter(), circles1.getCircumference());

        JOptionPane.showMessageDialog(null, userOutputString);

        System.exit(0);
    }
}

        /*userInputString = JOptionPane.showInputDialog("Please enter the circles radius: ");
        userRadius = Double.parseDouble(userInputString);
        userInputString = JOptionPane.showInputDialog("Please enter the coordinateX: ");
        coordinateX = Double.parseDouble(userInputString);
        userInputString = JOptionPane.showInputDialog("Please enter the coordinateY: ");
        coordinateY = Double.parseDouble(userInputString);

        Circles circles = new Circles();

        circles1.setRadius(userRadius);

        userOutputString = String.format("Area: %.2f\nDiameter: %.2f\nCircumference: %.2f", circles1.getArea(), circles1.getDiameter(), circles1.getCircumference());

        JOptionPane.showMessageDialog(null, userOutputString);

        System.exit(0);
    }
}

/*import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Circle> Circles = new ArrayList<>(10);
        int[] coordinatesX = {50, 100, 300, 500, 700, 900};
        int[] coordinatesY = {50, 100, 300, 500, 700};
        int[] r = {50, 100, 120, 150, 200};

        Random rnd = new Random();
        for (int i = 0; i < array.size(); i++) {
           Circle c = new Circle(coordinatesX[rnd.nextInt(6)],
                    coordinatesY[rnd.nextInt(6)], r[rnd.nextInt(5)]);
        }

    }
}*/