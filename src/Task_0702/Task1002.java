package Task_0702;

public class Task1002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myNum =30;
		int divisible1 = 3, divisible2 =12, divisible3 = 11;
		int divisibleCount = 0;
		if (myNum % divisible1 == 0) {
			divisibleCount += 1;
		}
		if (myNum % divisible2 == 0) {
			divisibleCount += 1;
		}
		if (myNum % divisible3 == 0) {
			divisibleCount += 1;
		}
		System.out.println(divisibleCount + " Strike");

	}
}

