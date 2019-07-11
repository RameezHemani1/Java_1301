
public class lab4 {
	public static void main(String[] args) {
		aboutMe();
		printStars();
		printNumbers();
	}
	public static void aboutMe() {
		int age= 20 - 3;
		double gpa= 3.0 +.3;
		System.out.println("My age is " + age);
		System.out.println("Twice my age is " + (2 * age));
		System.out.println("Three times my age is " + (3 * age));
		System.out.println("Half of my age is " + (.5 * age));
		System.out.println("My gpa is " + gpa);
		System.out.println("Half my gpa is " + (.5 * gpa));
	}
	public static void printStars() {
		System.out.println();
		for (int i=1; i<=10; i++) {
			System.out.print("*");	
		}
	} 
	public static void printNumbers() {
		System.out.println();
		System.out.println();
		for (int j=1; j<=10; j++) {
			System.out.print(j);
		}
	}
	
	


}
