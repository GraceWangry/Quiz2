import java.util.Scanner;

public class Tuition {
	public static void main (String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the tuition rate:");
		
		double tuition = input.nextDouble();
		double thesum = tuition;
		double percentage = input.nextDouble();
				
		for (int i=1; i<4;i++){
			System.out.println("What is the percentage Increase");
			
			tuition = (1+(percentage/100))*tuition;
			thesum += tuition;
			
		}
		
		System.out.println("The total tuition is :" +thesum);
	}
	
}
