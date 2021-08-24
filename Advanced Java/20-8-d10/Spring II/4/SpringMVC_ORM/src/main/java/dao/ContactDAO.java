package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import entities.Contact;

@Transactional
public class ContactDAO {
	
	@Autowired
	HibernateTemplate template;
	
	@PersistenceContext
    EntityManager em;
	
	public int save(Contact ct)
	{
		return (Integer)template.save(ct);
	}
	
	public List<Contact> getAll()
	{
		return template.loadAll(Contact.class);
	}
	
	public Contact getOne(int cid)
	{
		return template.get(Contact.class, cid);
	}

	public boolean updateOne(Contact ct)
	{
		boolean flag = false;
		try
		{
		  template.update(ct);
		  flag = true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			flag=false;
		}
		return flag;
	}

	@Transactional
    public List<Contact> search(String alpahbet) {
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Contact> criteriaQuery = criteriaBuilder.createQuery(Contact.class);
        Root<Contact> itemRoot = criteriaQuery.from(Contact.class);
        criteriaQuery.select(itemRoot).where(criteriaBuilder.equal(itemRoot.get("cid"), alpahbet), criteriaBuilder.equal(itemRoot.get("contactno"), alpahbet));
        return em.createQuery(criteriaQuery).getResultList();
    }
}
