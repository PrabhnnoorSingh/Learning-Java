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

//                         //making a Calculator using Switch Case statements
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

//         switch (operation){
//             case "sum":
//             System.out.printf("%f + %f = %f",Number1,Number2,Number1 + Number2);
//             break;   
            
//             case "sub":
//             System.out.printf("%f - %f = %f",Number1,Number2,Number1 - Number2);
//             break;

//             case "mul":
//             System.out.printf("%f * %f = %f",Number1,Number2,Number1 * Number2);
//             break;

//             case "div":
//              if (Number2 == 0){
//                 System.out.println("Can not divide by 0.");
//             }
//             else {
//             System.out.printf("%f / %f = %f",Number1,Number2,Number1 / Number2);
//             }
//             break;
//             default:
//             System.out.printf("%s is not a supported operation.",operation);
//         }
//         scanner.close();
//     }
// }end

//                         //Using Arrays
// import java.util.Arrays;
// class App{
//     public static void main(String[]args){
//         char vowels[] = new char [5];
        
//         vowels[0] ='a';
//         vowels[1] ='e';
//         vowels[2] ='i';
//         vowels[3] ='o';
//         vowels[4] ='u';


//         System.out.println(Arrays.toString(vowels));
//     }
// }

//                         //Defining and declaring arrays in the same line 
// import java.util.Arrays;
// class App{
//     public static void main(String[]args){
//         char vowels[] = {'a','e','i','o','u'};

//         System.out.println(Arrays.toString(vowels));
//     }
// }

                        //Replacing a value in an Array
// import java.util.Arrays;
// class App{
//     public static void main(String[]args){
//         char vowels[] = {'a','e','i','o','u'};

//         vowels[2] = 'x';

//         System.out.println(Arrays.toString(vowels));
//     }
// }

//                         //sorting values in the arrays
// import java.util.Arrays;
// class App{
//     public static void main(String[]args){
//         char vowels[] = {'e','u','a','o','i'};

//         Arrays.sort(vowels);
//         System.out.println(Arrays.toString(vowels));
//     }
// }

//                          //sorting values in the arrays in a specified range
// import java.util.Arrays;
// class App{
//     public static void main(String[]args){
//         char vowels[] = {'e','u','a','o','i'};
//         int startingIndex = 1;
//         int endingIndex = 4;

//         Arrays.sort(vowels,startingIndex,endingIndex);
//         System.out.println(Arrays.toString(vowels));
//     }
// }end

//                         //how to get the lenght of an Array
// class App{
//     public static void main(String[]args){
//         char vowels[] = {'e','u','a','o','i'};

//         System.out.println(vowels.length);
//     }
// }

//                         //searching for an object in the arrays
// import java.util.Arrays;
// class App{
//     public static void main(String[]args){
//         char vowels[] = {'e','u','a','o','i'};

//         Arrays.sort(vowels);
//         char key = 'o';
//         int foundItemIndex = Arrays.binarySearch(vowels, key);

//         System.out.println(vowels);
//         System.out.println(foundItemIndex);
//     }
// }end
//                       // fill an entire array
// import java.util.Arrays;
// class App{
//     public static void main(String[]args){
//         char vowels[] = {'e','u','a','o','i'};

//         Arrays.fill(vowels, 'x');

//         System.out.println(vowels);
//     }
// }
//                       // fill a specified range within the array
// import java.util.Arrays;
// class App{
//     public static void main(String[]args){
//         char vowels[] = {'e','u','a','o','i'};

//         int startingIndex = 1;
//         int endingIndx = 4;

//         Arrays.fill(vowels,startingIndex, endingIndx, 'x');

//         System.out.println(vowels);
//     }
// }end
//                       // Making a copy of an Array
// import java.util.Arrays;
// class App{
//     public static void main(String[]args){
//         int numbers[] = {1,2,3,4,5};
//         int copyOfNumbers[] = Arrays.copyOf(numbers, 5);

//         System.out.println(Arrays.toString(numbers));
//         System.out.println(Arrays.toString(copyOfNumbers));
//     }
// }
                    
// import java.util.Arrays;
// class App{
//     public static void main(String[]args){
//         int numbers[] = {1,2,3,4,5};
//         int copyOfNumbers[] = Arrays.copyOf(numbers, 5);

