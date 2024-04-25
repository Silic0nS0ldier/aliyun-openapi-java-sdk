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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.DescribeVodDomainRealTimeReqHitRateDataResponse;
import com.aliyuncs.vod.model.v20170321.DescribeVodDomainRealTimeReqHitRateDataResponse.ReqHitRateDataModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodDomainRealTimeReqHitRateDataResponseUnmarshaller {

	public static DescribeVodDomainRealTimeReqHitRateDataResponse unmarshall(DescribeVodDomainRealTimeReqHitRateDataResponse describeVodDomainRealTimeReqHitRateDataResponse, UnmarshallerContext _ctx) {
		
		describeVodDomainRealTimeReqHitRateDataResponse.setRequestId(_ctx.stringValue("DescribeVodDomainRealTimeReqHitRateDataResponse.RequestId"));

		List<ReqHitRateDataModel> data = new ArrayList<ReqHitRateDataModel>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVodDomainRealTimeReqHitRateDataResponse.Data.Length"); i++) {
			ReqHitRateDataModel reqHitRateDataModel = new ReqHitRateDataModel();
			reqHitRateDataModel.setReqHitRate(_ctx.floatValue("DescribeVodDomainRealTimeReqHitRateDataResponse.Data["+ i +"].ReqHitRate"));
			reqHitRateDataModel.setTimeStamp(_ctx.stringValue("DescribeVodDomainRealTimeReqHitRateDataResponse.Data["+ i +"].TimeStamp"));

			data.add(reqHitRateDataModel);
		}
		describeVodDomainRealTimeReqHitRateDataResponse.setData(data);
	 
	 	return describeVodDomainRealTimeReqHitRateDataResponse;
	}
}