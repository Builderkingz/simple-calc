import java.util.Scanner;

public class Main {


public static void main(String[] args) {

double FirstNumber;
double SecondNumber;
double AdditionResult;
double SubtractionResult;

Scanner input = new Scanner(System.in);

System.out.println("Enter the first number");
FirstNumber = input.nextDouble();

System.out.println("Enter the second number");
SecondNumber = input.nextDouble();

input.close();

   AdditionResult = (FirstNumber + SecondNumber);
   SubtractionResult = (FirstNumber - SecondNumber);

System.out.println("The Addition Result is " + AdditionResult);
System.out.println("The Subtraction Result is " + SubtractionResult);
    }

}

