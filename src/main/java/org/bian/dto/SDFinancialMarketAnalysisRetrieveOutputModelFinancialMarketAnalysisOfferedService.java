package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDFinancialMarketAnalysisRetrieveOutputModelFinancialMarketAnalysisOfferedServiceFinancialMarketAnalysisServiceRecord;

import javax.validation.Valid;
  
/**
 * SDFinancialMarketAnalysisRetrieveOutputModelFinancialMarketAnalysisOfferedService
 */
public class SDFinancialMarketAnalysisRetrieveOutputModelFinancialMarketAnalysisOfferedService   {
  private String financialMarketAnalysisServiceReference = null;

  private SDFinancialMarketAnalysisRetrieveOutputModelFinancialMarketAnalysisOfferedServiceFinancialMarketAnalysisServiceRecord financialMarketAnalysisServiceRecord = null;


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
   * Get financialMarketAnalysisServiceRecord
   * @return financialMarketAnalysisServiceRecord
  **/

  public SDFinancialMarketAnalysisRetrieveOutputModelFinancialMarketAnalysisOfferedServiceFinancialMarketAnalysisServiceRecord getFinancialMarketAnalysisServiceRecord() {
    return financialMarketAnalysisServiceRecord;
  }

  public void setFinancialMarketAnalysisServiceRecord(SDFinancialMarketAnalysisRetrieveOutputModelFinancialMarketAnalysisOfferedServiceFinancialMarketAnalysisServiceRecord financialMarketAnalysisServiceRecord) {
    this.financialMarketAnalysisServiceRecord = financialMarketAnalysisServiceRecord;
  }


}

