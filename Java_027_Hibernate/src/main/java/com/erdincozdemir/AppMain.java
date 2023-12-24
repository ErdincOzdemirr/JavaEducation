package com.erdincozdemir;

import com.erdincozdemir.model.Customer;
import com.erdincozdemir.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;

public class AppMain {
    public static void main(String[] args) {

        Customer customer1 = new Customer();
        customer1.setFirstName("Erdinç");
        customer1.setLastName("Ozdemir");
        customer1.setCreateDate(new Date());

        Customer customer2 = new Customer("Hava", "Sevgili");
        customer2.setCreateDate(new Date());

        Customer customer3 = new Customer("Oğuz", "Özkaraca");
        customer3.setCreateDate(new Date());

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

            session.save(customer1);
            session.save(customer2);
            session.save(customer3);

            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            System.out.println("Hata : " + e);
        } finally {
            session.close();
        }
    }
}