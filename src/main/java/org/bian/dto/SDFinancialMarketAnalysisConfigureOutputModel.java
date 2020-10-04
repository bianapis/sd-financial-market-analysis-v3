package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDFinancialMarketAnalysisConfigureOutputModelFinancialMarketAnalysisServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDFinancialMarketAnalysisConfigureOutputModel
 */
public class SDFinancialMarketAnalysisConfigureOutputModel   {
  private String financialMarketAnalysisConfigurationActionTaskReference = null;

  private Object financialMarketAnalysisConfigurationActionTaskRecord = null;

  private SDFinancialMarketAnalysisConfigureOutputModelFinancialMarketAnalysisServiceConfigurationRecord financialMarketAnalysisServiceConfigurationRecord = null;

  private String financialMarketAnalysisServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return financialMarketAnalysisConfigurationActionTaskReference
  **/

  public String getFinancialMarketAnalysisConfigurationActionTaskReference() {
    return financialMarketAnalysisConfigurationActionTaskReference;
  }

  public void setFinancialMarketAnalysisConfigurationActionTaskReference(String financialMarketAnalysisConfigurationActionTaskReference) {
    this.financialMarketAnalysisConfigurationActionTaskReference = financialMarketAnalysisConfigurationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return financialMarketAnalysisConfigurationActionTaskRecord
  **/

  public Object getFinancialMarketAnalysisConfigurationActionTaskRecord() {
    return financialMarketAnalysisConfigurationActionTaskRecord;
  }

  public void setFinancialMarketAnalysisConfigurationActionTaskRecord(Object financialMarketAnalysisConfigurationActionTaskRecord) {
    this.financialMarketAnalysisConfigurationActionTaskRecord = financialMarketAnalysisConfigurationActionTaskRecord;
  }


  /**
   * Get financialMarketAnalysisServiceConfigurationRecord
   * @return financialMarketAnalysisServiceConfigurationRecord
  **/

  public SDFinancialMarketAnalysisConfigureOutputModelFinancialMarketAnalysisServiceConfigurationRecord getFinancialMarketAnalysisServiceConfigurationRecord() {
    return financialMarketAnalysisServiceConfigurationRecord;
  }

  public void setFinancialMarketAnalysisServiceConfigurationRecord(SDFinancialMarketAnalysisConfigureOutputModelFinancialMarketAnalysisServiceConfigurationRecord financialMarketAnalysisServiceConfigurationRecord) {
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

