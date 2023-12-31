package core.coreDAO;

import org.hibernate.Session;

import javax.net.ssl.SSLServerSocket;
import java.util.List;

import static core.util.HibernateUtil.getSessionFactory;

public interface CoreDao<Vo, Integer>{
    Integer insert(Vo vo);
    Integer deleteById(Integer id);
    Integer update(Vo vo);
    Vo selectById(Integer id);
    List<Vo> selectAll();
    default Session getSession() {
        return getSessionFactory().openSession();
    }
    SSLServerSocket
}
