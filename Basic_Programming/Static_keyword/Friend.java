
package Static_keyword;

public class Friend {
    String name;
    static int NumberOfFriends;

    Friend(String name) {
        this.name = name;
        NumberOfFriends++;
    }
    
    static void NumFriends(){
        System.out.println("You have " +NumberOfFriends+ " Friends ");
    }
    
}
