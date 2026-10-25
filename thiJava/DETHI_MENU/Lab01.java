//Yêu cầu 1: Tạo BST và xuất sinh viên theo ID
public class Lab01 {
    public static void main(String[] args) {
        BSTStudent tree = ConsoleUtil.getStudentTree();
        System.out.println("Yêu cầu 1: Tạo BST và xuất sinh viên theo ID.");
        System.out.println("Da them 10 sinh vien vao BST theo ID.");
        ConsoleUtil.printTable("DANH SACH SINH VIEN SAP XEP THEO ID", tree.getAll());
    }
}
