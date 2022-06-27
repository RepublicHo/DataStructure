package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author Anthony Z.
 * @Date 13/5/2022
 * @Description:
 *
 * Delete: https://www.geeksforgeeks.org/deletion-binary-tree/
 *
 * Difference of Full, complete, and perfect Binary Tree.
 *
 * A Binary Tree is a full binary tree if every node has 0 or 2 children.
 * A Binary Tree is a Complete Binary Tree if all the levels are completely filled except possibly the last level and
 * the last level has all keys as left as possible
 * A Binary tree is a Perfect Binary Tree in which all the internal nodes have two children and all leaf nodes are at the same level.
 */
public class InsertionDeletion {

    static NodeInt root;
    static NodeInt temp = root;

    static void inorder(NodeInt temp){

        if(temp == null){
            return;
        }

        inorder(temp.left);
        System.out.println(temp.value + " ");
        inorder(temp.right);

    }

    static void insert(NodeInt temp, int key){

        if(temp == null){
            temp = new NodeInt(key);
            return;
        }

        Queue<NodeInt> queue = new LinkedList<>();
        queue.add(temp);

        while(!queue.isEmpty()){
            temp = queue.peek();
            queue.remove(); // removes the element at the front

            if(temp.left == null){
                temp.left = new NodeInt(key);
                break;
            }else{
                queue.add(temp.left);
            }

            if(temp.right == null){
                temp.right = new NodeInt(key);
                break;
            }else{
                queue.add(temp.right);
            }
        }
    }



    public static void main(String[] args) {

        root = new NodeInt(10);
        root.left = new NodeInt(11);
        root.left.left = new NodeInt(7);
        root.right = new NodeInt(9);
        root.right.left = new NodeInt(15);
        root.right.right = new NodeInt(8);

        System.out.print(
                "Inorder traversal before insertion:");
        inorder(root);

        int key = 12;
        insert(root, key);

        System.out.print(
                "\nInorder traversal after insertion:");
        inorder(root);
    }

}
