package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDFinancialMarketAnalysisRetrieveOutputModelFinancialMarketAnalysisOfferedService;
import org.bian.dto.SDFinancialMarketAnalysisRetrieveOutputModelFinancialMarketAnalysisRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDFinancialMarketAnalysisRetrieveOutputModel
 */
public class SDFinancialMarketAnalysisRetrieveOutputModel   {
  private String financialMarketAnalysisRetrieveActionTaskReference = null;

  private Object financialMarketAnalysisRetrieveActionTaskRecord = null;

  private String financialMarketAnalysisRetrieveActionResponse = null;

  private SDFinancialMarketAnalysisRetrieveOutputModelFinancialMarketAnalysisRetrieveActionRecord financialMarketAnalysisRetrieveActionRecord = null;

  private SDFinancialMarketAnalysisRetrieveOutputModelFinancialMarketAnalysisOfferedService financialMarketAnalysisOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return financialMarketAnalysisRetrieveActionTaskReference
  **/

  public String getFinancialMarketAnalysisRetrieveActionTaskReference() {
    return financialMarketAnalysisRetrieveActionTaskReference;
  }

  public void setFinancialMarketAnalysisRetrieveActionTaskReference(String financialMarketAnalysisRetrieveActionTaskReference) {
    this.financialMarketAnalysisRetrieveActionTaskReference = financialMarketAnalysisRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return financialMarketAnalysisRetrieveActionResponse
  **/

  public String getFinancialMarketAnalysisRetrieveActionResponse() {
    return financialMarketAnalysisRetrieveActionResponse;
  }

  public void setFinancialMarketAnalysisRetrieveActionResponse(String financialMarketAnalysisRetrieveActionResponse) {
    this.financialMarketAnalysisRetrieveActionResponse = financialMarketAnalysisRetrieveActionResponse;
  }


  /**
   * Get financialMarketAnalysisRetrieveActionRecord
   * @return financialMarketAnalysisRetrieveActionRecord
  **/

  public SDFinancialMarketAnalysisRetrieveOutputModelFinancialMarketAnalysisRetrieveActionRecord getFinancialMarketAnalysisRetrieveActionRecord() {
    return financialMarketAnalysisRetrieveActionRecord;
  }

  public void setFinancialMarketAnalysisRetrieveActionRecord(SDFinancialMarketAnalysisRetrieveOutputModelFinancialMarketAnalysisRetrieveActionRecord financialMarketAnalysisRetrieveActionRecord) {
    this.financialMarketAnalysisRetrieveActionRecord = financialMarketAnalysisRetrieveActionRecord;
  }


  /**
   * Get financialMarketAnalysisOfferedService
   * @return financialMarketAnalysisOfferedService
  **/

  public SDFinancialMarketAnalysisRetrieveOutputModelFinancialMarketAnalysisOfferedService getFinancialMarketAnalysisOfferedService() {
    return financialMarketAnalysisOfferedService;
  }

  public void setFinancialMarketAnalysisOfferedService(SDFinancialMarketAnalysisRetrieveOutputModelFinancialMarketAnalysisOfferedService financialMarketAnalysisOfferedService) {
    this.financialMarketAnalysisOfferedService = financialMarketAnalysisOfferedService;
  }


}

