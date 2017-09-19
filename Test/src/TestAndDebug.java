
class OS{
	

	void meth(){
		System.out.println("No args.");
	}
	void meth(String a){
		System.out.println("String args.."+a);
	}
	void meth(Object a){
		System.out.println("Object args.."+a);
	}
	
}


public class TestAndDebug {

	public static void main(String[] args) {
		
		OS o=new OS();
		o.meth();
		o.meth("23");
		o.meth(23); 
		Object a="23";
		int c=3%8;
		System.out.println(c);
		System.out.println(System.currentTimeMillis());

		
	}

}
