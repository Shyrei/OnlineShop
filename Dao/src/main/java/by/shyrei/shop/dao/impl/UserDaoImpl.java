package by.shyrei.shop.dao.impl;

import by.shyrei.shop.dao.IUserDao;
import by.shyrei.shop.entities.User;

/**
 * Project OnlineShop
 * Created on 22.04.2017.
 * author Uladzimir
 */
public class UserDaoImpl extends DaoImpl<User> implements IUserDao {

    private static volatile UserDaoImpl instance;

    private UserDaoImpl() {super(User.class);}

    /**
     * Singleton Pattern
     * @return UserDao instance
     */
    public UserDaoImpl getInstance() {
        if (instance == null) {
            synchronized (UserDaoImpl.class) {
                if (instance == null) {
                    instance = new UserDaoImpl();
                }
            }
        }
        return instance;
    }

    //TODO my methods
}
