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

package com.aliyuncs.hbase.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbase.model.v20190101.DescribeActiveOperationTasksResponse;
import com.aliyuncs.hbase.model.v20190101.DescribeActiveOperationTasksResponse.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeActiveOperationTasksResponseUnmarshaller {

	public static DescribeActiveOperationTasksResponse unmarshall(DescribeActiveOperationTasksResponse describeActiveOperationTasksResponse, UnmarshallerContext _ctx) {
		
		describeActiveOperationTasksResponse.setRequestId(_ctx.stringValue("DescribeActiveOperationTasksResponse.RequestId"));
		describeActiveOperationTasksResponse.setPageNumber(_ctx.integerValue("DescribeActiveOperationTasksResponse.PageNumber"));
		describeActiveOperationTasksResponse.setPageSize(_ctx.integerValue("DescribeActiveOperationTasksResponse.PageSize"));
		describeActiveOperationTasksResponse.setTotalRecordCount(_ctx.integerValue("DescribeActiveOperationTasksResponse.TotalRecordCount"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeActiveOperationTasksResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setStatus(_ctx.integerValue("DescribeActiveOperationTasksResponse.Items["+ i +"].Status"));
			itemsItem.setChangeLevelEn(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].ChangeLevelEn"));
			itemsItem.setTaskType(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].TaskType"));
			itemsItem.setInsName(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].InsName"));
			itemsItem.setRegion(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].Region"));
			itemsItem.setImpactZh(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].ImpactZh"));
			itemsItem.setCreatedTime(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].CreatedTime"));
			itemsItem.setSwitchTime(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].SwitchTime"));
			itemsItem.setChangeLevelZh(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].ChangeLevelZh"));
			itemsItem.setDeadline(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].Deadline"));
			itemsItem.setPrepareInterval(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].PrepareInterval"));
			itemsItem.setTaskTypeZh(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].TaskTypeZh"));
			itemsItem.setCurrentAVZ(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].CurrentAVZ"));
			itemsItem.setAllowChange(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].AllowChange"));
			itemsItem.setDbVersion(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].DbVersion"));
			itemsItem.setImpactEn(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].ImpactEn"));
			itemsItem.setInsComment(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].InsComment"));
			itemsItem.setStartTime(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].StartTime"));
			itemsItem.setModifiedTime(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].ModifiedTime"));
			itemsItem.setAllowCancel(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].AllowCancel"));
			itemsItem.setDbType(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].DbType"));
			itemsItem.setChangeLevel(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].ChangeLevel"));
			itemsItem.setTaskTypeEn(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].TaskTypeEn"));
			itemsItem.setResultInfo(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].ResultInfo"));
			itemsItem.setId(_ctx.integerValue("DescribeActiveOperationTasksResponse.Items["+ i +"].Id"));

			List<String> subInsNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeActiveOperationTasksResponse.Items["+ i +"].SubInsNames.Length"); j++) {
				subInsNames.add(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].SubInsNames["+ j +"]"));
			}
			itemsItem.setSubInsNames(subInsNames);

			items.add(itemsItem);
		}
		describeActiveOperationTasksResponse.setItems(items);
	 
	 	return describeActiveOperationTasksResponse;
	}
}