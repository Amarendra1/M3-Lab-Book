package com.cg.iter.dao;

import javax.persistence.EntityManager;

import com.cg.iter.entity.Author;
import com.cg.iter.util.JPAUtil;

public class AuthorDaoImpl implements AuthorDao {

	@Override
	public boolean create(Author auth) {
		try {
			EntityManager em = JPAUtil.getEntityManager();
			em.getTransaction().begin();
			em.persist(auth);
			em.getTransaction().commit();
			return true;
			}catch (Exception e) {
				e.printStackTrace();
			}
			return false;
	}
	@Override
	public Author getauthor(int authorid) {
		Author auth=null;
	
		try {
			EntityManager em = JPAUtil.getEntityManager();
			auth=em.find(Author.class, authorid);
		}
		catch (Exception e) {
		
		}
		return auth;
	}
	@Override
	public boolean update(Author auth) {
		try {
			EntityManager em = JPAUtil.getEntityManager();
			em.getTransaction().begin();
			em.merge(auth);
			em.getTransaction().commit();
			return true;
			}catch (Exception e) {
				e.printStackTrace();
			}
			return false;
	}
	@Override
	public boolean delete(Author auth) {
		try {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.remove(auth);
		em.getTransaction().commit();
		return true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
}
}
