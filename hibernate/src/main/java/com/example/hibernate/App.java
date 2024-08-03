package com.example.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration conn = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sf = conn.buildSessionFactory();
        Session s = sf.openSession();
        Transaction tn = s.beginTransaction();
        order or = new order();
        or.setOrderemail("eesha9@gmail.com");
        or.setOrdername("box");
        s.save(or);
        tn.commit();
        System.out.println("Successfully inserted");
        sf.close();
        s.close();
    }
}
