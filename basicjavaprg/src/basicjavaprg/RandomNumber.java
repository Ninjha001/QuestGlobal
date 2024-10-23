package basicjavaprg;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 1; // lower bound of the range
        int max = 10; // upper bound of the range
 
        
        double randomNumber = (Math.random() * (max - min + 1)) + min;
 
        System.out.println("Random number between " + min + " and " + max + ": " + randomNumber);
	}

}
