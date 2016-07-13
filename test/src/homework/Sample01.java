package homework;

public class Sample01 {
	public static void main(String[] args) {

		int sum = 0;
		for ( int i = 1 ; i <= 100 ; i++ ) {

			sum += i;
			System.out.println(i);
		}
		System.out.println("1～100の、足し算の合計は" + sum + "です。");

	}

}
