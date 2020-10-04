package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDFinancialMarketAnalysisActivateInputModelFinancialMarketAnalysisServiceConfigurationRecordFinancialMarketAnalysisServiceConfigurationSetup;

import javax.validation.Valid;
  
/**
 * SDFinancialMarketAnalysisActivateInputModelFinancialMarketAnalysisServiceConfigurationRecord
 */
public class SDFinancialMarketAnalysisActivateInputModelFinancialMarketAnalysisServiceConfigurationRecord   {
  private String financialMarketAnalysisServiceConfigurationSettingReference = null;

  private String financialMarketAnalysisServiceConfigurationSettingType = null;

  private SDFinancialMarketAnalysisActivateInputModelFinancialMarketAnalysisServiceConfigurationRecordFinancialMarketAnalysisServiceConfigurationSetup financialMarketAnalysisServiceConfigurationSetup = null;


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

  public SDFinancialMarketAnalysisActivateInputModelFinancialMarketAnalysisServiceConfigurationRecordFinancialMarketAnalysisServiceConfigurationSetup getFinancialMarketAnalysisServiceConfigurationSetup() {
    return financialMarketAnalysisServiceConfigurationSetup;
  }

  public void setFinancialMarketAnalysisServiceConfigurationSetup(SDFinancialMarketAnalysisActivateInputModelFinancialMarketAnalysisServiceConfigurationRecordFinancialMarketAnalysisServiceConfigurationSetup financialMarketAnalysisServiceConfigurationSetup) {
    this.financialMarketAnalysisServiceConfigurationSetup = financialMarketAnalysisServiceConfigurationSetup;
  }


}

