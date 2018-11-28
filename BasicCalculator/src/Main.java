import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		int answer;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter first digit:");
		int operand1 = in.nextInt();
		System.out.println("Please enter second digit:");
		int operand2 = in.nextInt();
		System.out.println("Select your operator( +, -, *, /, %, ^):");
		String operator = in.next();
		
		
		
		switch(operator) 
		{
		case "+": operator = "Addition"; 
				answer = operand1 + operand2;
				System.out.println(answer);
				break;
		case "-": operator = "Subtraction"; 
				answer = operand1 - operand2;
				System.out.println(answer);
				break;
		case "*": operator = "Multiplication"; 
				answer = operand1 * operand2;
				System.out.println(answer);
				break;
		case "/": operator = "Division";
				answer = operand1 / operand2;
				System.out.println(answer);
				break;
		case "%": operator = "Modulos";
				  answer = operand1 % operand2;
				  System.out.println(answer);
				  break;
		case "^": operator = "Square";
				  for(int i = 1; i <= operand2; i++) {
					  operand1 = operand1 * operand1;
					  System.out.println(operand1);
				
				  }
				  
				  
		
		}

	}

}
