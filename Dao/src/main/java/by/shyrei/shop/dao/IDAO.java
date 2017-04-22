package by.shyrei.shop.dao;

import by.shyrei.shop.entities.AbstractEntity;
import by.shyrei.shop.exception.DaoException;

import java.util.List;

/**
 * Project OnlineShop
 * Created on 22.04.2017.
 * author Uladzimir
 */
public interface IDAO<T extends AbstractEntity> {
    /**
     * Create or Update new rov in table
     * @param t object
     * @throws DaoException
     */
    void saveOrUpdate(T t) throws DaoException;

    /**
     * Get one rov from table by id
     * @param id rov id
     * @return T (rov) object
     * @throws DaoException
     */
    T get(Long id) throws DaoException;

    /**
     * Delete one rov from table by id
     * @param id rov id
     * @throws DaoException
     */
    void delete(Long id) throws DaoException;

    /**
     * Get all table
     * @return all object (table)
     * @throws DaoException
     */
    List<T> getAll() throws DaoException;
}
