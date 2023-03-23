import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestCases {
    Solution solution = new Solution();

    @Test
    public void TestCase1() {
        TreeNode tree = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3, new TreeNode(4), new TreeNode(4)),
                        new TreeNode(3, new TreeNode(4), new TreeNode(4))),

                new TreeNode(2,
                        new TreeNode(3, new TreeNode(4), new TreeNode(4)),
                        new TreeNode(3, new TreeNode(4), new TreeNode(4))
                ));

        Assertions.assertEquals(true, solution.isBalanced(tree));
    }

    @Test
    public void TestCase2() {
        TreeNode tree = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3, new TreeNode(4), new TreeNode(4)),
                        new TreeNode(3, new TreeNode(4), new TreeNode(4))),

                new TreeNode(2));

        Assertions.assertEquals(false, solution.isBalanced(tree));
    }
}
