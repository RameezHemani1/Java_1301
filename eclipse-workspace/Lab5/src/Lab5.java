// this is lab 5 questions 1-3, my name is Rameez Hemani
public class Lab5 {

	public static void main(String[] args) {
		name();
		age();
		multiples();
		// These next two methods are for number 3 on lab 5
		method1();
		method2();
		
	}
	public static void name() {
		for (int name=1; name<=20; name++) {
			System.out.println("Rameez");
		}
	}
	public static void age() {
		System.out.println();
		for (int age=1; age<=19; age++) {
			System.out.println(age);
		}
	}
	public static void multiples() {
		System.out.println();
		for(int i= 5; i<=50; i = i + 5) {
			System.out.println(i);
		}
	}
	public static void method1() {
		System.out.println();
		for (int j=5; j>=1; j--) {
			for(int k= 1; k<=j; k++) {
				System.out.print(j-k+1);
				
			}
			System.out.println();
		}
	}
	public static void method2() {
		System.out.println();
		for(int a= 1; a<=5; a++) {
			for(int b=1; b<=a; b++) {
				System.out.print(b);
			}
			System.out.println();
		}
	}
}
