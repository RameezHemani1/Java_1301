//This is lab 6, or the midterm final exam. My name is Rameez Hemani
public class lab6 {

	public static void main(String[] args) {
		question1();
		question2();
	
		

	}
	//this first method are the stars
	public static void question1() {
		for (int i=5; i>=1;i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	//this second method is the shape 
	public static void question2() {
		System.out.println("/\\\t/\\");
		System.out.println("  \\_______\\");
		System.out.println("   (_)-(_)");
	}
		

}
