package customermanager;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Customer> malelist = new ArrayList<>();
    static ArrayList<Customer> femalelist = new ArrayList<>();

    // Ghi danh sach ArrayList vao file
    public static boolean Save_to_file_arraylist(ArrayList<Customer> list, String path) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            oos.writeObject(list);
            return true;
        } catch (Exception e) {
            System.out.println("Loi ghi file " + path + ": " + e.getMessage());
            return false;
        }
    }

    // Ghi cay BST vao file
    public static boolean Save_to_file(Customer root, String path) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            oos.writeObject(root);
            return true;
        } catch (Exception e) {
            System.out.println("Loi ghi file " + path + ": " + e.getMessage());
            return false;
        }
    }

    // Doc cay BST tu file
    public static Customer Read_from_file(String path) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            return (Customer) ois.readObject();
        } catch (Exception e) {
            System.out.println("Loi doc file " + path + ": " + e.getMessage());
            return null;
        }
    }

    // Doc ArrayList tu file
    @SuppressWarnings("unchecked")
    public static ArrayList<Customer> Read_from_file_arraylist(String path) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            return (ArrayList<Customer>) ois.readObject();
        } catch (Exception e) {
            System.out.println("Loi doc file " + path + ": " + e.getMessage());
            return null;
        }
    }

    public static void getMaleList(Customer root) {
        if (root != null) {
            getMaleList(root.left);
            if ("nam".equalsIgnoreCase(root.getCustomer_Gender())) {
                malelist.add(root);
            }
            getMaleList(root.right);
        }
    }

    public static void getFemaleList(Customer root) {
        if (root != null) {
            getFemaleList(root.left);
            if ("nu".equalsIgnoreCase(root.getCustomer_Gender())) {
                femalelist.add(root);
            }
            getFemaleList(root.right);
        }
    }

    // Them khach hang vao cay BST theo ID
    public static Customer addCustomer(Customer root, Customer e) {
        if (root == null) return e;

        if (e.getCustomer_ID() < root.getCustomer_ID()) {
            root.left = addCustomer(root.left, e);
        } else {
            root.right = addCustomer(root.right, e);
        }
        return root;
    }

    // Duyet cay theo thu tu ID tang dan
    public static void readtree(Customer root) {
        if (root != null) {
            readtree(root.left);
            System.out.printf("%-10d%-25s%-10s%-10d%n",
                    root.getCustomer_ID(), root.getCustomer_Name(),
                    root.getCustomer_Gender(), root.getCustomer_Age());
            readtree(root.right);
        }
    }

    public static Customer findCustomer(Customer root, int ID) {
        if (root == null) return null;
        if (ID == root.getCustomer_ID()) return root;
        if (ID < root.getCustomer_ID()) return findCustomer(root.left, ID);
        return findCustomer(root.right, ID);
    }

    public static Customer deleteCustomer(Customer root, int ID) {
        if (root == null) return null;

        if (ID < root.getCustomer_ID()) {
            root.left = deleteCustomer(root.left, ID);
        } else if (ID > root.getCustomer_ID()) {
            root.right = deleteCustomer(root.right, ID);
        } else {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            Customer next = theleftCustomer(root.right);
            next.right = deleteCustomer(root.right, next.getCustomer_ID());
            next.left = root.left;
            return next;
        }
        return root;
    }

    public static Customer theleftCustomer(Customer root) {
        if (root == null || root.left == null) return root;
        return theleftCustomer(root.left);
    }

    public static void printList(ArrayList<Customer> list) {
        if (list == null) {
            System.out.println("Khong doc duoc danh sach tu file.");
            return;
        }
        System.out.printf("%-10s%-25s%-10s%-10s%n", "ID", "Name", "Gender", "Age");
        for (Customer c : list) {
            System.out.printf("%-10d%-25s%-10s%-10d%n",
                    c.getCustomer_ID(), c.getCustomer_Name(),
                    c.getCustomer_Gender(), c.getCustomer_Age());
        }
    }

    public static void main(String[] args) {
        // Tao du lieu mau
        Customer c1 = new Customer(105, "Nguyen Van Nam", "nam", 23);
        Customer c2 = new Customer(106, "Pham Le Huy", "nam", 28);
        Customer c3 = new Customer(108, "Le Van An", "nam", 23);
        Customer c4 = new Customer(103, "Duong Ngoc Nhu Y", "nu", 21);
        Customer c5 = new Customer(102, "Tran Van Dat", "nam", 20);
        Customer c6 = new Customer(109, "Le Thi Mai", "nu", 27);

        Customer root = c1;
        root = addCustomer(root, c2);
        root = addCustomer(root, c3);
        root = addCustomer(root, c4);
        root = addCustomer(root, c5);
        root = addCustomer(root, c6);

        // Dung ten file tuong doi: file duoc tao trong thu muc chay project
        String treePath = "treecustomer.dat";
        String malePath = "malelist.dat";
        String femalePath = "femalelist.dat";

        // Luu va doc cay tu file
        Save_to_file(root, treePath);
        root = Read_from_file(treePath);
        if (root == null) {
            System.out.println("Khong doc duoc cay BST. Dung chuong trinh.");
            return;
        }

        System.out.println("DANH SACH KHACH HANG THEO ID (BST):");
        System.out.printf("%-10s%-25s%-10s%-10s%n", "ID", "Name", "Gender", "Age");
        readtree(root);

        // Tach danh sach nam/nu tu cay
        malelist.clear();
        femalelist.clear();
        getMaleList(root);
        getFemaleList(root);
        Save_to_file_arraylist(malelist, malePath);
        Save_to_file_arraylist(femalelist, femalePath);

        System.out.println("\nDANH SACH KHACH HANG NAM:");
        printList(Read_from_file_arraylist(malePath));

        System.out.println("\nDANH SACH KHACH HANG NU:");
        printList(Read_from_file_arraylist(femalePath));

        System.out.println("\nDANH SACH NAM SAP XEP THEO TEN:");
        malelist.sort(new NameComparator());
        printList(malelist);
        Save_to_file_arraylist(malelist, malePath);

        // Tim khach hang
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap ID can tim: ");
        int ID = sc.nextInt();
        Customer found = findCustomer(root, ID);
        if (found != null) {
            System.out.println("Tim thay khach hang: " + found);
        } else {
            System.out.println("Khong tim thay khach hang co ID: " + ID);
        }

        // Xoa khach hang
        System.out.print("Nhap ID khach hang can xoa: ");
        ID = sc.nextInt();
        root = deleteCustomer(root, ID);
        System.out.println("\nDANH SACH SAU KHI XOA ID " + ID + ":");
        System.out.printf("%-10s%-25s%-10s%-10s%n", "ID", "Name", "Gender", "Age");
        readtree(root);
        Save_to_file(root, treePath);
        sc.close();
    }
}
