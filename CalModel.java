package application;

public class CalModel {
	public int calculate(String op, int a, int b) {
		int result = 0;
		switch(op) {
			case "+":
				result = a + b;
				break;
			case "-":
				result = a - b;
				break;
			case "x":
				result = a * b;
				break;	
			case "%":
				result = a / b;
				break;	
		}
		return result;
	}
}


