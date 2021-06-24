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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryEcsApiMetaSettingAttributeKeyValueResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryEcsApiMetaSettingAttributeKeyValueResponse extends AcsResponse {

	private String requestId;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String attributeKey;

		private List<AttributeKeyValueInfoListItem> attributeKeyValueInfoList;

		public String getAttributeKey() {
			return this.attributeKey;
		}

		public void setAttributeKey(String attributeKey) {
			this.attributeKey = attributeKey;
		}

		public List<AttributeKeyValueInfoListItem> getAttributeKeyValueInfoList() {
			return this.attributeKeyValueInfoList;
		}

		public void setAttributeKeyValueInfoList(List<AttributeKeyValueInfoListItem> attributeKeyValueInfoList) {
			this.attributeKeyValueInfoList = attributeKeyValueInfoList;
		}

		public static class AttributeKeyValueInfoListItem {

			private String attributeName;

			private String comment;

			private String attributeValue;

			public String getAttributeName() {
				return this.attributeName;
			}

			public void setAttributeName(String attributeName) {
				this.attributeName = attributeName;
			}

			public String getComment() {
				return this.comment;
			}

			public void setComment(String comment) {
				this.comment = comment;
			}

			public String getAttributeValue() {
				return this.attributeValue;
			}

			public void setAttributeValue(String attributeValue) {
				this.attributeValue = attributeValue;
			}
		}
	}

	@Override
	public OpsQueryEcsApiMetaSettingAttributeKeyValueResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryEcsApiMetaSettingAttributeKeyValueResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
