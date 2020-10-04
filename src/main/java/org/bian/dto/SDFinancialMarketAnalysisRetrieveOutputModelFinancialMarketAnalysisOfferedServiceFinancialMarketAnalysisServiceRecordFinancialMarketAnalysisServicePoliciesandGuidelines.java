package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDFinancialMarketAnalysisRetrieveOutputModelFinancialMarketAnalysisOfferedServiceFinancialMarketAnalysisServiceRecordFinancialMarketAnalysisServicePoliciesandGuidelines
 */
public class SDFinancialMarketAnalysisRetrieveOutputModelFinancialMarketAnalysisOfferedServiceFinancialMarketAnalysisServiceRecordFinancialMarketAnalysisServicePoliciesandGuidelines   {
  private String financialMarketAnalysisServiceEligibility = null;

  private String financialMarketAnalysisServiceIntendedUses = null;

  private String financialMarketAnalysisServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return financialMarketAnalysisServiceEligibility
  **/

  public String getFinancialMarketAnalysisServiceEligibility() {
    return financialMarketAnalysisServiceEligibility;
  }

  public void setFinancialMarketAnalysisServiceEligibility(String financialMarketAnalysisServiceEligibility) {
    this.financialMarketAnalysisServiceEligibility = financialMarketAnalysisServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return financialMarketAnalysisServiceIntendedUses
  **/

  public String getFinancialMarketAnalysisServiceIntendedUses() {
    return financialMarketAnalysisServiceIntendedUses;
  }

  public void setFinancialMarketAnalysisServiceIntendedUses(String financialMarketAnalysisServiceIntendedUses) {
    this.financialMarketAnalysisServiceIntendedUses = financialMarketAnalysisServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return financialMarketAnalysisServicePricingandTerms
  **/

  public String getFinancialMarketAnalysisServicePricingandTerms() {
    return financialMarketAnalysisServicePricingandTerms;
  }

  public void setFinancialMarketAnalysisServicePricingandTerms(String financialMarketAnalysisServicePricingandTerms) {
    this.financialMarketAnalysisServicePricingandTerms = financialMarketAnalysisServicePricingandTerms;
  }


}

