package by.shyrei.shop.dao.impl;

import by.shyrei.shop.entities.Category;
import by.shyrei.shop.utils.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Project OnlineShop
 * Created on 22.04.2017.
 * author Uladzimir
 */
public class CategoryDaoImplTest {

    CategoryDaoImpl categoryDaoImpl = CategoryDaoImpl.getInstance();

    @Test
    public void CategoryDaoTest() throws Exception {

//        Session session = HibernateUtil.getInstance().getSession();
//        Transaction transaction;
        Category testCategory = new Category(null, "Test category", null);
        Category actual;

//        transaction = session.beginTransaction();
        categoryDaoImpl.saveOrUpdate(testCategory);
        actual = categoryDaoImpl.get(testCategory.getId());
//        transaction.commit();
        Assert.assertEquals("Not equals", testCategory, actual);

//        transaction = session.beginTransaction();
        testCategory.setName("Test change name category");
        categoryDaoImpl.saveOrUpdate(testCategory);
        actual = categoryDaoImpl.get(testCategory.getId());
//        transaction.commit();
        Assert.assertEquals("Not equals change name category", testCategory, actual);

//        transaction = session.beginTransaction();
        categoryDaoImpl.delete(testCategory.getId());
        actual = categoryDaoImpl.get(testCategory.getId());
        Assert.assertNull("Not delete", actual);
//        transaction.commit();
//        HibernateUtil.getInstance().releaseSession(session);

    }
}