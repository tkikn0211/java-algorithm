package JAVA_practice;

public class Qtest12 {
	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				sum = sum + i;
				count++;
			}
		}
		System.out.println(sum);
		System.out.println(count);
	}
}
