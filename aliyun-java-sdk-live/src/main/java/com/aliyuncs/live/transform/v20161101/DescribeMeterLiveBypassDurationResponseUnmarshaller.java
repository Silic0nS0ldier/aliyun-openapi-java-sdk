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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeMeterLiveBypassDurationResponse;
import com.aliyuncs.live.model.v20161101.DescribeMeterLiveBypassDurationResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMeterLiveBypassDurationResponseUnmarshaller {

	public static DescribeMeterLiveBypassDurationResponse unmarshall(DescribeMeterLiveBypassDurationResponse describeMeterLiveBypassDurationResponse, UnmarshallerContext _ctx) {
		
		describeMeterLiveBypassDurationResponse.setRequestId(_ctx.stringValue("DescribeMeterLiveBypassDurationResponse.RequestId"));
		describeMeterLiveBypassDurationResponse.setAudioSummaryDuration(_ctx.longValue("DescribeMeterLiveBypassDurationResponse.AudioSummaryDuration"));
		describeMeterLiveBypassDurationResponse.setSingleAudioSummaryDuration(_ctx.longValue("DescribeMeterLiveBypassDurationResponse.SingleAudioSummaryDuration"));
		describeMeterLiveBypassDurationResponse.setSingleVideoSummaryDuration(_ctx.longValue("DescribeMeterLiveBypassDurationResponse.SingleVideoSummaryDuration"));
		describeMeterLiveBypassDurationResponse.setTotalSummaryDuration(_ctx.longValue("DescribeMeterLiveBypassDurationResponse.TotalSummaryDuration"));
		describeMeterLiveBypassDurationResponse.setV480SummaryDuration(_ctx.longValue("DescribeMeterLiveBypassDurationResponse.V480SummaryDuration"));
		describeMeterLiveBypassDurationResponse.setV720SummaryDuration(_ctx.longValue("DescribeMeterLiveBypassDurationResponse.V720SummaryDuration"));
		describeMeterLiveBypassDurationResponse.setV1080SummaryDuration(_ctx.longValue("DescribeMeterLiveBypassDurationResponse.V1080SummaryDuration"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMeterLiveBypassDurationResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAudioDuration(_ctx.longValue("DescribeMeterLiveBypassDurationResponse.Data["+ i +"].AudioDuration"));
			dataItem.setSingle_Audio(_ctx.longValue("DescribeMeterLiveBypassDurationResponse.Data["+ i +"].Single_Audio"));
			dataItem.setSingle_Video(_ctx.longValue("DescribeMeterLiveBypassDurationResponse.Data["+ i +"].Single_Video"));
			dataItem.setTimestamp(_ctx.stringValue("DescribeMeterLiveBypassDurationResponse.Data["+ i +"].Timestamp"));
			dataItem.setTotalDuration(_ctx.longValue("DescribeMeterLiveBypassDurationResponse.Data["+ i +"].TotalDuration"));
			dataItem.setV480Duration(_ctx.longValue("DescribeMeterLiveBypassDurationResponse.Data["+ i +"].V480Duration"));
			dataItem.setV720Duration(_ctx.longValue("DescribeMeterLiveBypassDurationResponse.Data["+ i +"].V720Duration"));
			dataItem.setV1080Duration(_ctx.longValue("DescribeMeterLiveBypassDurationResponse.Data["+ i +"].V1080Duration"));

			data.add(dataItem);
		}
		describeMeterLiveBypassDurationResponse.setData(data);
	 
	 	return describeMeterLiveBypassDurationResponse;
	}
}