package final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId", "grace");
        member.print();
        member.changeData("myId2", "grace-sy");
        member.print();
    }
}
