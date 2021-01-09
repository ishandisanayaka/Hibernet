package org.example;

import org.example.model.AlianName;
import org.example.model.Alien;
import org.example.model.Laptop;
import org.example.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

//        System.out.println( "Hello World!" );
        AlianName alianName=new AlianName();
        alianName.setFname("Ishan");
        alianName.setLname("Disanayaka");
        alianName.setMname("Madushaka");
        Alien telusko=new Alien();
        telusko.setAid(102);
        telusko.setaName(alianName);
        telusko.setColor("dadjad");

        Laptop laptop=new Laptop();
        laptop.setLapid(12);
        laptop.setLapName("Dell");


        Student student=new Student();
        student.setRollno(23);
        student.setName("Ishan");
        student.setMark(50);
        student.getLaptop().add(laptop);


        laptop.getStudents().add(student);



        Configuration configuration= new Configuration().configure().addAnnotatedClass(Alien.class);

        ServiceRegistry reg=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();

        SessionFactory sf=configuration.buildSessionFactory(reg);
        Session session=sf.openSession();

        Transaction transaction=session.beginTransaction();

        session.save(telusko);                   ////use store data

//        telusko=session.get(Alien.class,2);           ////use fetch data

        transaction.commit();

        System.out.println(telusko);



        Configuration configuration1= new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);

        ServiceRegistry registry=new StandardServiceRegistryBuilder().applySettings(configuration1.getProperties()).build();

        SessionFactory sessionFactory=configuration1.buildSessionFactory(registry);
        Session session1=sessionFactory.openSession();
        session1.beginTransaction();
        session1.save(laptop);
        session1.save(student);
        session1.getTransaction().commit();
    }
}
