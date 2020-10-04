package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDFinancialMarketAnalysisConfigureInputModelFinancialMarketAnalysisServiceConfigurationRecordFinancialMarketAnalysisServiceAgreement;
import org.bian.dto.SDFinancialMarketAnalysisConfigureInputModelFinancialMarketAnalysisServiceConfigurationRecordFinancialMarketAnalysisServiceConfigurationSetup;
import org.bian.dto.SDFinancialMarketAnalysisConfigureInputModelFinancialMarketAnalysisServiceConfigurationRecordFinancialMarketAnalysisServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDFinancialMarketAnalysisConfigureInputModelFinancialMarketAnalysisServiceConfigurationRecord
 */
public class SDFinancialMarketAnalysisConfigureInputModelFinancialMarketAnalysisServiceConfigurationRecord   {
  private String financialMarketAnalysisServiceConfigurationSettingReference = null;

  private String financialMarketAnalysisServiceConfigurationSettingType = null;

  private SDFinancialMarketAnalysisConfigureInputModelFinancialMarketAnalysisServiceConfigurationRecordFinancialMarketAnalysisServiceConfigurationSetup financialMarketAnalysisServiceConfigurationSetup = null;

  private SDFinancialMarketAnalysisConfigureInputModelFinancialMarketAnalysisServiceConfigurationRecordFinancialMarketAnalysisServiceSubscription financialMarketAnalysisServiceSubscription = null;

  private SDFinancialMarketAnalysisConfigureInputModelFinancialMarketAnalysisServiceConfigurationRecordFinancialMarketAnalysisServiceAgreement financialMarketAnalysisServiceAgreement = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return financialMarketAnalysisServiceConfigurationSettingReference
  **/

  public String getFinancialMarketAnalysisServiceConfigurationSettingReference() {
    return financialMarketAnalysisServiceConfigurationSettingReference;
  }

  public void setFinancialMarketAnalysisServiceConfigurationSettingReference(String financialMarketAnalysisServiceConfigurationSettingReference) {
    this.financialMarketAnalysisServiceConfigurationSettingReference = financialMarketAnalysisServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return financialMarketAnalysisServiceConfigurationSettingType
  **/

  public String getFinancialMarketAnalysisServiceConfigurationSettingType() {
    return financialMarketAnalysisServiceConfigurationSettingType;
  }

  public void setFinancialMarketAnalysisServiceConfigurationSettingType(String financialMarketAnalysisServiceConfigurationSettingType) {
    this.financialMarketAnalysisServiceConfigurationSettingType = financialMarketAnalysisServiceConfigurationSettingType;
  }


  /**
   * Get financialMarketAnalysisServiceConfigurationSetup
   * @return financialMarketAnalysisServiceConfigurationSetup
  **/

  public SDFinancialMarketAnalysisConfigureInputModelFinancialMarketAnalysisServiceConfigurationRecordFinancialMarketAnalysisServiceConfigurationSetup getFinancialMarketAnalysisServiceConfigurationSetup() {
    return financialMarketAnalysisServiceConfigurationSetup;
  }

  public void setFinancialMarketAnalysisServiceConfigurationSetup(SDFinancialMarketAnalysisConfigureInputModelFinancialMarketAnalysisServiceConfigurationRecordFinancialMarketAnalysisServiceConfigurationSetup financialMarketAnalysisServiceConfigurationSetup) {
    this.financialMarketAnalysisServiceConfigurationSetup = financialMarketAnalysisServiceConfigurationSetup;
  }


  /**
   * Get financialMarketAnalysisServiceSubscription
   * @return financialMarketAnalysisServiceSubscription
  **/

  public SDFinancialMarketAnalysisConfigureInputModelFinancialMarketAnalysisServiceConfigurationRecordFinancialMarketAnalysisServiceSubscription getFinancialMarketAnalysisServiceSubscription() {
    return financialMarketAnalysisServiceSubscription;
  }

  public void setFinancialMarketAnalysisServiceSubscription(SDFinancialMarketAnalysisConfigureInputModelFinancialMarketAnalysisServiceConfigurationRecordFinancialMarketAnalysisServiceSubscription financialMarketAnalysisServiceSubscription) {
    this.financialMarketAnalysisServiceSubscription = financialMarketAnalysisServiceSubscription;
  }


  /**
   * Get financialMarketAnalysisServiceAgreement
   * @return financialMarketAnalysisServiceAgreement
  **/

  public SDFinancialMarketAnalysisConfigureInputModelFinancialMarketAnalysisServiceConfigurationRecordFinancialMarketAnalysisServiceAgreement getFinancialMarketAnalysisServiceAgreement() {
    return financialMarketAnalysisServiceAgreement;
  }

  public void setFinancialMarketAnalysisServiceAgreement(SDFinancialMarketAnalysisConfigureInputModelFinancialMarketAnalysisServiceConfigurationRecordFinancialMarketAnalysisServiceAgreement financialMarketAnalysisServiceAgreement) {
    this.financialMarketAnalysisServiceAgreement = financialMarketAnalysisServiceAgreement;
  }


}

