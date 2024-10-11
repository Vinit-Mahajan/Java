class Node {

	Node prev = null;
	int data;
	Node next = null;
	Node(int data) {
		this.data = data;
	}
}

class DoublyLL {

	Node head = null;
	void addFirst(int data) {

		Node newNode = new Node(data);	
		if(head == null) {
		
			head = newNode;
		}else {
		
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}

	void addLast(int data) {
	
		Node newNode = new Node(data);
		if(head == null) {
		
			head = newNode;
		}else {
		
			Node temp = head;
			while(temp.next != null) {
			
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.prev = temp;
		}
	}

	int countNode() {
	
		int count = 0;
		if(head == null) {
			return count;
		}else {
		
			Node temp = head;
			while(temp != null) {
				
				count++;
				temp = temp.next;
			}
			return count;
		}
	}

	void addAtPos(int pos, int data) {
	
		if(pos <= 0 || pos >= countNode() + 2) {
		
			System.out.println("Invalid Position");
			return;
		}
		if(pos == 1) {
		
			addFirst(data);
		} else if(pos == countNode()+1) {
		
			addLast(data);
		} else {
		
			Node newNode = new Node(data);
			Node temp = head;
			while(pos-2 != 0) {
			
				temp = temp.next;
				pos--;
			}
			newNode.prev = temp;
			newNode.next = temp.next;
			temp.next = newNode;
			newNode.next.prev = newNode;
		}
	}

	void delFirst() {
	
		if(head == null) {
		
			System.out.println("Empty List");
		}else if(countNode() == 1) {
			head = null;
		} else {
			
			head = head.next;
			head.prev = null;
		}
	}

	void delLast() {
	
		if(head == null) {
		
			System.out.println("Empty List");
		} else {
		
			Node temp = head;
			while (temp.next != null) {
			
				temp = temp.next;
			}
			temp.prev.next = null;
			temp.prev = null;
		}
	}

	void delAtPos(int pos) {
	
		if(pos <= 0 || pos >= countNode()+1) {
		
			System.out.println("Invalid Position");
			return;
		}else if(pos == 1) {
		
			delFirst();
		}else if(pos == countNode()) {
		
			delLast();

		} else {
		
			Node temp = head;
			while (pos -2 != 0) {
			
				temp = temp.next;
				pos--;
			}
			temp.next = temp.next.next;
			temp.next.prev = temp;

		}
	}

	void printDLL () {

		if(head == null) {
		
			System.out.println("Empty List");
		} else{
	
			Node temp = head;
			while(temp != null) {
		
				System.out.print(temp.data+ " ");
				temp = temp.next;
			}
		}
	}
}

class DoublyClient {

	public static void main(String[] args) {
	
		DoublyLL ll = new DoublyLL();
		ll.addFirst(30);
		ll.addFirst(20);
		ll.addFirst(10);
		ll.printDLL();

		System.out.println();

		ll.addLast(40);
		ll.addLast(50);
		ll.printDLL();

		System.out.println();

		ll.delFirst();
		ll.printDLL();
		System.out.println();

		ll.delLast();
		ll.printDLL();

                System.out.println();


		ll.addFirst(100);
		ll.addFirst(200);
		ll.addFirst(300);
		ll.printDLL();

                System.out.println();

		ll.addAtPos(2, 50);
		ll.printDLL();

                System.out.println();

		ll.delAtPos(2);
                ll.printDLL();

                System.out.println();

		System.out.println(ll.countNode());



	}
}