//         Arrays.fill(numbers,0);

//         System.out.println(Arrays.toString(numbers));
//         System.out.println(Arrays.toString(copyOfNumbers));
//     }
// }

//                         //making a copy of a range of an array
// import java.util.Arrays;
// class App{
//     public static void main(String[]args){
//         int numbers[] = {1,2,3,4,5};

//         int startingIndex = 1;
//         int EndingIndex = 4;

//         int copyOfNumbers[] = Arrays.copyOfRange(numbers, startingIndex,EndingIndex);

//         System.out.println(Arrays.toString(numbers));
//         System.out.println(Arrays.toString(copyOfNumbers));
//     }
// }
 
// import java.util.Arrays;
// class App{
//     public static void main(String[]args){
//         int numbers[] = {1,2,3,4,5};

//         int startingIndex = 1;
//         int EndingIndex = 4;

//         int copyOfNumbers[] = Arrays.copyOfRange(numbers, startingIndex,EndingIndex);

//         Arrays.fill(numbers, 0);

//         System.out.println(Arrays.toString(numbers));
//         System.out.println(Arrays.toString(copyOfNumbers));
//     }
// }
  
//                         //comparing the Arrays
// import java.util.Arrays;
// class App{
//     public static void main(String[]args){
//         int numbers[] = {1,2,3,4,5};

//         int copyOfNumbers[] = Arrays.copyOf(numbers, numbers.length);

//         System.out.println(Arrays.equals(numbers,copyOfNumbers));
//     }
// }        ---Correct Method


// import java.util.Arrays;
// class App{
//     public static void main(String[]args){
//         int numbers[] = {1,2,3,4,5};

//         int copyOfNumbers[] = Arrays.copyOf(numbers, numbers.length);

//         System.out.println(numbers == copyOfNumbers);
//     }
// }        ---Incorrect method
  
//                         //For loops
// class App{
//     public static void main(String[]args){
//         for(int number = 1; number <= 10; number++){
//             System.out.println(number);
//         }
//     }
// }

//                         //For loop over an Array
// class App{
//     public static void main(String[]args){
//         int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//         for(int index = 0; index < 10; index++){
//             System.out.println(numbers[index]);
//         }
//     }
// }//

//                         //Adding an array using a FOR loop
// class App{
//     public static void main(String[]args){
//         int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//         int sum = 0;
//         for(int index = 0; index < 10; index++){
//             sum += numbers[index];
          
//         }
//           System.out.println(sum);
//     }
// }

//                         //Printing tables using FOR loops
// class App{
//     public static void main(String[]args){
//         int number = 5;

//         for(int multiplier = 1; multiplier <= 10; multiplier++){
//             System.out.printf("%d X %d = %d \n", number, multiplier, number*multiplier);
          
//         }
//     }
// }

//                         //Using nested FOR loops
// class App{
//     public static void main(String[]args){
//         for(int number = 1; number <= 10; number++){
//             for(int multiplier = 1; multiplier <= 10; multiplier++){
//             System.out.printf("%d X %d = %d \n", number, multiplier, number*multiplier);
          
//             }
//              System.out.printf("\n");
//         }
//     }
// }--

//                         //Using for loops to get odd numbers
// class App{
//     public static void main(String[]args){
//         for(int number = 1; number <=50; number++){
//             if(number % 2 == 1){
//                 System.out.println(number);
//             }
//         }
//     }
// }

//                         //Using Arrays in a for loop
// class App{
//     public static void main(String[]args){
//         int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//         for(int number : numbers){
//             System.out.println(number);
//         }
//     }
// }

//                         //summing an Array in a for loop
// class App{
//     public static void main(String[]args){
//         int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//         int sum = 0;
//         for(int number : numbers){
//             sum += number;
//         }
//         System.out.println(sum);
//     }
// }--

