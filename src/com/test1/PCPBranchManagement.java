package com.test1;

public class PCPBranchManagement {
	private long parallelBranchManagementId;
	private long passthroughChainConfigurationId;
	private long chainExecutionId;
	private String branchId;
	private String branchName;
	private String branchType;
	private String runnableComponentName;
	private String runnableComponentType;
	private String branchInput;
	private String branchOutput;
	private String inputKeysPreserved;
	private String outputMappingStrategy;
	private String parallelExecutionEnabled;
	private long branchExecutionPriority;
	private long branchTimeout;
	private long maximumRetryAttempts;
	private long currentRetryAttempt;
	private String branchStartTime;

	public PCPBranchManagement() {

	}

	public PCPBranchManagement(long parallelBranchManagementId, long passthroughChainConfigurationId,
			long chainExecutionId, String branchId, String branchName, String branchType, String runnableComponentName,
			String runnableComponentType, String branchInput, String branchOutput, String inputKeysPreserved,
			String outputMappingStrategy, String parallelExecutionEnabled, long branchExecutionPriority,
			long branchTimeout, long maximumRetryAttempts, long currentRetryAttempt, String branchStartTime) {
		super();
		this.parallelBranchManagementId = parallelBranchManagementId;
		this.passthroughChainConfigurationId = passthroughChainConfigurationId;
		this.chainExecutionId = chainExecutionId;
		this.branchId = branchId;
		this.branchName = branchName;
		this.branchType = branchType;
		this.runnableComponentName = runnableComponentName;
		this.runnableComponentType = runnableComponentType;
		this.branchInput = branchInput;
		this.branchOutput = branchOutput;
		this.inputKeysPreserved = inputKeysPreserved;
		this.outputMappingStrategy = outputMappingStrategy;
		this.parallelExecutionEnabled = parallelExecutionEnabled;
		this.branchExecutionPriority = branchExecutionPriority;
		this.branchTimeout = branchTimeout;
		this.maximumRetryAttempts = maximumRetryAttempts;
		this.currentRetryAttempt = currentRetryAttempt;
		this.branchStartTime = branchStartTime;
	}

	public long getParallelBranchManagementId() {
		return parallelBranchManagementId;
	}

	public void setParallelBranchManagementId(long parallelBranchManagementId) {
		this.parallelBranchManagementId = parallelBranchManagementId;
	}

	public long getPassthroughChainConfigurationId() {
		return passthroughChainConfigurationId;
	}

	public void setPassthroughChainConfigurationId(long passthroughChainConfigurationId) {
		this.passthroughChainConfigurationId = passthroughChainConfigurationId;
	}

	public long getChainExecutionId() {
		return chainExecutionId;
	}

	public void setChainExecutionId(long chainExecutionId) {
		this.chainExecutionId = chainExecutionId;
	}

	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchType() {
		return branchType;
	}

	public void setBranchType(String branchType) {
		this.branchType = branchType;
	}

	public String getRunnableComponentName() {
		return runnableComponentName;
	}

	public void setRunnableComponentName(String runnableComponentName) {
		this.runnableComponentName = runnableComponentName;
	}

	public String getRunnableComponentType() {
		return runnableComponentType;
	}

	public void setRunnableComponentType(String runnableComponentType) {
		this.runnableComponentType = runnableComponentType;
	}

	public String getBranchInput() {
		return branchInput;
	}

	public void setBranchInput(String branchInput) {
		this.branchInput = branchInput;
	}

	public String getBranchOutput() {
		return branchOutput;
	}

	public void setBranchOutput(String branchOutput) {
		this.branchOutput = branchOutput;
	}

	public String getInputKeysPreserved() {
		return inputKeysPreserved;
	}

	public void setInputKeysPreserved(String inputKeysPreserved) {
		this.inputKeysPreserved = inputKeysPreserved;
	}

	public String getOutputMappingStrategy() {
		return outputMappingStrategy;
	}

	public void setOutputMappingStrategy(String outputMappingStrategy) {
		this.outputMappingStrategy = outputMappingStrategy;
	}

	public String getParallelExecutionEnabled() {
		return parallelExecutionEnabled;
	}

	public void setParallelExecutionEnabled(String parallelExecutionEnabled) {
		this.parallelExecutionEnabled = parallelExecutionEnabled;
	}

	public long getBranchExecutionPriority() {
		return branchExecutionPriority;
	}

	public void setBranchExecutionPriority(long branchExecutionPriority) {
		this.branchExecutionPriority = branchExecutionPriority;
	}

	public long getBranchTimeout() {
		return branchTimeout;
	}

	public void setBranchTimeout(long branchTimeout) {
		this.branchTimeout = branchTimeout;
	}

	public long getMaximumRetryAttempts() {
		return maximumRetryAttempts;
	}

	public void setMaximumRetryAttempts(long maximumRetryAttempts) {
		this.maximumRetryAttempts = maximumRetryAttempts;
	}

	public long getCurrentRetryAttempt() {
		return currentRetryAttempt;
	}

	public void setCurrentRetryAttempt(long currentRetryAttempt) {
		this.currentRetryAttempt = currentRetryAttempt;
	}

	public String getBranchStartTime() {
		return branchStartTime;
	}

	public void setBranchStartTime(String branchStartTime) {
		this.branchStartTime = branchStartTime;
	}

}
