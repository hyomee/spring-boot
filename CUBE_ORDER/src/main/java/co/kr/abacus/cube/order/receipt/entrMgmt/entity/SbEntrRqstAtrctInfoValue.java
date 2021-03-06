package co.kr.abacus.cube.order.receipt.entrMgmt.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.time.LocalDate;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class SbEntrRqstAtrctInfoValue {

	// 가입대리점코드
	@Column(table="TB_SB_ENTR_RQST_ATRCT_INFO")
	private String entrDlrCd;
	
	// 유치 통합 영업 코드
	@Column(table="TB_SB_ENTR_RQST_ATRCT_INFO")
	private String atrctIntgBizCd;
	
	
	
	
	//@CreationTimestamp
	@Column(table="TB_SB_ENTR_RQST_ATRCT_INFO", name="SYS_CREATE_DATE", nullable = false, updatable = false)
	private LocalDate sysCreateDate;

	//@UpdateTimestamp
	@Column(table="TB_SB_ENTR_RQST_ATRCT_INFO", name="SYS_UPDATE_DATE", nullable = false)
	private LocalDate sysUpdateDate;

	@Column(table="TB_SB_ENTR_RQST_ATRCT_INFO", name="OPERATOR_ID")
	private String operatorId;

	@Column(table="TB_SB_ENTR_RQST_ATRCT_INFO", name="APPLICATION_ID")
	private String applicationId;

	@Column(table="TB_SB_ENTR_RQST_ATRCT_INFO", name="DL_SERVICE_CODE")
	private String dlServiceCode;

	@Column(table="TB_SB_ENTR_RQST_ATRCT_INFO", name="DL_UPDATE_STAMP")
		private String dlUpdateStamp;
}
