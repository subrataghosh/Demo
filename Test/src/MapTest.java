import java.util.HashMap;
import java.util.WeakHashMap;

public class MapTest {

	public static void main(String[] args) throws InterruptedException {
		HashMap m=new HashMap();
		//WeakHashMap m=new WeakHashMap();
		Temp t=new Temp();
		m.put(t, "Test");
		System.out.println(m); 
		t=null;
		System.gc();
		Thread.sleep(3000);
		System.out.println(m);
	}

}
class Temp{
	public String toString() {
		return "Temp";
	}
	
	public void finalize(){
		System.out.println("finalize method");
	}
}
