package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Program {

	public static void main(String[] args) {
		
		// Aqui eu inicio uma Session Factory do Hibernate, na qual � respons�vel por subir meu arquivo de configura��o do hibernate
		//Mapeio a classe entidade e subo uma sess�o do Hibernate
		// Sess�o seria um Objeto no qual eu sou capaz de fazer todos os processos no banco de dados e que cont�m a conex�o JDBC
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			Student tempStudent = new Student("Raphael","Wall","raphael@test.com");
			
			session.beginTransaction();
			
			session.save(tempStudent);
			
			session.getTransaction().commit();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally {
			factory.close();
		}
	}
}
