package web.mem.vo;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.sql.Date;


@Entity(name = "MEMBER")
public class MemVO implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MEM_NO", insertable = false, updatable = false)
    private Integer memNo;
    @Column(name = "MEM_NAME", updatable = false)
    private String memName;
    @Column(name = "MEM_PID", updatable = false)
    private String memPid;
    @Column(name = "MEM_GENDER", updatable = false)
    private Byte memGender;
    @Column(name = "MEM_PIC", insertable = false)
    private Byte[] memPic;
    @Column(name = "MEM_EMAIL")
    private String memEmail;
    @Column(name = "MEM_PWD")
    private String memPwd;
    @Column(name = "MEM_PH")
    private String memPh;
    @Column(name = "MEM_ADDRS")
    private String memAddress;
    @Column(name = "MEM_BIRTH", updatable = false)
    private Date memBirth;
    @Column(name = "MEM_AUTH")
    private Byte memAuth;
    @Column(name = "MEM_VIO")
    private Byte memVio;

    public MemVO() {
    }

    public MemVO(Integer memNo, String memName, String memPid, Byte memGender, Byte[] memPic, String memEmail, String memPwd, String memPh, String memAddress, Date memBirth, Byte memAuth, Byte memVio) {
        this.memNo = memNo;
        this.memName = memName;
        this.memPid = memPid;
        this.memGender = memGender;
        this.memPic = memPic;
        this.memEmail = memEmail;
        this.memPwd = memPwd;
        this.memPh = memPh;
        this.memAddress = memAddress;
        this.memBirth = memBirth;
        this.memAuth = memAuth;
        this.memVio = memVio;
    }

    public Integer getMemNo() {
        return memNo;
    }

    public void setMemNo(Integer memNo) {
        this.memNo = memNo;
    }

    public String getMemName() {
        return memName;
    }

    public void setMemName(String memName) {
        this.memName = memName;
    }

    public String getMemPid() {
        return memPid;
    }

    public void setMemPid(String memPid) {
        this.memPid = memPid;
    }

    public Byte getMemGender() {
        return memGender;
    }

    public void setMemGender(Byte memGender) {
        this.memGender = memGender;
    }

    public Byte[] getMemPic() {
        return memPic;
    }

    public void setMemPic(Byte[] memPic) {
        this.memPic = memPic;
    }

    public String getMemEmail() {
        return memEmail;
    }

    public void setMemEmail(String memEmail) {
        this.memEmail = memEmail;
    }

    public String getMemPwd() {
        return memPwd;
    }

    public void setMemPwd(String memPwd) {
        this.memPwd = memPwd;
    }

    public String getMemPh() {
        return memPh;
    }

    public void setMemPh(String memPh) {
        this.memPh = memPh;
    }

    public String getMemAddress() {
        return memAddress;
    }

    public void setMemAddress(String memAddress) {
        this.memAddress = memAddress;
    }

    public Date getMemBirth() {
        return memBirth;
    }

    public void setMemBirth(Date memBirth) {
        this.memBirth = memBirth;
    }

    public Byte getMemAuth() {
        return memAuth;
    }

    public void setMemAuth(Byte memAuth) {
        this.memAuth = memAuth;
    }

    public Byte getMemVio() {
        return memVio;
    }

    public void setMemVio(Byte memVio) {
        this.memVio = memVio;
    }
}
