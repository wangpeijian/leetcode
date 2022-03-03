import java.util.Arrays;
import java.util.List;

/**
 * @author wangpejian
 * @date 19-9-9 下午1:58
 */
public class Main {

    public static void main(String[] args) {
        Main tree = new Main();
        List<Node> nodeList = Arrays.asList(
                new Node(1, 0, "AA"),
                new Node(2, 1, "BB"),
                new Node(3, 1, "CC"),
                new Node(4, 3, "DD"),
                new Node(5, 3, "EE"),
                new Node(6, 2, "FF"),
                new Node(7, 2, "GG"),
                new Node(8, 4, "HH"),
                new Node(9, 5, "II"),
                new Node(10, 0, "JJ"));
        tree.convertList(nodeList);
    }

    static class Node {
        private int id;
        private int parentId;
        private String name;

        public Node() {

        }

        public Node(int id, int parentId, String name) {
            this.id = id;
            this.parentId = parentId;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getParentId() {
            return parentId;
        }

        public void setParentId(int parentId) {
            this.parentId = parentId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * 结果要求打印： 不能更改Node结构
     *  AA
     *      BB
     *          FF
     *          GG
     *      CC
     *          DD
     *              HH
     *          EE
     *              II
     *  JJ
     * @param nodeList
     * @return
     */
    private void convertList(List<Node> nodeList) {
        printChile(0, nodeList, 0, 0);
    }

    private void printChile(int pid, List<Node> nodeList, int lvl, int p){
        StringBuilder space = new StringBuilder();
        for (int i = 0; i < lvl; i++) {
            space.append("    ");
        }

        for (int i = p; i < nodeList.size(); i++) {
            Node c = nodeList.get(i);
            if (c.getParentId() == pid) {
                System.out.println(space.toString() + c.getName());
                printChile(c.getId(), nodeList, lvl + 1, p + 1);
            }
        }
    }

    //TreeNode treeNode5 = new TreeNode(5);
    //TreeNode treeNode4 = new TreeNode(4, null, treeNode5);
    //TreeNode treeNode3 = new TreeNode(3);
    //TreeNode treeNode2 = new TreeNode(2, treeNode3, treeNode4);
    //TreeNode treeNode1 = new TreeNode(1, null, treeNode2);

    static class TreeNode {
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

    //ListNode a = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1, new ListNode(1, null))))));
    //ListNode b = new ListNode(5, new ListNode(6, new ListNode(1, new ListNode(8, new ListNode(4, new ListNode(5, null))))));

    static public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

        ListNode(int x, ListNode next) {
            val = x;
            this.next = next;
        }
    }
}
