package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDFinancialMarketAnalysisActivateInputModelFinancialMarketAnalysisServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDFinancialMarketAnalysisActivateInputModel
 */
public class SDFinancialMarketAnalysisActivateInputModel   {
  private Object financialMarketAnalysisActivationActionTaskRecord = null;

  private String financialMarketAnalysisCenterReference = null;

  private String financialMarketAnalysisServiceReference = null;

  private SDFinancialMarketAnalysisActivateInputModelFinancialMarketAnalysisServiceConfigurationRecord financialMarketAnalysisServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return financialMarketAnalysisCenterReference
  **/

  public String getFinancialMarketAnalysisCenterReference() {
    return financialMarketAnalysisCenterReference;
  }

  public void setFinancialMarketAnalysisCenterReference(String financialMarketAnalysisCenterReference) {
    this.financialMarketAnalysisCenterReference = financialMarketAnalysisCenterReference;
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

  public SDFinancialMarketAnalysisActivateInputModelFinancialMarketAnalysisServiceConfigurationRecord getFinancialMarketAnalysisServiceConfigurationRecord() {
    return financialMarketAnalysisServiceConfigurationRecord;
  }

  public void setFinancialMarketAnalysisServiceConfigurationRecord(SDFinancialMarketAnalysisActivateInputModelFinancialMarketAnalysisServiceConfigurationRecord financialMarketAnalysisServiceConfigurationRecord) {
    this.financialMarketAnalysisServiceConfigurationRecord = financialMarketAnalysisServiceConfigurationRecord;
  }


}

