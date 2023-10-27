public class Person {
    private int ssn;
    private byte age;
    private String firstname;
    private String lastName;

    Person(String firstname, String lastName, Byte age, Integer ssn)
    {
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
    }
    public String getFirstname()
    {
        return firstname;
    }
    public String getLastName()
    {
        return lastName;
    }
    public byte getAge()
    {
        return age;
    }

}
