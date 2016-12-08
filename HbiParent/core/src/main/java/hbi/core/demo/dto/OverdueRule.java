package hbi.core.demo.dto;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.NotEmpty;

import com.hand.hap.system.dto.BaseDTO;

@Table(name="HCS_CA_OVERDUE_RULE")
public class OverdueRule extends BaseDTO{

	private static final long serialVersionUID = -8861414675983291635L;

	@Id
	@GeneratedValue
	@Column
	@NotEmpty
	private Long ruleId;
	
	@Column
	@NotEmpty
	private String ruleName;
	
	@Column
	private String description; 
	
	@Column
	@NotEmpty
	private Long accEntityId;
	
	@Column
	@NotEmpty
	private String docType; 
	
	@Column
	@NotEmpty
	private String frequency; 
	
	@Column
	@NotEmpty
	private BigDecimal pecent;
	
	@Column
	private Long programId;
	
	@Column
	private Long requestId;
	
	@Column
	@NotEmpty
	private Long objectVersionNumber;
	
	@Column
	@NotEmpty
	private Date creationDate;
	
	@Column
	@NotEmpty
	private Long createdBy;
	
	@Column
	@NotEmpty
	private Long lastUpdatedBy;
	
	@Column
	@NotEmpty
	private Date lastUpdateDate;
	
	@Column
	private Long lastUpdateLogin;
	
	@Transient
    private String entityName;

	public Long getRuleId() {
		return ruleId;
	}

	public void setRuleId(Long ruleId) {
		this.ruleId = ruleId;
	}

	public String getRuleName() {
		return ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getAccEntityId() {
		return accEntityId;
	}

	public void setAccEntityId(Long accEntityId) {
		this.accEntityId = accEntityId;
	}

	public String getDocType() {
		return docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public BigDecimal getPecent() {
		return pecent;
	}

	public void setPecent(BigDecimal pecent) {
		this.pecent = pecent;
	}

	public Long getProgramId() {
		return programId;
	}

	public void setProgramId(Long programId) {
		this.programId = programId;
	}

	public Long getRequestId() {
		return requestId;
	}

	public void setRequestId(Long requestId) {
		this.requestId = requestId;
	}

	public  Long getObjectVersionNumber() {
		return objectVersionNumber;
	}

	public void setObjectVersionNumber(Long objectVersionNumber) {
		this.objectVersionNumber = objectVersionNumber;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Long getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(Long lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public Long getLastUpdateLogin() {
		return lastUpdateLogin;
	}

	public void setLastUpdateLogin(Long lastUpdateLogin) {
		this.lastUpdateLogin = lastUpdateLogin;
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

}

 


