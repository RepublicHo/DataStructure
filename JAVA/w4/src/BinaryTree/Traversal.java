package BinaryTree;


public class Traversal {
    NodeChar root;
    Traversal(){ root = null; }

    void Inorder(NodeChar node){
        if(node == null){ return; }
        Inorder(node.left);
        System.out.println(node.value);
        Inorder(node.right);
    }

    void Preorder(NodeChar node){
        if(node == null){ return; }
        System.out.println(node.value);
        Preorder(node.left);
        Preorder(node.right);

    }

    void Postorder(NodeChar node){
        if(node == null){ return; }
        Postorder(node.left);
        Postorder(node.right);
        System.out.println(node.value + "  ");

    }

    void printPreorder(){Preorder(root);}
    void printInorder(){Inorder(root);}
    void printPostorder(){Postorder(root);}

    public static void main(String[] args) {
        Traversal tree = new Traversal();
        tree.root = new NodeChar('a');
        tree.root.left = new NodeChar('b');
        tree.root.right = new NodeChar('c');
        tree.root.left.left = new NodeChar('d');
        tree.root.left.right = new NodeChar('e');
        tree.root.right.right = new NodeChar('f');

        tree.printPreorder();
        System.out.println();
        tree.printInorder();
        System.out.println();
        tree.printPostorder();

    }
}
