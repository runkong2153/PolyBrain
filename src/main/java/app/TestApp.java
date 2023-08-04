package app;

import core.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import web.mem.dao.MemDAO;
import web.mem.dao.memDAOImpl;
import web.mem.vo.MemVO;


public class TestApp {

    public static void main(String[] args) {
        MemDAO memDAO = new memDAOImpl();

        MemVO memVO = new MemVO();
//        memVO.setMemName("Donut");
//        memVO.setMemPid("G129968373");
//        memVO.setMemGender((short) 1);
//        memVO.setMemEmail("kdjfa@gmail.com");
//        memVO.setMemPwd("kdjfadf");
//        memVO.setMemPh("0982849389");
//        memVO.setMemAddress("Taiwan, Taipei");
//        memVO.setMemBirth("19970430");
//        memVO.setMemAuth((short)1);
//        memVO.setMemVio((short)3);
//
//        testApp.insert(memVO);

        memVO.setMemNo(3);
        memVO.setMemEmail("30678@gmail.com");
        memVO.setMemPwd("30678");
        memVO.setMemPh("0978533937");
        memVO.setMemAddress("Tainan, yidjf");
        memVO.setMemAuth((byte)1);
        memVO.setMemVio((byte)1);
        memDAO.updateByMerge(memVO);
    }

}
