/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.edas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeployK8sApplicationRequest extends RoaAcsRequest<DeployK8sApplicationResponse> {
	   

	private String nasId;

	private String sidecars;

	private String packageVersionId;

	private Integer batchWaitTime;

	private Integer requestsEphemeralStorage;

	private String envs;

	private String annotations;

	private Integer cpuLimit;

	private String storageType;

	private String configMountDescs;

	private String startup;

	private Integer memoryLimit;

	private String imagePlatforms;

	private String imageTag;

	private String deployAcrossZones;

	private Integer terminateGracePeriod;

	private String deployAcrossNodes;

	private Integer memoryRequest;

	private String image;

	private String preStop;

	private String buildPackId;

	private Boolean enableEmptyPushReject;

	private String localVolume;

	private String updateStrategy;

	private String labels;

	private String userBaseImageUrl;

	private Boolean useBodyEncoding;

	private Integer limitEphemeralStorage;

	private String changeOrderDesc;

	private Integer losslessRuleFuncType;

	private String canaryRuleId;

	private String emptyDirs;

	private Integer mcpuLimit;

	private Boolean losslessRuleRelated;

	private String runtimeClassName;

	private String trafficControlStrategy;

	private String postStart;

	private String customAffinity;

	private Boolean enableLosslessRule;

	private Integer losslessRuleWarmupTime;

	private String webContainer;

	private Boolean enableAhas;

	private String slsConfigs;

	private String readiness;

	private String liveness;

	private String initContainers;

	private String packageVersion;

	private String envFroms;

	private String edasContainerVersion;

	private String packageUrl;

	private Integer losslessRuleDelayTime;

	private String mountDescs;

	private Integer replicas;

	private String customTolerations;

	private Integer cpuRequest;

	private String webContainerConfig;

	private String command;

	private String args;

	private String jDK;

	private String uriEncoding;

	private String appId;

	private Integer batchTimeout;

	private String pvcMountDescs;

	private Integer mcpuRequest;

	private String volumesStr;

	private Boolean losslessRuleAligned;

	private String javaStartUpConfig;
	public DeployK8sApplicationRequest() {
		super("Edas", "2017-08-01", "DeployK8sApplication", "Edas");
		setUriPattern("/pop/v5/k8s/acs/k8s_apps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getNasId() {
		return this.nasId;
	}

	public void setNasId(String nasId) {
		this.nasId = nasId;
		if(nasId != null){
			putQueryParameter("NasId", nasId);
		}
	}

	public String getSidecars() {
		return this.sidecars;
	}

	public void setSidecars(String sidecars) {
		this.sidecars = sidecars;
		if(sidecars != null){
			putQueryParameter("Sidecars", sidecars);
		}
	}

	public String getPackageVersionId() {
		return this.packageVersionId;
	}

	public void setPackageVersionId(String packageVersionId) {
		this.packageVersionId = packageVersionId;
		if(packageVersionId != null){
			putQueryParameter("PackageVersionId", packageVersionId);
		}
	}

	public Integer getBatchWaitTime() {
		return this.batchWaitTime;
	}

	public void setBatchWaitTime(Integer batchWaitTime) {
		this.batchWaitTime = batchWaitTime;
		if(batchWaitTime != null){
			putQueryParameter("BatchWaitTime", batchWaitTime.toString());
		}
	}

	public Integer getRequestsEphemeralStorage() {
		return this.requestsEphemeralStorage;
	}

	public void setRequestsEphemeralStorage(Integer requestsEphemeralStorage) {
		this.requestsEphemeralStorage = requestsEphemeralStorage;
		if(requestsEphemeralStorage != null){
			putQueryParameter("RequestsEphemeralStorage", requestsEphemeralStorage.toString());
		}
	}

	public String getEnvs() {
		return this.envs;
	}

	public void setEnvs(String envs) {
		this.envs = envs;
		if(envs != null){
			putQueryParameter("Envs", envs);
		}
	}

	public String getAnnotations() {
		return this.annotations;
	}

	public void setAnnotations(String annotations) {
		this.annotations = annotations;
		if(annotations != null){
			putQueryParameter("Annotations", annotations);
		}
	}

	public Integer getCpuLimit() {
		return this.cpuLimit;
	}

	public void setCpuLimit(Integer cpuLimit) {
		this.cpuLimit = cpuLimit;
		if(cpuLimit != null){
			putQueryParameter("CpuLimit", cpuLimit.toString());
		}
	}

	public String getStorageType() {
		return this.storageType;
	}

	public void setStorageType(String storageType) {
		this.storageType = storageType;
		if(storageType != null){
			putQueryParameter("StorageType", storageType);
		}
	}

	public String getConfigMountDescs() {
		return this.configMountDescs;
	}

	public void setConfigMountDescs(String configMountDescs) {
		this.configMountDescs = configMountDescs;
		if(configMountDescs != null){
			putQueryParameter("ConfigMountDescs", configMountDescs);
		}
	}

	public String getStartup() {
		return this.startup;
	}

	public void setStartup(String startup) {
		this.startup = startup;
		if(startup != null){
			putQueryParameter("Startup", startup);
		}
	}

	public Integer getMemoryLimit() {
		return this.memoryLimit;
	}

	public void setMemoryLimit(Integer memoryLimit) {
		this.memoryLimit = memoryLimit;
		if(memoryLimit != null){
			putQueryParameter("MemoryLimit", memoryLimit.toString());
		}
	}

	public String getImagePlatforms() {
		return this.imagePlatforms;
	}

	public void setImagePlatforms(String imagePlatforms) {
		this.imagePlatforms = imagePlatforms;
		if(imagePlatforms != null){
			putQueryParameter("ImagePlatforms", imagePlatforms);
		}
	}

	public String getImageTag() {
		return this.imageTag;
	}

	public void setImageTag(String imageTag) {
		this.imageTag = imageTag;
		if(imageTag != null){
			putQueryParameter("ImageTag", imageTag);
		}
	}

	public String getDeployAcrossZones() {
		return this.deployAcrossZones;
	}

	public void setDeployAcrossZones(String deployAcrossZones) {
		this.deployAcrossZones = deployAcrossZones;
		if(deployAcrossZones != null){
			putQueryParameter("DeployAcrossZones", deployAcrossZones);
		}
	}

	public Integer getTerminateGracePeriod() {
		return this.terminateGracePeriod;
	}

	public void setTerminateGracePeriod(Integer terminateGracePeriod) {
		this.terminateGracePeriod = terminateGracePeriod;
		if(terminateGracePeriod != null){
			putQueryParameter("TerminateGracePeriod", terminateGracePeriod.toString());
		}
	}

	public String getDeployAcrossNodes() {
		return this.deployAcrossNodes;
	}

	public void setDeployAcrossNodes(String deployAcrossNodes) {
		this.deployAcrossNodes = deployAcrossNodes;
		if(deployAcrossNodes != null){
			putQueryParameter("DeployAcrossNodes", deployAcrossNodes);
		}
	}

	public Integer getMemoryRequest() {
		return this.memoryRequest;
	}

	public void setMemoryRequest(Integer memoryRequest) {
		this.memoryRequest = memoryRequest;
		if(memoryRequest != null){
			putQueryParameter("MemoryRequest", memoryRequest.toString());
		}
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
		if(image != null){
			putQueryParameter("Image", image);
		}
	}

	public String getPreStop() {
		return this.preStop;
	}

	public void setPreStop(String preStop) {
		this.preStop = preStop;
		if(preStop != null){
			putQueryParameter("PreStop", preStop);
		}
	}

	public String getBuildPackId() {
		return this.buildPackId;
	}

	public void setBuildPackId(String buildPackId) {
		this.buildPackId = buildPackId;
		if(buildPackId != null){
			putQueryParameter("BuildPackId", buildPackId);
		}
	}

	public Boolean getEnableEmptyPushReject() {
		return this.enableEmptyPushReject;
	}

	public void setEnableEmptyPushReject(Boolean enableEmptyPushReject) {
		this.enableEmptyPushReject = enableEmptyPushReject;
		if(enableEmptyPushReject != null){
			putQueryParameter("EnableEmptyPushReject", enableEmptyPushReject.toString());
		}
	}

	public String getLocalVolume() {
		return this.localVolume;
	}

	public void setLocalVolume(String localVolume) {
		this.localVolume = localVolume;
		if(localVolume != null){
			putQueryParameter("LocalVolume", localVolume);
		}
	}

	public String getUpdateStrategy() {
		return this.updateStrategy;
	}

	public void setUpdateStrategy(String updateStrategy) {
		this.updateStrategy = updateStrategy;
		if(updateStrategy != null){
			putQueryParameter("UpdateStrategy", updateStrategy);
		}
	}

	public String getLabels() {
		return this.labels;
	}

	public void setLabels(String labels) {
		this.labels = labels;
		if(labels != null){
			putQueryParameter("Labels", labels);
		}
	}

	public String getUserBaseImageUrl() {
		return this.userBaseImageUrl;
	}

	public void setUserBaseImageUrl(String userBaseImageUrl) {
		this.userBaseImageUrl = userBaseImageUrl;
		if(userBaseImageUrl != null){
			putQueryParameter("UserBaseImageUrl", userBaseImageUrl);
		}
	}

	public Boolean getUseBodyEncoding() {
		return this.useBodyEncoding;
	}

	public void setUseBodyEncoding(Boolean useBodyEncoding) {
		this.useBodyEncoding = useBodyEncoding;
		if(useBodyEncoding != null){
			putQueryParameter("UseBodyEncoding", useBodyEncoding.toString());
		}
	}

	public Integer getLimitEphemeralStorage() {
		return this.limitEphemeralStorage;
	}

	public void setLimitEphemeralStorage(Integer limitEphemeralStorage) {
		this.limitEphemeralStorage = limitEphemeralStorage;
		if(limitEphemeralStorage != null){
			putQueryParameter("LimitEphemeralStorage", limitEphemeralStorage.toString());
		}
	}

	public String getChangeOrderDesc() {
		return this.changeOrderDesc;
	}

	public void setChangeOrderDesc(String changeOrderDesc) {
		this.changeOrderDesc = changeOrderDesc;
		if(changeOrderDesc != null){
			putQueryParameter("ChangeOrderDesc", changeOrderDesc);
		}
	}

	public Integer getLosslessRuleFuncType() {
		return this.losslessRuleFuncType;
	}

	public void setLosslessRuleFuncType(Integer losslessRuleFuncType) {
		this.losslessRuleFuncType = losslessRuleFuncType;
		if(losslessRuleFuncType != null){
			putQueryParameter("LosslessRuleFuncType", losslessRuleFuncType.toString());
		}
	}

	public String getCanaryRuleId() {
		return this.canaryRuleId;
	}

	public void setCanaryRuleId(String canaryRuleId) {
		this.canaryRuleId = canaryRuleId;
		if(canaryRuleId != null){
			putQueryParameter("CanaryRuleId", canaryRuleId);
		}
	}

	public String getEmptyDirs() {
		return this.emptyDirs;
	}

	public void setEmptyDirs(String emptyDirs) {
		this.emptyDirs = emptyDirs;
		if(emptyDirs != null){
			putQueryParameter("EmptyDirs", emptyDirs);
		}
	}

	public Integer getMcpuLimit() {
		return this.mcpuLimit;
	}

	public void setMcpuLimit(Integer mcpuLimit) {
		this.mcpuLimit = mcpuLimit;
		if(mcpuLimit != null){
			putQueryParameter("McpuLimit", mcpuLimit.toString());
		}
	}

	public Boolean getLosslessRuleRelated() {
		return this.losslessRuleRelated;
	}

	public void setLosslessRuleRelated(Boolean losslessRuleRelated) {
		this.losslessRuleRelated = losslessRuleRelated;
		if(losslessRuleRelated != null){
			putQueryParameter("LosslessRuleRelated", losslessRuleRelated.toString());
		}
	}

	public String getRuntimeClassName() {
		return this.runtimeClassName;
	}

	public void setRuntimeClassName(String runtimeClassName) {
		this.runtimeClassName = runtimeClassName;
		if(runtimeClassName != null){
			putQueryParameter("RuntimeClassName", runtimeClassName);
		}
	}

	public String getTrafficControlStrategy() {
		return this.trafficControlStrategy;
	}

	public void setTrafficControlStrategy(String trafficControlStrategy) {
		this.trafficControlStrategy = trafficControlStrategy;
		if(trafficControlStrategy != null){
			putQueryParameter("TrafficControlStrategy", trafficControlStrategy);
		}
	}

	public String getPostStart() {
		return this.postStart;
	}

	public void setPostStart(String postStart) {
		this.postStart = postStart;
		if(postStart != null){
			putQueryParameter("PostStart", postStart);
		}
	}

	public String getCustomAffinity() {
		return this.customAffinity;
	}

	public void setCustomAffinity(String customAffinity) {
		this.customAffinity = customAffinity;
		if(customAffinity != null){
			putQueryParameter("CustomAffinity", customAffinity);
		}
	}

	public Boolean getEnableLosslessRule() {
		return this.enableLosslessRule;
	}

	public void setEnableLosslessRule(Boolean enableLosslessRule) {
		this.enableLosslessRule = enableLosslessRule;
		if(enableLosslessRule != null){
			putQueryParameter("EnableLosslessRule", enableLosslessRule.toString());
		}
	}

	public Integer getLosslessRuleWarmupTime() {
		return this.losslessRuleWarmupTime;
	}

	public void setLosslessRuleWarmupTime(Integer losslessRuleWarmupTime) {
		this.losslessRuleWarmupTime = losslessRuleWarmupTime;
		if(losslessRuleWarmupTime != null){
			putQueryParameter("LosslessRuleWarmupTime", losslessRuleWarmupTime.toString());
		}
	}

	public String getWebContainer() {
		return this.webContainer;
	}

	public void setWebContainer(String webContainer) {
		this.webContainer = webContainer;
		if(webContainer != null){
			putQueryParameter("WebContainer", webContainer);
		}
	}

	public Boolean getEnableAhas() {
		return this.enableAhas;
	}

	public void setEnableAhas(Boolean enableAhas) {
		this.enableAhas = enableAhas;
		if(enableAhas != null){
			putQueryParameter("EnableAhas", enableAhas.toString());
		}
	}

	public String getSlsConfigs() {
		return this.slsConfigs;
	}

	public void setSlsConfigs(String slsConfigs) {
		this.slsConfigs = slsConfigs;
		if(slsConfigs != null){
			putQueryParameter("SlsConfigs", slsConfigs);
		}
	}

	public String getReadiness() {
		return this.readiness;
	}

	public void setReadiness(String readiness) {
		this.readiness = readiness;
		if(readiness != null){
			putQueryParameter("Readiness", readiness);
		}
	}

	public String getLiveness() {
		return this.liveness;
	}

	public void setLiveness(String liveness) {
		this.liveness = liveness;
		if(liveness != null){
			putQueryParameter("Liveness", liveness);
		}
	}

	public String getInitContainers() {
		return this.initContainers;
	}

	public void setInitContainers(String initContainers) {
		this.initContainers = initContainers;
		if(initContainers != null){
			putQueryParameter("InitContainers", initContainers);
		}
	}

	public String getPackageVersion() {
		return this.packageVersion;
	}

	public void setPackageVersion(String packageVersion) {
		this.packageVersion = packageVersion;
		if(packageVersion != null){
			putQueryParameter("PackageVersion", packageVersion);
		}
	}

	public String getEnvFroms() {
		return this.envFroms;
	}

	public void setEnvFroms(String envFroms) {
		this.envFroms = envFroms;
		if(envFroms != null){
			putQueryParameter("EnvFroms", envFroms);
		}
	}

	public String getEdasContainerVersion() {
		return this.edasContainerVersion;
	}

	public void setEdasContainerVersion(String edasContainerVersion) {
		this.edasContainerVersion = edasContainerVersion;
		if(edasContainerVersion != null){
			putQueryParameter("EdasContainerVersion", edasContainerVersion);
		}
	}

	public String getPackageUrl() {
		return this.packageUrl;
	}

	public void setPackageUrl(String packageUrl) {
		this.packageUrl = packageUrl;
		if(packageUrl != null){
			putQueryParameter("PackageUrl", packageUrl);
		}
	}

	public Integer getLosslessRuleDelayTime() {
		return this.losslessRuleDelayTime;
	}

	public void setLosslessRuleDelayTime(Integer losslessRuleDelayTime) {
		this.losslessRuleDelayTime = losslessRuleDelayTime;
		if(losslessRuleDelayTime != null){
			putQueryParameter("LosslessRuleDelayTime", losslessRuleDelayTime.toString());
		}
	}

	public String getMountDescs() {
		return this.mountDescs;
	}

	public void setMountDescs(String mountDescs) {
		this.mountDescs = mountDescs;
		if(mountDescs != null){
			putQueryParameter("MountDescs", mountDescs);
		}
	}

	public Integer getReplicas() {
		return this.replicas;
	}

	public void setReplicas(Integer replicas) {
		this.replicas = replicas;
		if(replicas != null){
			putQueryParameter("Replicas", replicas.toString());
		}
	}

	public String getCustomTolerations() {
		return this.customTolerations;
	}

	public void setCustomTolerations(String customTolerations) {
		this.customTolerations = customTolerations;
		if(customTolerations != null){
			putQueryParameter("CustomTolerations", customTolerations);
		}
	}

	public Integer getCpuRequest() {
		return this.cpuRequest;
	}

	public void setCpuRequest(Integer cpuRequest) {
		this.cpuRequest = cpuRequest;
		if(cpuRequest != null){
			putQueryParameter("CpuRequest", cpuRequest.toString());
		}
	}

	public String getWebContainerConfig() {
		return this.webContainerConfig;
	}

	public void setWebContainerConfig(String webContainerConfig) {
		this.webContainerConfig = webContainerConfig;
		if(webContainerConfig != null){
			putQueryParameter("WebContainerConfig", webContainerConfig);
		}
	}

	public String getCommand() {
		return this.command;
	}

	public void setCommand(String command) {
		this.command = command;
		if(command != null){
			putQueryParameter("Command", command);
		}
	}

	public String getArgs() {
		return this.args;
	}

	public void setArgs(String args) {
		this.args = args;
		if(args != null){
			putQueryParameter("Args", args);
		}
	}

	public String getJDK() {
		return this.jDK;
	}

	public void setJDK(String jDK) {
		this.jDK = jDK;
		if(jDK != null){
			putQueryParameter("JDK", jDK);
		}
	}

	public String getUriEncoding() {
		return this.uriEncoding;
	}

	public void setUriEncoding(String uriEncoding) {
		this.uriEncoding = uriEncoding;
		if(uriEncoding != null){
			putQueryParameter("UriEncoding", uriEncoding);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public Integer getBatchTimeout() {
		return this.batchTimeout;
	}

	public void setBatchTimeout(Integer batchTimeout) {
		this.batchTimeout = batchTimeout;
		if(batchTimeout != null){
			putQueryParameter("BatchTimeout", batchTimeout.toString());
		}
	}

	public String getPvcMountDescs() {
		return this.pvcMountDescs;
	}

	public void setPvcMountDescs(String pvcMountDescs) {
		this.pvcMountDescs = pvcMountDescs;
		if(pvcMountDescs != null){
			putQueryParameter("PvcMountDescs", pvcMountDescs);
		}
	}

	public Integer getMcpuRequest() {
		return this.mcpuRequest;
	}

	public void setMcpuRequest(Integer mcpuRequest) {
		this.mcpuRequest = mcpuRequest;
		if(mcpuRequest != null){
			putQueryParameter("McpuRequest", mcpuRequest.toString());
		}
	}

	public String getVolumesStr() {
		return this.volumesStr;
	}

	public void setVolumesStr(String volumesStr) {
		this.volumesStr = volumesStr;
		if(volumesStr != null){
			putQueryParameter("VolumesStr", volumesStr);
		}
	}

	public Boolean getLosslessRuleAligned() {
		return this.losslessRuleAligned;
	}

	public void setLosslessRuleAligned(Boolean losslessRuleAligned) {
		this.losslessRuleAligned = losslessRuleAligned;
		if(losslessRuleAligned != null){
			putQueryParameter("LosslessRuleAligned", losslessRuleAligned.toString());
		}
	}

	public String getJavaStartUpConfig() {
		return this.javaStartUpConfig;
	}

	public void setJavaStartUpConfig(String javaStartUpConfig) {
		this.javaStartUpConfig = javaStartUpConfig;
		if(javaStartUpConfig != null){
			putQueryParameter("JavaStartUpConfig", javaStartUpConfig);
		}
	}

	@Override
	public Class<DeployK8sApplicationResponse> getResponseClass() {
		return DeployK8sApplicationResponse.class;
	}

}
