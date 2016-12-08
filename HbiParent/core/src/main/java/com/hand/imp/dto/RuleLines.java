package com.hand.imp.dto;

import java.util.Date;

import javax.persistence.Table;

@Table(name="HCS_IMP_RULE_LINES")
public class RuleLines {

	private Long lineId;
	
	private Long headerId;
	
	private String fieldName;
	
	private Long seqNumber;
	
	private String valueFrom;
	
	private Long mappingHeaderId;
	
	private Long intLineId;
	
	private String defaultValue;
	
	private Long sequenceId;
	
	private String flexSetName;
	
	private String formatString;
	
	private String positiveOrNagetive;
	
	private String numberAction;
	
	private Date startDate;
	
	private Date endDate;
	
	private Long numberType;
	
}
