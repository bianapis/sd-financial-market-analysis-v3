package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDFinancialMarketAnalysisFeedbackInputModelFinancialMarketAnalysisFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDFinancialMarketAnalysisFeedbackInputModel
 */
public class SDFinancialMarketAnalysisFeedbackInputModel   {
  private Object financialMarketAnalysisFeedbackActionTaskRecord = null;

  private SDFinancialMarketAnalysisFeedbackInputModelFinancialMarketAnalysisFeedbackActionRecord financialMarketAnalysisFeedbackActionRecord = null;


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

  public SDFinancialMarketAnalysisFeedbackInputModelFinancialMarketAnalysisFeedbackActionRecord getFinancialMarketAnalysisFeedbackActionRecord() {
    return financialMarketAnalysisFeedbackActionRecord;
  }

  public void setFinancialMarketAnalysisFeedbackActionRecord(SDFinancialMarketAnalysisFeedbackInputModelFinancialMarketAnalysisFeedbackActionRecord financialMarketAnalysisFeedbackActionRecord) {
    this.financialMarketAnalysisFeedbackActionRecord = financialMarketAnalysisFeedbackActionRecord;
  }


}

