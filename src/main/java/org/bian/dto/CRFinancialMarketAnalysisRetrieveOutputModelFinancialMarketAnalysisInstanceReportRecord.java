package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketAnalysisRetrieveOutputModelFinancialMarketAnalysisInstanceReportRecord
 */
public class CRFinancialMarketAnalysisRetrieveOutputModelFinancialMarketAnalysisInstanceReportRecord   {
  private String financialMarketAnalysisInstanceReportData = null;

  private String financialMarketAnalysisInstanceReportType = null;

  private Object financialMarketAnalysisInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return financialMarketAnalysisInstanceReportData
  **/

  public String getFinancialMarketAnalysisInstanceReportData() {
    return financialMarketAnalysisInstanceReportData;
  }

  public void setFinancialMarketAnalysisInstanceReportData(String financialMarketAnalysisInstanceReportData) {
    this.financialMarketAnalysisInstanceReportData = financialMarketAnalysisInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return financialMarketAnalysisInstanceReport
  **/

  public Object getFinancialMarketAnalysisInstanceReport() {
    return financialMarketAnalysisInstanceReport;
  }

  public void setFinancialMarketAnalysisInstanceReport(Object financialMarketAnalysisInstanceReport) {
    this.financialMarketAnalysisInstanceReport = financialMarketAnalysisInstanceReport;
  }


}

