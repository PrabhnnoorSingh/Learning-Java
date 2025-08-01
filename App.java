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

//                         //using the .isEmpty() attachment
// class App{
//     public static void main(String[]args){

//         String name = "Prabhnoor Singh";

//         System.out.println(name.isEmpty());
//     }
// }

//                         //Experimental testing       Works
// class App{
//     public static void main(String[]args){

//         String name = "Prabhnoor Singh";

//         System.out.println("I am "+name+" and my name is "+name.length()+ " characters long");
//     }
// }

                        //Alternative testing method        Doesn't work
// class App{
//     public static void main(String[]args){

//         String name = "Prabhnoor Singh";

//         String Bio = String.format("I am %s and my name is %s.length() characters long",name,name);
//         System.out.println(Bio);
//     }
// }
//                                        // Working version
// class App{
//     public static void main(String[]args){

//         String name = "Prabhnoor Singh";

//         String Bio = String.format("I am %s and my name is "+ name.length()+ " characters long",name,name);
//         System.out.println(Bio);
//     }
// }

                        //Converting a String to UPPERCASE or lowercase
// class App{
//     public static void main(String[]args){

//         String name = "Prabhnoor Singh";

//         System.out.println(name.toUpperCase());
//         System.out.println(name.toLowerCase());
//     }
// }

                        // Compairing two strings for equality
// //the (==) method
// class App{
//     public static void main(String[]args){

//         String string1 = new String("abc");
//         String string2 = new String("abc");

//         System.out.println(string1 == string2); //the output is false
//     }
// }

// //the .equals() method
// class App{
//     public static void main(String[]args){

//         String string1 = new String("abc");
//         String string2 = new String("abc");

//         System.out.println(string1.equals(string2)); //the output is true
//     }
// }

// //the .equalsIgnoreCase() method
// class App{
//     public static void main(String[]args){

//         String string1 = new String("abc");
//         String string2 = new String("ABC");

//         System.out.println(string1.equalsIgnoreCase(string2)); //the output is true
//     }
// }

                        //Replace part of the string 
// class App{
//     public static void main(String[]args){

//         String string = "The sky is blue.";

//         System.out.println(string.replace("blue","red"));

//     }
// }

//                         //Check if the string includes a certian word
// class App{
//     public static void main(String[]args){
//          String string = "The sky is blue";

//          System.out.println(string.contains("sky"));
//     }
// }// end

//                         // learning to input

// import java.util.Scanner ;

// class App{
//     public static void main(String[]args){

//         Scanner scanner = new Scanner(System.in);

//         System.out.println("What is your name?");
//         String name = scanner.nextLine();

//         System.out.println("Your name is "+name+".");

//         scanner.close();

//     }
// }

//     //Without using the println metnod
// import java.util.Scanner;

// class App{ 
//     public  static void main(String[]args){
 
//          Scanner scanner = new Scanner(System.in);
 
//          System.out.print("What is your name?");
//          String name = scanner.nextLine();
 
//          System.out.println("Your name is "+name+".");
 
//          scanner.close();   // the ln in println takes us to the next line
 
//     }
// }//end

//                         // Using the printf method
// import java.util.Scanner;
// class App{
//     public static void main(String[]args){
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("What is your name?");
//         String name = scanner.nextLine();

//         System.out.printf("Hello %s. How are you?",name);
//         scanner.close();

//     }
// }

//                         // Using Different types of data in the scanner method
// import java.util.Scanner;
// class App{
//     public static void main(String[]args){
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("What is your name?");
//         String name = scanner.nextLine();

//         System.out.printf("Hello %s. How old are you?",name);

//         int age = scanner.nextInt();

//         System.out.printf("%d is a great age to start Programing",age);

//         scanner.close();

//     }
// }//end

//                         //How to close the input buffer caused by the nextInt()command
// import java.util.Scanner;
// class App{
//     public static void main(String[]args){
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("what is your name?");
//         String name = scanner.nextLine();

//         System.out.printf("Hello %s. How old are you?", name);
//         int age = scanner.nextInt();
//         scanner.nextLine();

//         System.out.printf("%d is a great age to start programming. What is your prefered language?", age);
//         String language = scanner.nextLine();

//         System.out.printf("%s is a very popular language for programming", language);
        

//     }
// }

//                         // Alternate method to avoid the inputBuffer 
// import java.util.Scanner;
// class App{
//     public static void main(String[]args){
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("what is your name?");
//         String name = scanner.nextLine();

//         System.out.printf("hello %s. How old are you?",name);
//         int age = Integer.parseInt(scanner.nextLine());

//         System.out.printf("%d is a great age to start programing. what language do you prefer?",age);
//         String language = scanner.nextLine();

//         System.out.printf("%s is a very popular language.", language);

//         scanner.close();
//     }
// }-end

//                         //making a simple calculator
// import java.util.Scanner;
// class App{
//     public static void main(String[]args){
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the first number: ");
//         double Number1 = scanner.nextDouble();
//         scanner.nextLine();

//         System.out.print("Enter the second number: ");
//         double Number2 = scanner.nextDouble();
//         scanner.nextLine();

//         System.out.print("what Operation do you want to perform?: ");
//         String operation = scanner.nextLine();

//         if (operation.equals("sum")){
//             System.out.printf("%f + %f = %f",Number1,Number2,Number1 + Number2);   
//         }
//         else if (operation.equals("sub")){
//             System.out.printf("%f - %f = %f",Number1,Number2,Number1 - Number2);
//         }
//         else if (operation.equals("div")){
//             if (Number2 == 0){
//                 System.out.println("Number can not be divided.");
//             }
//             else if (Number1 == 0){
//                 System.out.println("Number can not be divided.");
//             }
//             else {
//             System.out.printf("%f / %f = %f",Number1,Number2,Number1 / Number2);
//             }
//         }
//         else if (operation.equals("mlt")){
//             System.out.printf("%f * %f = %f",Number1,Number2,Number1 * Number2);
//         }
//         else if (operation.equals("rmn")){
//             System.out.printf("%f % %f = %f",Number1,Number2,Number1 % Number2);
//         }
//         else {
//             System.out.println("Operation not possible.");
//         }

//         scanner.close();
//     }
// }