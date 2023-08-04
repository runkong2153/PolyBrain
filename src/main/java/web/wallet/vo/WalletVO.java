package web.wallet.vo;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.sql.Date;

@Entity(name = "WALLET")
public class WalletVO implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "WALLET_HISTORY_NO", insertable = false)
    private Integer walletHistoryNo;
    @Column(name = "MEM_NO")
    private Integer memNo;
    @Column(name = "TRANS_TYPE")
    private Byte transType;
    @Column(name = "TRANS_DATE", insertable = false)
    private Date transDate;
    @Column(name = "TRANS_NOTE")
    private Byte transNote;
    @Column(name = "TRANS_AMOUNT")
    private Integer transAmount;

    public WalletVO() {
    }

    public WalletVO(Integer walletHistoryNo, Integer memNo, Byte transType, Date transDate, Byte transNote, Integer transAmount) {
        this.walletHistoryNo = walletHistoryNo;
        this.memNo = memNo;
        this.transType = transType;
        this.transDate = transDate;
        this.transNote = transNote;
        this.transAmount = transAmount;
    }

    public Integer getWalletHistoryNo() {
        return walletHistoryNo;
    }

    public void setWalletHistoryNo(Integer walletHistoryNo) {
        this.walletHistoryNo = walletHistoryNo;
    }

    public Integer getMemNo() {
        return memNo;
    }

    public void setMemNo(Integer memNo) {
        this.memNo = memNo;
    }

    public Byte getTransType() {
        return transType;
    }

    public void setTransType(Byte transType) {
        this.transType = transType;
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public Byte getTransNote() {
        return transNote;
    }

    public void setTransNote(Byte transNote) {
        this.transNote = transNote;
    }

    public Integer getTransAmount() {
        return transAmount;
    }

    public void setTransAmount(Integer transAmount) {
        this.transAmount = transAmount;
    }
}
