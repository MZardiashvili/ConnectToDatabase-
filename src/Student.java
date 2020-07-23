public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String identityNumber;
    private int age;

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }
}
