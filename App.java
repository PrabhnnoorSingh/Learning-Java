                        //making a simple calculator
import java.util.Scanner;
class App{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("what Operation do you want to perform?: ");
        String operation = scanner.nextLine();


        System.out.print("Enter the first number: ");
        double Number1 = scanner.nextDouble();
        scanner.nextLine();

        double Number2 = 0;
        if(!operation.equals("table")){
        System.out.print("Enter the second number: ");
        Number2 = scanner.nextDouble();
        scanner.nextLine();
        }

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
        else if(operation.equals("table")){
            for(int multiplier = 1; multiplier <=10; multiplier++){
                System.out.printf("%d X %d = %d \n",(int)Number1, multiplier, (int)Number1*multiplier);
            }
        }
        else {

            System.out.println("Operation not possible.");
        }

        scanner.close();
    }
}

                        //making a Calculator using Switch Case statements
import java.util.Scanner;
class App{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("what Operation do you want to perform?: ");
        String operation = scanner.nextLine();


        System.out.print("Enter the first number: ");
        double Number1 = scanner.nextDouble();
        scanner.nextLine();

        double Number2 = 0;
        if(!operation.equals("table")){
        System.out.print("Enter the second number: ");
        Number2 = scanner.nextDouble();
        scanner.nextLine();
        }

        switch (operation){
            case "sum":
            System.out.printf("%f + %f = %f",Number1,Number2,Number1 + Number2);
            break;   
            
            case "sub":
            System.out.printf("%f - %f = %f",Number1,Number2,Number1 - Number2);
            break;

            case "mul":
            System.out.printf("%f * %f = %f",Number1,Number2,Number1 * Number2);
            break;

            case "div":
             if (Number2 == 0){
                System.out.println("Can not divide by 0.");

            }
            else {
            System.out.printf("%f / %f = %f",Number1,Number2,Number1 / Number2);
            }
            break;
            case "table":
            for(int multiplier = 1; multiplier <=10; multiplier++){
                System.out.printf("%d X %d = %d \n",(int)Number1, multiplier, (int)Number1*multiplier);
            }break;
            default:
            System.out.printf("%s is not a supported operation.",operation);
        }
        scanner.close();
    }
}