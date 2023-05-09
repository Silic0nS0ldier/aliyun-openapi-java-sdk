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
import com.aliyuncs.iot.transform.v20180120.BatchImportDeviceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BatchImportDeviceResponse extends AcsResponse {

	private String code;

	private String errorMessage;

	private String requestId;

	private Boolean success;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long applyId;

		private List<InvalidDetailListItem> invalidDetailList;

		private List<String> repeatedDeviceNameList;

		private List<String> invalidSnList;

		private List<String> invalidDeviceSecretList;

		private List<String> invalidDeviceNameList;

		public Long getApplyId() {
			return this.applyId;
		}

		public void setApplyId(Long applyId) {
			this.applyId = applyId;
		}

		public List<InvalidDetailListItem> getInvalidDetailList() {
			return this.invalidDetailList;
		}

		public void setInvalidDetailList(List<InvalidDetailListItem> invalidDetailList) {
			this.invalidDetailList = invalidDetailList;
		}

		public List<String> getRepeatedDeviceNameList() {
			return this.repeatedDeviceNameList;
		}

		public void setRepeatedDeviceNameList(List<String> repeatedDeviceNameList) {
			this.repeatedDeviceNameList = repeatedDeviceNameList;
		}

		public List<String> getInvalidSnList() {
			return this.invalidSnList;
		}

		public void setInvalidSnList(List<String> invalidSnList) {
			this.invalidSnList = invalidSnList;
		}

		public List<String> getInvalidDeviceSecretList() {
			return this.invalidDeviceSecretList;
		}

		public void setInvalidDeviceSecretList(List<String> invalidDeviceSecretList) {
			this.invalidDeviceSecretList = invalidDeviceSecretList;
		}

		public List<String> getInvalidDeviceNameList() {
			return this.invalidDeviceNameList;
		}

		public void setInvalidDeviceNameList(List<String> invalidDeviceNameList) {
			this.invalidDeviceNameList = invalidDeviceNameList;
		}

		public static class InvalidDetailListItem {

			private String errorMsg;

			private String sn;

			private String deviceName;

			private String deviceSecret;

			public String getErrorMsg() {
				return this.errorMsg;
			}

			public void setErrorMsg(String errorMsg) {
				this.errorMsg = errorMsg;
			}

			public String getSn() {
				return this.sn;
			}

			public void setSn(String sn) {
				this.sn = sn;
			}

			public String getDeviceName() {
				return this.deviceName;
			}

			public void setDeviceName(String deviceName) {
				this.deviceName = deviceName;
			}

			public String getDeviceSecret() {
				return this.deviceSecret;
			}

			public void setDeviceSecret(String deviceSecret) {
				this.deviceSecret = deviceSecret;
			}
		}
	}

	@Override
	public BatchImportDeviceResponse getInstance(UnmarshallerContext context) {
		return	BatchImportDeviceResponseUnmarshaller.unmarshall(this, context);
	}
}
