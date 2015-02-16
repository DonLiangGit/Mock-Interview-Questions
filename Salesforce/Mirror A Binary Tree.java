/*
 * write program to mirror the binary tree.
 */

public class Solution {
	public void BinaryTreeMirror(TreeNode root) {
		if(root == null) {
			return root;
		}
		swap(root);
		BinaryTreeMirror(root.left);
		BinaryTreeMirror(root.right);
	}

	public void swap(TreeNode root) {
		TreeNode tempNode = new TreeNode();
		tempNode = root.left;
		root.left = root.right;
		root.right = tempNode;
	} 
}