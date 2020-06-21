package com.scp.hibernate.HibernateOneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Application Started...." );
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory factory = configuration.buildSessionFactory();
        
        //Creating Employee 1
        
        Employee employee = new Employee();
        employee.setEmployeeFirstName("Jagdish");
        employee.setEmployeeLastName("Khetre");
        
        
        //Creating AddressInfo for 1st Employee 
        EmployeeContactInfo contactInfo = new EmployeeContactInfo();
        contactInfo.setCity("Pune");
        contactInfo.setPhone(9637171607L);
        
        employee.setEmployeeContactInfo(contactInfo);
        
      //Creating Employee 2
        
        Employee employee2 = new Employee();
        employee2.setEmployeeFirstName("Swara");
        employee2.setEmployeeLastName("Khetre");
        
        
        //Creating AddressInfo for 2nd Employee
        
        EmployeeContactInfo contactInfo2 = new EmployeeContactInfo();
        contactInfo2.setCity("Pune");
        contactInfo2.setPhone(8888591352L);
        
        employee2.setEmployeeContactInfo(contactInfo2);
        
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(employee);
        session.save(employee2);
        transaction.commit();
        session.close();
        
        factory.close();
    }
}
