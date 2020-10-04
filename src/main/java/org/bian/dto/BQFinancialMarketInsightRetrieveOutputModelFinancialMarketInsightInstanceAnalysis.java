package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFinancialMarketInsightRetrieveOutputModelFinancialMarketInsightInstanceAnalysis
 */
public class BQFinancialMarketInsightRetrieveOutputModelFinancialMarketInsightInstanceAnalysis   {
  private Object financialMarketInsightInstanceAnalysisRecord = null;

  private String financialMarketInsightInstanceAnalysisReportType = null;

  private String financialMarketInsightInstanceAnalysisParameters = null;

  private Object financialMarketInsightInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return financialMarketInsightInstanceAnalysisRecord
  **/

  public Object getFinancialMarketInsightInstanceAnalysisRecord() {
    return financialMarketInsightInstanceAnalysisRecord;
  }

  public void setFinancialMarketInsightInstanceAnalysisRecord(Object financialMarketInsightInstanceAnalysisRecord) {
    this.financialMarketInsightInstanceAnalysisRecord = financialMarketInsightInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return financialMarketInsightInstanceAnalysisReportType
  **/

  public String getFinancialMarketInsightInstanceAnalysisReportType() {
    return financialMarketInsightInstanceAnalysisReportType;
  }

  public void setFinancialMarketInsightInstanceAnalysisReportType(String financialMarketInsightInstanceAnalysisReportType) {
    this.financialMarketInsightInstanceAnalysisReportType = financialMarketInsightInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return financialMarketInsightInstanceAnalysisParameters
  **/

  public String getFinancialMarketInsightInstanceAnalysisParameters() {
    return financialMarketInsightInstanceAnalysisParameters;
  }

  public void setFinancialMarketInsightInstanceAnalysisParameters(String financialMarketInsightInstanceAnalysisParameters) {
    this.financialMarketInsightInstanceAnalysisParameters = financialMarketInsightInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return financialMarketInsightInstanceAnalysisReport
  **/

  public Object getFinancialMarketInsightInstanceAnalysisReport() {
    return financialMarketInsightInstanceAnalysisReport;
  }

  public void setFinancialMarketInsightInstanceAnalysisReport(Object financialMarketInsightInstanceAnalysisReport) {
    this.financialMarketInsightInstanceAnalysisReport = financialMarketInsightInstanceAnalysisReport;
  }


}

