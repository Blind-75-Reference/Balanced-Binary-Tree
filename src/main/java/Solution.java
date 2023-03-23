class Solution {
    /*
    In this solution we use the recursive checkBalance() method to check the balance of the tree. If we find ourselves
    on a null node, we return 0. Otherwise we recurse on left and right sub-trees. Consider the two values we get back,
    if the difference is > 1 then we have found an imbalanced tree, and we return -1 to indicate this. Otherwise we
    add 1 to whichever depth was greater, and return that number. If we ever get a -1 back we know there is an
    imbalance somewhere below, and we propagate that -1 up the stack.

    When we are done and return back into isBalanced() we will either have a -1 or the depth of the balanced tree.
     */
    public boolean isBalanced(TreeNode root) {
        if(checkBalance(root) != -1) {
            return true;
        }

        return false;
    }

    //base case - node is null
        //return 0
    //else recurse on both children
        // imbalance = |l - r|
    // when we find an imbalance > 1 we send a -1 up, if we ever get a -1 pass that back up
    //otherwise send back the greater of the two depths, +1
    //if we get a -1 back at the top we know the solution is false
    private int checkBalance(TreeNode root) {
        //base case
        if(root == null) {
            return 0;
        }

        //otherwise recurse on left and right
        int l = checkBalance(root.left);
        int r = checkBalance(root.right);

        //check what we get back from recursion. Either propagate the -1, or check and return the max depth
        if(l == -1 || r == -1 || Math.abs(l - r) > 1) {
            return -1;
        } else {
            return Math.max(l, r) + 1;
        }

    }

}