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

package com.aliyuncs.linkvisual.model.v20180120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkvisual.transform.v20180120.QueryStreamSnapshotJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryStreamSnapshotJobResponse extends AcsResponse {

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

		private List<Job> jobList;

		public List<Job> getJobList() {
			return this.jobList;
		}

		public void setJobList(List<Job> jobList) {
			this.jobList = jobList;
		}

		public static class Job {

			private Integer streamType;

			private Integer snapshotInterval;

			public Integer getStreamType() {
				return this.streamType;
			}

			public void setStreamType(Integer streamType) {
				this.streamType = streamType;
			}

			public Integer getSnapshotInterval() {
				return this.snapshotInterval;
			}

			public void setSnapshotInterval(Integer snapshotInterval) {
				this.snapshotInterval = snapshotInterval;
			}
		}
	}

	@Override
	public QueryStreamSnapshotJobResponse getInstance(UnmarshallerContext context) {
		return	QueryStreamSnapshotJobResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
