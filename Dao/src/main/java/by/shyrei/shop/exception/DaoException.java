package by.shyrei.shop.exception;

/**
 * Project OnlineShop
 * Created on 22.04.2017.
 * author Uladzimir
 */

public class DaoException extends Exception {
    public DaoException(String msg) {
        super(msg);
    }
    public DaoException(String msg, Throwable e) {
        super(msg, e);
    }
}

