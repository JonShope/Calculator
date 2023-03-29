import java.util.Scanner;



public class App {
static final Scanner inputScanner = new Scanner(System.in);
private static Calculator s = new Calculator();

boolean continueProgram = true;


    
    public static void main(String[] args){
    double num1 = getDouble("enter a double");
    double num2 = getDouble("enter another double");
    String choice = getString ("Do you want to add, subtract ,divide, or multiply?");
    
    if(choice.equals("add")){
        System.out.println(Calculator.add(num1, num2));}
    if(choice.equals("subtract")){
        System.out.println(Calculator.subtract(num1, num2));}
    if(choice.equals("multiply")){
            System.out.println(Calculator.multiply(num1, num2));}
    if(choice.equals("divide")){
                System.out.println(Calculator.divide(num1, num2));}
    else{
        System.out.println("Goodbye");
    }
    
}
    

String result = getString("Do you want to continue? Yes or No");

// if  (result.equals("yes")){
//     continueProgram = true;
// }
// else{
//     System.out.println("Goodbye");
// }
private static String getString(String prompt){
        System.out.println(prompt);
        return inputScanner.next(); 
     }
private static double getDouble(String prompt){
        System.out.println(prompt);
        return inputScanner.nextDouble();

    }
}