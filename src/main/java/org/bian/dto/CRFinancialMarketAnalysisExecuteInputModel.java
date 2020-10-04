package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialMarketAnalysisExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketAnalysisExecuteInputModel
 */
public class CRFinancialMarketAnalysisExecuteInputModel   {
  private String financialMarketAnalysisServicingSessionReference = null;

  private String financialMarketAnalysisInstanceReference = null;

  private String financialMarketAnalysisParameterType = null;

  private String financialMarketAnalysisSelectedOption = null;

  private String financialMarketAnalysisRequest = null;

  private String financialMarketAnalysisSchedule = null;

  private String financialMarketAnalysisStatus = null;

  private String financialMarketAnalysisUsageLog = null;

  private String financialMarketAnalysisRequesterReference = null;

  private Object financialMarketAnalysisExecuteActionTaskRecord = null;

  private CRFinancialMarketAnalysisExecuteInputModelExecuteRecordType executeRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return financialMarketAnalysisServicingSessionReference
  **/

  public String getFinancialMarketAnalysisServicingSessionReference() {
    return financialMarketAnalysisServicingSessionReference;
  }

  public void setFinancialMarketAnalysisServicingSessionReference(String financialMarketAnalysisServicingSessionReference) {
    this.financialMarketAnalysisServicingSessionReference = financialMarketAnalysisServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Financial Market Analysis instance 
   * @return financialMarketAnalysisInstanceReference
  **/

  public String getFinancialMarketAnalysisInstanceReference() {
    return financialMarketAnalysisInstanceReference;
  }

  public void setFinancialMarketAnalysisInstanceReference(String financialMarketAnalysisInstanceReference) {
    this.financialMarketAnalysisInstanceReference = financialMarketAnalysisInstanceReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Timetable to perform Financial Market Analysis 
   * @return financialMarketAnalysisSchedule
  **/

  public String getFinancialMarketAnalysisSchedule() {
    return financialMarketAnalysisSchedule;
  }

  public void setFinancialMarketAnalysisSchedule(String financialMarketAnalysisSchedule) {
    this.financialMarketAnalysisSchedule = financialMarketAnalysisSchedule;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the party who has requested Financial Market Analysis 
   * @return financialMarketAnalysisRequesterReference
  **/

  public String getFinancialMarketAnalysisRequesterReference() {
    return financialMarketAnalysisRequesterReference;
  }

  public void setFinancialMarketAnalysisRequesterReference(String financialMarketAnalysisRequesterReference) {
    this.financialMarketAnalysisRequesterReference = financialMarketAnalysisRequesterReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return financialMarketAnalysisExecuteActionTaskRecord
  **/

  public Object getFinancialMarketAnalysisExecuteActionTaskRecord() {
    return financialMarketAnalysisExecuteActionTaskRecord;
  }

  public void setFinancialMarketAnalysisExecuteActionTaskRecord(Object financialMarketAnalysisExecuteActionTaskRecord) {
    this.financialMarketAnalysisExecuteActionTaskRecord = financialMarketAnalysisExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRFinancialMarketAnalysisExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRFinancialMarketAnalysisExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

