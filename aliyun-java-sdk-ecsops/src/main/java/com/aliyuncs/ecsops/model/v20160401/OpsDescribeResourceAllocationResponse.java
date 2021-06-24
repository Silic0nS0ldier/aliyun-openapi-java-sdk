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
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeResourceAllocationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeResourceAllocationResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Boolean success;

	private ResourcePlanningResponse resourcePlanningResponse;

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public ResourcePlanningResponse getResourcePlanningResponse() {
		return this.resourcePlanningResponse;
	}

	public void setResourcePlanningResponse(ResourcePlanningResponse resourcePlanningResponse) {
		this.resourcePlanningResponse = resourcePlanningResponse;
	}

	public static class ResourcePlanningResponse {

		private Integer satisfiedAmount;

		private List<ResourceModel> resourceModels;

		public Integer getSatisfiedAmount() {
			return this.satisfiedAmount;
		}

		public void setSatisfiedAmount(Integer satisfiedAmount) {
			this.satisfiedAmount = satisfiedAmount;
		}

		public List<ResourceModel> getResourceModels() {
			return this.resourceModels;
		}

		public void setResourceModels(List<ResourceModel> resourceModels) {
			this.resourceModels = resourceModels;
		}

		public static class ResourceModel {

			private String resourcePoolName;

			private String regionId;

			private Float maxPrice;

			private String networkType;

			private String spotStrategy;

			private String instanceChargeType;

			private Integer amount;

			private String ioOptimized;

			private Float price;

			private String zoneId;

			private Float weightedCapacity;

			private List<SpotPlanningModel> spotPlanningModels;

			private InstanceType instanceType;

			public String getResourcePoolName() {
				return this.resourcePoolName;
			}

			public void setResourcePoolName(String resourcePoolName) {
				this.resourcePoolName = resourcePoolName;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public Float getMaxPrice() {
				return this.maxPrice;
			}

			public void setMaxPrice(Float maxPrice) {
				this.maxPrice = maxPrice;
			}

			public String getNetworkType() {
				return this.networkType;
			}

			public void setNetworkType(String networkType) {
				this.networkType = networkType;
			}

			public String getSpotStrategy() {
				return this.spotStrategy;
			}

			public void setSpotStrategy(String spotStrategy) {
				this.spotStrategy = spotStrategy;
			}

			public String getInstanceChargeType() {
				return this.instanceChargeType;
			}

			public void setInstanceChargeType(String instanceChargeType) {
				this.instanceChargeType = instanceChargeType;
			}

			public Integer getAmount() {
				return this.amount;
			}

			public void setAmount(Integer amount) {
				this.amount = amount;
			}

			public String getIoOptimized() {
				return this.ioOptimized;
			}

			public void setIoOptimized(String ioOptimized) {
				this.ioOptimized = ioOptimized;
			}

			public Float getPrice() {
				return this.price;
			}

			public void setPrice(Float price) {
				this.price = price;
			}

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public Float getWeightedCapacity() {
				return this.weightedCapacity;
			}

			public void setWeightedCapacity(Float weightedCapacity) {
				this.weightedCapacity = weightedCapacity;
			}

			public List<SpotPlanningModel> getSpotPlanningModels() {
				return this.spotPlanningModels;
			}

			public void setSpotPlanningModels(List<SpotPlanningModel> spotPlanningModels) {
				this.spotPlanningModels = spotPlanningModels;
			}

			public InstanceType getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(InstanceType instanceType) {
				this.instanceType = instanceType;
			}

			public static class SpotPlanningModel {

				private Integer amount;

				private Integer discount;

				private Float originPrice;

				public Integer getAmount() {
					return this.amount;
				}

				public void setAmount(Integer amount) {
					this.amount = amount;
				}

				public Integer getDiscount() {
					return this.discount;
				}

				public void setDiscount(Integer discount) {
					this.discount = discount;
				}

				public Float getOriginPrice() {
					return this.originPrice;
				}

				public void setOriginPrice(Float originPrice) {
					this.originPrice = originPrice;
				}
			}

			public static class InstanceType {

				private String supportIoOptimized;

				private Integer cores;

				private String instanceFamilyLevel;

				private Integer memory;

				private String instanceType;

				private String instanceTypeFamily;

				private String generation;

				public String getSupportIoOptimized() {
					return this.supportIoOptimized;
				}

				public void setSupportIoOptimized(String supportIoOptimized) {
					this.supportIoOptimized = supportIoOptimized;
				}

				public Integer getCores() {
					return this.cores;
				}

				public void setCores(Integer cores) {
					this.cores = cores;
				}

				public String getInstanceFamilyLevel() {
					return this.instanceFamilyLevel;
				}

				public void setInstanceFamilyLevel(String instanceFamilyLevel) {
					this.instanceFamilyLevel = instanceFamilyLevel;
				}

				public Integer getMemory() {
					return this.memory;
				}

				public void setMemory(Integer memory) {
					this.memory = memory;
				}

				public String getInstanceType() {
					return this.instanceType;
				}

				public void setInstanceType(String instanceType) {
					this.instanceType = instanceType;
				}

				public String getInstanceTypeFamily() {
					return this.instanceTypeFamily;
				}

				public void setInstanceTypeFamily(String instanceTypeFamily) {
					this.instanceTypeFamily = instanceTypeFamily;
				}

				public String getGeneration() {
					return this.generation;
				}

				public void setGeneration(String generation) {
					this.generation = generation;
				}
			}
		}
	}

	@Override
	public OpsDescribeResourceAllocationResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeResourceAllocationResponseUnmarshaller.unmarshall(this, context);
	}
}
