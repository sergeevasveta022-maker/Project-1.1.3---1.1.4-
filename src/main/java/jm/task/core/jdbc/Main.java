package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
//        UserService userService = new UserServiceImpl();
//        userService.createUsersTable();
//        userService.saveUser("Saske", "Uchiha", (byte) 20);
//        userService.saveUser("Naruto", "Uzumaki", (byte) 19);
//        userService.saveUser("Koyani", "Koshka", (byte) 4);

//        userService.saveUser("Albert", "Yakupov", (byte) 25);
//
//        userService.getAllUsers();
//        userService.cleanUsersTable();
//        userService.dropUsersTable();

        try {
            Session session = Util.getSessionFactory().openSession();
            System.out.println("Connected!");
        } catch (HibernateException e) {
            throw new RuntimeException(e);
        }
    }
}
