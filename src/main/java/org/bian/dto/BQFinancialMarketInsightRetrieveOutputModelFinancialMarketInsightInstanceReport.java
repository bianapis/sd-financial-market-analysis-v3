package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFinancialMarketInsightRetrieveOutputModelFinancialMarketInsightInstanceReport
 */
public class BQFinancialMarketInsightRetrieveOutputModelFinancialMarketInsightInstanceReport   {
  private Object financialMarketInsightInstanceReportRecord = null;

  private String financialMarketInsightInstanceReportType = null;

  private String financialMarketInsightInstanceReportParameters = null;

  private Object financialMarketInsightInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return financialMarketInsightInstanceReportRecord
  **/

  public Object getFinancialMarketInsightInstanceReportRecord() {
    return financialMarketInsightInstanceReportRecord;
  }

  public void setFinancialMarketInsightInstanceReportRecord(Object financialMarketInsightInstanceReportRecord) {
    this.financialMarketInsightInstanceReportRecord = financialMarketInsightInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return financialMarketInsightInstanceReportType
  **/

  public String getFinancialMarketInsightInstanceReportType() {
    return financialMarketInsightInstanceReportType;
  }

  public void setFinancialMarketInsightInstanceReportType(String financialMarketInsightInstanceReportType) {
    this.financialMarketInsightInstanceReportType = financialMarketInsightInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return financialMarketInsightInstanceReportParameters
  **/

  public String getFinancialMarketInsightInstanceReportParameters() {
    return financialMarketInsightInstanceReportParameters;
  }

  public void setFinancialMarketInsightInstanceReportParameters(String financialMarketInsightInstanceReportParameters) {
    this.financialMarketInsightInstanceReportParameters = financialMarketInsightInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return financialMarketInsightInstanceReport
  **/

  public Object getFinancialMarketInsightInstanceReport() {
    return financialMarketInsightInstanceReport;
  }

  public void setFinancialMarketInsightInstanceReport(Object financialMarketInsightInstanceReport) {
    this.financialMarketInsightInstanceReport = financialMarketInsightInstanceReport;
  }


}

