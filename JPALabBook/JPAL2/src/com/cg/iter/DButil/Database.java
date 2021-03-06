package com.cg.iter.DButil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Database {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	
	static{
		factory= Persistence.createEntityManagerFactory("authorinfo");
	}
	
	public EntityManager getManager() {
		if(manager==null || !manager.isOpen())
			manager=factory.createEntityManager();
		else
			getManager();
		return manager;
	}

}
