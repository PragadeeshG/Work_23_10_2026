package com.test1;

public class PassthroughChainOutputAggregation {
	private long outputAggregationId;
	private long passthroughChainConfigurationId;
	private long chainExecution;
	private String aggregationName;
	private String aggregationType;
	private String originalInput;
	private String passthroughInput;
	private String assignedOutputKeys;
	private String parallelBranchOutputs;
	private String transformedOutputs;
	private String aggregationStrategy;
	private String outputMergeStrategy;
	private String duplicateKeyHandling;
	private String conflictResolutionStratgey;
	private String nullValueHandling;
	private String outputSchema;
	private String aggregatedOutput;
	private String finalOutput;

	public PassthroughChainOutputAggregation() {

	}

	public PassthroughChainOutputAggregation(long outputAggregationId, long passthroughChainConfigurationId,
			long chainExecution, String aggregationName, String aggregationType, String originalInput,
			String passthroughInput, String assignedOutputKeys, String parallelBranchOutputs, String transformedOutputs,
			String aggregationStrategy, String outputMergeStrategy, String duplicateKeyHandling,
			String conflictResolutionStratgey, String nullValueHandling, String outputSchema, String aggregatedOutput,
			String finalOutput) {
		super();
		this.outputAggregationId = outputAggregationId;
		this.passthroughChainConfigurationId = passthroughChainConfigurationId;
		this.chainExecution = chainExecution;
		this.aggregationName = aggregationName;
		this.aggregationType = aggregationType;
		this.originalInput = originalInput;
		this.passthroughInput = passthroughInput;
		this.assignedOutputKeys = assignedOutputKeys;
		this.parallelBranchOutputs = parallelBranchOutputs;
		this.transformedOutputs = transformedOutputs;
		this.aggregationStrategy = aggregationStrategy;
		this.outputMergeStrategy = outputMergeStrategy;
		this.duplicateKeyHandling = duplicateKeyHandling;
		this.conflictResolutionStratgey = conflictResolutionStratgey;
		this.nullValueHandling = nullValueHandling;
		this.outputSchema = outputSchema;
		this.aggregatedOutput = aggregatedOutput;
		this.finalOutput = finalOutput;
	}

	public long getOutputAggregationId() {
		return outputAggregationId;
	}

	public void setOutputAggregationId(long outputAggregationId) {
		this.outputAggregationId = outputAggregationId;
	}

	public long getPassthroughChainConfigurationId() {
		return passthroughChainConfigurationId;
	}

	public void setPassthroughChainConfigurationId(long passthroughChainConfigurationId) {
		this.passthroughChainConfigurationId = passthroughChainConfigurationId;
	}

	public long getChainExecution() {
		return chainExecution;
	}

	public void setChainExecution(long chainExecution) {
		this.chainExecution = chainExecution;
	}

	public String getAggregationName() {
		return aggregationName;
	}

	public void setAggregationName(String aggregationName) {
		this.aggregationName = aggregationName;
	}

	public String getAggregationType() {
		return aggregationType;
	}

	public void setAggregationType(String aggregationType) {
		this.aggregationType = aggregationType;
	}

	public String getOriginalInput() {
		return originalInput;
	}

	public void setOriginalInput(String originalInput) {
		this.originalInput = originalInput;
	}

	public String getPassthroughInput() {
		return passthroughInput;
	}

	public void setPassthroughInput(String passthroughInput) {
		this.passthroughInput = passthroughInput;
	}

	public String getAssignedOutputKeys() {
		return assignedOutputKeys;
	}

	public void setAssignedOutputKeys(String assignedOutputKeys) {
		this.assignedOutputKeys = assignedOutputKeys;
	}

	public String getParallelBranchOutputs() {
		return parallelBranchOutputs;
	}

	public void setParallelBranchOutputs(String parallelBranchOutputs) {
		this.parallelBranchOutputs = parallelBranchOutputs;
	}

	public String getTransformedOutputs() {
		return transformedOutputs;
	}

	public void setTransformedOutputs(String transformedOutputs) {
		this.transformedOutputs = transformedOutputs;
	}

	public String getAggregationStrategy() {
		return aggregationStrategy;
	}

	public void setAggregationStrategy(String aggregationStrategy) {
		this.aggregationStrategy = aggregationStrategy;
	}

	public String getOutputMergeStrategy() {
		return outputMergeStrategy;
	}

	public void setOutputMergeStrategy(String outputMergeStrategy) {
		this.outputMergeStrategy = outputMergeStrategy;
	}

	public String getDuplicateKeyHandling() {
		return duplicateKeyHandling;
	}

	public void setDuplicateKeyHandling(String duplicateKeyHandling) {
		this.duplicateKeyHandling = duplicateKeyHandling;
	}

	public String getConflictResolutionStratgey() {
		return conflictResolutionStratgey;
	}

	public void setConflictResolutionStratgey(String conflictResolutionStratgey) {
		this.conflictResolutionStratgey = conflictResolutionStratgey;
	}

	public String getNullValueHandling() {
		return nullValueHandling;
	}

	public void setNullValueHandling(String nullValueHandling) {
		this.nullValueHandling = nullValueHandling;
	}

	public String getOutputSchema() {
		return outputSchema;
	}

	public void setOutputSchema(String outputSchema) {
		this.outputSchema = outputSchema;
	}

	public String getAggregatedOutput() {
		return aggregatedOutput;
	}

	public void setAggregatedOutput(String aggregatedOutput) {
		this.aggregatedOutput = aggregatedOutput;
	}

	public String getFinalOutput() {
		return finalOutput;
	}

	public void setFinalOutput(String finalOutput) {
		this.finalOutput = finalOutput;
	}

}
