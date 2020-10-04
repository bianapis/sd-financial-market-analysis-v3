package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDFinancialMarketAnalysisConfigureInputModelFinancialMarketAnalysisServiceConfigurationRecordFinancialMarketAnalysisServiceConfigurationSetup
 */
public class SDFinancialMarketAnalysisConfigureInputModelFinancialMarketAnalysisServiceConfigurationRecordFinancialMarketAnalysisServiceConfigurationSetup   {
  private String financialMarketAnalysisServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The requested and current activation values for the service configuration parameter  
   * @return financialMarketAnalysisServiceConfigurationParameter
  **/

  public String getFinancialMarketAnalysisServiceConfigurationParameter() {
    return financialMarketAnalysisServiceConfigurationParameter;
  }

  public void setFinancialMarketAnalysisServiceConfigurationParameter(String financialMarketAnalysisServiceConfigurationParameter) {
    this.financialMarketAnalysisServiceConfigurationParameter = financialMarketAnalysisServiceConfigurationParameter;
  }


}

