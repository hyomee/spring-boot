package co.kr.abacus.cube.contract.svc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class MsconEntrKeyValue implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@Column(name="ENTR_NO")
	private long entrNo;
	
	
	@Column(name="SVC_CD")
	private long svcCd;

	
}
