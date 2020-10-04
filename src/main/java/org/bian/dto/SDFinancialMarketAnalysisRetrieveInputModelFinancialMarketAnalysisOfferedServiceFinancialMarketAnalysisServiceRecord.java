package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDFinancialMarketAnalysisRetrieveInputModelFinancialMarketAnalysisOfferedServiceFinancialMarketAnalysisServiceRecord
 */
public class SDFinancialMarketAnalysisRetrieveInputModelFinancialMarketAnalysisOfferedServiceFinancialMarketAnalysisServiceRecord   {
  private String financialMarketAnalysisServiceVersion = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return financialMarketAnalysisServiceVersion
  **/

  public String getFinancialMarketAnalysisServiceVersion() {
    return financialMarketAnalysisServiceVersion;
  }

  public void setFinancialMarketAnalysisServiceVersion(String financialMarketAnalysisServiceVersion) {
    this.financialMarketAnalysisServiceVersion = financialMarketAnalysisServiceVersion;
  }


}

