package by.shyrei.shop.dao.impl;

import by.shyrei.shop.dao.IProductDao;
import by.shyrei.shop.entities.Product;

/**
 * Project OnlineShop
 * Created on 22.04.2017.
 * author Uladzimir
 */
public class ProductDaoImpl extends DaoImpl<Product> implements IProductDao{

    private static volatile ProductDaoImpl instance;

    private ProductDaoImpl() {super(Product.class);}

    /**
     * Singleton Pattern
     * @return ProductDao instance
     */
    public ProductDaoImpl getInstance() {
        if (instance == null) {
            synchronized (ProductDaoImpl.class) {
                if (instance == null) {
                    instance = new ProductDaoImpl();
                }
            }
        }
        return instance;
    }

    //TODO my methods
}
