public class CWH_Member {
    // Private fields
    private String name;
    private int age;

    // Constructor
    public CWH_Member(String name, int age) {
        this.name = name;
        setAge(age); // Using the setter
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }

    // Main method
    public static void main(String[] args) {
        CWH_Member member = new CWH_Member("John Doe", 30);
        System.out.println("Name: " + member.getName());
        System.out.println("Age: " + member.getAge());
    }
}
