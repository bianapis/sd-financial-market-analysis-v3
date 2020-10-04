package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDFinancialMarketAnalysisConfigureInputModelFinancialMarketAnalysisServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDFinancialMarketAnalysisConfigureInputModel
 */
public class SDFinancialMarketAnalysisConfigureInputModel   {
  private Object financialMarketAnalysisConfigurationActionTaskRecord = null;

  private String financialMarketAnalysisServicingSessionReference = null;

  private String financialMarketAnalysisServiceReference = null;

  private SDFinancialMarketAnalysisConfigureInputModelFinancialMarketAnalysisServiceConfigurationRecord financialMarketAnalysisServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return financialMarketAnalysisServiceReference
  **/

  public String getFinancialMarketAnalysisServiceReference() {
    return financialMarketAnalysisServiceReference;
  }

  public void setFinancialMarketAnalysisServiceReference(String financialMarketAnalysisServiceReference) {
    this.financialMarketAnalysisServiceReference = financialMarketAnalysisServiceReference;
  }


  /**
   * Get financialMarketAnalysisServiceConfigurationRecord
   * @return financialMarketAnalysisServiceConfigurationRecord
  **/

  public SDFinancialMarketAnalysisConfigureInputModelFinancialMarketAnalysisServiceConfigurationRecord getFinancialMarketAnalysisServiceConfigurationRecord() {
    return financialMarketAnalysisServiceConfigurationRecord;
  }

  public void setFinancialMarketAnalysisServiceConfigurationRecord(SDFinancialMarketAnalysisConfigureInputModelFinancialMarketAnalysisServiceConfigurationRecord financialMarketAnalysisServiceConfigurationRecord) {
    this.financialMarketAnalysisServiceConfigurationRecord = financialMarketAnalysisServiceConfigurationRecord;
  }


}

