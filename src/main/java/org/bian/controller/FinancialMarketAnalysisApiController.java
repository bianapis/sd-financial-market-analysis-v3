/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Analyse;

@BianRestController
public class FinancialMarketAnalysisApiController {

	@Autowired
	FinancialMarketAnalysisApiService service;
	
	@Analyse.Activate
	public BianResponse<SDFinancialMarketAnalysisActivateOutputModel> activate(@RequestBody BianRequest<SDFinancialMarketAnalysisActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Analyse.Configure
	public BianResponse<SDFinancialMarketAnalysisConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDFinancialMarketAnalysisConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("financialmarketinsight")
	@Analyse.Execute
	public BianResponse<BQFinancialMarketInsightExecuteOutputModel> executeFinancialmarketinsight(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFinancialMarketInsightExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeFinancialmarketinsight(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Analyse.Execute
	public BianResponse<CRFinancialMarketAnalysisExecuteOutputModel> execute(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRFinancialMarketAnalysisExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.execute(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Analyse.Feedback
	public BianResponse<SDFinancialMarketAnalysisFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDFinancialMarketAnalysisFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Analyse.Initiate
	public BianResponse<CRFinancialMarketAnalysisInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRFinancialMarketAnalysisInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("financialmarketinsight")
	@Analyse.Initiate
	public BianResponse<BQFinancialMarketInsightInitiateOutputModel> initiateFinancialmarketinsight(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQFinancialMarketInsightInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateFinancialmarketinsight(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("financialmarketinsight")
	@Analyse.Request
	public BianResponse<BQFinancialMarketInsightRequestOutputModel> requestFinancialmarketinsight(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFinancialMarketInsightRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestFinancialmarketinsight(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Analyse.Request
	public BianResponse<CRFinancialMarketAnalysisRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRFinancialMarketAnalysisRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Analyse.Retrieve
	public BianResponse<CRFinancialMarketAnalysisRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Analyse.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Analyse.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("financialmarketinsight")
	@Analyse.Retrieve
	public BianResponse<BQFinancialMarketInsightRetrieveOutputModel> retrieveFinancialmarketinsight(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveFinancialmarketinsight(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Analyse.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Analyse.RetrieveSD
	public BianResponse<SDFinancialMarketAnalysisRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Analyse.Update
	public BianResponse<CRFinancialMarketAnalysisUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRFinancialMarketAnalysisUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("financialmarketinsight")
	@Analyse.Update
	public BianResponse<BQFinancialMarketInsightUpdateOutputModel> updateFinancialmarketinsight(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFinancialMarketInsightUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateFinancialmarketinsight(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