//                         //Experiment 1 with an Array
// import java.util.Arrays;
// import java.util.Scanner;
// class App{
//     public static void main(String[]args){
//         Scanner scanner = new Scanner(System.in);
//         int numbers[] = {1,2,3,4,5,6,7,8,9};
//         System.out.println("What Index do you want to replace? 0-8");
//         int index = scanner.nextInt();
//         System.out.println("what do you want to replace it with?") ;
//         int newNumber= scanner.nextInt();
//         scanner.nextLine();
//         numbers[index] = newNumber;
//         System.out.println("Sucessfully changed Array"+Arrays.toString(numbers));
       
//     }
// }

//                         // while loops
// class App{
//     public static void main(String[]args){
//         int Number = 5;
//         int multiplier = 1;

//         while(multiplier <= 10){
//             System.out.printf("%d X %d = %d \n",Number,multiplier,Number*multiplier);
//             multiplier++;
//         }
//     }
// }--

//                         //do while loops
// class App{
//     public static void main(String[]args){
//         int number = 5;
//         int multiplier = 1;

//         do{
//             System.out.printf("%d X %d = %d\n",number,multiplier,number*multiplier);
//             multiplier++;
//         }while(multiplier <=10);
//     }
// }

//                         //Array list
// import java.util.ArrayList;
// class App{
//     public static void main(String[]args){
//         ArrayList<Integer>numbers = new ArrayList<Integer>();

//         numbers.add(1);
//         numbers.add(2);
//         numbers.add(3);
//         numbers.add(4);
//         numbers.add(5);

//         System.out.println(numbers.toString());
//     }
// }--

//                         //Printing certain index in an ArrayList
// import java.util.ArrayList;
// class App{
//     public static void main(String[]args){
//         ArrayList<Integer>numbers = new ArrayList<Integer>();

//         numbers.add(1); //0---
//         numbers.add(2); //1  |
//         numbers.add(3); //2  Index
//         numbers.add(4); //3  |
//         numbers.add(5); //4---

//         System.out.println(numbers.get(2));
//     }
// }

//                         //Removing a certain index in an ArrayList
// import java.util.ArrayList;
// class App{
//     public static void main(String[]args){
//         ArrayList<Integer>numbers = new ArrayList<Integer>();

//         numbers.add(1); //0---
//         numbers.add(2); //1  |
//         numbers.add(3); //2  Index
//         numbers.add(4); //3  |
//         numbers.add(5); //4---

//         numbers.remove(2);

//         System.out.println(numbers.toString());
//     }
// }--

//                         //Removing a certain value in an ArrayList
// import java.util.ArrayList;
// class App{
//     public static void main(String[]args){
//         ArrayList<Integer>numbers = new ArrayList<Integer>();

//         numbers.add(1); //0---
//         numbers.add(2); //1  |
//         numbers.add(3); //2  Index
//         numbers.add(4); //3  |
//         numbers.add(5); //4---

//         numbers.remove(Integer.valueOf(4));

//         System.out.println(numbers.toString());
//     }
// }

//                         //Emptying an ArrayList
// import java.util.ArrayList;
// class App{
//     public static void main(String[]args){
//         ArrayList<Integer>numbers = new ArrayList<Integer>();

//         numbers.add(1);
//         numbers.add(2);
//         numbers.add(3);
//         numbers.add(4);
//         numbers.add(5);

//         numbers.clear();

//         System.out.println(numbers.toString());
//     }
// }--

//                         //Replacing a value in an ArrayList
// import java.util.ArrayList;
// class App{
//     public static void main(String[]args){
//         ArrayList<Integer>numbers = new ArrayList<Integer>();

//         numbers.add(1);
//         numbers.add(2);
//         numbers.add(3);
//         numbers.add(4);
//         numbers.add(5);

//         numbers.set(2, Integer.valueOf(30));

//         System.out.println(numbers.toString());
//     }
// }

//                         //Sorting an ArrayList
// import java.util.ArrayList;
// import java.util.Comparator;

// class App{
//     public static void main(String[]args){
//         ArrayList<Integer>numbers = new ArrayList<Integer>();

//         numbers.add(5);
//         numbers.add(3);
//         numbers.add(4);
//         numbers.add(1);
//         numbers.add(2);

//         numbers.sort(Comparator.naturalOrder());

//         System.out.println(numbers.toString());
//     }
// }--

//                         //Sorting an ArrayListi in the reverse order
// import java.util.ArrayList;
// import java.util.Comparator;

