package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDFinancialMarketAnalysisActivateOutputModelFinancialMarketAnalysisServiceConfigurationRecordFinancialMarketAnalysisServiceSubscription
 */
public class SDFinancialMarketAnalysisActivateOutputModelFinancialMarketAnalysisServiceConfigurationRecordFinancialMarketAnalysisServiceSubscription   {
  private String financialMarketAnalysisServiceSubscriberReference = null;

  private String financialMarketAnalysisServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return financialMarketAnalysisServiceSubscriberReference
  **/

  public String getFinancialMarketAnalysisServiceSubscriberReference() {
    return financialMarketAnalysisServiceSubscriberReference;
  }

  public void setFinancialMarketAnalysisServiceSubscriberReference(String financialMarketAnalysisServiceSubscriberReference) {
    this.financialMarketAnalysisServiceSubscriberReference = financialMarketAnalysisServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return financialMarketAnalysisServiceSubscriberAccessProfile
  **/

  public String getFinancialMarketAnalysisServiceSubscriberAccessProfile() {
    return financialMarketAnalysisServiceSubscriberAccessProfile;
  }

  public void setFinancialMarketAnalysisServiceSubscriberAccessProfile(String financialMarketAnalysisServiceSubscriberAccessProfile) {
    this.financialMarketAnalysisServiceSubscriberAccessProfile = financialMarketAnalysisServiceSubscriberAccessProfile;
  }


}

