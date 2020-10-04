package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDFinancialMarketAnalysisRetrieveOutputModelFinancialMarketAnalysisOfferedServiceFinancialMarketAnalysisServiceRecordFinancialMarketAnalysisServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDFinancialMarketAnalysisRetrieveOutputModelFinancialMarketAnalysisOfferedServiceFinancialMarketAnalysisServiceRecord
 */
public class SDFinancialMarketAnalysisRetrieveOutputModelFinancialMarketAnalysisOfferedServiceFinancialMarketAnalysisServiceRecord   {
  private String financialMarketAnalysisServiceType = null;

  private String financialMarketAnalysisServiceVersion = null;

  private String financialMarketAnalysisServiceDescription = null;

  private SDFinancialMarketAnalysisRetrieveOutputModelFinancialMarketAnalysisOfferedServiceFinancialMarketAnalysisServiceRecordFinancialMarketAnalysisServicePoliciesandGuidelines financialMarketAnalysisServicePoliciesandGuidelines = null;

  private String financialMarketAnalysisServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return financialMarketAnalysisServiceType
  **/

  public String getFinancialMarketAnalysisServiceType() {
    return financialMarketAnalysisServiceType;
  }

  public void setFinancialMarketAnalysisServiceType(String financialMarketAnalysisServiceType) {
    this.financialMarketAnalysisServiceType = financialMarketAnalysisServiceType;
  }


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return financialMarketAnalysisServiceDescription
  **/

  public String getFinancialMarketAnalysisServiceDescription() {
    return financialMarketAnalysisServiceDescription;
  }

  public void setFinancialMarketAnalysisServiceDescription(String financialMarketAnalysisServiceDescription) {
    this.financialMarketAnalysisServiceDescription = financialMarketAnalysisServiceDescription;
  }


  /**
   * Get financialMarketAnalysisServicePoliciesandGuidelines
   * @return financialMarketAnalysisServicePoliciesandGuidelines
  **/

  public SDFinancialMarketAnalysisRetrieveOutputModelFinancialMarketAnalysisOfferedServiceFinancialMarketAnalysisServiceRecordFinancialMarketAnalysisServicePoliciesandGuidelines getFinancialMarketAnalysisServicePoliciesandGuidelines() {
    return financialMarketAnalysisServicePoliciesandGuidelines;
  }

  public void setFinancialMarketAnalysisServicePoliciesandGuidelines(SDFinancialMarketAnalysisRetrieveOutputModelFinancialMarketAnalysisOfferedServiceFinancialMarketAnalysisServiceRecordFinancialMarketAnalysisServicePoliciesandGuidelines financialMarketAnalysisServicePoliciesandGuidelines) {
    this.financialMarketAnalysisServicePoliciesandGuidelines = financialMarketAnalysisServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return financialMarketAnalysisServiceSchedule
  **/

  public String getFinancialMarketAnalysisServiceSchedule() {
    return financialMarketAnalysisServiceSchedule;
  }

  public void setFinancialMarketAnalysisServiceSchedule(String financialMarketAnalysisServiceSchedule) {
    this.financialMarketAnalysisServiceSchedule = financialMarketAnalysisServiceSchedule;
  }


}

