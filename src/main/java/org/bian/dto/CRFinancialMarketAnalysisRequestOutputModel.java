package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketAnalysisRequestOutputModel
 */
public class CRFinancialMarketAnalysisRequestOutputModel   {
  private String financialMarketAnalysisParameterType = null;

  private String financialMarketAnalysisSelectedOption = null;

  private String financialMarketAnalysisRequest = null;

  private String financialMarketAnalysisStatus = null;

  private String financialMarketAnalysisUsageLog = null;

  private String financialMarketAnalysisRequestActionTaskReference = null;

  private Object financialMarketAnalysisRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Financial Market Analysis instance request service call 
   * @return financialMarketAnalysisRequestActionTaskReference
  **/

  public String getFinancialMarketAnalysisRequestActionTaskReference() {
    return financialMarketAnalysisRequestActionTaskReference;
  }

  public void setFinancialMarketAnalysisRequestActionTaskReference(String financialMarketAnalysisRequestActionTaskReference) {
    this.financialMarketAnalysisRequestActionTaskReference = financialMarketAnalysisRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return financialMarketAnalysisRequestActionTaskRecord
  **/

  public Object getFinancialMarketAnalysisRequestActionTaskRecord() {
    return financialMarketAnalysisRequestActionTaskRecord;
  }

  public void setFinancialMarketAnalysisRequestActionTaskRecord(Object financialMarketAnalysisRequestActionTaskRecord) {
    this.financialMarketAnalysisRequestActionTaskRecord = financialMarketAnalysisRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

