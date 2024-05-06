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

package com.aliyuncs.cloudauth.model.v20200618;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudauth.transform.v20200618.ContrastSmartVerifyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ContrastSmartVerifyResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private ResultObject resultObject;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ResultObject getResultObject() {
		return this.resultObject;
	}

	public void setResultObject(ResultObject resultObject) {
		this.resultObject = resultObject;
	}

	public static class ResultObject {

		private String subCode;

		private String certifyId;

		private String verifyInfo;

		private String riskInfo;

		private String passed;

		public String getSubCode() {
			return this.subCode;
		}

		public void setSubCode(String subCode) {
			this.subCode = subCode;
		}

		public String getCertifyId() {
			return this.certifyId;
		}

		public void setCertifyId(String certifyId) {
			this.certifyId = certifyId;
		}

		public String getVerifyInfo() {
			return this.verifyInfo;
		}

		public void setVerifyInfo(String verifyInfo) {
			this.verifyInfo = verifyInfo;
		}

		public String getRiskInfo() {
			return this.riskInfo;
		}

		public void setRiskInfo(String riskInfo) {
			this.riskInfo = riskInfo;
		}

		public String getPassed() {
			return this.passed;
		}

		public void setPassed(String passed) {
			this.passed = passed;
		}
	}

	@Override
	public ContrastSmartVerifyResponse getInstance(UnmarshallerContext context) {
		return	ContrastSmartVerifyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
