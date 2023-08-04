package web.mem.dao;

import core.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import web.mem.vo.MemVO;

public class memDAOImpl implements MemDAO {

    public int insert(MemVO memVO){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        try{
            Transaction transaction = session.beginTransaction();
            session.persist(memVO);
            transaction.commit();
            return 1;
        }catch (Exception e){
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        return -1;
    }

    public int deleteById(Integer memNo){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        try {
            Transaction transaction = session.beginTransaction();
            MemVO memVO = session.get(MemVO.class, memNo);
            session.remove(memVO);
            transaction.commit();
            return 1;
        }catch (Exception e){
            e.printStackTrace();
            session.getTransaction().rollback();
            return -1;
        }
    }

    @Override
    public boolean updateByMerge(MemVO memVO) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        try {
            Transaction transaction = session.beginTransaction();
            session.update(memVO);
            transaction.commit();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            session.getTransaction().rollback();
            return false;
        }
    }



}
