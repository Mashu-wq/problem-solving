package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

import ARRAYS.repeatAndMissingNumberArray;

public class binaryTree {

static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return  null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
        public static void preOrder(Node root){
            //root
            //left subtree
            //right subtree
            if (root == null){
                return;
            }
            System.out.println(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void postOrder(Node root){
            //left subtree
            //right subtree
            //root 
            if (root == null){
                return;
            }

            postOrder(root.left);
            postOrder(root.right);  
            System.out.println(root.data + " ");
        }

        //Lever order traversal
        public static void levelOrder(Node root){
            if (root == null){
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }

                }else{
                    System.out.println(currNode.data+ " ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }

    }

    public static int height (Node root){
        if (root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    public static int count(Node root){
        if (root == null){
            return 0;
        }
        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount+rightCount+1;
    }

    //Diameter of a tree(1st approach) 
    public static int diameter1 (Node root){
        if(root == null){
            return 0;
        }

        int leftDiam = diameter1(root.left);
        int leftHt = height(root.left);
        int rightDiam = diameter1(root.right);
        int rightHt = height(root.right);

        int selfDiam = leftHt + rightHt + 1;

        return Math.max(selfDiam, Math.max(leftDiam, rightDiam));

    }

    //Diameter of a tree(approach 2)

    public static int diameter2(Node root){
        if(root == null){
            return 0;
        }
        int leftDiam = diameter2(root.left);
        int leftHt = height(root.left);
        int rightDiam = diameter2(root.right);
        int rightHt = height(root.right);

        int selfDiam = leftHt + rightHt + 1;
        return Math.max(selfDiam, Math.max(leftDiam,rightDiam));
    }
    
    

    static class Info{
        int diam;
        int ht;
        public Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }

    }

    public static Info diameter(Node root){
        if(root == null){
            return new Info(0, 0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, ht);
    }

    

   
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        tree.preOrder(root);
        System.out.println(root.data);

        tree.postOrder(root);
        System.out.println(root.data);

        tree.levelOrder(root);
        System.out.println(root.data);

        Node roots = new Node(1);
        roots.left = new Node(2);
        roots.right = new Node(3);
        roots.left.left = new Node(4);
        roots.left.left = new Node(5);
        roots.right.right = new Node(7);

        System.out.println(height(roots));
        System.out.println(count(roots));
        System.out.println(diameter1(roots));
        

        //System.out.println(diameter1(roots).diam);
    }
}
