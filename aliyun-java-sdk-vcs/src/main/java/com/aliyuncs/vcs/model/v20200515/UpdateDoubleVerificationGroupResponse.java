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

package com.aliyuncs.vcs.model.v20200515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vcs.transform.v20200515.UpdateDoubleVerificationGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateDoubleVerificationGroupResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private DoubleVerificationGroup doubleVerificationGroup;

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

	public DoubleVerificationGroup getDoubleVerificationGroup() {
		return this.doubleVerificationGroup;
	}

	public void setDoubleVerificationGroup(DoubleVerificationGroup doubleVerificationGroup) {
		this.doubleVerificationGroup = doubleVerificationGroup;
	}

	public static class DoubleVerificationGroup {

		private String groupId;

		private Long interval;

		private String lastChange;

		private Long memberNumber;

		private String enabled;

		private String deviceId;

		private List<PersonIdListItem> personIdList;

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public Long getInterval() {
			return this.interval;
		}

		public void setInterval(Long interval) {
			this.interval = interval;
		}

		public String getLastChange() {
			return this.lastChange;
		}

		public void setLastChange(String lastChange) {
			this.lastChange = lastChange;
		}

		public Long getMemberNumber() {
			return this.memberNumber;
		}

		public void setMemberNumber(Long memberNumber) {
			this.memberNumber = memberNumber;
		}

		public String getEnabled() {
			return this.enabled;
		}

		public void setEnabled(String enabled) {
			this.enabled = enabled;
		}

		public String getDeviceId() {
			return this.deviceId;
		}

		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;
		}

		public List<PersonIdListItem> getPersonIdList() {
			return this.personIdList;
		}

		public void setPersonIdList(List<PersonIdListItem> personIdList) {
			this.personIdList = personIdList;
		}

		public static class PersonIdListItem {

			private String personTableId;

			private String personId;

			public String getPersonTableId() {
				return this.personTableId;
			}

			public void setPersonTableId(String personTableId) {
				this.personTableId = personTableId;
			}

			public String getPersonId() {
				return this.personId;
			}

			public void setPersonId(String personId) {
				this.personId = personId;
			}
		}
	}

	@Override
	public UpdateDoubleVerificationGroupResponse getInstance(UnmarshallerContext context) {
		return	UpdateDoubleVerificationGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
