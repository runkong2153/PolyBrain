package web.emp.controller;

import web.emp.vo.EmpVo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import static core.util.CommonUtil.jsonToVo;
import static core.util.CommonUtil.voToJson;
import static web.emp.util.EmpConstants.SERVICE;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        EmpVo empVo = jsonToVo(req, EmpVo.class);
        if(empVo == null){
            empVo = new EmpVo();
            empVo.setMessage("查無此管理員資料");
            empVo.setSuccess(false);
            voToJson(res, empVo);
            return;
        }
        empVo = SERVICE.login(empVo);
        if(empVo.isSuccess()){
            if(req.getSession(false) != null){
                req.changeSessionId();
            }
            final HttpSession session = req.getSession();
            session.setAttribute("loggedIn", true);
            session.setAttribute("employee", empVo);
        }
        voToJson(res, empVo);
    }

}
