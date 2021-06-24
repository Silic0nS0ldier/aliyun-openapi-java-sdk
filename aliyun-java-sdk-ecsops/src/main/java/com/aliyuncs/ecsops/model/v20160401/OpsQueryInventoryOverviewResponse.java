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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryInventoryOverviewResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryInventoryOverviewResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private String success;

	private Data data;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long memCycleDays;

		private Long cycleMem;

		private Long ds;

		private Long cycleCpu;

		private Long fragmentMem;

		private Long waterCpu;

		private Long cycleMemSaleRate;

		private String gmtModified;

		private Long elasticMem;

		private Long cpuCycleDays;

		private Long elasticCpu;

		private Long dailyIncreaseMem;

		private String gmtCreate;

		private Long waterMem;

		private Long cycleCpuSaleRate;

		private Long dailyIncreaseCpu;

		private String izNo;

		private String flavorFamily;

		private Long fragmentCpu;

		public Long getMemCycleDays() {
			return this.memCycleDays;
		}

		public void setMemCycleDays(Long memCycleDays) {
			this.memCycleDays = memCycleDays;
		}

		public Long getCycleMem() {
			return this.cycleMem;
		}

		public void setCycleMem(Long cycleMem) {
			this.cycleMem = cycleMem;
		}

		public Long getDs() {
			return this.ds;
		}

		public void setDs(Long ds) {
			this.ds = ds;
		}

		public Long getCycleCpu() {
			return this.cycleCpu;
		}

		public void setCycleCpu(Long cycleCpu) {
			this.cycleCpu = cycleCpu;
		}

		public Long getFragmentMem() {
			return this.fragmentMem;
		}

		public void setFragmentMem(Long fragmentMem) {
			this.fragmentMem = fragmentMem;
		}

		public Long getWaterCpu() {
			return this.waterCpu;
		}

		public void setWaterCpu(Long waterCpu) {
			this.waterCpu = waterCpu;
		}

		public Long getCycleMemSaleRate() {
			return this.cycleMemSaleRate;
		}

		public void setCycleMemSaleRate(Long cycleMemSaleRate) {
			this.cycleMemSaleRate = cycleMemSaleRate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Long getElasticMem() {
			return this.elasticMem;
		}

		public void setElasticMem(Long elasticMem) {
			this.elasticMem = elasticMem;
		}

		public Long getCpuCycleDays() {
			return this.cpuCycleDays;
		}

		public void setCpuCycleDays(Long cpuCycleDays) {
			this.cpuCycleDays = cpuCycleDays;
		}

		public Long getElasticCpu() {
			return this.elasticCpu;
		}

		public void setElasticCpu(Long elasticCpu) {
			this.elasticCpu = elasticCpu;
		}

		public Long getDailyIncreaseMem() {
			return this.dailyIncreaseMem;
		}

		public void setDailyIncreaseMem(Long dailyIncreaseMem) {
			this.dailyIncreaseMem = dailyIncreaseMem;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getWaterMem() {
			return this.waterMem;
		}

		public void setWaterMem(Long waterMem) {
			this.waterMem = waterMem;
		}

		public Long getCycleCpuSaleRate() {
			return this.cycleCpuSaleRate;
		}

		public void setCycleCpuSaleRate(Long cycleCpuSaleRate) {
			this.cycleCpuSaleRate = cycleCpuSaleRate;
		}

		public Long getDailyIncreaseCpu() {
			return this.dailyIncreaseCpu;
		}

		public void setDailyIncreaseCpu(Long dailyIncreaseCpu) {
			this.dailyIncreaseCpu = dailyIncreaseCpu;
		}

		public String getIzNo() {
			return this.izNo;
		}

		public void setIzNo(String izNo) {
			this.izNo = izNo;
		}

		public String getFlavorFamily() {
			return this.flavorFamily;
		}

		public void setFlavorFamily(String flavorFamily) {
			this.flavorFamily = flavorFamily;
		}

		public Long getFragmentCpu() {
			return this.fragmentCpu;
		}

		public void setFragmentCpu(Long fragmentCpu) {
			this.fragmentCpu = fragmentCpu;
		}
	}

	@Override
	public OpsQueryInventoryOverviewResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryInventoryOverviewResponseUnmarshaller.unmarshall(this, context);
	}
}
