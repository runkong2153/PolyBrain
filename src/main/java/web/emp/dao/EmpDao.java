package web.emp.dao;

import core.coreDAO.CoreDao;
import web.emp.vo.EmpVo;

import java.util.List;

public interface EmpDao extends CoreDao<EmpVo, Integer> {
        Integer insert(EmpVo empVo);
        Integer deleteById(Integer empNo);
        Integer updateById(EmpVo empVo);
        EmpVo selectById(Integer empNo);
        List<EmpVo> selectAll();
}
