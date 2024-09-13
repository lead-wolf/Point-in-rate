import java.util.Scanner;

public class PointInCircle {
   public static void main(String[] args) {
        Float xC, yC, xM, yM, radius;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter xC: ");
        xC = InputPoint(sc);
        System.out.print("Enter yC: ");
        yC = InputPoint(sc);
        System.out.println("Enter radius: ");
        radius = InputPoint(sc);
        System.out.print("Enter xM: ");
        xM = InputPoint(sc);
        System.out.print("Enter yM: ");
        yM = InputPoint(sc);

        if (CheckedInCircle(xM, yM, xC, yC, radius)) {
            System.out.println("Point in circle");
        }else{
            System.out.println("Point out circle");
        }
   }

    private static boolean CheckedInCircle(Float xM, Float yM, Float xC, Float yC, Float radius) {
        double distance = Math.sqrt(Math.pow((xM - xC), 2) + Math.pow((yM - yC), 2));
        return distance <= radius;
    }


    private static float InputPoint(Scanner sc) {
        String stringInput;
        float numbInput;
        while (true) {
            try {
                stringInput = sc.nextLine();
                numbInput = Float.parseFloat(stringInput);
                break;
            } catch (Exception e) {
                System.err.print("Incorrect format \n" +
                                    "Please re-enter: ");
            }
        }
        return numbInput;
    } 
}
