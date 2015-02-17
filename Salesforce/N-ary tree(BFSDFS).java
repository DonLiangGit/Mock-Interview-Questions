/*
 * Write the recursive implementation of BFS and DFS
 * for an n-ary tree. Tree node has an int data item, 
 * and a linked list "children" of nodes.
 */

public class Solution {
	public TreeNode BFSDFStree(int[] A, int k) {
		if(A.length == 0 || A == null) {
			return null;
		}
		Queue<TreeNode> queue = new Queue<TreeNode>();
		for(int i : A) {
			queue.offer(new TreeNode(i));
		}
		TreeNode root = queue.poll();
		treeHelper(queue, root, k);
		return root;
	}
	public void treeHelper(Queue queue, TreeNode root, int k) {
		while(!queue.isEmpty() && root.children.size() < k) {
			root.children.add(queue.poll());
		}
		for(int i = 0; i < k && !queue.isEmpty(); i++) {
			treeHelper(queue, root.children.get(i), k);
		}
	}
}

public class TreeNode {
	private int val;
	private List<TreeNode> children;
	public void TreeNode(int val) {
		this.val = val;
	}
}