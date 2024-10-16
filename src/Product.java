import java.util.ArrayList;

public class Product {
    public static void main(String[] args) {

        //List for product names
        ArrayList<String> product_name_list = new ArrayList<>();
        product_name_list.add("Laptop");
        product_name_list.add("Desk Chair");
        product_name_list.add("Smartwatch");
        product_name_list.add("Notebook");
        product_name_list.add("Running Shoes");

        //List for product categories
        ArrayList<String> product_category_list = new ArrayList<>();
        product_category_list.add("Electronics");
        product_category_list.add("Furniture");
        product_category_list.add("Electronics");
        product_category_list.add("Stationery");
        product_category_list.add("Apparel");


        //List for product id
        ArrayList<Integer> product_id_list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            product_id_list.add(i);
        }


        //List for product price
        ArrayList<Integer> product_price_list = new ArrayList<>();
        product_price_list.add(750);
        product_price_list.add(100);
        product_price_list.add(200);
        product_price_list.add(5);
        product_price_list.add(80);


        //Print result
        for (int i = 0; i < product_name_list.size(); i++) {
            System.out.println("ID: " + product_id_list.get(i) + ", Name: " + product_name_list.get(i) + ", Category: " + product_category_list.get(i) + ", Price: " + product_price_list.get(i));
        }
    }
}
