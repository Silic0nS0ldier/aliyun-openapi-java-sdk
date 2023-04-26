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

package com.aliyuncs.premiumpics.model.v20200505;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.premiumpics.transform.v20200505.ListUserProduceOperateLogsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListUserProduceOperateLogsResponse extends AcsResponse {

	private Integer pageNum;

	private String requestId;

	private Integer pageSize;

	private Integer totalPageNum;

	private Integer totalItemNum;

	private Boolean success;

	private List<OpateLogs> data;

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalPageNum() {
		return this.totalPageNum;
	}

	public void setTotalPageNum(Integer totalPageNum) {
		this.totalPageNum = totalPageNum;
	}

	public Integer getTotalItemNum() {
		return this.totalItemNum;
	}

	public void setTotalItemNum(Integer totalItemNum) {
		this.totalItemNum = totalItemNum;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<OpateLogs> getData() {
		return this.data;
	}

	public void setData(List<OpateLogs> data) {
		this.data = data;
	}

	public static class OpateLogs {

		private Long operateTime;

		private String operateUserType;

		private String bizId;

		private String operateName;

		private String bizType;

		public Long getOperateTime() {
			return this.operateTime;
		}

		public void setOperateTime(Long operateTime) {
			this.operateTime = operateTime;
		}

		public String getOperateUserType() {
			return this.operateUserType;
		}

		public void setOperateUserType(String operateUserType) {
			this.operateUserType = operateUserType;
		}

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public String getOperateName() {
			return this.operateName;
		}

		public void setOperateName(String operateName) {
			this.operateName = operateName;
		}

		public String getBizType() {
			return this.bizType;
		}

		public void setBizType(String bizType) {
			this.bizType = bizType;
		}
	}

	@Override
	public ListUserProduceOperateLogsResponse getInstance(UnmarshallerContext context) {
		return	ListUserProduceOperateLogsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
