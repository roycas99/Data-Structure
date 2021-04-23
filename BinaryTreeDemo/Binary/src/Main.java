public class Main {
    public static void main(String[] args) {
    BinaryTree tree=new BinaryTree();
    tree.addNode(37,"five");
    tree.addNode(18,"three");
    tree.addNode(45,"two");
    tree.addNode(12,"four");
    tree.addNode(14,"six");
    tree.addNode(41,"seven");
    tree.addNode(49,"eight");
        //tree.BSTRemove(tree,30);
        System.out.println(tree.BSTGetHeight(tree.findNode(12)));

     tree.preOrderTraverseTree(tree.root);



    }
}

