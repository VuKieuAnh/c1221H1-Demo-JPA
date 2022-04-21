//package com.codegym.dao;
//
//import com.codegym.model.Product;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//import org.springframework.stereotype.Component;
//
//import javax.persistence.EntityManager;
//import javax.persistence.TypedQuery;
//import java.util.List;
//
//@Component
//public class ProductDao implements IProductDAO {
//	private static SessionFactory sessionFactory;
//	private static EntityManager entityManager;
//
//	static {
//		sessionFactory = new Configuration()
//			.configure("hibernate.conf.xml")
//			.buildSessionFactory();
//		entityManager = sessionFactory.createEntityManager();
//	}
//
//	@Override
//	public List<Product> findAll() {
//		String query = "select p from Product as p";
//		TypedQuery<Product> typedQuery = entityManager.createQuery(query, Product.class);
//		List<Product> products = typedQuery.getResultList();
//		return products;
//	}
//
//	@Override
//	public Product findById(Long id) {
//		String query = "select p from Product as p where p.id = :id";//NamedQuery
////		String query = "select p from Product as p where p.id = ?1";//IndexedQuery
//		TypedQuery<Product> typedQuery = entityManager.createQuery(query, Product.class);
//		typedQuery.setParameter("id", id);
//		return typedQuery.getSingleResult();
//	}
//
//	@Override
//	public void save(Product product) {
//		Session session = sessionFactory.openSession();
//		Transaction transaction = session.beginTransaction();
//		Product oldProduct = findById(product.getId());
//		oldProduct.setName(product.getName());
//		oldProduct.setPrice(product.getPrice());
//		oldProduct.setDescription(product.getDescription());
//		oldProduct.setCategory(product.getCategory());
//		session.saveOrUpdate(oldProduct);
//		transaction.commit();
//	}
//
//	@Override
//	public void removeById(Long id) {
//		Session session = sessionFactory.openSession();
//		Transaction transaction = session.beginTransaction();
//		Product product = findById(id);
//		session.delete(product);
//		transaction.commit();
//	}
//}
