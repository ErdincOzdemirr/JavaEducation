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
        customer1.setAdress("Sakarya");

        Customer customer2 = new Customer("Hava", "Sevgili");
        customer2.setCreateDate(new Date());
        customer2.setAdress("Kocaeli");

        Customer customer3 = new Customer("ismail", "Hacer");
        customer3.setCreateDate(new Date());
        customer3.setAdress("Ankara");

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