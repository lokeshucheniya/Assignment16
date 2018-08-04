
public class CommandLine {
	
	public static void main(String args[]) {
		int n = 0;
		for(int i=0;i<3;i++) {					//Loop for taking integer from terminal
			n = n + Integer.parseInt(args[i]);
		}
		System.out.println("The sum of three number is "+n);
	}
}
