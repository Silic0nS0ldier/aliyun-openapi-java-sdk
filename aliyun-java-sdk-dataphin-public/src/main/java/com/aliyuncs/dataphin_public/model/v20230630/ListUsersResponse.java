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

package com.aliyuncs.dataphin_public.model.v20230630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.ListUsersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListUsersResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer totalCount;

		private List<User> userList;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<User> getUserList() {
			return this.userList;
		}

		public void setUserList(List<User> userList) {
			this.userList = userList;
		}

		public static class User {

			private String accountName;

			private String dingNumber;

			private String displayName;

			private Long gmtCreate;

			private Long gmtModified;

			private String mail;

			private String mobilePhone;

			private String nickName;

			private String realName;

			private String sourceType;

			private String sourceUserId;

			private String userId;

			private String userName;

			public String getAccountName() {
				return this.accountName;
			}

			public void setAccountName(String accountName) {
				this.accountName = accountName;
			}

			public String getDingNumber() {
				return this.dingNumber;
			}

			public void setDingNumber(String dingNumber) {
				this.dingNumber = dingNumber;
			}

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}

			public Long getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(Long gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public Long getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(Long gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getMail() {
				return this.mail;
			}

			public void setMail(String mail) {
				this.mail = mail;
			}

			public String getMobilePhone() {
				return this.mobilePhone;
			}

			public void setMobilePhone(String mobilePhone) {
				this.mobilePhone = mobilePhone;
			}

			public String getNickName() {
				return this.nickName;
			}

			public void setNickName(String nickName) {
				this.nickName = nickName;
			}

			public String getRealName() {
				return this.realName;
			}

			public void setRealName(String realName) {
				this.realName = realName;
			}

			public String getSourceType() {
				return this.sourceType;
			}

			public void setSourceType(String sourceType) {
				this.sourceType = sourceType;
			}

			public String getSourceUserId() {
				return this.sourceUserId;
			}

			public void setSourceUserId(String sourceUserId) {
				this.sourceUserId = sourceUserId;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}
		}
	}

	@Override
	public ListUsersResponse getInstance(UnmarshallerContext context) {
		return	ListUsersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
