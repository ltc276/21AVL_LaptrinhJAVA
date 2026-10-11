package binarysearchtree;
import java.util.Scanner;
public class Main {

    public static Node addNode(Node root, int value) {

        if(root==null) return new Node(value);

        if(value<root.label) {

            if(root.left==null) root.left = new Node(value);

            else root.left = addNode(root.left,value);

        }else {

            if(root.right==null) root.right = new Node(value);

            else root.right = addNode(root.right,value);

        }

        return root;
    }

    public static void readtree(Node root) {

        if(root!=null) {

            System.out.print(root.label + " ");

            readtree(root.left);

            readtree(root.right);

        }
    }
    public static boolean findNode(Node root,int value) {
        if(root==null) return false;
        if(value==root.label) return true;
        else if(value<root.label) return findNode(root.left,value);
        else return findNode(root.right,value);
    }
    public static Node theleftNode(Node root) {
        if(root==null) return null;
        if(root.left==null) return root;
        return theleftNode(root.left);
    }
    public static Node deleteNode(Node root, int value) {
        if(root==null) return null;

        if(root.label==value) {
            if(root.left==null) return root.right;
            if(root.right==null) return root.left;

            Node T = theleftNode(root.right);
            Node L = root.left;
            Node R = root.right;

            T.left = L;
            T.right = deleteNode(R,T.label);

            return T;
        }

        if(value<root.label)
            root.left = deleteNode(root.left,value);
        else
            root.right = deleteNode(root.right,value);

        return root;
    }

    public static void main(String[] args) {

        Node root = null;

        root = addNode(root,60);
        root = addNode(root,41);
        root = addNode(root,16);
        root = addNode(root,25);
        root = addNode(root,53);
        root = addNode(root,46);
        root = addNode(root,42);
        root = addNode(root,55);
        root = addNode(root,74);
        root = addNode(root,65);
        root = addNode(root,63);
        root = addNode(root,62);
        root = addNode(root,64);
        root = addNode(root,70);
        root = deleteNode(root, 60);
        readtree(root);
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap node can tim: ");
        int value = sc.nextInt();
        if(findNode(root,value))
            System.out.println("Tim thay node " + value);
        else
            System.out.println("Khong tim thay node " + value);
    }
}
//Nhat huong doi tuong ten tuoi , contract 2 la linedked , 3 cay nhi phan