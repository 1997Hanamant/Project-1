package com.xworkz.userData.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.userData.dao.UserDAO;
import com.xworkz.userData.dto.UserDTO;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private EntityManagerFactory factory;
	private EntityManager manager;
	
	@Override
	public Boolean save(UserDTO userDTO) {
		manager = factory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(userDTO);
			transaction.commit();
		}
		catch(PersistenceException p) {
			p.printStackTrace();
		}
		finally {
			manager.close();
		}
		return true;
	}

}
