package hbi.core.demo.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.hand.hap.core.annotation.Children;
import com.hand.hap.system.dto.BaseDTO;


@Table(name = "HCS_CA_AGING_HEADERS")
public class AgingHeaders extends BaseDTO{
	
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
    private Date creationDate;
    
    @Column
    private Date lastUpdateDate;
    
    @Column
    private Long createdBy;
    
    @Column
    private Long lastUpdatedBy;
    
    @Children
	@Transient
	private List<AgingLines> agingLinesList;

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

	public List<AgingLines> getAgingLinesList() {
		return agingLinesList;
	}

	public void setAgingLinesList(List<AgingLines> agingLinesList) {
		this.agingLinesList = agingLinesList;
	}
    
    
}
