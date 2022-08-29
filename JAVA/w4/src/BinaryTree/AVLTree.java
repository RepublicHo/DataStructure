package BinaryTree;

/**
 * @Author Anthony Z.
 * @Date 3/6/2022
 * @Description:
 *
 * Binary Search Tree存在的问题是，树在插入的时候，不同的插入会导致树的高度
 * 不一样，影响查询效率。最差的情况是节点都在一条斜线上。
 *
 * Balanced BST平衡查找二叉树：插入和删除的时候 会通过旋转操作将高度保持在LogN。
 * 其中具有代表性的树是AVL树和红黑树
 *
 * AVL tree is a self-balancing Binary Search Tree where the difference
 * between heights of left and right subtrees cannot be more than one for
 * all nodes. As such, it adheres to the same rules as a normal binary
 * search tree, where nodes in the left subtree are less than the root and nodes in
 * the right subtree are greater.
 *
 * AVL tree ensures that the insert, find and delete operations are always performed
 * in O(logn) time.
 *
 *  https://github.com/isaacmast/AVLTree
 */
public class AVLTree {
    // declare instance variable
    private NodeInt root;
    // Constructs an empty AVL tree.
    public AVLTree(){
        this.root = null;
    }

    /**
     * Construct an AVL tree, setting root to a new Node
     * that contains the int value.
     * @param data
     */
    public AVLTree(int data){
        this.root = new NodeInt(data);
    }

    public NodeInt getRoot(){
        return this.root;
    }

    public void preOrder(NodeInt current){
        if(current == null){
            System.out.println("null");
        }else{
            System.out.println();
        }
    }


}