// class App{
//     public static void main(String[]args){
//         ArrayList<Integer>numbers = new ArrayList<Integer>();

//         numbers.add(5);
//         numbers.add(3);
//         numbers.add(4);
//         numbers.add(1);
//         numbers.add(2);

//         numbers.sort(Comparator.reverseOrder());

//         System.out.println(numbers.toString());
//     }
// }

//                         //using the .contains() method
// import java.util.ArrayList;
// class App{
//     public static void main(String[]args){
//         ArrayList<Integer>numbers = new ArrayList<Integer>();
//         numbers.add(1);
//         numbers.add(2);
//         numbers.add(3);
//         numbers.add(4);
//         numbers.add(5);

//         System.out.println(numbers.contains(Integer.valueOf(1)));

//     }
// }--

//                         //Using the .size method 
// import java.util.ArrayList;
// class App{
//     public static void main(String[]args){
//         ArrayList<Integer>numbers = new ArrayList<Integer>();

//         numbers.add(1);
//         numbers.add(2);
//         numbers.add(3);
//         numbers.add(4);
//         numbers.add(5);
//         numbers.add(6);
//         numbers.add(7);
//         numbers.add(8);
//         numbers.add(9);
//         numbers.add(0);

//         System.out.println(numbers.size());

//     }

// }

//                         //Checking if the ArrayList is empty
// import java.util.ArrayList;
// class App{
//     public static void main(String[]args){
//         ArrayList<Integer>numbers = new ArrayList<Integer>();

//         numbers.add(1);
//         numbers.add(2);
//         numbers.add(3);
//         numbers.add(4);
//         numbers.add(5);
//         numbers.add(6);
//         numbers.add(7);
//         numbers.add(8);
//         numbers.add(9);
//         numbers.add(0);

//         System.out.println(numbers.isEmpty());

//     }
// }--

//                         //Clearing an ArryaList
// import java.util.ArrayList;
// class App{
//     public static void main(String[]args){
//         ArrayList<Integer>numbers = new ArrayList<Integer>();

//         numbers.add(1);
//         numbers.add(2);
//         numbers.add(3);
//         numbers.add(4);
//         numbers.add(5);
//         numbers.add(6);
//         numbers.add(7);
//         numbers.add(8);
//         numbers.add(9);
//         numbers.add(0);

//         numbers.clear();

//         System.out.println(numbers.isEmpty());

//     }
// }

//                         //Using the forEach loop with an ArrayList
// import java.util.ArrayList;
// class App{
//     public static void main(String[]args){
//         ArrayList<Integer>numbers = new ArrayList<Integer>();

//         numbers.add(1);
//         numbers.add(2);
//         numbers.add(3);
//         numbers.add(4);
//         numbers.add(5);
//         numbers.add(6);
//         numbers.add(7);
//         numbers.add(8);
//         numbers.add(9);
//         numbers.add(0);

//         numbers.forEach(number -> {
//             System.out.println(number * 2);
//         });

//         System.out.println(numbers);

//     }
// }--

//                         //Using the forEach loop to update values in an ArrayList
// import java.util.ArrayList;
// class App{
//     public static void main(String[]args){
//         ArrayList<Integer>numbers = new ArrayList<Integer>();
//         numbers.add(1);
//         numbers.add(2);
//         numbers.add(3);
//         numbers.add(4);
//         numbers.add(5);

//         System.out.println("Before Update: "+numbers.toString());

//         numbers.forEach(number -> {
//             numbers.set(numbers.indexOf(number), number * 2);
//         });
//         System.out.println("After Update: " + numbers.toString());
//     }
// }

//                         //Creating a HashMap in Java
// import java.util.HashMap;
// class App{
//     public static void main(String[]args){
//         HashMap<String, Integer> examScores =  new HashMap<String, Integer>();
//         examScores.put("Maths", 90);
//         examScores.put("Science", 85);
//         examScores.put("History", 88);
//         examScores.put("Physical Education", 95);

//         System.out.println(examScores.toString());
//     }
// }--

