package com.elif;

import com.elif.user.Employee;
import com.elif.user.Student;
import com.elif.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            Student user = new Student("Ayşe", "Yıldız");
            session.persist(user); //save
            Employee employee = new Employee("Ayşe", 30, 2500);
            session.persist(employee);

            tx.commit();
        }catch (Exception e){
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();
            HibernateUtil.shutdown();
        }
    }
}
