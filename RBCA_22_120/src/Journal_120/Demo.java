package Journal_120;
import java.util.Scanner;
// R/BCA-22-120
public class Demo {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first number: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("Enter the second number: ");
	        double num2 = scanner.nextDouble();

	        double sum = num1 + num2;
	        double difference = num1 - num2;
	        double product = num1 * num2;
	        double quotient = num2 != 0 ? num1 / num2 : Double.NaN;

	        System.out.println("Sum: " + sum);
	        System.out.println("Difference: " + difference);
	        System.out.println("Product: " + product);
	        System.out.println("Quotient: " + quotient);

	        scanner.close();
	    }
	}


