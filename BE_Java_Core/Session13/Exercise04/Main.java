package vn.edu.rikkei.session13.ex04;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- QUẢN LÝ DÂY CHUYỀN SẢN XUẤT ---");
        System.out.println("Thêm thường: \"SP-01\", \"Bàn phím\" | \"SP-02\", \"Chuột\"");
        System.out.println("Thêm ưu tiên (đầu): \"SP-99\", \"Mainboard Server\"\n");

        ProductionLine line = new ProductionLine();

        line.addNormalPriority(new Product("SP-01", "Bàn phím", 500000));
        line.addNormalPriority(new Product("SP-02", "Chuột", 200000));

        line.addHighPriority(new Product("SP-99", "Mainboard Server", 8000000));

        line.displayProductionLine();
    }
}
