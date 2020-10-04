package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDFinancialMarketAnalysisActivateInputModelFinancialMarketAnalysisServiceConfigurationRecordFinancialMarketAnalysisServiceConfigurationSetup;
import org.bian.dto.SDFinancialMarketAnalysisActivateOutputModelFinancialMarketAnalysisServiceConfigurationRecordFinancialMarketAnalysisServiceAgreement;
import org.bian.dto.SDFinancialMarketAnalysisActivateOutputModelFinancialMarketAnalysisServiceConfigurationRecordFinancialMarketAnalysisServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDFinancialMarketAnalysisActivateOutputModelFinancialMarketAnalysisServiceConfigurationRecord
 */
public class SDFinancialMarketAnalysisActivateOutputModelFinancialMarketAnalysisServiceConfigurationRecord   {
  private String financialMarketAnalysisServiceConfigurationSettingReference = null;

  private String financialMarketAnalysisServiceConfigurationSettingDescription = null;

  private SDFinancialMarketAnalysisActivateInputModelFinancialMarketAnalysisServiceConfigurationRecordFinancialMarketAnalysisServiceConfigurationSetup financialMarketAnalysisServiceConfigurationSetup = null;

  private SDFinancialMarketAnalysisActivateOutputModelFinancialMarketAnalysisServiceConfigurationRecordFinancialMarketAnalysisServiceSubscription financialMarketAnalysisServiceSubscription = null;

  private SDFinancialMarketAnalysisActivateOutputModelFinancialMarketAnalysisServiceConfigurationRecordFinancialMarketAnalysisServiceAgreement financialMarketAnalysisServiceAgreement = null;

  private String financialMarketAnalysisServiceStatus = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return financialMarketAnalysisServiceConfigurationSettingDescription
  **/

  public String getFinancialMarketAnalysisServiceConfigurationSettingDescription() {
    return financialMarketAnalysisServiceConfigurationSettingDescription;
  }

  public void setFinancialMarketAnalysisServiceConfigurationSettingDescription(String financialMarketAnalysisServiceConfigurationSettingDescription) {
    this.financialMarketAnalysisServiceConfigurationSettingDescription = financialMarketAnalysisServiceConfigurationSettingDescription;
  }


  /**
   * Get financialMarketAnalysisServiceConfigurationSetup
   * @return financialMarketAnalysisServiceConfigurationSetup
  **/

  public SDFinancialMarketAnalysisActivateInputModelFinancialMarketAnalysisServiceConfigurationRecordFinancialMarketAnalysisServiceConfigurationSetup getFinancialMarketAnalysisServiceConfigurationSetup() {
    return financialMarketAnalysisServiceConfigurationSetup;
  }

  public void setFinancialMarketAnalysisServiceConfigurationSetup(SDFinancialMarketAnalysisActivateInputModelFinancialMarketAnalysisServiceConfigurationRecordFinancialMarketAnalysisServiceConfigurationSetup financialMarketAnalysisServiceConfigurationSetup) {
    this.financialMarketAnalysisServiceConfigurationSetup = financialMarketAnalysisServiceConfigurationSetup;
  }


  /**
   * Get financialMarketAnalysisServiceSubscription
   * @return financialMarketAnalysisServiceSubscription
  **/

  public SDFinancialMarketAnalysisActivateOutputModelFinancialMarketAnalysisServiceConfigurationRecordFinancialMarketAnalysisServiceSubscription getFinancialMarketAnalysisServiceSubscription() {
    return financialMarketAnalysisServiceSubscription;
  }

  public void setFinancialMarketAnalysisServiceSubscription(SDFinancialMarketAnalysisActivateOutputModelFinancialMarketAnalysisServiceConfigurationRecordFinancialMarketAnalysisServiceSubscription financialMarketAnalysisServiceSubscription) {
    this.financialMarketAnalysisServiceSubscription = financialMarketAnalysisServiceSubscription;
  }


  /**
   * Get financialMarketAnalysisServiceAgreement
   * @return financialMarketAnalysisServiceAgreement
  **/

  public SDFinancialMarketAnalysisActivateOutputModelFinancialMarketAnalysisServiceConfigurationRecordFinancialMarketAnalysisServiceAgreement getFinancialMarketAnalysisServiceAgreement() {
    return financialMarketAnalysisServiceAgreement;
  }

  public void setFinancialMarketAnalysisServiceAgreement(SDFinancialMarketAnalysisActivateOutputModelFinancialMarketAnalysisServiceConfigurationRecordFinancialMarketAnalysisServiceAgreement financialMarketAnalysisServiceAgreement) {
    this.financialMarketAnalysisServiceAgreement = financialMarketAnalysisServiceAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return financialMarketAnalysisServiceStatus
  **/

  public String getFinancialMarketAnalysisServiceStatus() {
    return financialMarketAnalysisServiceStatus;
  }

  public void setFinancialMarketAnalysisServiceStatus(String financialMarketAnalysisServiceStatus) {
    this.financialMarketAnalysisServiceStatus = financialMarketAnalysisServiceStatus;
  }


}

