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
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribePurchasesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribePurchasesResponse extends AcsResponse {

	private Integer totalCount;

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private List<PurchaseSet> purchaseSets;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<PurchaseSet> getPurchaseSets() {
		return this.purchaseSets;
	}

	public void setPurchaseSets(List<PurchaseSet> purchaseSets) {
		this.purchaseSets = purchaseSets;
	}

	public static class PurchaseSet {

		private String status;

		private String endDate;

		private Long userId;

		private String startDate;

		private String instanceId;

		private String orderType;

		private Long orderId;

		private Long id;

		private List<Component> components;

		private List<Property2> properties;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getEndDate() {
			return this.endDate;
		}

		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}

		public Long getUserId() {
			return this.userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

		public String getStartDate() {
			return this.startDate;
		}

		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getOrderType() {
			return this.orderType;
		}

		public void setOrderType(String orderType) {
			this.orderType = orderType;
		}

		public Long getOrderId() {
			return this.orderId;
		}

		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public List<Component> getComponents() {
			return this.components;
		}

		public void setComponents(List<Component> components) {
			this.components = components;
		}

		public List<Property2> getProperties() {
			return this.properties;
		}

		public void setProperties(List<Property2> properties) {
			this.properties = properties;
		}

		public static class Component {

			private Long moduleAttrStatus;

			private String tag;

			private String componentCode;

			private List<Property> properties1;

			public Long getModuleAttrStatus() {
				return this.moduleAttrStatus;
			}

			public void setModuleAttrStatus(Long moduleAttrStatus) {
				this.moduleAttrStatus = moduleAttrStatus;
			}

			public String getTag() {
				return this.tag;
			}

			public void setTag(String tag) {
				this.tag = tag;
			}

			public String getComponentCode() {
				return this.componentCode;
			}

			public void setComponentCode(String componentCode) {
				this.componentCode = componentCode;
			}

			public List<Property> getProperties1() {
				return this.properties1;
			}

			public void setProperties1(List<Property> properties1) {
				this.properties1 = properties1;
			}

			public static class Property {

				private String value;

				private String code;

				private String name;

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getCode() {
					return this.code;
				}

				public void setCode(String code) {
					this.code = code;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}
		}

		public static class Property2 {

			private String value;

			private String code;

			private String name;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}
	}

	@Override
	public OpsDescribePurchasesResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribePurchasesResponseUnmarshaller.unmarshall(this, context);
	}
}
