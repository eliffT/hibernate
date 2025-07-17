package com.elif;

import com.elif.user.Employee;
import com.elif.user.Student;
import com.elif.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            //CREATE
            Student student = new Student("Gülsüm", "Başak");
            session.persist(student); //save
            Employee employee = new Employee("Gül", 25, 2000);
            session.persist(employee);

            //READ
            Employee readEmployee = session.get(Employee.class, 3);
            System.out.println("ID: " + readEmployee.getId() + " Name: " + readEmployee.getName() + " Salary: " + readEmployee.getSalary());

            List<Student> studentList = session.createQuery("FROM Student", Student.class).list();
            for (Student st: studentList){
                System.out.println("ID: " + st.getId() + " Name: " + st.getName() + " " + st.getLastName());
            }

            // UPDATE
            readEmployee.setName("Faruk");
            session.update(readEmployee);

            // DELETE
            session.delete(readEmployee);

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
