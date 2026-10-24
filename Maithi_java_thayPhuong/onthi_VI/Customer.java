public class Customer {
    public int id;
    public String hoten;
    public String gioitinh;
    public int tuoi;
    public String nhommau;
    public Customer(int id, String hoten, String gioitinh, int tuoi, String nhommau){
        this.id = id;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.tuoi = tuoi;
        this.nhommau = nhommau;

    }
      public String toFileLine() {
        return id + "|" + hoten.replace('|', ' ') + "|" + gioitinh + "|" + tuoi + "|" + nhommau;
    }
}