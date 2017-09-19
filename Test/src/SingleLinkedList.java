public class SingleLinkedList {

	public static void main(String[] args) {
		CustomLinkedList<Integer> list=new CustomLinkedList<Integer>();
		/*list.add(23);
		list.add(26);
		list.add(27);
		list.add(29);
		System.out.println("Size:"+list.size());
		list.print();
		list.delete();
		System.out.println("Size:"+list.size());
		list.print();
		list.addAfter(30, 29);
		list.print();*/
		
		list.add(2);
		list.add(34);
		list.add(35);
		list.print();
		list.delete();
		list.print();
		list.addAfter(36, 35);
		list.print();
	}

}

class CustomLinkedList<T>{
	private int size;
	private Node<T> head;
	private Node<T> tail;
	
	public void add(T element) {
		Node<T> nd = new Node<T>();
		nd.setValue(element);
		size++;
		if (head == null) {
			head = nd;
			tail = nd;
		} else {
			tail.setNextRef(nd);
			tail = nd;
		}

	}
	
	public void addAfter(T element, T after) {
		Node<T> tmp = head;
		Node<T> refN = null;
		while (true) {
			if (tmp == null) {
				break;
			}
			if (tmp.compareTo(after) == 0) {
				refN = tmp;
				break;
			}
			tmp = tmp.getNextRef();
		}
		if (refN != null) {
			Node<T> nd = new Node<T>();
			nd.setValue(element);
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
	
	public void delete() {
		if (head == null) {
			System.out.println("Empty List..");
		}
		Node<T> tmp = head;
		head = tmp.getNextRef();
		if (head == null) {
			tail = null;
		}
		System.out.println("Deleted:" + tmp.getValue());
		size--;
	}
	
	public void deleteAfter(T after) {
		Node<T> tmp = head;
		Node<T> refN = null;
		while (true) {
			if (tmp == null) {
				break;
			}
			if (tmp.compareTo(after) == 0) {
				refN = tmp;
				break;
			}
			tmp = tmp.getNextRef();
		}
		if (refN != null) {
			tmp = refN.getNextRef();
			refN.setNextRef(tmp.getNextRef());
			if (refN.getNextRef() == null) {
				tail = refN;
			}
			System.out.println("Deleted: " + tmp.getValue());
			size--;
		} else {
			System.out.println("Unable to find the given element...");
		}
	}
	
	
	public void print(){
		Node<T> temp = head; 
		while(true){
			if(temp == null){
				break;
			}
			System.out.print(temp.getValue()+"-->");
			temp=temp.getNextRef();
		}
		System.out.println();
	}
	
	public int size(){
		return size;
	}
	
}



class Node<T> implements Comparable<T>{ 
	private T value;
	private Node<T> nextRef;
	
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public Node<T> getNextRef() {
		return nextRef;
	}
	public void setNextRef(Node<T> nextRef) {
		this.nextRef = nextRef;
	}
	
	@Override
	public int compareTo(T arg) {
		if(arg == this.value){
			return 0;	
		}else{
			return 1;
		}
	}
}
