import java.util.Arrays;
import java.util.List;

public class TestListClass {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(111, 211, 121, 231, 51);
		
		count(l);

		System.out.println("..Use of reduce method...");

		l.stream().reduce((x, y) -> x + y).ifPresent(s -> System.out.println(s));

		//l.stream().reduce(Integer::sum).ifPresent(s -> System.out.println(s));

	}
	
	
	public static void count(List<Integer> l){
		System.out.println("Total no. of odd integers are="+l.stream().filter(i -> i % 2 != 0).count());
		System.out.println("Total no. of prime numbers are="+primeCount(l));
		System.out.println("Total no. of palindrome numbers are=="+palindromeCount(l));
	}
	
	
	public static int primeCount(List<Integer> l){
		int k=0;
		for (int i = 0; i < l.size(); i++) {
			int c=0;
			for (int j = 1; j <= l.get(i); j++) {
				if (l.get(i) % j == 0) {
					c++;
				}
			}
			if(c==2){
				k++;
			}
			
		}
		return k;
	}
	
	public static int palindromeCount(List<Integer> l){
       int k=0;
		
		for (int i = 0; i < l.size(); i++) {
			int sum=0,r = 0,n;
			n=l.get(i);
			while(n>0){
				r=n%10;
				sum=10*sum+r;
				n=n/10;
			}
			if(sum==l.get(i)){
				k++;
			}
		}
		return k;
	}


}



