package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketAnalysisUpdateOutputModel
 */
public class CRFinancialMarketAnalysisUpdateOutputModel   {
  private String financialMarketAnalysisParameterType = null;

  private String financialMarketAnalysisSelectedOption = null;

  private String financialMarketAnalysisRequest = null;

  private String financialMarketAnalysisStatus = null;

  private String financialMarketAnalysisUsageLog = null;

  private String financialMarketAnalysisUpdateActionTaskReference = null;

  private Object financialMarketAnalysisUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between Analysis according to the type of business services and/or type of concern defined within Financial Market Analysis . Eg Market Analysis, Risk Analysis, Perfomance Analysis, etc. 
   * @return financialMarketAnalysisParameterType
  **/

  public String getFinancialMarketAnalysisParameterType() {
    return financialMarketAnalysisParameterType;
  }

  public void setFinancialMarketAnalysisParameterType(String financialMarketAnalysisParameterType) {
    this.financialMarketAnalysisParameterType = financialMarketAnalysisParameterType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A selected optional business service as subject matter of analysis 
   * @return financialMarketAnalysisSelectedOption
  **/

  public String getFinancialMarketAnalysisSelectedOption() {
    return financialMarketAnalysisSelectedOption;
  }

  public void setFinancialMarketAnalysisSelectedOption(String financialMarketAnalysisSelectedOption) {
    this.financialMarketAnalysisSelectedOption = financialMarketAnalysisSelectedOption;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Request to perform Financial Market Analysis 
   * @return financialMarketAnalysisRequest
  **/

  public String getFinancialMarketAnalysisRequest() {
    return financialMarketAnalysisRequest;
  }

  public void setFinancialMarketAnalysisRequest(String financialMarketAnalysisRequest) {
    this.financialMarketAnalysisRequest = financialMarketAnalysisRequest;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of Financial Market Analysis 
   * @return financialMarketAnalysisStatus
  **/

  public String getFinancialMarketAnalysisStatus() {
    return financialMarketAnalysisStatus;
  }

  public void setFinancialMarketAnalysisStatus(String financialMarketAnalysisStatus) {
    this.financialMarketAnalysisStatus = financialMarketAnalysisStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the log of (usage) ativities/events of Financial Market Analysis 
   * @return financialMarketAnalysisUsageLog
  **/

  public String getFinancialMarketAnalysisUsageLog() {
    return financialMarketAnalysisUsageLog;
  }

  public void setFinancialMarketAnalysisUsageLog(String financialMarketAnalysisUsageLog) {
    this.financialMarketAnalysisUsageLog = financialMarketAnalysisUsageLog;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return financialMarketAnalysisUpdateActionTaskReference
  **/

  public String getFinancialMarketAnalysisUpdateActionTaskReference() {
    return financialMarketAnalysisUpdateActionTaskReference;
  }

  public void setFinancialMarketAnalysisUpdateActionTaskReference(String financialMarketAnalysisUpdateActionTaskReference) {
    this.financialMarketAnalysisUpdateActionTaskReference = financialMarketAnalysisUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return financialMarketAnalysisUpdateActionTaskRecord
  **/

  public Object getFinancialMarketAnalysisUpdateActionTaskRecord() {
    return financialMarketAnalysisUpdateActionTaskRecord;
  }

  public void setFinancialMarketAnalysisUpdateActionTaskRecord(Object financialMarketAnalysisUpdateActionTaskRecord) {
    this.financialMarketAnalysisUpdateActionTaskRecord = financialMarketAnalysisUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

