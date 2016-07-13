package homework;

import java.util.ArrayList;
import java.util.Iterator;

public class Sample03 {
	public static void main(String []args){

		int [] intList = {1,2,3,4,5,6,7};
		//keisan1(intList);

		String [] strList ={"犬","キジ","サル","桃太郎"};
		//keisan2(strList);

		ArrayList<Integer> intArrayList = new ArrayList<Integer>();
		intArrayList.add(1);
		intArrayList.add(2);
		intArrayList.add(3);
		intArrayList.add(4);
		//keisan3(intArrayList);
		//keisan4(intArrayList);
		keisan5(intArrayList);
	}

	static void keisan1(int[] intList){

		//lengthは配列の長さ
		for(int i=0 ; i<intList.length ; i++){
			System.out.println(intList[i]);
		}
	}

	static void keisan2(String[] strList){
		//名前で回す
		for(int i=0; i<strList.length ; i++){
			System.out.println(strList[i]);
		}
	}
	static void keisan3(ArrayList<Integer>intArrayList){
		//戻り値
		int sum = 0;

		//足し算
		for(int i=0 ; i < intArrayList.size() ; i++){
			sum += intArrayList.get(i);
		}
		System.out.println(sum);
	}
	static void keisan4(ArrayList<Integer>intArrayList){
		//戻り値
		int sum = 0;

		//Iteratorを使ったfor文
		for(Iterator<Integer> it =intArrayList.iterator(); it.hasNext();){
			sum += it.next();
		}
		System.out.println(sum);
	}
	static void keisan5(ArrayList<Integer>intArrayList){
		//拡張for文
		for(int i : intArrayList){
			System.out.println(i);
		}
	}




}
