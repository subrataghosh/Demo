import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.IntStream;

/*class p{

	public void test() {
		
	}
	
}*/

/*interface I{
	static void test(){
		System.out.println("test");
	}
}*/


public class Test2 {
   /* public static boolean isGreater3(int number){
    	return number >3;
    }*/
	public static void main(String[] args) {
		//List<Integer> l = Arrays.asList(1, 2, 121, 4, 5);
	//	System.out.println(l.stream().filter(i -> i % 2 != 0).count());
		
	//	l.stream().re
		
		/*int k=0;
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
		System.out.println(k); 
		*/
		
		/*int k=0;
		
		for (int i = 0; i < l.size(); i++) {
			int sum=0,r = 0,n;
			n=l.get(i);
			while(n>0){
				r=n%10;
				sum=10*sum+r;
				n=n/10;
			}
			//System.out.println(sum);
			if(sum==l.get(i)){
				System.out.println(","+sum); 
			}
			
			
		}*/
		
		
		
		
		
		
		
		
		/*p obj=new p(){
			public void test(){
				System.out.println("dsf");
			}
		};
		obj.test();*/ 
		//Test2::isGreater3
		//Test2.isGreater3
		
		/*List<Integer> l = Arrays.asList(1, 2, 3, 4, 5,6,7,8);
		l.forEach(i -> System.out.println(i)); 
		System.out.println(
				l.stream().filter(e -> Test2.isGreater3(e)).findFirst()  
				
				);*/
		
		System.out.println(primes(7));
		
		
	}
	
	static Collection<Integer> primes(int numPrimes) {
	    final List<Integer> primes = new ArrayList<>(numPrimes);
	    IntStream.iterate(2, i -> i + 1).
	            filter(i -> {
	                for (int prime : primes)
	                    if (i % prime == 0)
	                        return false;
	                return true;
	            }).limit(numPrimes).
	            forEach(primes::add);
	    return primes;
	}

}
