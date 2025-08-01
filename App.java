//                         //making a simple calculator
import java.util.Scanner;
class App{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double Number1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the second number: ");
        double Number2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("what Operation do you want to perform?: ");
        String operation = scanner.nextLine();

        if (operation.equals("sum")){
            System.out.printf("%f + %f = %f",Number1,Number2,Number1 + Number2);   
        }
        else if (operation.equals("sub")){
            System.out.printf("%f - %f = %f",Number1,Number2,Number1 - Number2);
        }
        else if (operation.equals("div")){
            if (Number2 == 0){
                System.out.println("Number can not be divided.");
            }
            else if (Number1 == 0){
                System.out.println("Number can not be divided.");
            }
            else {
            System.out.printf("%f / %f = %f",Number1,Number2,Number1 / Number2);
            }
        }
        else if (operation.equals("mul")){
            System.out.printf("%f * %f = %f",Number1,Number2,Number1 * Number2);
        }
        else if (operation.equals("rem")){
            System.out.printf("%f % %f = %f",Number1,Number2,Number1 % Number2);
        }
        else {

            System.out.println("Operation not possible.");
        }

        scanner.close();
    }
}