package hbi.core.demo.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.hand.hap.system.dto.BaseDTO;

@Table(name = "HCS_CA_AGING_LINES")
public class AgingLines extends BaseDTO{

	@Id
    @Column
    @GeneratedValue
    private Long agingLineId;
	
	@Column 
	private Long agingHeaderId;
	
	@Column  
	@NotNull
    private Long lineNumber;
    
    @Column
    @NotEmpty
    private String stageName;
    
    @Column
    @NotNull
    private Long agingFrom;

    @Column
    @NotNull
    private Long agingTo;
    
    @Column
    private Date creationDate;
    
    @Column
    private Date lastUpdateDate;

	public Long getAgingLineId() {
		return agingLineId;
	}

	public void setAgingLineId(Long agingLineId) {
		this.agingLineId = agingLineId;
	}

	public Long getAgingHeaderId() {
		return agingHeaderId;
	}

	public void setAgingHeaderId(Long agingHeaderId) {
		this.agingHeaderId = agingHeaderId;
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
    
    
}
