/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int val=0, TreeNode left=null, TreeNode right=null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution
{
    public bool LeafSimilar(TreeNode root1, TreeNode root2)
    {
        List<int> leaf1 = new List<int>();
        List<int> leaf2 = new List<int>();

        Dfs(root1, leaf1);
        Dfs(root2, leaf2);

        return leaf1.SequenceEqual(leaf2);
    }

    public void Dfs(TreeNode node, List<int> leafValues)
    {
        if (node == null)
        {
            return;
        }

        if (node.left == null && node.right == null)
        {
            leafValues.Add(node.val);
        }

        Dfs(node.left, leafValues);
        Dfs(node.right, leafValues);
    }
}
