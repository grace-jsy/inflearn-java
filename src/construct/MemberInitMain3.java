package construct;

public class MemberInitMain3 {

    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.initMember("Enzo", 25, 90);

        MemberInit member2 = new MemberInit();
        member2.initMember("Caicedo", 25, 80);

        MemberInit[] members = {member1, member2};

        for (MemberInit s : members) {
            System.out.println("Name: " + s.name + " Age: " + s.age + " Grade: " + s.grade);
        }
    }
}
