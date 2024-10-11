import java.util.*;

class Node {

	int data;
	Node left;
	Node right;
	Node (int data ) {
		
		this.data = data;
		left = right = null;

	}
}

class BinaryTree {

	Scanner sc = new Scanner(System.in);

	Node constructBT() {
		
		System.out.println("Enter data for Node : ");
		int data = sc.nextInt();

		Node newNode = new Node(data);

		System.out.println("Do u want to insert data at left of " + newNode.data);
		char leftNode = sc.next().charAt(0);
		if(leftNode == 'Y' || leftNode == 'y') {
			newNode.left = constructBT();
		}

		System.out.println("Do u want to insert data at right of " + newNode.data);
		char rightNode = sc.next().charAt(0);
		if(rightNode == 'Y' || rightNode == 'y'){
			newNode.right = constructBT();
		}

		return newNode;
	}

	void pre(Node root) {
		
		if( root == null)
			return;
		System.out.print(root.data + " ");
		pre(root.left);
		pre(root.right);
	}

	void in(Node root) {
	
		if( root == null )
			return;
		in(root.left);
		System.out.print(root.data + " " );
		in(root.right);
	}

	void post(Node root) {
		
		if(root == null)
			return;
		post(root.left);
		post(root.right);
		System.out.print(root.data + " ");
	}
	
	public static void main(String[] args) {
	
		Node root = null;
		
		BinaryTree bt = new BinaryTree();
		root = bt.constructBT();		
		
		System.out.println("Prorder Traversal : ");
		bt.pre(root);
		System.out.println();

		System.out.println("Inorder Traversal : ");
		bt.in(root);
		System.out.println();

		System.out.println("Postorder Traversal : ");
		bt.post(root);
		System.out.println();
	}
}
