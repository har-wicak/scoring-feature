public class Photos {
    int photoID;
    String photoTitle;
    String photoURL;
    int numOfLikes;


    void getPhotoID() {
        System.out.println("Photo ID: " + photoID);
    }
    void getNumOfLikes() {
        System.out.println("Number of Likes: " + numOfLikes);
    }
    void getPhotoTitle() {
        System.out.println("Title: " + photoTitle);
    }
    void getPhotoURL() {
        System.out.println("Photo Link: " + photoURL);
    }
    void displayPhotoInfo() {
        getPhotoID();
        getPhotoTitle();
        getNumOfLikes();
        getPhotoURL();
    }

    Photos (int photoID, String photoTitle, String photoURL, int numOfLikes) {
        this.photoID = photoID;
        this.photoTitle = photoTitle;
        this.photoURL = photoURL;
        this.numOfLikes = numOfLikes;
    }
}