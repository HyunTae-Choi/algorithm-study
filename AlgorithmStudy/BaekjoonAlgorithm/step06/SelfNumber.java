package step06;

public class SelfNumber {

	public static void main(String[] args) {
		boolean[] selfNumArr = new boolean[10001];
		for(int i = 0; i < 10000; i++) {
			d(i, selfNumArr);
		}
		for(int i = 0; i < selfNumArr.length; i++) {
			if(selfNumArr[i]) {
				continue;
			} else {
				System.out.println(i);
			}
		}
	}

	private static void d(int i, boolean[] selfNumArr) {
		int result = i;
		while(i != 0) {
			result += i % 10;
			i = i / 10;
		}
		if(result <= 10000) {
			selfNumArr[result] = true;
		}
	}

}
