package vn.edu.rikkei.session13.ex04;

import java.util.Iterator;
import java.util.LinkedList;

public class ProductionLine {
    private LinkedList<Product> products = new LinkedList<>();

    public void addHighPriority(Product p) {
        products.addFirst(p);
    }

    public void addNormalPriority(Product p) {
        products.addLast(p);
    }

    public void displayProductionLine() {
        System.out.println("+-------------------------------------------------+");
        System.out.println("|             DÂY CHUYỀN SẢN XUẤT LINKEDLIST      |");
        System.out.println("+-------------------------------------------------+");

        Iterator<Product> it = products.iterator();
        int index = 1;

        while (it.hasNext()) {
            Product p = it.next();

            String priorityLabel = p.getId().equals("SP-99") ? "ƯU TIÊN" : "Thường ";

            System.out.printf("| [Thứ tự %d - %s] %-5s | %-18s |\n", index, priorityLabel, p.getId(), p.getName());
            index++;
        }

        System.out.println("+-------------------------------------------------+");
    }
}
