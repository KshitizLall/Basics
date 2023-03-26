package tree;

public class BST {

	public Node insertRecursive(Node root, int data) {

		if (root == null) {
			return new Node(data);
		}

		if (data < root.getData()) {
			root.setLeft(insertRecursive(root.getLeft(), data));
		} else {
			root.setRight(insertRecursive(root.getRight(), data));
		}
		return root;
	}

	public Node insert(Node root, int data) {
		return insertRecursive(root, data);
	}

	// INORDER
	public void inOrder(Node node) {
		if (node != null) {
			inOrder(node.getLeft());
			System.out.print(" " + node.getData());
			inOrder(node.getRight());
		}
	}

	// PREORDER
	public void preOrder(Node node) {
		if (node != null) {
			System.out.print(" " + node.getData());
			inOrder(node.getLeft());
			inOrder(node.getRight());
		}
	}

	// POSTORDER
	public void postOrder(Node node) {
		if (node != null) {
			inOrder(node.getLeft());
			inOrder(node.getRight());
			System.out.print(" " + node.getData());
		}
	}

	// MAXIMUM VALUE IN TREE
	public int max(Node root) {
		int max = 0;

		if (root != null) {
			int LeftMax = max(root.getLeft());
			int RightMax = max(root.getRight());

			if (LeftMax > RightMax) {
				max = LeftMax;
			} else {
				max = RightMax;
			}

			if (root.getData() > max) {
				max = root.getData();
			}
		}
		return max;
	}

	// MINIMUM VALUE IN TREE
	public int min(Node root) {
		int min=999999999;

		if (root != null) {
			int LeftMin = min(root.getLeft());
			int RightMin = min(root.getRight());

			if (LeftMin < RightMin) {
				min = LeftMin;
			} else {
				min = RightMin;
			}

			if (root.getData() < min) {
				min = root.getData();
			}
		}
		return min;
	}
	// SEARCHING THE BST
	public boolean search(Node root, int data) {
		
		if(root == null) {
			return false;
		}
		
		if(root.getData() == data) {
			return true;
		}
			
		return search(root.getLeft(), data) || search(root.getRight(), data);
	}
	
	//FINDING THE MAXIMUM HEIGHT OF THE TREE
	public int height(Node root) {
		if(root == null) {
			return 0;
		}
		
		int leftHeight = height(root.getLeft());
		int rightHeight = height(root.getRight());
		
		return (leftHeight > rightHeight) ? leftHeight+1 : rightHeight+1;
	}
	
	//TOTAL SIZE OF THE TREE
	public int size(Node root) {
		int leftCount = root.getLeft() == null ? 0 : size(root.getLeft());
		int rightCount = root.getRight() == null ? 0 : size(root.getRight());
		
		return leftCount + rightCount + 1;
	}
	
	//FIND THE ELEMENT IN BST
	public Node find(Node root, int data) {
		if(root == null) {
			return null;
		}
		
		if(data < root.getData()) {
			return find(root.getLeft(), data);
		}
		else if(data > root.getData()) {
			return find(root.getRight(), data);
		}
		return root;
	}
	
	public static void main(String[] args) {
		BST bst = new BST();
		Node root = bst.insert(null, 5);
		root = bst.insert(root, 15);
		root = bst.insert(root, 52);
		root = bst.insert(root, 23);
		root = bst.insert(root, 65);
		root = bst.insert(root, 99);
		root = bst.insert(root, 86);
		// bst.inOrder(root);
		bst.preOrder(root);
		// bst.postOrder(root);

		//System.out.println("\nMaximum Value in BST " + bst.max(root));
		//System.out.println("\nMinimum Value in BST " + bst.min(root));
		System.out.println();
		System.out.println(bst.search(root, 23));
	
	}

}
