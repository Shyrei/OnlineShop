package by.shyrei.shop.dao.impl;

import by.shyrei.shop.dao.IOrderDao;
import by.shyrei.shop.entities.Order;

/**
 * Project OnlineShop
 * Created on 22.04.2017.
 * author Uladzimir
 */
public class OrderDaoImpl extends DaoImpl<Order> implements IOrderDao {

    private static volatile OrderDaoImpl instance;

    private OrderDaoImpl() {super(Order.class);}

    /**
     * Singleton pattern
     * @return OrderDao instance
     */
    public static OrderDaoImpl getInstance(){
        if (instance == null) {
            synchronized (Order.class) {
                if (instance == null) {
                    instance = new OrderDaoImpl();
                }
            }
        }
        return instance;
    }

    //TODO my methods
}
