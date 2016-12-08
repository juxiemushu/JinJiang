package hbi.core.demo.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import com.hand.hap.system.dto.BaseDTO;

@Table(name = "HCS_CA_AGING_HEADERS")
public class Aging extends BaseDTO{

	@Id
    @Column
    @GeneratedValue
    private Long agingHeaderId;	

	@Column
    private String agingName;
    
    @Column
    private String description;
    
    @Column
    private String enableFlag;
    
    @Column  
    private Long agingLineId;
    
    @Column
    private Date creationDate;
    
    @Column
    private Date lastUpdateDate;
    
    @Column  
	@NotNull
	@Transient
    private Long lineNumber;
    
    @Column
    @Transient
    private String stageName;
    
    @Column
    @Transient
    private Long agingFrom;

    @Column
    @Transient
    private Long agingTo;

	public Long getAgingHeaderId() {
		return agingHeaderId;
	}

	public void setAgingHeaderId(Long agingHeaderId) {
		this.agingHeaderId = agingHeaderId;
	}

	public String getAgingName() {
		return agingName;
	}

	public void setAgingName(String agingName) {
		this.agingName = agingName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEnableFlag() {
		return enableFlag;
	}

	public void setEnableFlag(String enableFlag) {
		this.enableFlag = enableFlag;
	}

	public Long getAgingLineId() {
		return agingLineId;
	}

	public void setAgingLineId(Long agingLineId) {
		this.agingLineId = agingLineId;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public Long getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(Long lineNumber) {
		this.lineNumber = lineNumber;
	}

	public String getStageName() {
		return stageName;
	}

	public void setStageName(String stageName) {
		this.stageName = stageName;
	}

	public Long getAgingFrom() {
		return agingFrom;
	}

	public void setAgingFrom(Long agingFrom) {
		this.agingFrom = agingFrom;
	}

	public Long getAgingTo() {
		return agingTo;
	}

	public void setAgingTo(Long agingTo) {
		this.agingTo = agingTo;
	}
    
    
    
}
