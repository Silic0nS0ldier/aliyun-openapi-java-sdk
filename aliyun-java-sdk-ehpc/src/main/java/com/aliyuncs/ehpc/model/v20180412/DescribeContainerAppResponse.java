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

package com.aliyuncs.ehpc.model.v20180412;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ehpc.transform.v20180412.DescribeContainerAppResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeContainerAppResponse extends AcsResponse {

	private String requestId;

	private ContainerAppInfo containerAppInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ContainerAppInfo getContainerAppInfo() {
		return this.containerAppInfo;
	}

	public void setContainerAppInfo(ContainerAppInfo containerAppInfo) {
		this.containerAppInfo = containerAppInfo;
	}

	public static class ContainerAppInfo {

		private String type;

		private String description;

		private String createTime;

		private String repository;

		private String imageTag;

		private String name;

		private String id;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getRepository() {
			return this.repository;
		}

		public void setRepository(String repository) {
			this.repository = repository;
		}

		public String getImageTag() {
			return this.imageTag;
		}

		public void setImageTag(String imageTag) {
			this.imageTag = imageTag;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}
	}

	@Override
	public DescribeContainerAppResponse getInstance(UnmarshallerContext context) {
		return	DescribeContainerAppResponseUnmarshaller.unmarshall(this, context);
	}
}
