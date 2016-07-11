

import java.util.ArrayList;

public class Calculation1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(30);
		list1.add(50);
		
		add(list1);
	}
	
	static void add(ArrayList<Integer> intArrayList){
		int sum = 0;
		for(int num : intArrayList){
			sum += num;
		}
		System.out.println(sum);
	}

}
