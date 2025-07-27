                        //basics
// public class App {
//     public static void main(String[] args){
//         System.out.println("Hello, World!");
//     }
// }

                            //variables
// public class App {
//     static int age;
//     public static void main(String[] args) {
    
//         System.out.println("I am "+ age +" years old.");
//     }
// }

                        // Works
// public class App {
//     public static void main(String[] args) {
    
//         int Number1 = 5;
//         double Number2 = Number1;

//         System.out.println(Number2);

//     }
// }

                        //Doesn't work
// public class App {
//     public static void main(String[] args) {
    
//         double Number1 = 5.8;
//         int Number2 = Number1;

//         System.out.println(Number2);

//     }
// }

                        //works
// public class App {
//     public static void main(String[] args) {
    
//         double Number1 = 5.8;
//         int Number2 = (int)Number1;

//         System.out.println(Number2);

//     }
// }

                        //Arithmetic Operators
// public class App {
//     public static void main(String[] args) {
    
//         int Number1 = 12;
//         int Number2 = 8;

//         //Addition
//         System.out.println(Number1 + Number2);

//         //Subtraction 
//         System.out.println(Number1 - Number2);

//         //Multiplcation
//         System.out.println(Number1 * Number2);

//         //Division
//         System.out.println(Number1 / Number2);

//         //Remainder
//         System.out.println(Number1 % Number2);
        

//     }
// }

                        //adding to a variable(Works for all the arithmetic operators)
// public class App {
//     public static void main(String[] args) {
    
//         int Number = 12;
//         Number = Number + 8;

//         System.out.println(Number);
        

//     }
// }

                        //Alternative method
// public class App {
//     public static void main(String[] args) {
    
//         int Number = 12;
//         Number +=8;

//         System.out.println(Number);
        

//     }
// }


                        // Relitaional Operators
// public class App{
//     public static void main(String[]args){
//         int Number1 = 12;
//         int Number2 = 15;

//         //is equal to
//         System.out.println(Number1==Number2);

//         //is not equal to
//         System.out.println(Number1!=Number2);

//         //is greater than
//         System.out.println(Number1>Number2);

//         //is smaller than
//         System.out.println(Number1<Number2);

//         //is greater than or equal to 
//         System.out.println(Number1>=Number2);

//         //is smaller than or equal to
//         System.out.println(Number1<=Number2);
        
//     }
// }

                        // logical operators

//And logic operator ( && )
// class App{
//     public static void main(String[]args){
//         int age = 25;

//         System.out.println(age>=18 && age<=40);
//     }
// }

// or logic operator ( || )
// class App{
//     public static void main(String[]args){
//         boolean isStudentOfUniversity = false;
//         boolean isMemberOflibrary = true;

//         System.out.println(isStudentOfUniversity||isMemberOflibrary);
//     }

// }

//Not logic Operator ( ! )
// class App{
//     public static void main(String[]args){
//         boolean isStudentOfUniversity = false;

//         System.out.println(!isStudentOfUniversity);
//     }
// }

// increment operator ( ++ )
// class App {
//     public static void main(String[]args){
//         int number = 55;
//         // number++; 
//         //System.out.println(number);

//         //alternative
//         System.out.println(++number);
//     }
// }

// decrement operator ( -- )
// class App{
//     public static void main(String[]agrs){
//         int number = 55;
//         //number--;
//         //System.out.println(number);

//         //Alternetive
//         System.out.println(--number);
//     }
// }

                        //how to declare a string
// class App{
//     public static void main(String[]args){
//         //String name = "Prabhnoor Singh";

//         String name = new String("Prabhnoor SIngh");

//         System.out.println(name);
//     }
// }

                        //difference between normal method to declare a string and the new method.
// class App{
//     public static void main(String[]args){
//         String literalString1 = "abc";
//         String literalString2 = "abc";

//         String ObjectString1 = new String("xyz");
//         String ObjectString2 = new String("xyz");

//         System.out.println(literalString1 == literalString2);
//         System.out.println(ObjectString1 == ObjectString2);
        
//     }
// }

                        //Normal method to use a string
// class App{
//     public static void main(String[]args){
       
//         String name = "Prabhnoor Singh";
//         String university = "BSBI";
//         String country = "India";
//         int age = 20;

//         System.out.println("My name is "+name+". I study at "+ university + ". I am " + age + " years old. I am from "+ country + ".");
//     }
// }

                        // Formatted String method
// class App{
//     public static void main(String[]args){
       
//         String name = "Prabhnoor Singh";
//         String university = "BSBI";
//         String country = "India";
//         int age = 20;

//         String FormattedString = String.format ("My name is %s. I study at %s. I am %d years old. I am from %s.",name,university,age,country);

//         System.out.println(FormattedString);
//     }
// }

                        //format specifers
// class App{
//     public static void main(String[]args){
       
//         String name = "Prabhnoor Singh";
//         String university = "BSBI";
//         String country = "India";
//         int age = 20;
//         char percentSign = '%';
//         boolean allTruth = false;

//         String FormattedString = String.format ("My name is %s. I study at %s. I am %d years old. I am from %s. I got 50%c in my exams. One of these is %b.",name,university,age,country,percentSign,allTruth);

//         System.out.println(FormattedString);
//     }
// }

//                         //using the .length() attachment
// class App{
//     public static void main(String[]args){

//         String name = "Prabhnoor Singh";

//         System.out.println(name.length());
//     }
// }

