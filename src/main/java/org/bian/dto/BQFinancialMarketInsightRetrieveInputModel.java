package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFinancialMarketInsightRetrieveInputModelFinancialMarketInsightInstanceAnalysis;
import org.bian.dto.BQFinancialMarketInsightRetrieveInputModelFinancialMarketInsightInstanceReport;

import javax.validation.Valid;
  
/**
 * BQFinancialMarketInsightRetrieveInputModel
 */
public class BQFinancialMarketInsightRetrieveInputModel   {
  private Object financialMarketInsightRetrieveActionTaskRecord = null;

  private String financialMarketInsightRetrieveActionRequest = null;

  private BQFinancialMarketInsightRetrieveInputModelFinancialMarketInsightInstanceReport financialMarketInsightInstanceReport = null;

  private BQFinancialMarketInsightRetrieveInputModelFinancialMarketInsightInstanceAnalysis financialMarketInsightInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return financialMarketInsightRetrieveActionRequest
  **/

  public String getFinancialMarketInsightRetrieveActionRequest() {
    return financialMarketInsightRetrieveActionRequest;
  }

  public void setFinancialMarketInsightRetrieveActionRequest(String financialMarketInsightRetrieveActionRequest) {
    this.financialMarketInsightRetrieveActionRequest = financialMarketInsightRetrieveActionRequest;
  }


  /**
   * Get financialMarketInsightInstanceReport
   * @return financialMarketInsightInstanceReport
  **/

  public BQFinancialMarketInsightRetrieveInputModelFinancialMarketInsightInstanceReport getFinancialMarketInsightInstanceReport() {
    return financialMarketInsightInstanceReport;
  }

  public void setFinancialMarketInsightInstanceReport(BQFinancialMarketInsightRetrieveInputModelFinancialMarketInsightInstanceReport financialMarketInsightInstanceReport) {
    this.financialMarketInsightInstanceReport = financialMarketInsightInstanceReport;
  }


  /**
   * Get financialMarketInsightInstanceAnalysis
   * @return financialMarketInsightInstanceAnalysis
  **/

  public BQFinancialMarketInsightRetrieveInputModelFinancialMarketInsightInstanceAnalysis getFinancialMarketInsightInstanceAnalysis() {
    return financialMarketInsightInstanceAnalysis;
  }

  public void setFinancialMarketInsightInstanceAnalysis(BQFinancialMarketInsightRetrieveInputModelFinancialMarketInsightInstanceAnalysis financialMarketInsightInstanceAnalysis) {
    this.financialMarketInsightInstanceAnalysis = financialMarketInsightInstanceAnalysis;
  }


}

