package com.erdincozdemir.dao;

import com.erdincozdemir.model.Agent;
import com.erdincozdemir.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


import java.util.List;

public class AgentDAO {

public void saveOrUpdate(Agent agent ){

    Session session = HibernateUtil.getSessionFactory().openSession();
    Transaction transaction = null;

    try {
        transaction = session.beginTransaction();
        session.saveOrUpdate(agent);
        transaction.commit();
    } catch (HibernateException ex) {

        if (transaction != null)
            transaction.rollback();

        System.out.println("Hata: " + ex);
        ex.printStackTrace();

    } finally {
        session.close();
    }

}
 public Agent getAgentFindById (long id){
        return null;
}
 public List<Agent> getAgentsfindAll(){
        return null;
 }
 public void deleteAgentFindById (Long id){
    }
 };



