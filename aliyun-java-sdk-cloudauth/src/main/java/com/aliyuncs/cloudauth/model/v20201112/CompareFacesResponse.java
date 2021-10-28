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

package com.aliyuncs.cloudauth.model.v20201112;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudauth.transform.v20201112.CompareFacesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CompareFacesResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Boolean success;

	private ResultObject resultObject;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public ResultObject getResultObject() {
		return this.resultObject;
	}

	public void setResultObject(ResultObject resultObject) {
		this.resultObject = resultObject;
	}

	public static class ResultObject {

		private Float similarityScore;

		private String confidenceThresholds;

		public Float getSimilarityScore() {
			return this.similarityScore;
		}

		public void setSimilarityScore(Float similarityScore) {
			this.similarityScore = similarityScore;
		}

		public String getConfidenceThresholds() {
			return this.confidenceThresholds;
		}

		public void setConfidenceThresholds(String confidenceThresholds) {
			this.confidenceThresholds = confidenceThresholds;
		}
	}

	@Override
	public CompareFacesResponse getInstance(UnmarshallerContext context) {
		return	CompareFacesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
