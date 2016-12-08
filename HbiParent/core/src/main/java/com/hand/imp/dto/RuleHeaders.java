package com.hand.imp.dto;

import java.util.Date;

import javax.persistence.Table;

@Table(name="HCS_IMP_RULE_HEADERS")
public class RuleHeaders {

	private Long headerId;
	
	private Long intHeaderId;
	
	private String ruleName;
	
	private String objectType;
	
	private Long filterHeaderId;
	
	private Long updateFilterId;
	
	private Date startDate;
	
	private Date endDate;
	
	private String levelTypeCode;
	
	private String description;
	
	
}
