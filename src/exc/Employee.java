package exc;

public class Employee {

    private int age;

    private String firstName;

    private String lastName;


    public Employee(int age, String firstName, String lastName) {
        this.age= age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ",\n firstName='" + firstName + '\'' +
                ",\n lastName='" + lastName + '\'' +
                '}';
    }


}



