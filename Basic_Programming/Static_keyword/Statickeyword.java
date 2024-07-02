
package Static_keyword;

public class Statickeyword {
    public static void main(String[] args) {
        
         Friend friend1 = new Friend("Rocky");
         Friend friend2 = new Friend("Shivi"); 
         Friend friend3 = new Friend("Sam");
         Friend friend4 = new Friend("Jhonny");
         
         
        //System.out.println(Friend.NumberOfFriends); //4
        
        Friend.NumFriends();
       
    }
}
