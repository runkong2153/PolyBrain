package web.emp.service;

import org.jetbrains.annotations.NotNull;
import web.emp.dao.EmpDao;
import web.emp.dao.EmpDaoImpl;
import web.emp.vo.EmpVo;

public class EmpServiceImpl implements EmpService{
    private EmpDao empDao;
    public EmpServiceImpl(){
        empDao = new EmpDaoImpl();
    }
    @Override
    public EmpVo login(@NotNull EmpVo empVo) {
        final String account = empVo.getEmpEmail();
        final String password = empVo.getEmpPwd();
        if(account.isEmpty()){
            empVo.setMessage("請輸入帳號");
            empVo.setSuccess(false);
            return empVo;
        }
        if(password.isEmpty()){
            empVo.setMessage("請輸入密碼");
            empVo.setSuccess(false);
            return empVo;
        }
        empVo = empDao.selectForLogin(account, password);
        if(empVo == null){
            empVo = new EmpVo();
            empVo.setMessage("帳號或密碼錯誤");
            empVo.setSuccess(false);
            return empVo;
        }
        empVo.setMessage("登入成功");
        empVo.setSuccess(true);
        return empVo;
    }
}
