public class Users {
    int userID;
    String Name;
    boolean Admin;
    Integer likedPostsIDFirst;
    Integer likedPostsIDSecond;
    Integer likedPostsIDThird;
    
    Users(int userID, String Name, boolean Admin, 
    Integer likedPostsIDFirst, Integer likedPostsIDSecond, 
    Integer likedPostsIDThird) {
        this.userID = userID;
        this.Name = Name;
        this.Admin = Admin;
        this.likedPostsIDFirst = likedPostsIDFirst;
        this.likedPostsIDSecond = likedPostsIDSecond;
        this.likedPostsIDThird = likedPostsIDThird;
    }
}