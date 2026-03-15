package Lec33;

public class Flatten_Binary_Tree_to_LinkedList {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public void flatten(TreeNode root) {

		}

		public TreeNode MakeLL(TreeNode root) {
			if (root == null) {
				return null;
			}
			if(root.left==null && root.right==null) {
				return root;
			}

			TreeNode left_tail = MakeLL(root.left);
			TreeNode right_tail = MakeLL(root.right);
			if (left_tail != null) {
				left_tail.right = root.right;// head right wala ka
				root.right = root.left;
				root.left = null;
			}
			return right_tail != null ? right_tail : left_tail;
		}
	}
}
