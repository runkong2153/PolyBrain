package web.emp.vo;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Entity(name = "EMPLOYEE")
public class EmpVO implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EMP_NO", insertable = false)
    private Integer empNo;
    @Column(name = "EMP_NAME")
    private String empName;
    @Column(name = "EMP_GENDER")
    private Byte empGender;
    @Column(name = "EMP_EMAIL")
    private String empEmail;
    @Column(name = "EMP_PWD")
    private String empPwd;
    @Column(name = "EMP_PH")
    private String empPh;
    @Column(name = "EMP_PIC")
    private Byte[] empPic;
    @Column(name = "EMP_STATE")
    private Byte empState;

    public EmpVO() {
    }

    public EmpVO(Integer empNo, String empName, Byte empGender, String empEmail, String empPwd, String empPh, Byte[] empPic, Byte empState) {
        this.empNo = empNo;
        this.empName = empName;
        this.empGender = empGender;
        this.empEmail = empEmail;
        this.empPwd = empPwd;
        this.empPh = empPh;
        this.empPic = empPic;
        this.empState = empState;
    }

    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Byte getEmpGender() {
        return empGender;
    }

    public void setEmpGender(Byte empGender) {
        this.empGender = empGender;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpPwd() {
        return empPwd;
    }

    public void setEmpPwd(String empPwd) {
        this.empPwd = empPwd;
    }

    public String getEmpPh() {
        return empPh;
    }

    public void setEmpPh(String empPh) {
        this.empPh = empPh;
    }

    public Byte[] getEmpPic() {
        return empPic;
    }

    public void setEmpPic(Byte[] empPic) {
        this.empPic = empPic;
    }

    public Byte getEmpState() {
        return empState;
    }

    public void setEmpState(Byte empState) {
        this.empState = empState;
    }
}
