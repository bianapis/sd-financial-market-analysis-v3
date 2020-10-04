/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class FinancialMarketAnalysisApiServiceImpl implements FinancialMarketAnalysisApiService {

	public SDFinancialMarketAnalysisActivateOutputModel activate(SDFinancialMarketAnalysisActivateInputModel request){
		return JsonReader.read("activate-SDFinancialMarketAnalysisActivateOutputModel.json",new TypeReference<SDFinancialMarketAnalysisActivateOutputModel>(){});
	}
	
	public SDFinancialMarketAnalysisConfigureOutputModel configure(String sdReferenceId, SDFinancialMarketAnalysisConfigureInputModel request){
		return JsonReader.read("configure-SDFinancialMarketAnalysisConfigureOutputModel.json",new TypeReference<SDFinancialMarketAnalysisConfigureOutputModel>(){});
	}
	
	public BQFinancialMarketInsightExecuteOutputModel executeFinancialmarketinsight(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFinancialMarketInsightExecuteInputModel request){
		return JsonReader.read("execute-BQFinancialMarketInsightExecuteOutputModel.json",new TypeReference<BQFinancialMarketInsightExecuteOutputModel>(){});
	}
	
	public CRFinancialMarketAnalysisExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRFinancialMarketAnalysisExecuteInputModel request){
		return JsonReader.read("execute-CRFinancialMarketAnalysisExecuteOutputModel.json",new TypeReference<CRFinancialMarketAnalysisExecuteOutputModel>(){});
	}
	
	public SDFinancialMarketAnalysisFeedbackOutputModel feedback(String sdReferenceId, SDFinancialMarketAnalysisFeedbackInputModel request){
		return JsonReader.read("feedback-SDFinancialMarketAnalysisFeedbackOutputModel.json",new TypeReference<SDFinancialMarketAnalysisFeedbackOutputModel>(){});
	}
	
	public CRFinancialMarketAnalysisInitiateOutputModel initiate(String sdReferenceId, CRFinancialMarketAnalysisInitiateInputModel request){
		return JsonReader.read("initiate-CRFinancialMarketAnalysisInitiateOutputModel.json",new TypeReference<CRFinancialMarketAnalysisInitiateOutputModel>(){});
	}
	
	public BQFinancialMarketInsightInitiateOutputModel initiateFinancialmarketinsight(String sdReferenceId, String crReferenceId, BQFinancialMarketInsightInitiateInputModel request){
		return JsonReader.read("initiate-BQFinancialMarketInsightInitiateOutputModel.json",new TypeReference<BQFinancialMarketInsightInitiateOutputModel>(){});
	}
	
	public BQFinancialMarketInsightRequestOutputModel requestFinancialmarketinsight(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFinancialMarketInsightRequestInputModel request){
		return JsonReader.read("request-BQFinancialMarketInsightRequestOutputModel.json",new TypeReference<BQFinancialMarketInsightRequestOutputModel>(){});
	}
	
	public CRFinancialMarketAnalysisRequestOutputModel request(String sdReferenceId, String crReferenceId, CRFinancialMarketAnalysisRequestInputModel request){
		return JsonReader.read("request-CRFinancialMarketAnalysisRequestOutputModel.json",new TypeReference<CRFinancialMarketAnalysisRequestOutputModel>(){});
	}
	
	public CRFinancialMarketAnalysisRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRFinancialMarketAnalysisRetrieveOutputModel.json",new TypeReference<CRFinancialMarketAnalysisRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQFinancialMarketInsightRetrieveOutputModel retrieveFinancialmarketinsight(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQFinancialMarketInsightRetrieveOutputModel.json",new TypeReference<BQFinancialMarketInsightRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDFinancialMarketAnalysisRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDFinancialMarketAnalysisRetrieveOutputModel.json",new TypeReference<SDFinancialMarketAnalysisRetrieveOutputModel>(){});
	}
	
	public CRFinancialMarketAnalysisUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRFinancialMarketAnalysisUpdateInputModel request){
		return JsonReader.read("update-CRFinancialMarketAnalysisUpdateOutputModel.json",new TypeReference<CRFinancialMarketAnalysisUpdateOutputModel>(){});
	}
	
	public BQFinancialMarketInsightUpdateOutputModel updateFinancialmarketinsight(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFinancialMarketInsightUpdateInputModel request){
		return JsonReader.read("update-BQFinancialMarketInsightUpdateOutputModel.json",new TypeReference<BQFinancialMarketInsightUpdateOutputModel>(){});
	}
	
}
