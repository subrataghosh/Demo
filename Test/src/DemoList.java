
public class DemoList {

	public static void main(String[] args) {
		CusLink<Integer> ll=new CusLink<Integer>();
		ll.add(2);
		ll.add(34);
		ll.add(345);
		ll.print();
		ll.delete();
		ll.print();
		ll.addAfter(346, 345);
		ll.print();
	}
}
	class CusLink<T>{
		private int size;
		private Node1<T> head;
		private Node1<T> tail;
		
		public int size(){
			return size;
		}
		
		/*public void add(T element){
			Node1<T> nd =new Node1<T>();
			nd.setData(element);
			size++;
			if(head == null){
				head = nd;
				tail = nd;
				
			}else{
				tail.setNextRef(nd);
				tail = nd;
			}
		}*/
		
		public void add(T element) {
			Node1<T> nd = new Node1<T>();
			nd.setData(element);
			size++;
			if (head == null) {
				head = nd;
				tail = nd;
			} else {
				tail.setNextRef(nd);
				tail = nd;
			}

		}
		
		/*public void addAfter(T element,T after){
		  Node1<T> tmp = head;
		  Node1<T> ref = null;
		  while(true){
			  if(tmp == null){
				  break;
			  }
			  if(tmp.compareTo(after)==0){
				  ref = tmp;
				  break;
			  }
			  tmp = tmp.getNextRef();
		  }
		  if(ref!= null){
			  Node1<T> nd =new Node1<T>();
			  nd.setData(element);
			  nd.setNextRef(tmp.getNextRef()); 
			  if(tmp == tail){
				  tail= nd; 
			  }
			  tmp.setNextRef(nd);
		  }else{
			  System.out.println("Unable to find the given element...");
		  }
		}*/
		
		public void addAfter(T element, T after) {
			Node1<T> tmp = head;
			Node1<T> refN = null;
			while (true) {
				if (tmp == null) {
					break;
				}
				if (tmp.compareTo(after) == 1) {
					refN = tmp;
					break;
				}
				tmp = tmp.getNextRef();
			}
			if (refN != null) {
				Node1<T> nd = new Node1<T>();
				nd.setData(element);
				nd.setNextRef(tmp.getNextRef());
				size++;
				if (tmp == tail) {
					tail = nd;
				}
				tmp.setNextRef(nd);
			} else {
				System.out.println("Unable to find the given element...");
			}

		}
		
		/*public void delete(){
			Node1<T> tmp=head;
			if(head ==  null){
				System.out.println("Empty List...");
			}
			else{
				head = tmp.getNextRef();
				if(head ==  null){
					tail=null;
				}
				System.out.println("Deleted:"+tmp.getData()); 
				size--;
			}
		}*/
		public void delete() {
			if (head == null) {
				System.out.println("Empty List..");
			}
			Node1<T> tmp = head;
			head = tmp.getNextRef();
			if (head == null) {
				tail = null;
			}
			System.out.println("Deleted:" + tmp.getData());
			size--;
		}
		
		public void print(){
			Node1<T> tmp = head;
			while(true){
				if(tmp == null){
					break;
				}
				System.out.print(tmp.getData()+"-->"); 
				tmp= tmp.getNextRef();
			}
			System.out.println();
			
		}
		
	}
	
	class Node1<T> implements Comparable<T>{
		private T data;
		private Node1<T> nextRef;
		
		public T getData() {
			return data;
		}
		public void setData(T data) {
			this.data = data;
		}
		public Node1<T> getNextRef() {
			return nextRef;
		}
		public void setNextRef(Node1<T> nextRef) {
			this.nextRef = nextRef;
		}
		
		@Override
		public int compareTo(T args) {
			if(args == this.data){
			    return 1;
			}else{
				return 0;
			}
		}
	}
