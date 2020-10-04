/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface FinancialMarketAnalysisApiService {

	SDFinancialMarketAnalysisActivateOutputModel activate(SDFinancialMarketAnalysisActivateInputModel request);
	
	SDFinancialMarketAnalysisConfigureOutputModel configure(String sdReferenceId, SDFinancialMarketAnalysisConfigureInputModel request);
	
	BQFinancialMarketInsightExecuteOutputModel executeFinancialmarketinsight(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFinancialMarketInsightExecuteInputModel request);
	
	CRFinancialMarketAnalysisExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRFinancialMarketAnalysisExecuteInputModel request);
	
	SDFinancialMarketAnalysisFeedbackOutputModel feedback(String sdReferenceId, SDFinancialMarketAnalysisFeedbackInputModel request);
	
	CRFinancialMarketAnalysisInitiateOutputModel initiate(String sdReferenceId, CRFinancialMarketAnalysisInitiateInputModel request);
	
	BQFinancialMarketInsightInitiateOutputModel initiateFinancialmarketinsight(String sdReferenceId, String crReferenceId, BQFinancialMarketInsightInitiateInputModel request);
	
	BQFinancialMarketInsightRequestOutputModel requestFinancialmarketinsight(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFinancialMarketInsightRequestInputModel request);
	
	CRFinancialMarketAnalysisRequestOutputModel request(String sdReferenceId, String crReferenceId, CRFinancialMarketAnalysisRequestInputModel request);
	
	CRFinancialMarketAnalysisRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQFinancialMarketInsightRetrieveOutputModel retrieveFinancialmarketinsight(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDFinancialMarketAnalysisRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRFinancialMarketAnalysisUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRFinancialMarketAnalysisUpdateInputModel request);
	
	BQFinancialMarketInsightUpdateOutputModel updateFinancialmarketinsight(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFinancialMarketInsightUpdateInputModel request);
	
}
