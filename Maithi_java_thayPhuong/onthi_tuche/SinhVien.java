public class SinhVien {
    public int id;
    public String name;
    public String gender;
    public int age;
    public String conduct;

    public SinhVien(int id, String name, String gender, int age, String conduct) {
        this.id = id;
        this.name = name.trim();
        this.gender = chuanHoaGioiTinh(gender);
        this.age = age;
        this.conduct = conduct.trim().toUpperCase();
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
        return id + "|" + name.replace('|', ' ') + "|" + gender + "|" + age + "|" + conduct;
    }
}
