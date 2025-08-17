package CustomLinkedList;

public class CustomLinkedList {
	
	private Node head;
	
	private static class Node {
		Integer data;
		Node next;
		

		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}
	}

	public void add(int data) {
		Node idata=new Node(data);
		if(head==null) {
			head=idata;
			return;
		}
		Node current=head;
		while(current.next!=null){
			current=current.next;
		}
		current.next=idata;
	}
	
	public Integer get(int index) {
		Node current=head;
		int count=0;
		
		while(current.next!=null) {
			if(count==index) {
				return current.data;
			}
			current=current.next;
			count++;

		}
		
		return 0;
	}
	
	public Integer size() {
		Node current=head;
		int count=0;
		while(current!=null) {
			count++;
			current=current.next;
		}
		
		return count;
	}
	public void remove(int data) {
		Node current=head;
		while(current.next!=null) {
			if(current.next.data==data) {
				current.next = current.next.next;
				break;
			}
			current=current.next;
		}
	}
	
	public void printAll() {
		Node current=head;
		while(current!=null) {
			System.out.print(current.data+"->");
			current=current.next;
		}
	}
	
	public static void main(String[] args) {
		CustomLinkedList customLinkedList=new CustomLinkedList();
		customLinkedList.add(10);
		customLinkedList.add(20);
		customLinkedList.add(30);
		customLinkedList.add(40);
		System.out.println( "size: "+ customLinkedList.size());
		System.out.println(customLinkedList.get(0));
		customLinkedList.remove(20);
		System.out.println( "size: "+customLinkedList.size());
		customLinkedList.printAll();


		
	}
	
	

}
