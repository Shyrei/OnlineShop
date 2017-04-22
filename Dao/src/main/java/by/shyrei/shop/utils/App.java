package by.shyrei.shop.utils;

import by.shyrei.shop.dao.impl.CategoryDaoImpl;
import by.shyrei.shop.entities.Category;
import by.shyrei.shop.exception.DaoException;

/**
 * Created by Uladzimir on 21.04.2017.
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Стартанем чтоле ??? )))))))");
        try {



           Category category = CategoryDaoImpl.getInstance().get(9L);
           Category categorySun = new Category(null, "PodKategoria head 2 category", category);
           CategoryDaoImpl.getInstance().saveOrUpdate(categorySun);

            } catch (DaoException e) {
            e.printStackTrace();
        }
    }
}
