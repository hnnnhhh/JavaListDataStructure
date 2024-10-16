import java.util.ArrayList;

public class Employee {
    public static void main(String[] args) {


        ArrayList<String> employee_name_list = new ArrayList<>();
        employee_name_list.add("John Doe");
        employee_name_list.add("Jane Smith");
        employee_name_list.add("Mark Johnson");
        employee_name_list.add("Lisa Wong");
        employee_name_list.add("Paul McDonald");


        ArrayList<String> employee_department_list = new ArrayList<>();
        employee_department_list.add("Sales");
        employee_department_list.add("Human Resources");
        employee_department_list.add("IT");
        employee_department_list.add("Marketing");
        employee_department_list.add("Finance");



        ArrayList<Integer> employee_id_list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            employee_id_list.add(i);
        }


        ArrayList<String> product_email_list = new ArrayList<>();
        product_email_list.add("john.doe@company.com");
        product_email_list.add("jane.smith@company.com");
        product_email_list.add("mark.johnson@company.com");
        product_email_list.add("lisa.wong@company.com");
        product_email_list.add("paul.mcdonald@company.com");



        for (int i = 0; i < employee_name_list.size(); i++) {
            System.out.println("ID: " + employee_id_list.get(i) + ", Name: " + employee_name_list.get(i) + ", Department: " + employee_department_list.get(i) + ", Email: " + product_email_list.get(i));
        }
    }
}
