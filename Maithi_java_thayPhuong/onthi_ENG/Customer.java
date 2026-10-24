public class Customer {
    public int id;
    public String name;
    public String gender;
    public int age;
    public String blood;

    public Customer(int id, String name, String gender, int age, String blood) {
        this.id = id;
        this.name = name.trim();
        this.gender = chuanHoaGioiTinh(gender);
        this.age = age;
        this.blood = blood.trim().toUpperCase();
    }

    private String chuanHoaGioiTinh(String value) {
        String s = value.trim();
        if (s.equalsIgnoreCase("nam") || s.equalsIgnoreCase("m") || s.equalsIgnoreCase("male")) {
            return "Nam";
        }
        if (s.equalsIgnoreCase("nu") || s.equalsIgnoreCase("nữ") || s.equalsIgnoreCase("f")
                || s.equalsIgnoreCase("female")) {
            return "Nữ";
        }
        return s;
    }

    public String toFileLine() {
        return id + "|" + name.replace('|', ' ') + "|" + gender + "|" + age + "|" + blood;
    }
}
