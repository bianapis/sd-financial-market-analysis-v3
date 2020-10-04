package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFinancialMarketInsightUpdateInputModel
 */
public class BQFinancialMarketInsightUpdateInputModel   {
  private String financialMarketAnalysisInstanceReference = null;

  private String financialMarketInsightInstanceReference = null;

  private String financialMarketInsightPreconditions = null;

  private String financialMarketInsightAnalysisSchedule = null;

  private String financialMarketInsightVersionNumber = null;

  private String financialMarketAnalysis = null;

  private String financialMarketAnalysisServiceType = null;

  private String financialMarketAnalysisServiceDescription = null;

  private String financialMarketAnalysisServiceInputsandOuputs = null;

  private String financialMarketAnalysisServiceWorkProduct = null;

  private Object financialMarketInsightUpdateActionTaskRecord = null;

  private String financialMarketInsightUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Financial Market Analysis instance 
   * @return financialMarketAnalysisInstanceReference
  **/

  public String getFinancialMarketAnalysisInstanceReference() {
    return financialMarketAnalysisInstanceReference;
  }

  public void setFinancialMarketAnalysisInstanceReference(String financialMarketAnalysisInstanceReference) {
    this.financialMarketAnalysisInstanceReference = financialMarketAnalysisInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Financial Market Insight instance 
   * @return financialMarketInsightInstanceReference
  **/

  public String getFinancialMarketInsightInstanceReference() {
    return financialMarketInsightInstanceReference;
  }

  public void setFinancialMarketInsightInstanceReference(String financialMarketInsightInstanceReference) {
    this.financialMarketInsightInstanceReference = financialMarketInsightInstanceReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return financialMarketInsightUpdateActionTaskRecord
  **/

  public Object getFinancialMarketInsightUpdateActionTaskRecord() {
    return financialMarketInsightUpdateActionTaskRecord;
  }

  public void setFinancialMarketInsightUpdateActionTaskRecord(Object financialMarketInsightUpdateActionTaskRecord) {
    this.financialMarketInsightUpdateActionTaskRecord = financialMarketInsightUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return financialMarketInsightUpdateActionRequest
  **/

  public String getFinancialMarketInsightUpdateActionRequest() {
    return financialMarketInsightUpdateActionRequest;
  }

  public void setFinancialMarketInsightUpdateActionRequest(String financialMarketInsightUpdateActionRequest) {
    this.financialMarketInsightUpdateActionRequest = financialMarketInsightUpdateActionRequest;
  }


}

