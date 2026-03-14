package final1;

public class ConstantMain2 {
    public static void main(String[] args) {
        System.out.println("maximum number of users: " + Constant.MAX_USERS);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process(int currentCount) {
        System.out.println("number of users: " + currentCount);
        if (currentCount > Constant.MAX_USERS) {
            System.out.println("You will be added to the waiting list.");
        } else {
            System.out.println("You have joined the game.");
        }
    }
}
