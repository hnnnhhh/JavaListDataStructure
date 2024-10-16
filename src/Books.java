import java.util.ArrayList;

public class Books {
    public static void main(String[] args) {

        //List for books' names
        ArrayList<String> book_title_list = new ArrayList<>();
        book_title_list.add("The Great Gatsby");
        book_title_list.add("To Kill a Mockingbird");
        book_title_list.add("1984");
        book_title_list.add("The Catcher in the Rye");
        book_title_list.add("A Brief History of Time");

        //List for books' names
        ArrayList<String> book_author_list = new ArrayList<>();
        book_author_list.add("F. Scott Fitzgerald");
        book_author_list.add("Harper Lee");
        book_author_list.add("George Orwell");
        book_author_list.add("J.D. Salinger");
        book_author_list.add("Stephen Hawking");


        //List for books' names
        ArrayList<Integer> book_id_list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            book_id_list.add(i);
        }

        //List for books' names
        ArrayList<Integer> book_publishedyear_list = new ArrayList<>();
        book_publishedyear_list.add(1925);
        book_publishedyear_list.add(1960);
        book_publishedyear_list.add(1949);
        book_publishedyear_list.add(1951);
        book_publishedyear_list.add(1988);


        //Print result
        for (int i = 0; i < book_title_list.size(); i++) {
            System.out.println("ID: " + book_id_list.get(i) + ", Name: " + book_title_list.get(i) + ", Author: " + book_author_list.get(i) + ", Published Year: " + book_publishedyear_list.get(i));
        }
    }
}

