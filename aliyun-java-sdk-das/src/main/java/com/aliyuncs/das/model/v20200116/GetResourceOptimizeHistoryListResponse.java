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

package com.aliyuncs.das.model.v20200116;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.das.transform.v20200116.GetResourceOptimizeHistoryListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetResourceOptimizeHistoryListResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String data;

	private String message;

	private String synchro;

	private String success;

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

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSynchro() {
		return this.synchro;
	}

	public void setSynchro(String synchro) {
		this.synchro = synchro;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	@Override
	public GetResourceOptimizeHistoryListResponse getInstance(UnmarshallerContext context) {
		return	GetResourceOptimizeHistoryListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}