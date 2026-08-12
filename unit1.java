import java.util.*; // import everything
// import java.util.Scanner



public class unit1 { // has to match progam files
    public static void main(String[] args)
    {
        // text- string literal
        System.out.print("Github is working!"); // prints on the same line
        System.out.println("Git Hub is working!!!"); // semi colon on everything except class definitions
        int age; // Default of 0 
        
        age = 50;
        age=49;
        System.out.println("I am "+ age + "years old.");
        double weight; // int cannot be a decimal
        weight = 50.0;
        System.out.print("I weight "+ weight +" pounds");
        double height = 5.0; //double can be an integer or decimal
        // double weight = 50.0;
        boolean old = true; // only true or false
        // int age = 50;
        char grade ='D'; 
        // Reference data types
        String name ="Naman Raichura"; // string object
       
        String address = new String(":123 Grizzly way"); // formal way
        // primitive data types NOT  on AP test. 
        float gpa = 2.145f;
                        // new - creates a new string object by talking to constructor 
        short kids = 3;
        long life = 108;
   
        // call scanner class
        Scanner userinput = new Scanner(System.in); 
   
        System.out.println("Enter your Name");
        name = userinput.nextLine(); //string - collects string

        System.out.println(name);

        System.out.println("Enter your age");

        age=userinput.nextInt(); // integer
// clear integer buffer
        System.out.println(age);

        userinput.nextLine(); // Clear the integer buffer, return to string // userINput.nextINt(), userINput.nextDouble();
       
        System.out.println("Enter your address");
        address= userinput.nextLine();
        System.out.println(address);
        System.out.println("n \\\\");
        //
        /* */ // multiple line comments 
        }
    
    
    // class           x: place holder:   // println is a method - defined in class systems 
}
// Public - allows for access to classes
// Static - method doesn't belong to object; belongs to class
    // Objects: copy of class
// Void - no return statement
// --> HAS TO MEAN main

// Python is efficient in processing and code, but less memory efficent - versus java

// 