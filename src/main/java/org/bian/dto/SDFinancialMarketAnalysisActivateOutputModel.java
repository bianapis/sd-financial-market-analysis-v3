package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDFinancialMarketAnalysisActivateOutputModelFinancialMarketAnalysisServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDFinancialMarketAnalysisActivateOutputModel
 */
public class SDFinancialMarketAnalysisActivateOutputModel   {
  private String financialMarketAnalysisActivationActionTaskReference = null;

  private Object financialMarketAnalysisActivationActionTaskRecord = null;

  private String financialMarketAnalysisServicingSessionReference = null;

  private Object financialMarketAnalysisServicingSessionRecord = null;

  private SDFinancialMarketAnalysisActivateOutputModelFinancialMarketAnalysisServiceConfigurationRecord financialMarketAnalysisServiceConfigurationRecord = null;

  private String financialMarketAnalysisServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return financialMarketAnalysisActivationActionTaskReference
  **/

  public String getFinancialMarketAnalysisActivationActionTaskReference() {
    return financialMarketAnalysisActivationActionTaskReference;
  }

  public void setFinancialMarketAnalysisActivationActionTaskReference(String financialMarketAnalysisActivationActionTaskReference) {
    this.financialMarketAnalysisActivationActionTaskReference = financialMarketAnalysisActivationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return financialMarketAnalysisActivationActionTaskRecord
  **/

  public Object getFinancialMarketAnalysisActivationActionTaskRecord() {
    return financialMarketAnalysisActivationActionTaskRecord;
  }

  public void setFinancialMarketAnalysisActivationActionTaskRecord(Object financialMarketAnalysisActivationActionTaskRecord) {
    this.financialMarketAnalysisActivationActionTaskRecord = financialMarketAnalysisActivationActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return financialMarketAnalysisServicingSessionReference
  **/

  public String getFinancialMarketAnalysisServicingSessionReference() {
    return financialMarketAnalysisServicingSessionReference;
  }

  public void setFinancialMarketAnalysisServicingSessionReference(String financialMarketAnalysisServicingSessionReference) {
    this.financialMarketAnalysisServicingSessionReference = financialMarketAnalysisServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return financialMarketAnalysisServicingSessionRecord
  **/

  public Object getFinancialMarketAnalysisServicingSessionRecord() {
    return financialMarketAnalysisServicingSessionRecord;
  }

  public void setFinancialMarketAnalysisServicingSessionRecord(Object financialMarketAnalysisServicingSessionRecord) {
    this.financialMarketAnalysisServicingSessionRecord = financialMarketAnalysisServicingSessionRecord;
  }


  /**
   * Get financialMarketAnalysisServiceConfigurationRecord
   * @return financialMarketAnalysisServiceConfigurationRecord
  **/

  public SDFinancialMarketAnalysisActivateOutputModelFinancialMarketAnalysisServiceConfigurationRecord getFinancialMarketAnalysisServiceConfigurationRecord() {
    return financialMarketAnalysisServiceConfigurationRecord;
  }

  public void setFinancialMarketAnalysisServiceConfigurationRecord(SDFinancialMarketAnalysisActivateOutputModelFinancialMarketAnalysisServiceConfigurationRecord financialMarketAnalysisServiceConfigurationRecord) {
    this.financialMarketAnalysisServiceConfigurationRecord = financialMarketAnalysisServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return financialMarketAnalysisServicingSessionStatus
  **/

  public String getFinancialMarketAnalysisServicingSessionStatus() {
    return financialMarketAnalysisServicingSessionStatus;
  }

  public void setFinancialMarketAnalysisServicingSessionStatus(String financialMarketAnalysisServicingSessionStatus) {
    this.financialMarketAnalysisServicingSessionStatus = financialMarketAnalysisServicingSessionStatus;
  }


}

