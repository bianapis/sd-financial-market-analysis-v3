package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialMarketAnalysisRetrieveInputModelFinancialMarketAnalysisInstanceAnalysis;
import org.bian.dto.CRFinancialMarketAnalysisRetrieveInputModelFinancialMarketAnalysisInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketAnalysisRetrieveInputModel
 */
public class CRFinancialMarketAnalysisRetrieveInputModel   {
  private Object financialMarketAnalysisRetrieveActionTaskRecord = null;

  private String financialMarketAnalysisRetrieveActionRequest = null;

  private CRFinancialMarketAnalysisRetrieveInputModelFinancialMarketAnalysisInstanceReportRecord financialMarketAnalysisInstanceReportRecord = null;

  private CRFinancialMarketAnalysisRetrieveInputModelFinancialMarketAnalysisInstanceAnalysis financialMarketAnalysisInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return financialMarketAnalysisRetrieveActionTaskRecord
  **/

  public Object getFinancialMarketAnalysisRetrieveActionTaskRecord() {
    return financialMarketAnalysisRetrieveActionTaskRecord;
  }

  public void setFinancialMarketAnalysisRetrieveActionTaskRecord(Object financialMarketAnalysisRetrieveActionTaskRecord) {
    this.financialMarketAnalysisRetrieveActionTaskRecord = financialMarketAnalysisRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return financialMarketAnalysisRetrieveActionRequest
  **/

  public String getFinancialMarketAnalysisRetrieveActionRequest() {
    return financialMarketAnalysisRetrieveActionRequest;
  }

  public void setFinancialMarketAnalysisRetrieveActionRequest(String financialMarketAnalysisRetrieveActionRequest) {
    this.financialMarketAnalysisRetrieveActionRequest = financialMarketAnalysisRetrieveActionRequest;
  }


  /**
   * Get financialMarketAnalysisInstanceReportRecord
   * @return financialMarketAnalysisInstanceReportRecord
  **/

  public CRFinancialMarketAnalysisRetrieveInputModelFinancialMarketAnalysisInstanceReportRecord getFinancialMarketAnalysisInstanceReportRecord() {
    return financialMarketAnalysisInstanceReportRecord;
  }

  public void setFinancialMarketAnalysisInstanceReportRecord(CRFinancialMarketAnalysisRetrieveInputModelFinancialMarketAnalysisInstanceReportRecord financialMarketAnalysisInstanceReportRecord) {
    this.financialMarketAnalysisInstanceReportRecord = financialMarketAnalysisInstanceReportRecord;
  }


  /**
   * Get financialMarketAnalysisInstanceAnalysis
   * @return financialMarketAnalysisInstanceAnalysis
  **/

  public CRFinancialMarketAnalysisRetrieveInputModelFinancialMarketAnalysisInstanceAnalysis getFinancialMarketAnalysisInstanceAnalysis() {
    return financialMarketAnalysisInstanceAnalysis;
  }

  public void setFinancialMarketAnalysisInstanceAnalysis(CRFinancialMarketAnalysisRetrieveInputModelFinancialMarketAnalysisInstanceAnalysis financialMarketAnalysisInstanceAnalysis) {
    this.financialMarketAnalysisInstanceAnalysis = financialMarketAnalysisInstanceAnalysis;
  }


}

