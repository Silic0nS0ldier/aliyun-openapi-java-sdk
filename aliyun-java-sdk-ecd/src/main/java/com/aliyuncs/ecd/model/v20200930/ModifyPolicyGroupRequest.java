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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyPolicyGroupRequest extends RpcAcsRequest<ModifyPolicyGroupResponse> {
	   

	private Long recordingExpires;

	private List<RevokeSecurityPolicyRule> revokeSecurityPolicyRules;

	private String printerRedirection;

	private List<String> preemptLoginUsers;

	private String domainList;

	private String netRedirect;

	private String localDrive;

	private List<AuthorizeSecurityPolicyRule> authorizeSecurityPolicyRules;

	private String clipboard;

	private String usbRedirect;

	private String watermarkType;

	private String recordingStartTime;

	private Integer recordingDuration;

	private List<RevokeAccessPolicyRule> revokeAccessPolicyRules;

	private String watermark;

	private String cameraRedirect;

	private String appContentProtection;

	private List<AuthorizeAccessPolicyRule> authorizeAccessPolicyRules;

	private String watermarkTransparency;

	private String name;

	private String policyGroupId;

	private String preemptLogin;

	private List<ClientType> clientTypes;

	private List<UsbSupplyRedirectRule> usbSupplyRedirectRules;

	private String recording;

	private List<String> scopeValues;

	private Long recordingFps;

	private String recordContent;

	private String scope;

	private Long recordContentExpires;

	private String recordingAudio;

	private String remoteCoordinate;

	private String html5Access;

	private String gpuAcceleration;

	private String html5FileTransfer;

	private String visualQuality;

	private String recordingEndTime;

	private String internetCommunicationProtocol;
	public ModifyPolicyGroupRequest() {
		super("ecd", "2020-09-30", "ModifyPolicyGroup");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getRecordingExpires() {
		return this.recordingExpires;
	}

	public void setRecordingExpires(Long recordingExpires) {
		this.recordingExpires = recordingExpires;
		if(recordingExpires != null){
			putQueryParameter("RecordingExpires", recordingExpires.toString());
		}
	}

	public List<RevokeSecurityPolicyRule> getRevokeSecurityPolicyRules() {
		return this.revokeSecurityPolicyRules;
	}

	public void setRevokeSecurityPolicyRules(List<RevokeSecurityPolicyRule> revokeSecurityPolicyRules) {
		this.revokeSecurityPolicyRules = revokeSecurityPolicyRules;	
		if (revokeSecurityPolicyRules != null) {
			for (int depth1 = 0; depth1 < revokeSecurityPolicyRules.size(); depth1++) {
				putQueryParameter("RevokeSecurityPolicyRule." + (depth1 + 1) + ".PortRange" , revokeSecurityPolicyRules.get(depth1).getPortRange());
				putQueryParameter("RevokeSecurityPolicyRule." + (depth1 + 1) + ".IpProtocol" , revokeSecurityPolicyRules.get(depth1).getIpProtocol());
				putQueryParameter("RevokeSecurityPolicyRule." + (depth1 + 1) + ".Description" , revokeSecurityPolicyRules.get(depth1).getDescription());
				putQueryParameter("RevokeSecurityPolicyRule." + (depth1 + 1) + ".Type" , revokeSecurityPolicyRules.get(depth1).getType());
				putQueryParameter("RevokeSecurityPolicyRule." + (depth1 + 1) + ".Priority" , revokeSecurityPolicyRules.get(depth1).getPriority());
				putQueryParameter("RevokeSecurityPolicyRule." + (depth1 + 1) + ".CidrIp" , revokeSecurityPolicyRules.get(depth1).getCidrIp());
				putQueryParameter("RevokeSecurityPolicyRule." + (depth1 + 1) + ".Policy" , revokeSecurityPolicyRules.get(depth1).getPolicy());
			}
		}	
	}

	public String getPrinterRedirection() {
		return this.printerRedirection;
	}

	public void setPrinterRedirection(String printerRedirection) {
		this.printerRedirection = printerRedirection;
		if(printerRedirection != null){
			putQueryParameter("PrinterRedirection", printerRedirection);
		}
	}

	public List<String> getPreemptLoginUsers() {
		return this.preemptLoginUsers;
	}

	public void setPreemptLoginUsers(List<String> preemptLoginUsers) {
		this.preemptLoginUsers = preemptLoginUsers;	
		if (preemptLoginUsers != null) {
			for (int i = 0; i < preemptLoginUsers.size(); i++) {
				putQueryParameter("PreemptLoginUser." + (i + 1) , preemptLoginUsers.get(i));
			}
		}	
	}

	public String getDomainList() {
		return this.domainList;
	}

	public void setDomainList(String domainList) {
		this.domainList = domainList;
		if(domainList != null){
			putQueryParameter("DomainList", domainList);
		}
	}

	public String getNetRedirect() {
		return this.netRedirect;
	}

	public void setNetRedirect(String netRedirect) {
		this.netRedirect = netRedirect;
		if(netRedirect != null){
			putQueryParameter("NetRedirect", netRedirect);
		}
	}

	public String getLocalDrive() {
		return this.localDrive;
	}

	public void setLocalDrive(String localDrive) {
		this.localDrive = localDrive;
		if(localDrive != null){
			putQueryParameter("LocalDrive", localDrive);
		}
	}

	public List<AuthorizeSecurityPolicyRule> getAuthorizeSecurityPolicyRules() {
		return this.authorizeSecurityPolicyRules;
	}

	public void setAuthorizeSecurityPolicyRules(List<AuthorizeSecurityPolicyRule> authorizeSecurityPolicyRules) {
		this.authorizeSecurityPolicyRules = authorizeSecurityPolicyRules;	
		if (authorizeSecurityPolicyRules != null) {
			for (int depth1 = 0; depth1 < authorizeSecurityPolicyRules.size(); depth1++) {
				putQueryParameter("AuthorizeSecurityPolicyRule." + (depth1 + 1) + ".PortRange" , authorizeSecurityPolicyRules.get(depth1).getPortRange());
				putQueryParameter("AuthorizeSecurityPolicyRule." + (depth1 + 1) + ".IpProtocol" , authorizeSecurityPolicyRules.get(depth1).getIpProtocol());
				putQueryParameter("AuthorizeSecurityPolicyRule." + (depth1 + 1) + ".Description" , authorizeSecurityPolicyRules.get(depth1).getDescription());
				putQueryParameter("AuthorizeSecurityPolicyRule." + (depth1 + 1) + ".Type" , authorizeSecurityPolicyRules.get(depth1).getType());
				putQueryParameter("AuthorizeSecurityPolicyRule." + (depth1 + 1) + ".Priority" , authorizeSecurityPolicyRules.get(depth1).getPriority());
				putQueryParameter("AuthorizeSecurityPolicyRule." + (depth1 + 1) + ".CidrIp" , authorizeSecurityPolicyRules.get(depth1).getCidrIp());
				putQueryParameter("AuthorizeSecurityPolicyRule." + (depth1 + 1) + ".Policy" , authorizeSecurityPolicyRules.get(depth1).getPolicy());
			}
		}	
	}

	public String getClipboard() {
		return this.clipboard;
	}

	public void setClipboard(String clipboard) {
		this.clipboard = clipboard;
		if(clipboard != null){
			putQueryParameter("Clipboard", clipboard);
		}
	}

	public String getUsbRedirect() {
		return this.usbRedirect;
	}

	public void setUsbRedirect(String usbRedirect) {
		this.usbRedirect = usbRedirect;
		if(usbRedirect != null){
			putQueryParameter("UsbRedirect", usbRedirect);
		}
	}

	public String getWatermarkType() {
		return this.watermarkType;
	}

	public void setWatermarkType(String watermarkType) {
		this.watermarkType = watermarkType;
		if(watermarkType != null){
			putQueryParameter("WatermarkType", watermarkType);
		}
	}

	public String getRecordingStartTime() {
		return this.recordingStartTime;
	}

	public void setRecordingStartTime(String recordingStartTime) {
		this.recordingStartTime = recordingStartTime;
		if(recordingStartTime != null){
			putQueryParameter("RecordingStartTime", recordingStartTime);
		}
	}

	public Integer getRecordingDuration() {
		return this.recordingDuration;
	}

	public void setRecordingDuration(Integer recordingDuration) {
		this.recordingDuration = recordingDuration;
		if(recordingDuration != null){
			putQueryParameter("RecordingDuration", recordingDuration.toString());
		}
	}

	public List<RevokeAccessPolicyRule> getRevokeAccessPolicyRules() {
		return this.revokeAccessPolicyRules;
	}

	public void setRevokeAccessPolicyRules(List<RevokeAccessPolicyRule> revokeAccessPolicyRules) {
		this.revokeAccessPolicyRules = revokeAccessPolicyRules;	
		if (revokeAccessPolicyRules != null) {
			for (int depth1 = 0; depth1 < revokeAccessPolicyRules.size(); depth1++) {
				putQueryParameter("RevokeAccessPolicyRule." + (depth1 + 1) + ".Description" , revokeAccessPolicyRules.get(depth1).getDescription());
				putQueryParameter("RevokeAccessPolicyRule." + (depth1 + 1) + ".CidrIp" , revokeAccessPolicyRules.get(depth1).getCidrIp());
			}
		}	
	}

	public String getWatermark() {
		return this.watermark;
	}

	public void setWatermark(String watermark) {
		this.watermark = watermark;
		if(watermark != null){
			putQueryParameter("Watermark", watermark);
		}
	}

	public String getCameraRedirect() {
		return this.cameraRedirect;
	}

	public void setCameraRedirect(String cameraRedirect) {
		this.cameraRedirect = cameraRedirect;
		if(cameraRedirect != null){
			putQueryParameter("CameraRedirect", cameraRedirect);
		}
	}

	public String getAppContentProtection() {
		return this.appContentProtection;
	}

	public void setAppContentProtection(String appContentProtection) {
		this.appContentProtection = appContentProtection;
		if(appContentProtection != null){
			putQueryParameter("AppContentProtection", appContentProtection);
		}
	}

	public List<AuthorizeAccessPolicyRule> getAuthorizeAccessPolicyRules() {
		return this.authorizeAccessPolicyRules;
	}

	public void setAuthorizeAccessPolicyRules(List<AuthorizeAccessPolicyRule> authorizeAccessPolicyRules) {
		this.authorizeAccessPolicyRules = authorizeAccessPolicyRules;	
		if (authorizeAccessPolicyRules != null) {
			for (int depth1 = 0; depth1 < authorizeAccessPolicyRules.size(); depth1++) {
				putQueryParameter("AuthorizeAccessPolicyRule." + (depth1 + 1) + ".Description" , authorizeAccessPolicyRules.get(depth1).getDescription());
				putQueryParameter("AuthorizeAccessPolicyRule." + (depth1 + 1) + ".CidrIp" , authorizeAccessPolicyRules.get(depth1).getCidrIp());
			}
		}	
	}

	public String getWatermarkTransparency() {
		return this.watermarkTransparency;
	}

	public void setWatermarkTransparency(String watermarkTransparency) {
		this.watermarkTransparency = watermarkTransparency;
		if(watermarkTransparency != null){
			putQueryParameter("WatermarkTransparency", watermarkTransparency);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getPolicyGroupId() {
		return this.policyGroupId;
	}

	public void setPolicyGroupId(String policyGroupId) {
		this.policyGroupId = policyGroupId;
		if(policyGroupId != null){
			putQueryParameter("PolicyGroupId", policyGroupId);
		}
	}

	public String getPreemptLogin() {
		return this.preemptLogin;
	}

	public void setPreemptLogin(String preemptLogin) {
		this.preemptLogin = preemptLogin;
		if(preemptLogin != null){
			putQueryParameter("PreemptLogin", preemptLogin);
		}
	}

	public List<ClientType> getClientTypes() {
		return this.clientTypes;
	}

	public void setClientTypes(List<ClientType> clientTypes) {
		this.clientTypes = clientTypes;	
		if (clientTypes != null) {
			for (int depth1 = 0; depth1 < clientTypes.size(); depth1++) {
				putQueryParameter("ClientType." + (depth1 + 1) + ".ClientType" , clientTypes.get(depth1).getClientType());
				putQueryParameter("ClientType." + (depth1 + 1) + ".Status" , clientTypes.get(depth1).getStatus());
			}
		}	
	}

	public List<UsbSupplyRedirectRule> getUsbSupplyRedirectRules() {
		return this.usbSupplyRedirectRules;
	}

	public void setUsbSupplyRedirectRules(List<UsbSupplyRedirectRule> usbSupplyRedirectRules) {
		this.usbSupplyRedirectRules = usbSupplyRedirectRules;	
		if (usbSupplyRedirectRules != null) {
			for (int depth1 = 0; depth1 < usbSupplyRedirectRules.size(); depth1++) {
				putQueryParameter("UsbSupplyRedirectRule." + (depth1 + 1) + ".ProductId" , usbSupplyRedirectRules.get(depth1).getProductId());
				putQueryParameter("UsbSupplyRedirectRule." + (depth1 + 1) + ".DeviceSubclass" , usbSupplyRedirectRules.get(depth1).getDeviceSubclass());
				putQueryParameter("UsbSupplyRedirectRule." + (depth1 + 1) + ".UsbRedirectType" , usbSupplyRedirectRules.get(depth1).getUsbRedirectType());
				putQueryParameter("UsbSupplyRedirectRule." + (depth1 + 1) + ".VendorId" , usbSupplyRedirectRules.get(depth1).getVendorId());
				putQueryParameter("UsbSupplyRedirectRule." + (depth1 + 1) + ".Description" , usbSupplyRedirectRules.get(depth1).getDescription());
				putQueryParameter("UsbSupplyRedirectRule." + (depth1 + 1) + ".DeviceClass" , usbSupplyRedirectRules.get(depth1).getDeviceClass());
				putQueryParameter("UsbSupplyRedirectRule." + (depth1 + 1) + ".UsbRuleType" , usbSupplyRedirectRules.get(depth1).getUsbRuleType());
			}
		}	
	}

	public String getRecording() {
		return this.recording;
	}

	public void setRecording(String recording) {
		this.recording = recording;
		if(recording != null){
			putQueryParameter("Recording", recording);
		}
	}

	public List<String> getScopeValues() {
		return this.scopeValues;
	}

	public void setScopeValues(List<String> scopeValues) {
		this.scopeValues = scopeValues;	
		if (scopeValues != null) {
			for (int i = 0; i < scopeValues.size(); i++) {
				putQueryParameter("ScopeValue." + (i + 1) , scopeValues.get(i));
			}
		}	
	}

	public Long getRecordingFps() {
		return this.recordingFps;
	}

	public void setRecordingFps(Long recordingFps) {
		this.recordingFps = recordingFps;
		if(recordingFps != null){
			putQueryParameter("RecordingFps", recordingFps.toString());
		}
	}

	public String getRecordContent() {
		return this.recordContent;
	}

	public void setRecordContent(String recordContent) {
		this.recordContent = recordContent;
		if(recordContent != null){
			putQueryParameter("RecordContent", recordContent);
		}
	}

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
		if(scope != null){
			putQueryParameter("Scope", scope);
		}
	}

	public Long getRecordContentExpires() {
		return this.recordContentExpires;
	}

	public void setRecordContentExpires(Long recordContentExpires) {
		this.recordContentExpires = recordContentExpires;
		if(recordContentExpires != null){
			putQueryParameter("RecordContentExpires", recordContentExpires.toString());
		}
	}

	public String getRecordingAudio() {
		return this.recordingAudio;
	}

	public void setRecordingAudio(String recordingAudio) {
		this.recordingAudio = recordingAudio;
		if(recordingAudio != null){
			putQueryParameter("RecordingAudio", recordingAudio);
		}
	}

	public String getRemoteCoordinate() {
		return this.remoteCoordinate;
	}

	public void setRemoteCoordinate(String remoteCoordinate) {
		this.remoteCoordinate = remoteCoordinate;
		if(remoteCoordinate != null){
			putQueryParameter("RemoteCoordinate", remoteCoordinate);
		}
	}

	public String getHtml5Access() {
		return this.html5Access;
	}

	public void setHtml5Access(String html5Access) {
		this.html5Access = html5Access;
		if(html5Access != null){
			putQueryParameter("Html5Access", html5Access);
		}
	}

	public String getGpuAcceleration() {
		return this.gpuAcceleration;
	}

	public void setGpuAcceleration(String gpuAcceleration) {
		this.gpuAcceleration = gpuAcceleration;
		if(gpuAcceleration != null){
			putQueryParameter("GpuAcceleration", gpuAcceleration);
		}
	}

	public String getHtml5FileTransfer() {
		return this.html5FileTransfer;
	}

	public void setHtml5FileTransfer(String html5FileTransfer) {
		this.html5FileTransfer = html5FileTransfer;
		if(html5FileTransfer != null){
			putQueryParameter("Html5FileTransfer", html5FileTransfer);
		}
	}

	public String getVisualQuality() {
		return this.visualQuality;
	}

	public void setVisualQuality(String visualQuality) {
		this.visualQuality = visualQuality;
		if(visualQuality != null){
			putQueryParameter("VisualQuality", visualQuality);
		}
	}

	public String getRecordingEndTime() {
		return this.recordingEndTime;
	}

	public void setRecordingEndTime(String recordingEndTime) {
		this.recordingEndTime = recordingEndTime;
		if(recordingEndTime != null){
			putQueryParameter("RecordingEndTime", recordingEndTime);
		}
	}

	public String getInternetCommunicationProtocol() {
		return this.internetCommunicationProtocol;
	}

	public void setInternetCommunicationProtocol(String internetCommunicationProtocol) {
		this.internetCommunicationProtocol = internetCommunicationProtocol;
		if(internetCommunicationProtocol != null){
			putQueryParameter("InternetCommunicationProtocol", internetCommunicationProtocol);
		}
	}

	public static class RevokeSecurityPolicyRule {

		private String portRange;

		private String ipProtocol;

		private String description;

		private String type;

		private String priority;

		private String cidrIp;

		private String policy;

		public String getPortRange() {
			return this.portRange;
		}

		public void setPortRange(String portRange) {
			this.portRange = portRange;
		}

		public String getIpProtocol() {
			return this.ipProtocol;
		}

		public void setIpProtocol(String ipProtocol) {
			this.ipProtocol = ipProtocol;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getPriority() {
			return this.priority;
		}

		public void setPriority(String priority) {
			this.priority = priority;
		}

		public String getCidrIp() {
			return this.cidrIp;
		}

		public void setCidrIp(String cidrIp) {
			this.cidrIp = cidrIp;
		}

		public String getPolicy() {
			return this.policy;
		}

		public void setPolicy(String policy) {
			this.policy = policy;
		}
	}

	public static class AuthorizeSecurityPolicyRule {

		private String portRange;

		private String ipProtocol;

		private String description;

		private String type;

		private String priority;

		private String cidrIp;

		private String policy;

		public String getPortRange() {
			return this.portRange;
		}

		public void setPortRange(String portRange) {
			this.portRange = portRange;
		}

		public String getIpProtocol() {
			return this.ipProtocol;
		}

		public void setIpProtocol(String ipProtocol) {
			this.ipProtocol = ipProtocol;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getPriority() {
			return this.priority;
		}

		public void setPriority(String priority) {
			this.priority = priority;
		}

		public String getCidrIp() {
			return this.cidrIp;
		}

		public void setCidrIp(String cidrIp) {
			this.cidrIp = cidrIp;
		}

		public String getPolicy() {
			return this.policy;
		}

		public void setPolicy(String policy) {
			this.policy = policy;
		}
	}

	public static class RevokeAccessPolicyRule {

		private String description;

		private String cidrIp;

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCidrIp() {
			return this.cidrIp;
		}

		public void setCidrIp(String cidrIp) {
			this.cidrIp = cidrIp;
		}
	}

	public static class AuthorizeAccessPolicyRule {

		private String description;

		private String cidrIp;

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCidrIp() {
			return this.cidrIp;
		}

		public void setCidrIp(String cidrIp) {
			this.cidrIp = cidrIp;
		}
	}

	public static class ClientType {

		private String clientType;

		private String status;

		public String getClientType() {
			return this.clientType;
		}

		public void setClientType(String clientType) {
			this.clientType = clientType;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	public static class UsbSupplyRedirectRule {

		private String productId;

		private String deviceSubclass;

		private Long usbRedirectType;

		private String vendorId;

		private String description;

		private String deviceClass;

		private Long usbRuleType;

		public String getProductId() {
			return this.productId;
		}

		public void setProductId(String productId) {
			this.productId = productId;
		}

		public String getDeviceSubclass() {
			return this.deviceSubclass;
		}

		public void setDeviceSubclass(String deviceSubclass) {
			this.deviceSubclass = deviceSubclass;
		}

		public Long getUsbRedirectType() {
			return this.usbRedirectType;
		}

		public void setUsbRedirectType(Long usbRedirectType) {
			this.usbRedirectType = usbRedirectType;
		}

		public String getVendorId() {
			return this.vendorId;
		}

		public void setVendorId(String vendorId) {
			this.vendorId = vendorId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getDeviceClass() {
			return this.deviceClass;
		}

		public void setDeviceClass(String deviceClass) {
			this.deviceClass = deviceClass;
		}

		public Long getUsbRuleType() {
			return this.usbRuleType;
		}

		public void setUsbRuleType(Long usbRuleType) {
			this.usbRuleType = usbRuleType;
		}
	}

	@Override
	public Class<ModifyPolicyGroupResponse> getResponseClass() {
		return ModifyPolicyGroupResponse.class;
	}

}
