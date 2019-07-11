// this program is going to be used to study for computer science midterm
public class StudyGuide {

	public static void main(String[] args) {
		forLoops();
	}
	public static void forLoops() {
		System.out.println();
		int rameez= 9;
		for(int i=1;i<=rameez; i++) {
			for(int j=9; j>= i; j--) {
				System.out.print(" ");
			}
			
			for(int k=1;k<=i; k++) {
				System.out.print(i); 
			}
			
			
			for(int g=1; g<=i;g++) {
				System.out.print(".");
			}
			System.out.print("\n");
		}
			
		
	}
	
}
