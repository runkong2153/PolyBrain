package web.emp.service;

import web.emp.dao.EmpDao;
import web.emp.dao.EmpDaoImpl;
import web.emp.vo.EmpVo;

public class EmpServiceImpl implements EmpService{
    private EmpDao empDao;
    public EmpServiceImpl(){
        empDao = new EmpDaoImpl();
    }
    @Override
    public EmpVo login(EmpVo empVo) {
        return null;
    }
}
