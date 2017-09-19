import java.util.TreeSet;

public class MapTest2 {

	public static void main(String[] args) {
		
		Person p1 = new Person(0, "Bob");
        Person p2 = new Person(1, "Sue");
        Person p3 = new Person(2, "Mike");
        Person p4 = new Person(2, "Mike");
        
        /*Map<Person, Integer> map = new LinkedHashMap<Person, Integer>();
        
        map.put(p1, 1);
        map.put(p2, 2);
        map.put(p3, 3);
        map.put(p4, 3);
        
        for(Person key: map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }*/
        
        TreeSet<Person> t=new TreeSet<Person>();
        t.add(p1);
        t.add(p2);
        t.add(p3);
        t.add(p4);
        System.out.println(t); 
	
	}

}

/*class Cuskey{
	    private int accountNumber;
	    private String holderName;
	 
	    public Cuskey(int accountNumber) {
	        this.accountNumber = accountNumber;
	    }
	 
	    public String getHolderName() {
	        return holderName;
	    }
	 
	    public void setHolderName(String holderName) {
	        this.holderName = holderName;
	    }
	 
	    public int getAccountNumber() {
	        return accountNumber;
	    }
}*/


class Person implements Comparable{
	
    private int id;
    private String name;
    
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public String toString() {
        return "{ID is: " + id + "; name is: " + name + "}";
    }

	@Override
	public int compareTo(Object o) {
		int id1=this.id;
		Person p=(Person) o;
		int id2=p.id;
		if(id1<id2){
			return -1;
		}else if (id1>id2) {
			return 1;
		}else{
			return 0;
		}
		
	}

  /*  @Override
    public int hashCode() {
		
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        System.out.println(result); 
        return result;
    	
    }*/

  /*  @Override
    public boolean equals(Object obj) {
		
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Person other = (Person) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    	
    }*/
    
    
}

