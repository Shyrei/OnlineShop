package by.shyrei.shop.dao.impl;

import by.shyrei.shop.dao.IDAO;
import by.shyrei.shop.entities.AbstractEntity;
import by.shyrei.shop.exception.DaoException;
import by.shyrei.shop.utils.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Project OnlineShop
 * Created on 22.04.2017.
 * author Uladzimir
 */
public abstract class DaoImpl<T extends AbstractEntity> implements IDAO<T> {

    private HibernateUtil util = HibernateUtil.getInstance();
    private Session session;
    private Transaction transaction;
    private Class persistentClass;

    protected DaoImpl(Class persistentClass){
        this.persistentClass = persistentClass;
    }

    public void saveOrUpdate(T t) throws DaoException {
        try {
            session = util.getSession();
            transaction = session.beginTransaction();
            session.saveOrUpdate(t);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            throw new DaoException("Error in saveOrUpdate method", e);
        } finally {
            util.releaseSession(session);
        }
    }

    public T get(Long id) throws DaoException {
        T t;
        try {
            session = util.getSession();
            transaction = session.beginTransaction();
            t = (T) session.get(persistentClass, id);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            throw new DaoException("Error in get method", e);
        } finally {
            util.releaseSession(session);
        }
        return t;
    }

    public void delete(Long id) throws DaoException {
         try {
            session = util.getSession();
            transaction = session.beginTransaction();
            T t = (T) session.get(persistentClass, id);
            session.delete(t);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            throw new DaoException("Error in delete method", e);
        } finally {
            util.releaseSession(session);
        }
    }

    public List<T> getAll() throws DaoException {
        List<T> t;
        try {
            session = util.getSession();
            transaction = session.beginTransaction();
            Criteria criteria = session.createCriteria(persistentClass);
            t = criteria.list();
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            throw new DaoException("Error in getAll method", e);
        } finally {
            util.releaseSession(session);
        }
        return t;
    }
}
