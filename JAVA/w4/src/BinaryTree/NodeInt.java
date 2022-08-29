package BinaryTree;

/**
 * A binary tree node has a key, two pointers which points to
 * left child and right child respectively
 */
public class NodeInt {
    int value;
    NodeInt left, right;

    NodeInt(int item){
        value = item;
        left = right = null;
    }

    int getValue(){
        return value;
    }
}
