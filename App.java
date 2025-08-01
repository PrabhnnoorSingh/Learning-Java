                        //making a simple calculator
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
        }else if (operation.equals("sub")){
            System.out.printf("%f - %f = %f",Number1,Number2,Number1 - Number2);
        }else if (operation.equals("div")){
            System.out.printf("%f / %f = %f",Number1,Number2,Number1 / Number2);
        }else if (operation.equals("mlt")){
            System.out.printf("%f * %f = %f",Number1,Number2,Number1 * Number2);
        }else if (operation.equals("rmn")){
            System.out.printf("%f % %f = %f",Number1,Number2,Number1 % Number2);
        }else {
            System.out.println("Operation not possible.");
        }

        scanner.close();
    }
}