package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketAnalysisRetrieveInputModelFinancialMarketAnalysisInstanceReportRecord
 */
public class CRFinancialMarketAnalysisRetrieveInputModelFinancialMarketAnalysisInstanceReportRecord   {
  private String financialMarketAnalysisInstanceReportReference = null;

  private String financialMarketAnalysisInstanceReportType = null;

  private String financialMarketAnalysisInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return financialMarketAnalysisInstanceReportReference
  **/

  public String getFinancialMarketAnalysisInstanceReportReference() {
    return financialMarketAnalysisInstanceReportReference;
  }

  public void setFinancialMarketAnalysisInstanceReportReference(String financialMarketAnalysisInstanceReportReference) {
    this.financialMarketAnalysisInstanceReportReference = financialMarketAnalysisInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return financialMarketAnalysisInstanceReportType
  **/

  public String getFinancialMarketAnalysisInstanceReportType() {
    return financialMarketAnalysisInstanceReportType;
  }

  public void setFinancialMarketAnalysisInstanceReportType(String financialMarketAnalysisInstanceReportType) {
    this.financialMarketAnalysisInstanceReportType = financialMarketAnalysisInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return financialMarketAnalysisInstanceReportParameters
  **/

  public String getFinancialMarketAnalysisInstanceReportParameters() {
    return financialMarketAnalysisInstanceReportParameters;
  }

  public void setFinancialMarketAnalysisInstanceReportParameters(String financialMarketAnalysisInstanceReportParameters) {
    this.financialMarketAnalysisInstanceReportParameters = financialMarketAnalysisInstanceReportParameters;
  }


}

