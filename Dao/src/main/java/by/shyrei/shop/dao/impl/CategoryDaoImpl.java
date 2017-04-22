package by.shyrei.shop.dao.impl;

import by.shyrei.shop.dao.ICategoryDao;
import by.shyrei.shop.entities.Category;

/**
 * Project OnlineShop
 * Created on 22.04.2017.
 * author Uladzimir
 */
public class CategoryDaoImpl extends DaoImpl<Category> implements ICategoryDao {

    private static volatile CategoryDaoImpl instance;

    private CategoryDaoImpl() {super(Category.class);}

    /**
     * Singleton pattern
     * @return CategoryDao instance
     */
    public static CategoryDaoImpl getInstance() {
        if (instance == null) {
            synchronized (CategoryDaoImpl.class) {
                if (instance == null) {
                    instance = new CategoryDaoImpl();
                }
            }
        }
        return instance;
    }

    //TODO my methods
}
