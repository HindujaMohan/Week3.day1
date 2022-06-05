package Week3.day1;

public class Calculater {
	
	public int add(int num1, int num2) {
		int a = num1 + num2;
		return a;
	
	}
	public int add(int num1, int num2, int num3) {
		int b = num1 + num2 + num3;
		return b;
	}
	public int mul(int num1, int num2) {
		int c = num1 * num2;
		return c;
	}
	public double mul(double num1, double num2) {
		double d = num1 * num2;
		return d;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Calculater Calc = new Calculater();
     System.out.println(Calc.add(10, 70));
     System.out.println(Calc.add(1, 1, 1));
     System.out.println(Calc.mul(3.5, 3.5));
     System.out.println(Calc.mul(10, 10));

	}

}
