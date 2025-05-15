import java.util.*;
public class RandomTest {

	public static void main(String[] args) {
		Random rndm = new Random();
		int max = 25;
		int value = rndm.nextInt(max);
		System.out.println(value);
		
	}

}
