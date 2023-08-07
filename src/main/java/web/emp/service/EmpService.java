package web.emp.service;

import core.coreService.CoreService;
import web.emp.vo.EmpVo;

public interface EmpService extends CoreService {
    EmpVo login(EmpVo empVo);
}
