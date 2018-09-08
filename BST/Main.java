public class Main{
	public static void main(String args[]){
		BST bst = new BST();
		bst.insert(10);
		bst.insert(20);
		bst.insert(30);
		bst.insert(9);
		bst.insert(8);
		bst.insert(6);
		System.out.println("InOrder (count "+bst.count+"): ");
		bst.inOrder(bst.root);
		bst.delete(8);
		System.out.println("After Deleting 8 (count "+bst.count+"): ");
		bst.inOrder(bst.root);
	}
}