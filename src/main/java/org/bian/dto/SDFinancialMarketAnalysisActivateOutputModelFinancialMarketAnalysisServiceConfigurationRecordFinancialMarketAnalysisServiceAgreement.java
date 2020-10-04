package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDFinancialMarketAnalysisActivateOutputModelFinancialMarketAnalysisServiceConfigurationRecordFinancialMarketAnalysisServiceAgreement
 */
public class SDFinancialMarketAnalysisActivateOutputModelFinancialMarketAnalysisServiceConfigurationRecordFinancialMarketAnalysisServiceAgreement   {
  private String financialMarketAnalysisServiceAgreementReference = null;

  private String financialMarketAnalysisServiceUserReference = null;

  private String financialMarketAnalysisServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return financialMarketAnalysisServiceAgreementReference
  **/

  public String getFinancialMarketAnalysisServiceAgreementReference() {
    return financialMarketAnalysisServiceAgreementReference;
  }

  public void setFinancialMarketAnalysisServiceAgreementReference(String financialMarketAnalysisServiceAgreementReference) {
    this.financialMarketAnalysisServiceAgreementReference = financialMarketAnalysisServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return financialMarketAnalysisServiceUserReference
  **/

  public String getFinancialMarketAnalysisServiceUserReference() {
    return financialMarketAnalysisServiceUserReference;
  }

  public void setFinancialMarketAnalysisServiceUserReference(String financialMarketAnalysisServiceUserReference) {
    this.financialMarketAnalysisServiceUserReference = financialMarketAnalysisServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return financialMarketAnalysisServiceAgreementTermsandConditions
  **/

  public String getFinancialMarketAnalysisServiceAgreementTermsandConditions() {
    return financialMarketAnalysisServiceAgreementTermsandConditions;
  }

  public void setFinancialMarketAnalysisServiceAgreementTermsandConditions(String financialMarketAnalysisServiceAgreementTermsandConditions) {
    this.financialMarketAnalysisServiceAgreementTermsandConditions = financialMarketAnalysisServiceAgreementTermsandConditions;
  }


}

