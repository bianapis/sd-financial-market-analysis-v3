package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFinancialMarketInsightRetrieveOutputModelFinancialMarketInsightInstanceAnalysis;
import org.bian.dto.BQFinancialMarketInsightRetrieveOutputModelFinancialMarketInsightInstanceReport;

import javax.validation.Valid;
  
/**
 * BQFinancialMarketInsightRetrieveOutputModel
 */
public class BQFinancialMarketInsightRetrieveOutputModel   {
  private String financialMarketInsightPreconditions = null;

  private String financialMarketInsightAnalysisSchedule = null;

  private String financialMarketInsightVersionNumber = null;

  private String financialMarketAnalysis = null;

  private String financialMarketAnalysisServiceType = null;

  private String financialMarketAnalysisServiceDescription = null;

  private String financialMarketAnalysisServiceInputsandOuputs = null;

  private String financialMarketAnalysisServiceWorkProduct = null;

  private String financialMarketInsightRetrieveActionTaskReference = null;

  private Object financialMarketInsightRetrieveActionTaskRecord = null;

  private String financialMarketInsightRetrieveActionResponse = null;

  private BQFinancialMarketInsightRetrieveOutputModelFinancialMarketInsightInstanceReport financialMarketInsightInstanceReport = null;

  private BQFinancialMarketInsightRetrieveOutputModelFinancialMarketInsightInstanceAnalysis financialMarketInsightInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the algorithm can be applied 
   * @return financialMarketInsightPreconditions
  **/

  public String getFinancialMarketInsightPreconditions() {
    return financialMarketInsightPreconditions;
  }

  public void setFinancialMarketInsightPreconditions(String financialMarketInsightPreconditions) {
    this.financialMarketInsightPreconditions = financialMarketInsightPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the analysis performed using the algorithm 
   * @return financialMarketInsightAnalysisSchedule
  **/

  public String getFinancialMarketInsightAnalysisSchedule() {
    return financialMarketInsightAnalysisSchedule;
  }

  public void setFinancialMarketInsightAnalysisSchedule(String financialMarketInsightAnalysisSchedule) {
    this.financialMarketInsightAnalysisSchedule = financialMarketInsightAnalysisSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The algorithm version employed in the analysis 
   * @return financialMarketInsightVersionNumber
  **/

  public String getFinancialMarketInsightVersionNumber() {
    return financialMarketInsightVersionNumber;
  }

  public void setFinancialMarketInsightVersionNumber(String financialMarketInsightVersionNumber) {
    this.financialMarketInsightVersionNumber = financialMarketInsightVersionNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Financial Market Analysis specific Business Service 
   * @return financialMarketAnalysis
  **/

  public String getFinancialMarketAnalysis() {
    return financialMarketAnalysis;
  }

  public void setFinancialMarketAnalysis(String financialMarketAnalysis) {
    this.financialMarketAnalysis = financialMarketAnalysis;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return financialMarketAnalysisServiceType
  **/

  public String getFinancialMarketAnalysisServiceType() {
    return financialMarketAnalysisServiceType;
  }

  public void setFinancialMarketAnalysisServiceType(String financialMarketAnalysisServiceType) {
    this.financialMarketAnalysisServiceType = financialMarketAnalysisServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return financialMarketAnalysisServiceDescription
  **/

  public String getFinancialMarketAnalysisServiceDescription() {
    return financialMarketAnalysisServiceDescription;
  }

  public void setFinancialMarketAnalysisServiceDescription(String financialMarketAnalysisServiceDescription) {
    this.financialMarketAnalysisServiceDescription = financialMarketAnalysisServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return financialMarketAnalysisServiceInputsandOuputs
  **/

  public String getFinancialMarketAnalysisServiceInputsandOuputs() {
    return financialMarketAnalysisServiceInputsandOuputs;
  }

  public void setFinancialMarketAnalysisServiceInputsandOuputs(String financialMarketAnalysisServiceInputsandOuputs) {
    this.financialMarketAnalysisServiceInputsandOuputs = financialMarketAnalysisServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return financialMarketAnalysisServiceWorkProduct
  **/

  public String getFinancialMarketAnalysisServiceWorkProduct() {
    return financialMarketAnalysisServiceWorkProduct;
  }

  public void setFinancialMarketAnalysisServiceWorkProduct(String financialMarketAnalysisServiceWorkProduct) {
    this.financialMarketAnalysisServiceWorkProduct = financialMarketAnalysisServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Financial Market Insight instance retrieve service call 
   * @return financialMarketInsightRetrieveActionTaskReference
  **/

  public String getFinancialMarketInsightRetrieveActionTaskReference() {
    return financialMarketInsightRetrieveActionTaskReference;
  }

  public void setFinancialMarketInsightRetrieveActionTaskReference(String financialMarketInsightRetrieveActionTaskReference) {
    this.financialMarketInsightRetrieveActionTaskReference = financialMarketInsightRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return financialMarketInsightRetrieveActionTaskRecord
  **/

  public Object getFinancialMarketInsightRetrieveActionTaskRecord() {
    return financialMarketInsightRetrieveActionTaskRecord;
  }

  public void setFinancialMarketInsightRetrieveActionTaskRecord(Object financialMarketInsightRetrieveActionTaskRecord) {
    this.financialMarketInsightRetrieveActionTaskRecord = financialMarketInsightRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return financialMarketInsightRetrieveActionResponse
  **/

  public String getFinancialMarketInsightRetrieveActionResponse() {
    return financialMarketInsightRetrieveActionResponse;
  }

  public void setFinancialMarketInsightRetrieveActionResponse(String financialMarketInsightRetrieveActionResponse) {
    this.financialMarketInsightRetrieveActionResponse = financialMarketInsightRetrieveActionResponse;
  }


  /**
   * Get financialMarketInsightInstanceReport
   * @return financialMarketInsightInstanceReport
  **/

  public BQFinancialMarketInsightRetrieveOutputModelFinancialMarketInsightInstanceReport getFinancialMarketInsightInstanceReport() {
    return financialMarketInsightInstanceReport;
  }

  public void setFinancialMarketInsightInstanceReport(BQFinancialMarketInsightRetrieveOutputModelFinancialMarketInsightInstanceReport financialMarketInsightInstanceReport) {
    this.financialMarketInsightInstanceReport = financialMarketInsightInstanceReport;
  }


  /**
   * Get financialMarketInsightInstanceAnalysis
   * @return financialMarketInsightInstanceAnalysis
  **/

  public BQFinancialMarketInsightRetrieveOutputModelFinancialMarketInsightInstanceAnalysis getFinancialMarketInsightInstanceAnalysis() {
    return financialMarketInsightInstanceAnalysis;
  }

  public void setFinancialMarketInsightInstanceAnalysis(BQFinancialMarketInsightRetrieveOutputModelFinancialMarketInsightInstanceAnalysis financialMarketInsightInstanceAnalysis) {
    this.financialMarketInsightInstanceAnalysis = financialMarketInsightInstanceAnalysis;
  }


}

