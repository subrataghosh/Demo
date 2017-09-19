import java.util.Arrays;
import java.util.List;


class Demo{
	
	    public static void main(String[] args){
	        //Integer i=10;
	    	/*ArrayList<Integer> l=new ArrayList<Integer>();
	    	l.add(1);
	    	l.add(2);
	    	for (int i : l) {
	    		System.out.println(i);
			}
	    	
	    	Object o[]=l.toArray();
	    	System.out.println(o[0]);
	    	
	    	l.add(3);
	    	
	    	System.out.println(l);*/
	    	
	    	/*
	    	String uri="entities/V1GeiV5/attributes/EC_Name/184ppbnD5";
	    	String st1=uri.substring(uri.indexOf("/")+1);
	    	String uir1=st1.substring(0, st1.indexOf("/"));
	    	System.out.println(uri.substring(uri.indexOf("/")+1));
	    	System.out.println(uir1);*/
	    	
	    	 // int[] array = {1,2,3,4,5};
	    	  
	    	  List<Integer> l=Arrays.asList(1,2,3,4,5);
	    	  
	    	  l.stream().reduce((x,y) -> x+y).ifPresent(s -> System.out.println(s));
	    	  
	    	  l.stream().reduce(Integer::sum).ifPresent(s -> System.out.println(s));
	    	  
	    	  l.stream().reduce(SubClass::addIntData).ifPresent(s -> System.out.println(s));
	    	
	    }
	}

class SubClass {
	public static int addIntData(int num1, int num2) {
		return num1 + num2;
	}
} 

