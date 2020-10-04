package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDFinancialMarketAnalysisRetrieveInputModelFinancialMarketAnalysisOfferedService;
import org.bian.dto.SDFinancialMarketAnalysisRetrieveInputModelFinancialMarketAnalysisRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDFinancialMarketAnalysisRetrieveInputModel
 */
public class SDFinancialMarketAnalysisRetrieveInputModel   {
  private Object financialMarketAnalysisRetrieveActionTaskRecord = null;

  private String financialMarketAnalysisRetrieveActionRequest = null;

  private SDFinancialMarketAnalysisRetrieveInputModelFinancialMarketAnalysisRetrieveActionRecord financialMarketAnalysisRetrieveActionRecord = null;

  private SDFinancialMarketAnalysisRetrieveInputModelFinancialMarketAnalysisOfferedService financialMarketAnalysisOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return financialMarketAnalysisRetrieveActionTaskRecord
  **/

  public Object getFinancialMarketAnalysisRetrieveActionTaskRecord() {
    return financialMarketAnalysisRetrieveActionTaskRecord;
  }

  public void setFinancialMarketAnalysisRetrieveActionTaskRecord(Object financialMarketAnalysisRetrieveActionTaskRecord) {
    this.financialMarketAnalysisRetrieveActionTaskRecord = financialMarketAnalysisRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return financialMarketAnalysisRetrieveActionRequest
  **/

  public String getFinancialMarketAnalysisRetrieveActionRequest() {
    return financialMarketAnalysisRetrieveActionRequest;
  }

  public void setFinancialMarketAnalysisRetrieveActionRequest(String financialMarketAnalysisRetrieveActionRequest) {
    this.financialMarketAnalysisRetrieveActionRequest = financialMarketAnalysisRetrieveActionRequest;
  }


  /**
   * Get financialMarketAnalysisRetrieveActionRecord
   * @return financialMarketAnalysisRetrieveActionRecord
  **/

  public SDFinancialMarketAnalysisRetrieveInputModelFinancialMarketAnalysisRetrieveActionRecord getFinancialMarketAnalysisRetrieveActionRecord() {
    return financialMarketAnalysisRetrieveActionRecord;
  }

  public void setFinancialMarketAnalysisRetrieveActionRecord(SDFinancialMarketAnalysisRetrieveInputModelFinancialMarketAnalysisRetrieveActionRecord financialMarketAnalysisRetrieveActionRecord) {
    this.financialMarketAnalysisRetrieveActionRecord = financialMarketAnalysisRetrieveActionRecord;
  }


  /**
   * Get financialMarketAnalysisOfferedService
   * @return financialMarketAnalysisOfferedService
  **/

  public SDFinancialMarketAnalysisRetrieveInputModelFinancialMarketAnalysisOfferedService getFinancialMarketAnalysisOfferedService() {
    return financialMarketAnalysisOfferedService;
  }

  public void setFinancialMarketAnalysisOfferedService(SDFinancialMarketAnalysisRetrieveInputModelFinancialMarketAnalysisOfferedService financialMarketAnalysisOfferedService) {
    this.financialMarketAnalysisOfferedService = financialMarketAnalysisOfferedService;
  }


}

