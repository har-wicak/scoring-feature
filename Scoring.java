// by Haryo Wicaksono (19/440449/PA/19079)

import java.util.Scanner;
class Scoring
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        Photos photos[] = new Photos[6];
        photos[0] = new Photos(1, "Photo 1", 
        "https://drive.google.com/file/d/1M-gvqcjysTwRNOSbFDlAfI6fWxPQYG0S/view?usp=sharing", 10);
        photos[1] = new Photos(2, "Photo 2", 
        "https://drive.google.com/file/d/1dy0KC3oS8oaa6YQnQdyQQ-3JBSQiVJP9/view?usp=sharing", 2);
        photos[2] = new Photos(3, "Photo 3", 
        "https://drive.google.com/file/d/1bZQO9X5P2tXPyrIgo9Yx9ojlFrQZjI-Q/view?usp=sharing", 7);
        photos[3] = new Photos(4, "Photo 4", 
        "https://drive.google.com/file/d/1vwnU_8FoNTbrjvu2gTx8tZu2bCRijzG-/view?usp=sharing", 6);
        photos[4] = new Photos(5, "Photo 5", 
        "https://drive.google.com/file/d/16v4lRUBGI0tAqY5fhpGMBu-YmmBJny8r/view?usp=sharing", 9);
        photos[5] = new Photos(6, "Photo 6", 
        "https://drive.google.com/file/d/1Bxw1LWZRMIM_7ao9GA91c0S6ro4MWl3q/view?usp=sharing", 3);

        System.out.println("Are you an admin? input true or false");
        Boolean boolAdmin = input.nextBoolean();
        int winnerPhotoID;

        Users adminUser = new Users(1, "Admin with Privileges", true, 2,3,5);

        String Name = null;

        if (boolAdmin == false) {
            System.out.print("Input your name: ");
            Name = input.next();
        }

        Users user1 = new Users(2, Name, boolAdmin, null, null, null);

        for (int i = 0; i < photos.length; i++) {
            photos[i].displayPhotoInfo();
        }

        if (boolAdmin == false) {
            System.out.println("How many pictures do you like?");
            int num = input.nextInt();
            switch(num){    
                case 1:    
                    System.out.println("Input Photo ID you like:");
                    user1.likedPostsIDFirst = input.nextInt() - 1;
                    if (user1.likedPostsIDFirst >= 1 && user1.likedPostsIDFirst <= 6) {
                        System.out.println("Photos you've liked.");
                        photos[user1.likedPostsIDFirst].displayPhotoInfo();
                    } else {
                        System.out.println("Such Photo ID does not exist");
                    }
                    System.out.println("Photos you've liked.");
                    photos[user1.likedPostsIDFirst].displayPhotoInfo(); 
                    break;
                case 2:  
                    System.out.println("Input Photo ID you like:");
                    user1.likedPostsIDFirst = input.nextInt() - 1;   
                    if (user1.likedPostsIDFirst >= 1 && user1.likedPostsIDFirst <= 6) {
                        photos[user1.likedPostsIDFirst].displayPhotoInfo();  
                    } else {
                        System.out.println("Such Photo ID does not exist");
                    }  
                    System.out.println("Input Photo ID you like:");
                    user1.likedPostsIDSecond = input.nextInt() - 1; 
                    if (user1.likedPostsIDSecond >= 1 && user1.likedPostsIDSecond <= 6) {
                        photos[user1.likedPostsIDSecond].displayPhotoInfo();
                    } else {
                        System.out.println("Such Photo ID does not exist");
                    }  
                    System.out.println("Photos you've liked.");
                    photos[user1.likedPostsIDFirst].displayPhotoInfo(); 
                    photos[user1.likedPostsIDSecond].displayPhotoInfo();
                    break;
                case 3:  
                    System.out.println("Input Photo ID you like:");
                    user1.likedPostsIDFirst = input.nextInt() - 1;   
                    if (user1.likedPostsIDFirst >= 1 && user1.likedPostsIDFirst <= 6) {
                        photos[user1.likedPostsIDFirst].displayPhotoInfo();  
                    } else {
                        System.out.println("Such Photo ID does not exist");
                    }  
                    System.out.println("Input Photo ID you like:");
                    user1.likedPostsIDSecond = input.nextInt() - 1; 
                    if (user1.likedPostsIDSecond >= 1 && user1.likedPostsIDSecond <= 6) {
                        photos[user1.likedPostsIDSecond].displayPhotoInfo();
                    } else {
                        System.out.println("Such Photo ID does not exist");
                    }  
                    System.out.println("Input Photo ID you like:");  
                    user1.likedPostsIDThird = input.nextInt() - 1;   
                    if (user1.likedPostsIDThird >= 1 && user1.likedPostsIDThird <= 6) {
                        photos[user1.likedPostsIDThird].displayPhotoInfo();
                    } else {
                        System.out.println("Such Photo ID does not exist");
                    }  
                    System.out.println("Photos you've liked.");
                    photos[user1.likedPostsIDFirst].displayPhotoInfo();  
                    photos[user1.likedPostsIDSecond].displayPhotoInfo();
                    photos[user1.likedPostsIDThird].displayPhotoInfo();
                    break;  
                default:
                    break;
            }
        } else {
            System.out.println("Which photo do you think is the winner as the Admin?");
            winnerPhotoID = input.nextInt() - 1;
            System.out.println("The following photo wins.");
            photos[winnerPhotoID].displayPhotoInfo();
        }

        System.out.println("by Haryo Wicaksono - 19/440449/PA/19079");
    }
}