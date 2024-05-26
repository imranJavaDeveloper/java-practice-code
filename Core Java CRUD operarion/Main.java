import Db_Operation.UserDao;
import Student_Detail.User;


public class Main {
    public static void main(String[] args) {

        UserDao userDao = new UserDao();
        // Create a new user
       User newUser = new User();
        newUser.setId(8);
        newUser.setName("md imran alam");
        newUser.setEmail("md@gmail.com");
        userDao.addUser(newUser);
        System.out.println("Added user: " + newUser);



        // user second will create
        User newUser2 = new User();
        newUser2.setId(9);
        newUser2.setName("md furkan alam");
        newUser2.setEmail("furkan.@gmail.com");
        userDao.addUser(newUser2);
        System.out.println("Added user: " + newUser2);



//        // Retrieve a user by ID
//        User user = userDao.getUser(82002);
//        System.out.println("Retrieved user: " + user);


        // Update a user
//        user.setName("M.S.D");
//        user.setEmail("msd.@gmail.com");
//        userDao.updateUser(user);
//        System.out.println("Updated user: " + user);

        // Delete a user
        userDao.deleteUser(8);
        System.out.println("Deleted user with ID 1");

    }
}