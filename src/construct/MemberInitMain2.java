package construct;

public class MemberInitMain2 {

    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initMember(member1, "Enzo", 25, 90);

        MemberInit member2 = new MemberInit();
        initMember(member2, "Caicedo", 25, 80);

        MemberInit[] members = {member1, member2};

        for (MemberInit s : members) {
            System.out.println("Name: " + s.name + " Age: " + s.age + " Grade: " + s.grade);
        }
    }

    static void initMember(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
