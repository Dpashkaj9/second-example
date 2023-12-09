package exc;

public class main {
    public static void main(String[] args) {

        //System.out.println("The area is:"+rectangle.getArea());
        //System.out.println("The perimeter is:" + rectangle.getPerimeter());

        Employee[] employees = new Employee[]{
                new Employee(30, "Name", "LastName"),
                new Employee(34, "Name", "LastName"),
                new Employee(51, "Name", "LastName"),
                new Employee(27, "Name", "LastName"),
                new Employee(48, "Name", "LastName"),
        };

        Company company = new Company("CompanyName");
        company.setEmployees(employees);
        System.out.println(company.toString());
    }


}

