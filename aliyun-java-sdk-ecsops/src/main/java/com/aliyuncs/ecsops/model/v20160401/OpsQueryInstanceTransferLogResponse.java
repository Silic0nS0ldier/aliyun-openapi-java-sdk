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
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryInstanceTransferLogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryInstanceTransferLogResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer total;

	private Integer pageNo;

	private List<TransferLog> transferLogs;

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public List<TransferLog> getTransferLogs() {
		return this.transferLogs;
	}

	public void setTransferLogs(List<TransferLog> transferLogs) {
		this.transferLogs = transferLogs;
	}

	public static class TransferLog {

		private String oldVmTypeFamily;

		private String status;

		private String newPrivateBps;

		private String newPrivatePps;

		private String newPublicPps;

		private String oldPrivateBps;

		private String newVmTypeFamily;

		private String oldGpu;

		private String oldDiskIo2;

		private String oldPrivatePps;

		private String oldNcIp;

		private String newVmType;

		private Long oldMemory;

		private String newNcId;

		private String oldVecus;

		private String newDiskIo1;

		private String oldNcId;

		private String oldPublicPps;

		private String newGpu;

		private String oldNodeIds;

		private String createdTime;

		private String oldLocaldiskIsdeleted;

		private String newPublicBps;

		private String oldPublicBps;

		private String oldVcpus;

		private String newNodeIds;

		private String newVecus;

		private String oldLocaldiskIds;

		private String newMemory;

		private String instanceId;

		private String newIops;

		private String newNcIp;

		private String newDiskIo2;

		private String oldDiskIo1;

		private String modifiedTime;

		private String oldIops;

		private String newVcpus;

		private String reason;

		private String oldVmType;

		private Long id;

		public String getOldVmTypeFamily() {
			return this.oldVmTypeFamily;
		}

		public void setOldVmTypeFamily(String oldVmTypeFamily) {
			this.oldVmTypeFamily = oldVmTypeFamily;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getNewPrivateBps() {
			return this.newPrivateBps;
		}

		public void setNewPrivateBps(String newPrivateBps) {
			this.newPrivateBps = newPrivateBps;
		}

		public String getNewPrivatePps() {
			return this.newPrivatePps;
		}

		public void setNewPrivatePps(String newPrivatePps) {
			this.newPrivatePps = newPrivatePps;
		}

		public String getNewPublicPps() {
			return this.newPublicPps;
		}

		public void setNewPublicPps(String newPublicPps) {
			this.newPublicPps = newPublicPps;
		}

		public String getOldPrivateBps() {
			return this.oldPrivateBps;
		}

		public void setOldPrivateBps(String oldPrivateBps) {
			this.oldPrivateBps = oldPrivateBps;
		}

		public String getNewVmTypeFamily() {
			return this.newVmTypeFamily;
		}

		public void setNewVmTypeFamily(String newVmTypeFamily) {
			this.newVmTypeFamily = newVmTypeFamily;
		}

		public String getOldGpu() {
			return this.oldGpu;
		}

		public void setOldGpu(String oldGpu) {
			this.oldGpu = oldGpu;
		}

		public String getOldDiskIo2() {
			return this.oldDiskIo2;
		}

		public void setOldDiskIo2(String oldDiskIo2) {
			this.oldDiskIo2 = oldDiskIo2;
		}

		public String getOldPrivatePps() {
			return this.oldPrivatePps;
		}

		public void setOldPrivatePps(String oldPrivatePps) {
			this.oldPrivatePps = oldPrivatePps;
		}

		public String getOldNcIp() {
			return this.oldNcIp;
		}

		public void setOldNcIp(String oldNcIp) {
			this.oldNcIp = oldNcIp;
		}

		public String getNewVmType() {
			return this.newVmType;
		}

		public void setNewVmType(String newVmType) {
			this.newVmType = newVmType;
		}

		public Long getOldMemory() {
			return this.oldMemory;
		}

		public void setOldMemory(Long oldMemory) {
			this.oldMemory = oldMemory;
		}

		public String getNewNcId() {
			return this.newNcId;
		}

		public void setNewNcId(String newNcId) {
			this.newNcId = newNcId;
		}

		public String getOldVecus() {
			return this.oldVecus;
		}

		public void setOldVecus(String oldVecus) {
			this.oldVecus = oldVecus;
		}

		public String getNewDiskIo1() {
			return this.newDiskIo1;
		}

		public void setNewDiskIo1(String newDiskIo1) {
			this.newDiskIo1 = newDiskIo1;
		}

		public String getOldNcId() {
			return this.oldNcId;
		}

		public void setOldNcId(String oldNcId) {
			this.oldNcId = oldNcId;
		}

		public String getOldPublicPps() {
			return this.oldPublicPps;
		}

		public void setOldPublicPps(String oldPublicPps) {
			this.oldPublicPps = oldPublicPps;
		}

		public String getNewGpu() {
			return this.newGpu;
		}

		public void setNewGpu(String newGpu) {
			this.newGpu = newGpu;
		}

		public String getOldNodeIds() {
			return this.oldNodeIds;
		}

		public void setOldNodeIds(String oldNodeIds) {
			this.oldNodeIds = oldNodeIds;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public String getOldLocaldiskIsdeleted() {
			return this.oldLocaldiskIsdeleted;
		}

		public void setOldLocaldiskIsdeleted(String oldLocaldiskIsdeleted) {
			this.oldLocaldiskIsdeleted = oldLocaldiskIsdeleted;
		}

		public String getNewPublicBps() {
			return this.newPublicBps;
		}

		public void setNewPublicBps(String newPublicBps) {
			this.newPublicBps = newPublicBps;
		}

		public String getOldPublicBps() {
			return this.oldPublicBps;
		}

		public void setOldPublicBps(String oldPublicBps) {
			this.oldPublicBps = oldPublicBps;
		}

		public String getOldVcpus() {
			return this.oldVcpus;
		}

		public void setOldVcpus(String oldVcpus) {
			this.oldVcpus = oldVcpus;
		}

		public String getNewNodeIds() {
			return this.newNodeIds;
		}

		public void setNewNodeIds(String newNodeIds) {
			this.newNodeIds = newNodeIds;
		}

		public String getNewVecus() {
			return this.newVecus;
		}

		public void setNewVecus(String newVecus) {
			this.newVecus = newVecus;
		}

		public String getOldLocaldiskIds() {
			return this.oldLocaldiskIds;
		}

		public void setOldLocaldiskIds(String oldLocaldiskIds) {
			this.oldLocaldiskIds = oldLocaldiskIds;
		}

		public String getNewMemory() {
			return this.newMemory;
		}

		public void setNewMemory(String newMemory) {
			this.newMemory = newMemory;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getNewIops() {
			return this.newIops;
		}

		public void setNewIops(String newIops) {
			this.newIops = newIops;
		}

		public String getNewNcIp() {
			return this.newNcIp;
		}

		public void setNewNcIp(String newNcIp) {
			this.newNcIp = newNcIp;
		}

		public String getNewDiskIo2() {
			return this.newDiskIo2;
		}

		public void setNewDiskIo2(String newDiskIo2) {
			this.newDiskIo2 = newDiskIo2;
		}

		public String getOldDiskIo1() {
			return this.oldDiskIo1;
		}

		public void setOldDiskIo1(String oldDiskIo1) {
			this.oldDiskIo1 = oldDiskIo1;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getOldIops() {
			return this.oldIops;
		}

		public void setOldIops(String oldIops) {
			this.oldIops = oldIops;
		}

		public String getNewVcpus() {
			return this.newVcpus;
		}

		public void setNewVcpus(String newVcpus) {
			this.newVcpus = newVcpus;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public String getOldVmType() {
			return this.oldVmType;
		}

		public void setOldVmType(String oldVmType) {
			this.oldVmType = oldVmType;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}
	}

	@Override
	public OpsQueryInstanceTransferLogResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryInstanceTransferLogResponseUnmarshaller.unmarshall(this, context);
	}
}
