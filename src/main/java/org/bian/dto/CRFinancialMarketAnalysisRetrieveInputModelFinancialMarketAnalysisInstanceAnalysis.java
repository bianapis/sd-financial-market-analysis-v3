package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketAnalysisRetrieveInputModelFinancialMarketAnalysisInstanceAnalysis
 */
public class CRFinancialMarketAnalysisRetrieveInputModelFinancialMarketAnalysisInstanceAnalysis   {
  private String financialMarketAnalysisInstanceAnalysisReference = null;

  private String financialMarketAnalysisInstanceAnalysisReportType = null;

  private String financialMarketAnalysisInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return financialMarketAnalysisInstanceAnalysisReference
  **/

  public String getFinancialMarketAnalysisInstanceAnalysisReference() {
    return financialMarketAnalysisInstanceAnalysisReference;
  }

  public void setFinancialMarketAnalysisInstanceAnalysisReference(String financialMarketAnalysisInstanceAnalysisReference) {
    this.financialMarketAnalysisInstanceAnalysisReference = financialMarketAnalysisInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return financialMarketAnalysisInstanceAnalysisReportType
  **/

  public String getFinancialMarketAnalysisInstanceAnalysisReportType() {
    return financialMarketAnalysisInstanceAnalysisReportType;
  }

  public void setFinancialMarketAnalysisInstanceAnalysisReportType(String financialMarketAnalysisInstanceAnalysisReportType) {
    this.financialMarketAnalysisInstanceAnalysisReportType = financialMarketAnalysisInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return financialMarketAnalysisInstanceAnalysisParameters
  **/

  public String getFinancialMarketAnalysisInstanceAnalysisParameters() {
    return financialMarketAnalysisInstanceAnalysisParameters;
  }

  public void setFinancialMarketAnalysisInstanceAnalysisParameters(String financialMarketAnalysisInstanceAnalysisParameters) {
    this.financialMarketAnalysisInstanceAnalysisParameters = financialMarketAnalysisInstanceAnalysisParameters;
  }


}

