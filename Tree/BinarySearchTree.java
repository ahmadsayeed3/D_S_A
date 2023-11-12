public class BinarySearchTree{


	public static void main(String[] args){
		BinaryTree_ binaryTree = new BinaryTree_();
		System.out.println("Inserting Tree");
		binaryTree.insert(1);
		binaryTree.insert(9);
		binaryTree.insert(2);
		binaryTree.insert(3);
		binaryTree.insert(7);
		binaryTree.insert(4);
		binaryTree.insert(5);
		binaryTree.insert(0);
		
		System.out.println();
		System.out.println("Traverse Tree");
		binaryTree.traverse();
		
		System.out.println();
		System.out.println("Check isExists");
		boolean value = binaryTree.isExists(4);
		System.out.println("isExists: " + value);
	}

}

class BinaryTree_{

	private Node rootNode;

	public void insert(int value){
		this.rootNode = insertValue(this.rootNode, value);
	}
	
	private Node insertValue(Node node, int value){
		if(node == null){
			return new Node(value);
		}
				
		if(value < node.getValue()){
			
			if(node.getLeft() == null){
				node.setLeft(new Node(value));
			}else{
				insertValue(node.getLeft(), value);
			}
		}else{
			if(node.getRight() == null){
				node.setRight(new Node(value));
			}else {
				insertValue(node.getRight(), value);
			}
		}
		
		return node;
	}
	
	/*private Node insertValueInternetWay(Node node, int value) {
		if (node == null) {
			return new Node(value);
		}

		if (value < node.getValue()) {
			node.setLeft(insertValue1(node.getLeft(), value));
		} else if (value > node.getValue()) {
			node.setRight(insertValue1(node.getRight(), value));
		}

		return node;
	}*/

	
	public void traverse(){
		inOrderTraverse(this.rootNode);
	}
	
	private void inOrderTraverse(Node node){
		if(node == null)
			return;
		
		if(node.getLeft() != null){
			inOrderTraverse(node.getLeft());
		}
		
		System.out.println(node.getValue());
		
		if(node.getRight() !=null){
			inOrderTraverse(node.getRight());
		}
	}
	
	public boolean isExists(int value) {
		return searchTree(this.rootNode, value);
	}

	private boolean searchTree(Node node, int value) {
		if (node == null) {
			return false;
		}

		if (node.getValue() == value) {
			return true;
		}

		return searchTree(node.getLeft(), value) || searchTree(node.getRight(), value);
	}

}

class Node{

	private int value;
	private Node left;
	private Node right;
	
	public Node(int value){
		this.value = value;
	}
	
	public int getValue(){
		return this.value;
	}
	
	public void setLeft(Node node){
		this.left = node;
	}
	
	public Node getLeft(){
		return this.left;
	}
	
	public void setRight(Node node){
		this.right = node;
	}
	
	public Node getRight(){
		return this.right;
	}

}