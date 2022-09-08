package labtest01;
import java.util.Scanner;
public class oprators {

	public static void main(String[] args) {
		int i=20;
		int j=10;
		switch('-')
		 {
		      case '+': System.out.println("addition of two number is "+(i+j));
		               break;
		      case '-': System.out.println("substraction of two number is "+(i-j));
		               break;
		      case '*': System.out.println("multilication of two number is "+(i*j));
		               break;
		      case '/': System.out.println("division of two number is "+(i/j));
		               break;
		      case '%': System.out.println("module of two number is "+(i%j));
		               break;
		      default: System.out.println("invalid Operator");
		               break;
		  }
	}
		
	}