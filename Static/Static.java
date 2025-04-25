package Static;

public class Static {
    public static void main(String[] args) {
        // static = Makes a variable or method belong to the class rather than to any
        // specific object.
        // Commonly used for utility methods or shared resources

        Friend friend1 = new Friend("Sebastian");
        Friend friend2 = new Friend("Arthur");
        Friend friend3 = new Friend("Arthur");

        System.out.println(Friend.numberOfFriends);
        Friend.showFriends();
    }
}
