package lt.lhu.unit02.main;

public class Task09 {

	public static void main(String[] args) {
		// Вычислить значение функции:
		int x;
		double fx;
		
		x = 7;
		
		if (x<= -3) {
			fx = 9;
		} else {
			fx = 1/(Math.pow(x, 2)+1);
		}
		
		System.out.println ("F(x)="+ fx);

	}

}
