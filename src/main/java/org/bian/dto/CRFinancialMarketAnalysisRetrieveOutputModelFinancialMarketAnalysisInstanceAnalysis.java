package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketAnalysisRetrieveOutputModelFinancialMarketAnalysisInstanceAnalysis
 */
public class CRFinancialMarketAnalysisRetrieveOutputModelFinancialMarketAnalysisInstanceAnalysis   {
  private String financialMarketAnalysisInstanceAnalysisData = null;

  private String financialMarketAnalysisInstanceAnalysisReportType = null;

  private Object financialMarketAnalysisInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return financialMarketAnalysisInstanceAnalysisData
  **/

  public String getFinancialMarketAnalysisInstanceAnalysisData() {
    return financialMarketAnalysisInstanceAnalysisData;
  }

  public void setFinancialMarketAnalysisInstanceAnalysisData(String financialMarketAnalysisInstanceAnalysisData) {
    this.financialMarketAnalysisInstanceAnalysisData = financialMarketAnalysisInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return financialMarketAnalysisInstanceAnalysisReport
  **/

  public Object getFinancialMarketAnalysisInstanceAnalysisReport() {
    return financialMarketAnalysisInstanceAnalysisReport;
  }

  public void setFinancialMarketAnalysisInstanceAnalysisReport(Object financialMarketAnalysisInstanceAnalysisReport) {
    this.financialMarketAnalysisInstanceAnalysisReport = financialMarketAnalysisInstanceAnalysisReport;
  }


}

