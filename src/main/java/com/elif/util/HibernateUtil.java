package com.elif.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

// HibernateUtil Sınıfı : Hibernate yapılandırmasını merkezî olarak yönetmek.

public class HibernateUtil {
    private static final SessionFactory sessionFactory;

    static {
        try{
            sessionFactory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .buildSessionFactory();
        }catch (Throwable ex){
            System.err.println("SessionFactory oluşturulamadı." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    public static SessionFactory getSessionFactory(){return sessionFactory;}

    public static void shutdown(){getSessionFactory().close();}
}
