package mypkg;

public class mycalc {

	public int sum(int a, int b) {
		return a + b;
	}

	public int diff(int a, int b) {
		return a - b;
	}

	public int prod(int a, int b) {
		return a * b;
	}

	public int div(int a, int b) {
		return a / b;
	}

	public void show() {
		System.out.println("Show Function!!");
	}

	public void hello() {
		System.out.println("Hello Function!!");
	}

	public void test() {
		System.out.println("Hello! Docker conatiner from GitHub Actions");
	}

	public static void main(String[] args) {

		mycalc calc = new mycalc();
		System.out.println("Sum is :" + calc.sum(20, 10));
		System.out.println("Diff is :" + calc.diff(20, 10));
		System.out.println("Product is :" + calc.prod(20, 10));
		System.out.println("Division is :" + calc.div(20, 10));
		calc.show();
		calc.hello();
		calc.test();

	}

}
