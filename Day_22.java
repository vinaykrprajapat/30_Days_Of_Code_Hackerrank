// Day 22: Binary Search Trees

	public static int getHeight(Node root){
      //Write your code here
            if (root==null) return -1;
    return Math.max(1+getHeight(root.left),
    1+getHeight(root.right));
    }

