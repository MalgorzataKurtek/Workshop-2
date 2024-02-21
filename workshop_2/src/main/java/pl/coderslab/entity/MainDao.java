package pl.coderslab.entity;

public class MainDao {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        User user = new User();
        user.setUserName("arek");
        user.setEmail("arkadiusz.jozwiak@coderslab.pl");
        user.setPassword("pass");
        userDao.createUser(user);
    }
}
