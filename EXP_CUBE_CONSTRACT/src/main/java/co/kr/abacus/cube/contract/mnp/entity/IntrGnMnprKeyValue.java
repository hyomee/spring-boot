package co.kr.abacus.cube.contract.mnp.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Data
@Embeddable
public class IntrGnMnprKeyValue implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "ENTR_NO")
	private long entrNo;

	@Column(name = "MNP_SEQNO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long mnpSeqno;

}
