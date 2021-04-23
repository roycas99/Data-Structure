 class BinaryTree {
     Node root;

     public void addNode(int key, String name) {
         // create a new Node and initialize it
         Node newNode = new Node(key, name);
         // if there is no root this becomes root
         if (root == null) {
             root = newNode;
         } else {
             // Set root as the Node we will start
             // with as we traverse the tree
             Node focusNode = root;

             // future parent for our new Node
             Node parent;
             while (true) {

                 // root is the top parent so we start
                 // there
                 parent = focusNode;

                 // Check if the new node should go on
                 // the left side of the parent node

                 if (key < focusNode.key) {
                     // Switch focus to the left child

                     focusNode = focusNode.leftChild;

                     if (focusNode == null) {
                         parent.leftChild = newNode;
                         return;
                     }
                 } else {
                     focusNode = focusNode.rightChild;

                     if (focusNode == null) {
                         parent.rightChild = newNode;
                         return;
                     }
                 }

             }

         }
     }

     // All nodes are visited in ascending order
     // Recursion is used to go to one node and
     // then go to its child nodes and so forth

     public void inorderTraverseTree(Node focusNode) {
         if (focusNode != null) {
             // Traverse the left node
             inorderTraverseTree(focusNode.leftChild);

             // Visit the currently focused on node
             System.out.println(focusNode);

             //Traverse the right node
             inorderTraverseTree(focusNode.rightChild);

         }
     }

     public void preOrderTraverseTree(Node focusNode) {
         if (focusNode != null) {
             System.out.println(focusNode);

             preOrderTraverseTree(focusNode.leftChild);
             preOrderTraverseTree(focusNode.rightChild);

         }
     }

     public void postOrderTraverseTree(Node focusNode) {
         if (focusNode != null) {
             postOrderTraverseTree(focusNode.leftChild);
             postOrderTraverseTree(focusNode.rightChild);

             System.out.println(focusNode);

         }
     }

     public Node findNode(int key) {
         // start at the top of the tree
         Node focusNode = root;
         // while we have not found the keep looking
         while (focusNode.key != key) {
             // if we should search to the left
             if (key < focusNode.key) {
                 // shift the focus Node to the left

                 focusNode = focusNode.leftChild;

             } else {
                 // shift the focus the Node to the right child
                 focusNode = focusNode.rightChild;
             }

             // the node was not found
             if (focusNode == null)
                 return null;


         }
         return focusNode;
     }
     public void BSTRemove(BinaryTree tree,int key)
     {
         Node par=null;
         Node cur=tree.root;
         while (cur != null){ // search for node
             if(cur.key == key){ // Node found
                 if (cur.leftChild == null && cur.rightChild==null){ // Remove leaf
                     if (par == null){ // Node is root
                         tree.root= null;
                     }
                     else if (par.leftChild==cur)
                         par.leftChild=null;
                     else
                         par.rightChild=null;
                 }
                 else if(cur.rightChild==null)  //Remove node with only left child
                 {
                     if (par == null) // Node is root
                         tree.root=cur.leftChild;
                     else  if (par.leftChild==cur)
                         par.leftChild=cur.leftChild;
                     else par.rightChild=cur.leftChild;
                 }
                 else if(cur.leftChild==null)
                 {  //  Remove node with only Right child
                     if (par == null) // Node is root
                         tree.root=cur.rightChild;
                     else  if (par.leftChild==cur)
                         par.leftChild=cur.rightChild;
                     else par.rightChild=cur.rightChild;
                 }
                 else {   // remove node with two children
                     //Find successor(leftmost child of right subtree
                     Node suc=cur.rightChild;
                     while(suc.leftChild != null)
                         suc=suc.leftChild;
                         int successsorData=suc.key;
                         BSTRemove(tree,suc.key);
                         cur.key=successsorData;
                     }
                     return;

                 }
             else if(cur.key<key){  // search right
                 par = cur;
                 cur=cur.rightChild;
             }
             else {
                 par = cur;
                 cur=cur.leftChild;
             }

             }

             return;
         }
         public int BSTGetHeight(Node n){
         if (n == null){
             return -1;
         }
         int leftHeight=BSTGetHeight(n.leftChild);
         int rightHeight=BSTGetHeight(n.rightChild);
//         if (leftHeight>rightHeight){
//             return leftHeight+1;
//         }
//         else {
//             return rightHeight+1;
//         }
             return 1+ Math.max(leftHeight,rightHeight);
         }
     }
