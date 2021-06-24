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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryDetailImpactResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryDetailImpactResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private List<ImpactDetailInfo> impactDetailInfos;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ImpactDetailInfo> getImpactDetailInfos() {
		return this.impactDetailInfos;
	}

	public void setImpactDetailInfos(List<ImpactDetailInfo> impactDetailInfos) {
		this.impactDetailInfos = impactDetailInfos;
	}

	public static class ImpactDetailInfo {

		private String status;

		private String physicalModel;

		private String gcLevel;

		private String room;

		private String cluster;

		private String isStorageNc;

		private String ncIp;

		private String additionalInfo;

		private Float gocCores;

		private String region;

		private String warningLevel;

		private String asw;

		private String exceptionTime;

		private String isLocalDisk;

		private String idc;

		private String cores;

		private String productName;

		private String aZone;

		private String aliUid;

		private String instanceId;

		private String instanceType;

		private String isPhysicalMachine;

		private String rack;

		private String zone;

		private String reason;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getPhysicalModel() {
			return this.physicalModel;
		}

		public void setPhysicalModel(String physicalModel) {
			this.physicalModel = physicalModel;
		}

		public String getGcLevel() {
			return this.gcLevel;
		}

		public void setGcLevel(String gcLevel) {
			this.gcLevel = gcLevel;
		}

		public String getRoom() {
			return this.room;
		}

		public void setRoom(String room) {
			this.room = room;
		}

		public String getCluster() {
			return this.cluster;
		}

		public void setCluster(String cluster) {
			this.cluster = cluster;
		}

		public String getIsStorageNc() {
			return this.isStorageNc;
		}

		public void setIsStorageNc(String isStorageNc) {
			this.isStorageNc = isStorageNc;
		}

		public String getNcIp() {
			return this.ncIp;
		}

		public void setNcIp(String ncIp) {
			this.ncIp = ncIp;
		}

		public String getAdditionalInfo() {
			return this.additionalInfo;
		}

		public void setAdditionalInfo(String additionalInfo) {
			this.additionalInfo = additionalInfo;
		}

		public Float getGocCores() {
			return this.gocCores;
		}

		public void setGocCores(Float gocCores) {
			this.gocCores = gocCores;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getWarningLevel() {
			return this.warningLevel;
		}

		public void setWarningLevel(String warningLevel) {
			this.warningLevel = warningLevel;
		}

		public String getAsw() {
			return this.asw;
		}

		public void setAsw(String asw) {
			this.asw = asw;
		}

		public String getExceptionTime() {
			return this.exceptionTime;
		}

		public void setExceptionTime(String exceptionTime) {
			this.exceptionTime = exceptionTime;
		}

		public String getIsLocalDisk() {
			return this.isLocalDisk;
		}

		public void setIsLocalDisk(String isLocalDisk) {
			this.isLocalDisk = isLocalDisk;
		}

		public String getIdc() {
			return this.idc;
		}

		public void setIdc(String idc) {
			this.idc = idc;
		}

		public String getCores() {
			return this.cores;
		}

		public void setCores(String cores) {
			this.cores = cores;
		}

		public String getProductName() {
			return this.productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getAZone() {
			return this.aZone;
		}

		public void setAZone(String aZone) {
			this.aZone = aZone;
		}

		public String getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(String aliUid) {
			this.aliUid = aliUid;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getIsPhysicalMachine() {
			return this.isPhysicalMachine;
		}

		public void setIsPhysicalMachine(String isPhysicalMachine) {
			this.isPhysicalMachine = isPhysicalMachine;
		}

		public String getRack() {
			return this.rack;
		}

		public void setRack(String rack) {
			this.rack = rack;
		}

		public String getZone() {
			return this.zone;
		}

		public void setZone(String zone) {
			this.zone = zone;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}
	}

	@Override
	public OpsQueryDetailImpactResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryDetailImpactResponseUnmarshaller.unmarshall(this, context);
	}
}
