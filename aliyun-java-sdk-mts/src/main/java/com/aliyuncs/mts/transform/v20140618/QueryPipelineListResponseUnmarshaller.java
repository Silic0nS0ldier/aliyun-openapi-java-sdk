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

package com.aliyuncs.mts.transform.v20140618;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.QueryPipelineListResponse;
import com.aliyuncs.mts.model.v20140618.QueryPipelineListResponse.Pipeline;
import com.aliyuncs.mts.model.v20140618.QueryPipelineListResponse.Pipeline.ExtendConfig;
import com.aliyuncs.mts.model.v20140618.QueryPipelineListResponse.Pipeline.NotifyConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPipelineListResponseUnmarshaller {

	public static QueryPipelineListResponse unmarshall(QueryPipelineListResponse queryPipelineListResponse, UnmarshallerContext _ctx) {
		
		queryPipelineListResponse.setRequestId(_ctx.stringValue("QueryPipelineListResponse.RequestId"));

		List<String> nonExistPids = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryPipelineListResponse.NonExistPids.Length"); i++) {
			nonExistPids.add(_ctx.stringValue("QueryPipelineListResponse.NonExistPids["+ i +"]"));
		}
		queryPipelineListResponse.setNonExistPids(nonExistPids);

		List<Pipeline> pipelineList = new ArrayList<Pipeline>();
		for (int i = 0; i < _ctx.lengthValue("QueryPipelineListResponse.PipelineList.Length"); i++) {
			Pipeline pipeline = new Pipeline();
			pipeline.setSpeed(_ctx.stringValue("QueryPipelineListResponse.PipelineList["+ i +"].Speed"));
			pipeline.setState(_ctx.stringValue("QueryPipelineListResponse.PipelineList["+ i +"].State"));
			pipeline.setSpeedLevel(_ctx.longValue("QueryPipelineListResponse.PipelineList["+ i +"].SpeedLevel"));
			pipeline.setRole(_ctx.stringValue("QueryPipelineListResponse.PipelineList["+ i +"].Role"));
			pipeline.setName(_ctx.stringValue("QueryPipelineListResponse.PipelineList["+ i +"].Name"));
			pipeline.setId(_ctx.stringValue("QueryPipelineListResponse.PipelineList["+ i +"].Id"));
			pipeline.setQuotaAllocate(_ctx.longValue("QueryPipelineListResponse.PipelineList["+ i +"].QuotaAllocate"));

			NotifyConfig notifyConfig = new NotifyConfig();
			notifyConfig.setMqTopic(_ctx.stringValue("QueryPipelineListResponse.PipelineList["+ i +"].NotifyConfig.MqTopic"));
			notifyConfig.setQueueName(_ctx.stringValue("QueryPipelineListResponse.PipelineList["+ i +"].NotifyConfig.QueueName"));
			notifyConfig.setMqTag(_ctx.stringValue("QueryPipelineListResponse.PipelineList["+ i +"].NotifyConfig.MqTag"));
			notifyConfig.setTopic(_ctx.stringValue("QueryPipelineListResponse.PipelineList["+ i +"].NotifyConfig.Topic"));
			pipeline.setNotifyConfig(notifyConfig);

			ExtendConfig extendConfig = new ExtendConfig();
			extendConfig.setIsBoostNew(_ctx.booleanValue("QueryPipelineListResponse.PipelineList["+ i +"].ExtendConfig.IsBoostNew"));
			extendConfig.setMaxMultiSpeed(_ctx.integerValue("QueryPipelineListResponse.PipelineList["+ i +"].ExtendConfig.MaxMultiSpeed"));
			extendConfig.setMultiSpeedDowngradePolicy(_ctx.stringValue("QueryPipelineListResponse.PipelineList["+ i +"].ExtendConfig.MultiSpeedDowngradePolicy"));
			pipeline.setExtendConfig(extendConfig);

			pipelineList.add(pipeline);
		}
		queryPipelineListResponse.setPipelineList(pipelineList);
	 
	 	return queryPipelineListResponse;
	}
}