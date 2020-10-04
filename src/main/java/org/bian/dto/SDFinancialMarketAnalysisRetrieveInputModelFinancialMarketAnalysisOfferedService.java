package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDFinancialMarketAnalysisRetrieveInputModelFinancialMarketAnalysisOfferedServiceFinancialMarketAnalysisServiceRecord;

import javax.validation.Valid;
  
/**
 * SDFinancialMarketAnalysisRetrieveInputModelFinancialMarketAnalysisOfferedService
 */
public class SDFinancialMarketAnalysisRetrieveInputModelFinancialMarketAnalysisOfferedService   {
  private String financialMarketAnalysisServiceReference = null;

  private SDFinancialMarketAnalysisRetrieveInputModelFinancialMarketAnalysisOfferedServiceFinancialMarketAnalysisServiceRecord financialMarketAnalysisServiceRecord = null;


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

  public SDFinancialMarketAnalysisRetrieveInputModelFinancialMarketAnalysisOfferedServiceFinancialMarketAnalysisServiceRecord getFinancialMarketAnalysisServiceRecord() {
    return financialMarketAnalysisServiceRecord;
  }

  public void setFinancialMarketAnalysisServiceRecord(SDFinancialMarketAnalysisRetrieveInputModelFinancialMarketAnalysisOfferedServiceFinancialMarketAnalysisServiceRecord financialMarketAnalysisServiceRecord) {
    this.financialMarketAnalysisServiceRecord = financialMarketAnalysisServiceRecord;
  }


}

