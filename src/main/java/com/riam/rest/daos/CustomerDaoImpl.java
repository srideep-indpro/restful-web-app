package com.riam.rest.daos;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.riam.rest.entities.Customers;

public class CustomerDaoImpl implements CustomerDao {
	@Override
	public Customers getCustomerDetail(int id) {
		Session session = HibernateUtil.getSession();
		Query<Customers> query = session.createNamedQuery("fetchCustomerById", Customers.class);
		query.setParameter("customerId", id);
		List<Customers> customerList = query.getResultList();
		return customerList.get(0);
	}

	@Override
	public List<Customers> getAllCustomerDetails() {
		Session session = HibernateUtil.getSession();
		Query<Customers> query = session.createQuery("from Customers", Customers.class);
		List<Customers> customerList = query.getResultList();
		return customerList;
	}

	@Override
	public  Customers createNewCustomer(Customers createdCustomerEntity) {
		try (Session session = HibernateUtil.getSession()) {
			Transaction tx = null;
			try {
				tx = session.beginTransaction();
				session.saveOrUpdate(createdCustomerEntity);
				tx.commit();
			} catch (HibernateException hbe) {
				if (tx.isActive()) {
					tx.rollback();
				}
			}
		}
		return createdCustomerEntity;
	}

	@Override
	public Customers updateCustomer(Customers createdCustomerEntity) {
		try (Session session = HibernateUtil.getSession()) {
			Transaction tx = null;
			try {
				tx = session.beginTransaction();
				session.saveOrUpdate(createdCustomerEntity);
				tx.commit();
			} catch (HibernateException hbe) {
				if (tx.isActive()) {
					tx.rollback();
				}
			}
		}
		return createdCustomerEntity;
	}

	@Override
	public Customers deleteCustomer(String id) {
		Customers customerToBeDeleted = null;
		
		try (Session session = HibernateUtil.getSession()) {
			customerToBeDeleted = session.get(Customers.class, Integer.parseInt(id));
			Transaction tx = null;
			try {
				tx = session.beginTransaction();
				session.delete(customerToBeDeleted);
				tx.commit();
			} catch (HibernateException hbe) {
				if (tx.isActive()) {
					tx.rollback();
				}
			}
		}
		return customerToBeDeleted;
	}

}
