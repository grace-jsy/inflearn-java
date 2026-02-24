package construct;

public class MemberInitMain1 {

    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.name = "Enzo";
        member1.age = 25;
        member1.grade = 90;

        MemberInit member2 = new MemberInit();
        member2.name = "Caicedo";
        member2.age = 25;
        member2.grade = 80;

        MemberInit[] members = {member1, member2};

        for (MemberInit s : members) {
            System.out.println("Name: " + s.name + " Age: " + s.age + " Grade: " + s.grade);
        }
    }
}
