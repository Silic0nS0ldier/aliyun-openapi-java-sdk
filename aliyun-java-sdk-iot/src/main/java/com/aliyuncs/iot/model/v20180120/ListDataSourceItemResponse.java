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

package com.aliyuncs.iot.model.v20180120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.ListDataSourceItemResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDataSourceItemResponse extends AcsResponse {

	private String requestId;

	private String errorMessage;

	private Boolean success;

	private String code;

	private Integer pageSize;

	private Integer total;

	private Integer page;

	private List<DataSourceItem> dataSourceItems;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getPage() {
		return this.page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public List<DataSourceItem> getDataSourceItems() {
		return this.dataSourceItems;
	}

	public void setDataSourceItems(List<DataSourceItem> dataSourceItems) {
		this.dataSourceItems = dataSourceItems;
	}

	public static class DataSourceItem {

		private String productKey;

		private Long dataSourceItemId;

		private String deviceName;

		private String scopeType;

		private String topic;

		public String getProductKey() {
			return this.productKey;
		}

		public void setProductKey(String productKey) {
			this.productKey = productKey;
		}

		public Long getDataSourceItemId() {
			return this.dataSourceItemId;
		}

		public void setDataSourceItemId(Long dataSourceItemId) {
			this.dataSourceItemId = dataSourceItemId;
		}

		public String getDeviceName() {
			return this.deviceName;
		}

		public void setDeviceName(String deviceName) {
			this.deviceName = deviceName;
		}

		public String getScopeType() {
			return this.scopeType;
		}

		public void setScopeType(String scopeType) {
			this.scopeType = scopeType;
		}

		public String getTopic() {
			return this.topic;
		}

		public void setTopic(String topic) {
			this.topic = topic;
		}
	}

	@Override
	public ListDataSourceItemResponse getInstance(UnmarshallerContext context) {
		return	ListDataSourceItemResponseUnmarshaller.unmarshall(this, context);
	}
}
