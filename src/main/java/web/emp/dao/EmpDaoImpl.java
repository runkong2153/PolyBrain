package web.emp.dao;

import web.emp.vo.EmpVo;

import java.util.List;

public class EmpDaoImpl implements EmpDao{
    @Override
    public Integer insert(EmpVo empVo) {
        return null;
    }

    @Override
    public Integer deleteById(Integer id) {
        return null;
    }

    @Override
    public Integer update(EmpVo empVo) {
        return null;
    }

    @Override
    public Integer updateById(EmpVo empVo) {
        return null;
    }

    @Override
    public EmpVo selectById(Integer empNo) {
        return null;
    }

    @Override
    public List<EmpVo> selectAll() {
        return null;
    }

    @Override
    public EmpVo selectForLogin(String empEmail, String empPwd) {
        final String sql = "select * from EMPOLYEE where EMP_EMAIL = :empEmail and EMP_PWD = :empPwd";
        return getSession()
                .createNativeQuery(sql, EmpVo.class)
                .setParameter("empEmail", empEmail)
                .setParameter("empPwd", empPwd)
                .uniqueResult();
    }
}
