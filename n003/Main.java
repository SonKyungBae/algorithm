package algorithm.n003;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr = {1,2,2,3,1,4,2,2,4,3,5,3,2,3,3,3,2,2};
		
		int[] mod = new int[10] ;
		
		for (int i : arr) {
			mod[i]++;
		}
		
		int MaxNumber = 0;
		int NumberCnt = 0;
		
		for (int i = 0; i < mod.length; i++) {
			if (NumberCnt < mod[i]) {
				MaxNumber = i;
				NumberCnt = mod[i];
			}
		}
		
		System.out.println(MaxNumber);
		System.out.println(NumberCnt);
		
	}

}
