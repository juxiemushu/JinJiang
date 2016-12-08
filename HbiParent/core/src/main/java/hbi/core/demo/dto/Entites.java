package hbi.core.demo.dto;

import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

import com.hand.hap.system.dto.BaseDTO;

@Table(name="hcs_md_entites")
public class Entites extends BaseDTO{

	private static final long serialVersionUID = -3972947717799433612L;

	@Id
	@NotEmpty
	private Long entityId;
	
	@NotEmpty
	private String entityName;

	public Long getEntityId() {
		return entityId;
	}

	public void setEntityId(Long entityId) {
		this.entityId = entityId;
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}
	
	
}