//                         //Getting a value from a HashMap
// import java.util.HashMap;
// class App{
//     public static void main(String[]args){
//         HashMap<String, Integer> examScores = new HashMap<String, Integer>();
//         examScores.put("Maths", 90);
//         examScores.put("Science", 85);
//         examScores.put("History", 88);
//         examScores.put("Physical Education", 95);
//         examScores.put("English", 95);

//         System.out.println(examScores.get("English"));

//     }
// }

//                         //using the putIfAbsent method to insert a value in a HashMap
// import java.util.HashMap;
// class App{
//     public static void main(String[]args){
//         HashMap<String, Integer> examScores = new HashMap<String, Integer>();

//          examScores.put("Maths", 90);
//          examScores.put("Science", 85);
//          examScores.put("History", 88);
//          examScores.put("Physical Education", 95);
//          examScores.put("English", 95);

//          examScores.putIfAbsent("Maths", 70);

//          System.out.println(examScores.toString());

//     }
// }--

//                         //replacing a value in a HashMap
// import java.util.HashMap;
// class App{
//     public static void main(String[]args){
//         HashMap<String, Integer> examScores = new HashMap<String, Integer>();

//          examScores.put("Maths", 90);
//          examScores.put("Science", 85);
//          examScores.put("History", 88);
//          examScores.put("Physical Education", 95);
//          examScores.put("English", 95);

//          examScores.replace("Maths", 70);

//          System.out.println(examScores.toString());

//     }
// }

//                         //Using the getOrDefault method 
// import java.util.HashMap;
// class App{
//     public static void main(String[]args){
//         HashMap<String, Integer> examScores = new HashMap<String, Integer>();
//             examScores.put("Maths", 90);
//             examScores.put("Science", 85);
//             examScores.put("History", 88);
//             examScores.put("Physical Education", 95);
//             examScores.put("English", 95);

//             System.out.println(examScores.getOrDefault("Religion", -1));
//     }
// }--

//                         //How to clear a HashMap 
// import java.util.HashMap;
// class App{
//     public static void main(String[]args){
//         HashMap<String, Integer> examScores = new HashMap<String, Integer>();
//             examScores.put("Maths", 90);
//             examScores.put("Science", 85);
//             examScores.put("History", 88);
//             examScores.put("Physical Education", 95);
//             examScores.put("English", 95);

//             examScores.clear();

//         System.out.println(examScores.toString());
//     }
// }

//                         //how to get the size of a HashMap
// import java.util.HashMap;
// class App{
//     public static void main(String[]args){
//         HashMap<String, Integer> examScores = new HashMap<String, Integer>();
//         examScores.put("Maths", 90);
//         examScores.put("Science", 85);
//         examScores.put("History", 88);
//         examScores.put("Physical Education", 95);
//         examScores.put("English", 95);

//         System.out.println(examScores.size());
//     }
// }

//                         //How to remove a key-value pair from a HashMap
// import java.util.HashMap;
// class App{
//     public static void main(String[]args){
//         HashMap<String, Integer> examScores = new HashMap<String, Integer>();
//         examScores.put("Maths", 90);
//         examScores.put("Science", 85);
//         examScores.put("History", 88);
//         examScores.put("Physical Education", 95);
//         examScores.put("English", 95);        
    
//         examScores.remove("Physical Education");

//         System.out.println(examScores.toString());
//     }
// }--

//                         //How to check wether a HashMap includes a certain key
// import java.util.HashMap;
// class App{
//     public static void main(String[]args){
//         HashMap<String, Integer> examScores = new HashMap<>();
//         examScores.put("Maths", 90);
//         examScores.put("Science", 85);
//         examScores.put("History", 88);
//         examScores.put("Physical Education", 95);
//         examScores.put("English", 95);        
        
//         System.out.println(examScores.containsKey("Maths"));

//     }
// }

//                         //How to check wether a HashMap includes a certain value
// import java.util.HashMap;
// class App{
//     public static void main(String[]args){
//         HashMap<String, Integer> examScores = new HashMap<>();
//         examScores.put("Maths", 90);
//         examScores.put("Science", 85);
//         examScores.put("History", 88);
//         examScores.put("Physical Education", 95);
//         examScores.put("English", 95);        
        
//         System.out.println(examScores.containsValue(90));

//     }
// }--