package customermanager;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer u1 = new Customer(107, "an", "nam", 30);
        Customer u2 = new Customer(101, "hoa", "nu", 20);
        Customer u3 = new Customer(105, "khanh", "nam", 35);
        Customer u4 = new Customer(103, "mai", "nu", 28);
        Customer u5 = new Customer(109, "huy", "nam", 40);
        Customer u6 = new Customer(102, "binh", "nam", 25);
        Customer u7 = new Customer(104, "thuan", "nam", 37);

        ArrayList<Customer> list = new ArrayList<>();

        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        list.add(u5);
        list.add(u6);
        list.add(u7);

        System.out.println("Danh sach khach hang: ");

        for (Customer e : list)
            System.out.println(e.toString());
        double avg = 0 ; 
        double sum = 0;
        for (Customer e : list)
            sum = sum+e.getCustomer_Age();
        if(sum!=0) avg = sum/list.size();
        int g=0,s=0;
        for (Customer e : list)
            if(e.getCustomer_Age()>avg) g++; else s++;
        System.out.println("Tuoi trung binh khach hang la: "+avg);
        System.out.println("Tuoi lon hon trung binhla : "+g);
        System.out.println("Tuoi nho hon trung binhla : "+s);
        System.out.println("Danh sach khach hang nam la :");
        for (Customer e : list)
            if (e.getCustomer_Gender().compareTo("nam") == 0)
                System.out.println(e.toString());

        System.out.println("Danh sach khach hang nu la :");
        for (Customer e : list)
            if (e.getCustomer_Gender().compareTo("nu") == 0)
                System.out.println(e.toString());
        int maxNam = -1;
        int minNam = 999;
        Customer khachNamLon = null;
        Customer khachNamNho = null;

        for (Customer e : list)
            if (e.getCustomer_Gender().compareTo("nam") == 0) {
                if (e.getCustomer_Age() > maxNam) {
                    maxNam = e.getCustomer_Age();
                    khachNamLon = e;
                }

                if (e.getCustomer_Age() < minNam) {
                    minNam = e.getCustomer_Age();
                    khachNamNho = e;
                }
            }

        System.out.println("Khach nam lon tuoi nhat: " + khachNamLon.toString());
        System.out.println("Khach nam nho tuoi nhat: " + khachNamNho.toString());


        int maxNu = -1;
        int minNu = 999;
        Customer khachNuLon = null;
        Customer khachNuNho = null;

        for (Customer e : list)
            if (e.getCustomer_Gender().compareTo("nu") == 0) {
                if (e.getCustomer_Age() > maxNu) {
                    maxNu = e.getCustomer_Age();
                    khachNuLon = e;
                }

                if (e.getCustomer_Age() < minNu) {
                    minNu = e.getCustomer_Age();
                    khachNuNho = e;
                }
            }

        System.out.println("Khach nu lon tuoi nhat: " + khachNuLon.toString());
        System.out.println("Khach nu nho tuoi nhat: " + khachNuNho.toString());


        double sumNam = 0;
        double sumNu = 0;
        int demNam = 0;
        int demNu = 0;

        for (Customer e : list)
            if (e.getCustomer_Gender().compareTo("nam") == 0) {
                sumNam = sumNam + e.getCustomer_Age();
                demNam++;
            }
            else if (e.getCustomer_Gender().compareTo("nu") == 0) {
                sumNu = sumNu + e.getCustomer_Age();
                demNu++;
            }

        double avgNam = 0;
        double avgNu = 0;

        if (demNam != 0)
            avgNam = sumNam / demNam;

        if (demNu != 0)
            avgNu = sumNu / demNu;

        System.out.println("Tuoi trung binh khach hang nam: " + avgNam);
        System.out.println("Tuoi trung binh khach hang nu: " + avgNu);
        System.out.println("Danh sach khach hang sap xep theo ID: ");
        list.sort(new IDComparator());
        for (Customer e : list)
            System.out.println(e.toString());
        System.out.println("Danh sach khach hang sap xep theo ten: ");
        list.sort(new NameComparator());
        for (Customer e : list)
            System.out.println(e.toString());
    }
}