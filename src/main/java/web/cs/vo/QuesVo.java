package web.cs.vo;

import core.coreVO.Core;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;

@Entity(name = "QUESTION")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QuesVo extends Core {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="QUESTION_NO,insertable = false")
    private Integer quesNo;
    @Column(name="QUESTION_CFT")
    private String quesCft;
    @Column(name="QUESTION_CONT")
    private String quesCont;

}
