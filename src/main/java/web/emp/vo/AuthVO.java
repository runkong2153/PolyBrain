package web.emp.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serial;
import java.io.Serializable;

@Entity(name = "AUTHORITY")
public class AuthVO implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "EMP_NO")
    private Integer empNo;
    @Id
    @Column(name = "FUNC_NO")
    private String funcNo;

    public AuthVO() {
    }

    public AuthVO(Integer empNo, String funcNo) {
        this.empNo = empNo;
        this.funcNo = funcNo;
    }

    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public String getFuncNo() {
        return funcNo;
    }

    public void setFuncNo(String funcNo) {
        this.funcNo = funcNo;
    }
}
