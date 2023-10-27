public final class Employee extends Person{

    Employee(String firstname, String lastName, Byte age, Integer ssn) {
        super(firstname, lastName, age, ssn);
        firstname = this.getFirstname();
    }

    public String speak()
    {
        String firstName = "";
        String salary = "";
        return firstName + salary;
    }
}
