package finalTest;

import java.util.Random;

public class GenerateRnd {

	public static void main(String[] args) {
	int d=0;
		int[] array=new int[500];
		
		
		for(int i=0;i<500;i++) {
			System.out.println("position : "+i);
			array[i]=random1();
      System.out.println(array[i]);
		
			
		}
		int min=array[0];
	for(int item : array) {
		
		if (item < min) {
			min=item;
			
			
		}
	}
	
	for (int i=0;i<array.length;i++) {
		
		if (min==array[i]) {
		d=i;
	}
	}
		System.out.println("the smallest Num is "+ min+ " and the position is "+d);
	}
	public static int random1() {
		Random rnd=new Random();
			int random=rnd.nextInt(500);
			
			return random;
		}

}
