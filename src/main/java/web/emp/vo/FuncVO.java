package web.emp.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serial;
import java.io.Serializable;

@Entity(name = "FUNCTION")
public class FuncVO implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "FUNC_NO")
    private String funcNo;
    @Column(name = "FUNC_NAME")
    private String funcName;

    public FuncVO() {
    }

    public FuncVO(String funcNo, String funcName) {
        this.funcNo = funcNo;
        this.funcName = funcName;
    }

    public String getFuncNo() {
        return funcNo;
    }

    public void setFuncNo(String funcNo) {
        this.funcNo = funcNo;
    }

    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName;
    }
}
