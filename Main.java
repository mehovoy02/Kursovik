import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String userInputString;
        double userRadius;
        String userOutputString;

        userInputString = JOptionPane.showInputDialog("Please enter the circles radius: ");
        userRadius = Double.parseDouble( userInputString );

        Circle circles1 = new Circle( );

        circles1.setRadius( userRadius );

        userOutputString = String.format( "Area: %.2f\nDiameter: %.2f\nCircumference: %.2f",circles1.getArea(), circles1.getDiameter(), circles1.getCircumference());

        JOptionPane.showMessageDialog( null, userOutputString );

        System.exit( 0 );
    }
}

/*import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Circle> array = new ArrayList<>(10);
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