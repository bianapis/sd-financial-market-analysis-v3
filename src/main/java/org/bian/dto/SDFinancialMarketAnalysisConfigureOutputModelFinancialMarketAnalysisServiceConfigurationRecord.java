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
 * SDFinancialMarketAnalysisConfigureOutputModelFinancialMarketAnalysisServiceConfigurationRecord
 */
public class SDFinancialMarketAnalysisConfigureOutputModelFinancialMarketAnalysisServiceConfigurationRecord   {
  private String financialMarketAnalysisServiceConfigurationSettingDescription = null;

  private SDFinancialMarketAnalysisConfigureInputModelFinancialMarketAnalysisServiceConfigurationRecordFinancialMarketAnalysisServiceConfigurationSetup financialMarketAnalysisServiceConfigurationSetup = null;

  private SDFinancialMarketAnalysisConfigureInputModelFinancialMarketAnalysisServiceConfigurationRecordFinancialMarketAnalysisServiceSubscription financialMarketAnalysisServiceSubscription = null;

  private SDFinancialMarketAnalysisConfigureInputModelFinancialMarketAnalysisServiceConfigurationRecordFinancialMarketAnalysisServiceAgreement financialMarketAnalysisServiceAgreement = null;

  private String financialMarketAnalysisServiceStatus = null;


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

