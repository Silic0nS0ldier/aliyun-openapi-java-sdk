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

package com.aliyuncs.slb.model.v20130221;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.slb.transform.v20130221.DescribeLoadBalancerAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLoadBalancerAttributeResponse extends AcsResponse {

	private String vpcId;

	private Long createTimeStamp;

	private String loadBalancerSpec;

	private Long autoReleaseTime;

	private String isPublicAddress;

	private String createTime;

	private String loadBalancerId;

	private String payType;

	private String addressType;

	private String networkType;

	private String regionId;

	private String endTime;

	private String vSwitchId;

	private String requestId;

	private Integer bandwidth;

	private String loadBalancerStatus;

	private String loadBalancerName;

	private String internetChargeType;

	private String address;

	private String slaveZoneId;

	private Long endTimeStamp;

	private String regionIdAlias;

	private String masterZoneId;

	private List<ListenerPortAndProtocal> listenerPortsAndProtocal;

	private List<ListenerPortAndProtocol> listenerPortsAndProtocol;

	private List<BackendServer> backendServers;

	private List<String> listenerPorts;

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}

	public Long getCreateTimeStamp() {
		return this.createTimeStamp;
	}

	public void setCreateTimeStamp(Long createTimeStamp) {
		this.createTimeStamp = createTimeStamp;
	}

	public String getLoadBalancerSpec() {
		return this.loadBalancerSpec;
	}

	public void setLoadBalancerSpec(String loadBalancerSpec) {
		this.loadBalancerSpec = loadBalancerSpec;
	}

	public Long getAutoReleaseTime() {
		return this.autoReleaseTime;
	}

	public void setAutoReleaseTime(Long autoReleaseTime) {
		this.autoReleaseTime = autoReleaseTime;
	}

	public String getIsPublicAddress() {
		return this.isPublicAddress;
	}

	public void setIsPublicAddress(String isPublicAddress) {
		this.isPublicAddress = isPublicAddress;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getLoadBalancerId() {
		return this.loadBalancerId;
	}

	public void setLoadBalancerId(String loadBalancerId) {
		this.loadBalancerId = loadBalancerId;
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getAddressType() {
		return this.addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(Integer bandwidth) {
		this.bandwidth = bandwidth;
	}

	public String getLoadBalancerStatus() {
		return this.loadBalancerStatus;
	}

	public void setLoadBalancerStatus(String loadBalancerStatus) {
		this.loadBalancerStatus = loadBalancerStatus;
	}

	public String getLoadBalancerName() {
		return this.loadBalancerName;
	}

	public void setLoadBalancerName(String loadBalancerName) {
		this.loadBalancerName = loadBalancerName;
	}

	public String getInternetChargeType() {
		return this.internetChargeType;
	}

	public void setInternetChargeType(String internetChargeType) {
		this.internetChargeType = internetChargeType;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSlaveZoneId() {
		return this.slaveZoneId;
	}

	public void setSlaveZoneId(String slaveZoneId) {
		this.slaveZoneId = slaveZoneId;
	}

	public Long getEndTimeStamp() {
		return this.endTimeStamp;
	}

	public void setEndTimeStamp(Long endTimeStamp) {
		this.endTimeStamp = endTimeStamp;
	}

	public String getRegionIdAlias() {
		return this.regionIdAlias;
	}

	public void setRegionIdAlias(String regionIdAlias) {
		this.regionIdAlias = regionIdAlias;
	}

	public String getMasterZoneId() {
		return this.masterZoneId;
	}

	public void setMasterZoneId(String masterZoneId) {
		this.masterZoneId = masterZoneId;
	}

	public List<ListenerPortAndProtocal> getListenerPortsAndProtocal() {
		return this.listenerPortsAndProtocal;
	}

	public void setListenerPortsAndProtocal(List<ListenerPortAndProtocal> listenerPortsAndProtocal) {
		this.listenerPortsAndProtocal = listenerPortsAndProtocal;
	}

	public List<ListenerPortAndProtocol> getListenerPortsAndProtocol() {
		return this.listenerPortsAndProtocol;
	}

	public void setListenerPortsAndProtocol(List<ListenerPortAndProtocol> listenerPortsAndProtocol) {
		this.listenerPortsAndProtocol = listenerPortsAndProtocol;
	}

	public List<BackendServer> getBackendServers() {
		return this.backendServers;
	}

	public void setBackendServers(List<BackendServer> backendServers) {
		this.backendServers = backendServers;
	}

	public List<String> getListenerPorts() {
		return this.listenerPorts;
	}

	public void setListenerPorts(List<String> listenerPorts) {
		this.listenerPorts = listenerPorts;
	}

	public static class ListenerPortAndProtocal {

		private String listenerProtocal;

		private Integer listenerPort;

		public String getListenerProtocal() {
			return this.listenerProtocal;
		}

		public void setListenerProtocal(String listenerProtocal) {
			this.listenerProtocal = listenerProtocal;
		}

		public Integer getListenerPort() {
			return this.listenerPort;
		}

		public void setListenerPort(Integer listenerPort) {
			this.listenerPort = listenerPort;
		}
	}

	public static class ListenerPortAndProtocol {

		private Integer listenerPort;

		private String listenerProtocol;

		public Integer getListenerPort() {
			return this.listenerPort;
		}

		public void setListenerPort(Integer listenerPort) {
			this.listenerPort = listenerPort;
		}

		public String getListenerProtocol() {
			return this.listenerProtocol;
		}

		public void setListenerProtocol(String listenerProtocol) {
			this.listenerProtocol = listenerProtocol;
		}
	}

	public static class BackendServer {

		private Integer weight;

		private String serverId;

		public Integer getWeight() {
			return this.weight;
		}

		public void setWeight(Integer weight) {
			this.weight = weight;
		}

		public String getServerId() {
			return this.serverId;
		}

		public void setServerId(String serverId) {
			this.serverId = serverId;
		}
	}

	@Override
	public DescribeLoadBalancerAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeLoadBalancerAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
