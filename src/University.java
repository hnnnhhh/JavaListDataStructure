import java.util.ArrayList;

public class University {
    public static void main(String[] args) {

        //List for universities' names
        ArrayList<String> university_name_list = new ArrayList<>();
        university_name_list.add("University of the Philippines");
        university_name_list.add("Ateneo de Manila University");
        university_name_list.add("De La Salle University");
        university_name_list.add("University of Santo Tomas");
        university_name_list.add("Polytechnic University of the Philippines");

        //List for universities' names
        ArrayList<String> university_location_list = new ArrayList<>();
        university_location_list.add("Quezon City");
        university_location_list.add("Quezon City");
        university_location_list.add("Manila");
        university_location_list.add("Manila");
        university_location_list.add("Manila");


        //List for universities' names
        ArrayList<Integer> university_id_list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            university_id_list.add(i);
        }

        //List for universities' names
        ArrayList<String> university_website_list = new ArrayList<>();
        university_website_list.add("www.up.edu.ph");
        university_website_list.add("www.ateneo.edu");
        university_website_list.add("www.dlsu.edu.ph");
        university_website_list.add("www.ust.edu.ph");
        university_website_list.add("www.pup.edu.ph");


        //Print result
        for (int i = 0; i < university_name_list.size(); i++) {
            System.out.println("ID: " + university_id_list.get(i) + ", Name: " + university_name_list.get(i) + ", Location: " + university_location_list.get(i) + ", Website: " + university_website_list.get(i));
        }
    }
}

