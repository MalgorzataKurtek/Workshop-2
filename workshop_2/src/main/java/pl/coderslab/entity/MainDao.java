package pl.coderslab.entity;

public class MainDao {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        User user = new User();
        user.setUserName("arek");
        user.setEmail("arkadiusz.jozwiak@coderslab.pl");
        user.setPassword("pass");
        userDao.createUser(user);

        User read = userDao.readUser(3);
        System.out.println(read);

        User userToUpdate = userDao.readUser(7);
        userToUpdate.setUserName("Arkadiusz");
        userToUpdate.setEmail("arek@coderslab.pl");
        userToUpdate.setPassword("superPassword");
        userDao.update(userToUpdate);
        userDao.deleteUser(3);
    }
}
