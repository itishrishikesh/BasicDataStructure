class BST{
	Node root;
	int count;
	public void insert(int value){
		if(root == null){
			root = new Node(value);
			count++;
		}
		else{
			insertNode(root, value);
		}
	}
	public void insertNode(Node current, int value){
		if(value < current.value){
			if(current.left == null){
				current.left = new Node(value);
				count++;
			} 
			else
				insertNode(current.left, value);
		}
		else{
			if(current.right == null){
				current.right = new Node(value);
				count++;
			}
			else
				insertNode(current.right, value);
		}
	}
	public Node findNode(Node root, int value){
		if(root == null) return null;
		else{
			if(root.value == value)
				return root;
			else if(root.value > value){
				return findNode(root.left, value);
			}
			else{
				return findNode(root.right, value);
			}
		}
	}
	public Node findParent(Node root, int value){
		if(value == root.value){
			return null;
		}
		if(value < root.value){
			if(root.left == null){
				return null;
			}
			else if(root.left.value == value){
				return root;
			}
			else
				return findParent(root.left, value);
		}
		else{
			if(root.right == null){
				return null;
			}
			else if(root.right.value == value){
				return root;
			} 
			else
				return findParent(root.right, value);
		}
	}

	public boolean delete(int value){
		Node nodeToRemove = findNode(root, value);
		if(nodeToRemove == null) 
			return false;
		Node parent = findParent(root, value);
		if(count == 1) 
			root = null;
		else if(nodeToRemove.left == null && nodeToRemove.right == null){
			if(nodeToRemove.value < parent.value)
				parent.left = null;
			else
				parent.right = null;
		}
		else if(nodeToRemove.left != null && nodeToRemove.right == null){
			if(nodeToRemove.value < parent.value)
				parent.left = nodeToRemove.left;
			else
				parent.right = nodeToRemove.left;
		}
		else if(nodeToRemove.left == null && nodeToRemove.right != null){
			if(nodeToRemove.value < parent.value)
				parent.left = nodeToRemove.right;
			else
				parent.right = nodeToRemove.right;
		}
		else{
			Node largestValue = nodeToRemove.left;
			while(largestValue.right != null){
				largestValue = largestValue.right;
			}
			findParent(largestValue, value).right = null;
			nodeToRemove.value = largestValue.value;
		}
		count--;
		return true;
	}
	public boolean find(int value){
		if(root == null){
			return false;
		}
		Node temp = root;
		while(temp != null){
			if(temp.value == value)
				return true;
			else if(temp.value > value)
				temp = temp.left;
			else if(temp.value < value)
				temp = temp.right;
		}
		return false;
	}
	public int findMax(){
		Node temp = root;
		while(temp != null){
			temp = temp.right;
			if(temp.right == null) return temp.value;
		}
		return -1;
	}
	public int findMin(){
		Node temp = root;
		while(temp != null){
			temp = temp.left;
			if(temp.left == null) return temp.value;
		}
		return -1;
	}
	public void inOrder(Node root){
		if(root == null) return;
		inOrder(root.left);
		System.out.println(root.value);
		inOrder(root.right);
	}
	public void preOrder(Node root){
		if(root == null) return;
		preOrder(root.left);
		preOrder(root.right);
		System.out.println(root.value);
	}
	public void postOrder(Node root){
		if(root == null) return;
		System.out.println(root.value);
		postOrder(root.left);
		postOrder(root.right);
	}
}