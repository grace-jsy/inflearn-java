package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // Constructor
    MemberConstruct(String name, int age, int grade) {
        System.out.println("Call Construct name =  " + name + ", age: " + age + " , grade: " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
