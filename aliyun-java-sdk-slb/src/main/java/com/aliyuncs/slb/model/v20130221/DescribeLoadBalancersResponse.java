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
import com.aliyuncs.slb.transform.v20130221.DescribeLoadBalancersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLoadBalancersResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<LoadBalancer> loadBalancers;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<LoadBalancer> getLoadBalancers() {
		return this.loadBalancers;
	}

	public void setLoadBalancers(List<LoadBalancer> loadBalancers) {
		this.loadBalancers = loadBalancers;
	}

	public static class LoadBalancer {

		private String vpcId;

		private Long createTimeStamp;

		private String createTime;

		private String loadBalancerId;

		private String payType;

		private String addressType;

		private String networkType;

		private String regionId;

		private String vSwitchId;

		private String loadBalancerStatus;

		private String loadBalancerName;

		private String resourceGroupId;

		private String internetChargeType;

		private String address;

		private String slaveZoneId;

		private String regionIdAlias;

		private String masterZoneId;

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

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
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

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
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
	}

	@Override
	public DescribeLoadBalancersResponse getInstance(UnmarshallerContext context) {
		return	DescribeLoadBalancersResponseUnmarshaller.unmarshall(this, context);
	}
}
