import java.util.ArrayList;

public class Restaurant {
    public static void main(String[] args) {

        //List for restaurants' names
        ArrayList<String> restaurant_name_list = new ArrayList<>();
        restaurant_name_list.add("Vikings Luxury Buffet");
        restaurant_name_list.add("Antonio's Restaurant");
        restaurant_name_list.add("Mesa Filipino Moderne");
        restaurant_name_list.add("Manam Comfort Filipino");
        restaurant_name_list.add("Ramen Nagi");

        //List for restaurants' names
        ArrayList<String> restaurant_cuisinetype_list = new ArrayList<>();
        restaurant_cuisinetype_list.add("Buffet");
        restaurant_cuisinetype_list.add("Fine Dining");
        restaurant_cuisinetype_list.add("Filipino");
        restaurant_cuisinetype_list.add("Filipino");
        restaurant_cuisinetype_list.add("Japanese");


        //List for restaurants' names
        ArrayList<Integer> restaurant_id_list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            restaurant_id_list.add(i);
        }


        //List for restaurants' names
        ArrayList<String> restaurant_websiteorcontract_list = new ArrayList<>();
        restaurant_websiteorcontract_list.add("www.vikings.ph");
        restaurant_websiteorcontract_list.add("www.antoniosrestaurant.ph");
        restaurant_websiteorcontract_list.add("www.mesa.ph");
        restaurant_websiteorcontract_list.add("www.manam.ph");
        restaurant_websiteorcontract_list.add("www.ramennagi.com.ph");


        //Print results
        for (int i = 0; i < restaurant_name_list.size(); i++) {
            System.out.println("ID: " + restaurant_id_list.get(i) + ", Name: " + restaurant_name_list.get(i) + ", Cuisine Type: " + restaurant_cuisinetype_list.get(i) + ", Website: " + restaurant_websiteorcontract_list.get(i));
        }
    }
}

