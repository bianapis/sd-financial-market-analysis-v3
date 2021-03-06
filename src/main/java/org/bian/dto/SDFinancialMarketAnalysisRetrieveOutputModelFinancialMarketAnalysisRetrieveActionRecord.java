package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDFinancialMarketAnalysisRetrieveOutputModelFinancialMarketAnalysisRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDFinancialMarketAnalysisRetrieveOutputModelFinancialMarketAnalysisRetrieveActionRecordFinancialMarketAnalysisActivityAnalysis;
import org.bian.dto.SDFinancialMarketAnalysisRetrieveOutputModelFinancialMarketAnalysisRetrieveActionRecordFinancialMarketAnalysisPerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDFinancialMarketAnalysisRetrieveOutputModelFinancialMarketAnalysisRetrieveActionRecord
 */
public class SDFinancialMarketAnalysisRetrieveOutputModelFinancialMarketAnalysisRetrieveActionRecord   {
  private SDFinancialMarketAnalysisRetrieveOutputModelFinancialMarketAnalysisRetrieveActionRecordFinancialMarketAnalysisActivityAnalysis financialMarketAnalysisActivityAnalysis = null;

  private SDFinancialMarketAnalysisRetrieveOutputModelFinancialMarketAnalysisRetrieveActionRecordFinancialMarketAnalysisPerformanceAnalysis financialMarketAnalysisPerformanceAnalysis = null;

  private SDFinancialMarketAnalysisRetrieveOutputModelFinancialMarketAnalysisRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get financialMarketAnalysisActivityAnalysis
   * @return financialMarketAnalysisActivityAnalysis
  **/

  public SDFinancialMarketAnalysisRetrieveOutputModelFinancialMarketAnalysisRetrieveActionRecordFinancialMarketAnalysisActivityAnalysis getFinancialMarketAnalysisActivityAnalysis() {
    return financialMarketAnalysisActivityAnalysis;
  }

  public void setFinancialMarketAnalysisActivityAnalysis(SDFinancialMarketAnalysisRetrieveOutputModelFinancialMarketAnalysisRetrieveActionRecordFinancialMarketAnalysisActivityAnalysis financialMarketAnalysisActivityAnalysis) {
    this.financialMarketAnalysisActivityAnalysis = financialMarketAnalysisActivityAnalysis;
  }


  /**
   * Get financialMarketAnalysisPerformanceAnalysis
   * @return financialMarketAnalysisPerformanceAnalysis
  **/

  public SDFinancialMarketAnalysisRetrieveOutputModelFinancialMarketAnalysisRetrieveActionRecordFinancialMarketAnalysisPerformanceAnalysis getFinancialMarketAnalysisPerformanceAnalysis() {
    return financialMarketAnalysisPerformanceAnalysis;
  }

  public void setFinancialMarketAnalysisPerformanceAnalysis(SDFinancialMarketAnalysisRetrieveOutputModelFinancialMarketAnalysisRetrieveActionRecordFinancialMarketAnalysisPerformanceAnalysis financialMarketAnalysisPerformanceAnalysis) {
    this.financialMarketAnalysisPerformanceAnalysis = financialMarketAnalysisPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDFinancialMarketAnalysisRetrieveOutputModelFinancialMarketAnalysisRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDFinancialMarketAnalysisRetrieveOutputModelFinancialMarketAnalysisRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

