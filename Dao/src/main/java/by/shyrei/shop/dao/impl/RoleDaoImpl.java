package by.shyrei.shop.dao.impl;

import by.shyrei.shop.dao.IRoleDao;
import by.shyrei.shop.entities.Role;

/**
 * Project OnlineShop
 * Created on 22.04.2017.
 * author Uladzimir
 */
public class RoleDaoImpl extends DaoImpl<Role> implements IRoleDao {

    private static volatile RoleDaoImpl instance;

    private RoleDaoImpl() {super(Role.class);}

    /**
     * Singleton Pattern
     * @return RoleDao instance
     */
    public RoleDaoImpl getInstance() {
        if (instance == null) {
            synchronized (RoleDaoImpl.class) {
                if (instance == null) {
                    instance = new RoleDaoImpl();
                }
            }
        }
        return instance;
    }

    //TODO my methods
}
