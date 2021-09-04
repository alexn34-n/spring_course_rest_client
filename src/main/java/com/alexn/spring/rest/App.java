package com.alexn.spring.rest;

import com.alexn.spring.rest.configuration.MyConfig;
import com.alexn.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication=context.getBean("communication"
                ,Communication.class);

//      List<Employee> allEmployees= communication.getAllEmployees();
//        System.out.println(allEmployees);

//        Employee empByID=communication.getEmployee(4);
//        System.out.println(empByID);

//        Employee emp= new Employee("Simon","Richson"
//                , "Sales",1050);
//        emp.setId(7);
//        communication.saveEmployee(emp);

        communication.deleteEmployee(7);

    }
}
