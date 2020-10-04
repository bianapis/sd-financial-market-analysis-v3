package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDFinancialMarketAnalysisFeedbackOutputModelFinancialMarketAnalysisFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDFinancialMarketAnalysisFeedbackOutputModel
 */
public class SDFinancialMarketAnalysisFeedbackOutputModel   {
  private String financialMarketAnalysisFeedbackActionTaskReference = null;

  private Object financialMarketAnalysisFeedbackActionTaskRecord = null;

  private SDFinancialMarketAnalysisFeedbackOutputModelFinancialMarketAnalysisFeedbackActionRecord financialMarketAnalysisFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return financialMarketAnalysisFeedbackActionTaskReference
  **/

  public String getFinancialMarketAnalysisFeedbackActionTaskReference() {
    return financialMarketAnalysisFeedbackActionTaskReference;
  }

  public void setFinancialMarketAnalysisFeedbackActionTaskReference(String financialMarketAnalysisFeedbackActionTaskReference) {
    this.financialMarketAnalysisFeedbackActionTaskReference = financialMarketAnalysisFeedbackActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return financialMarketAnalysisFeedbackActionTaskRecord
  **/

  public Object getFinancialMarketAnalysisFeedbackActionTaskRecord() {
    return financialMarketAnalysisFeedbackActionTaskRecord;
  }

  public void setFinancialMarketAnalysisFeedbackActionTaskRecord(Object financialMarketAnalysisFeedbackActionTaskRecord) {
    this.financialMarketAnalysisFeedbackActionTaskRecord = financialMarketAnalysisFeedbackActionTaskRecord;
  }


  /**
   * Get financialMarketAnalysisFeedbackActionRecord
   * @return financialMarketAnalysisFeedbackActionRecord
  **/

  public SDFinancialMarketAnalysisFeedbackOutputModelFinancialMarketAnalysisFeedbackActionRecord getFinancialMarketAnalysisFeedbackActionRecord() {
    return financialMarketAnalysisFeedbackActionRecord;
  }

  public void setFinancialMarketAnalysisFeedbackActionRecord(SDFinancialMarketAnalysisFeedbackOutputModelFinancialMarketAnalysisFeedbackActionRecord financialMarketAnalysisFeedbackActionRecord) {
    this.financialMarketAnalysisFeedbackActionRecord = financialMarketAnalysisFeedbackActionRecord;
  }


}

