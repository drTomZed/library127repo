package pl.sdacademy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;

import static pl.sdacademy.HibernateUtil.getSessionFactory;


//public class Main {
//    public static void main(String[] args) {
//
//        Session session = getSessionFactory().openSession();
//
//
//        //Check databse vaersion
//        String sql = "Select version()";
//
//        String result = (String) session.createNativeQuery(sql).getSingleResult();
//        System.out.println(result);
//
//        session.close();
//        HibernateUtil.shutdown();
//
//    }




import pl.sdacademy.ui.ConsoleInterface;

public class Main {
    public static void main(String[] args) {

    ConsoleInterface consoleInterface= new ConsoleInterface();
    consoleInterface.userUI();

    }
}

