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

package com.aliyuncs.ccc.transform.v20200701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20200701.ListIntervalAgentReportResponse;
import com.aliyuncs.ccc.model.v20200701.ListIntervalAgentReportResponse.DataItem;
import com.aliyuncs.ccc.model.v20200701.ListIntervalAgentReportResponse.DataItem.Back2Back;
import com.aliyuncs.ccc.model.v20200701.ListIntervalAgentReportResponse.DataItem.Inbound;
import com.aliyuncs.ccc.model.v20200701.ListIntervalAgentReportResponse.DataItem.Inbound.AccessChannelTypeDetail;
import com.aliyuncs.ccc.model.v20200701.ListIntervalAgentReportResponse.DataItem.Internal;
import com.aliyuncs.ccc.model.v20200701.ListIntervalAgentReportResponse.DataItem.Outbound;
import com.aliyuncs.ccc.model.v20200701.ListIntervalAgentReportResponse.DataItem.Overall;
import com.aliyuncs.ccc.model.v20200701.ListIntervalAgentReportResponse.DataItem.Overall.BreakCodeDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListIntervalAgentReportResponseUnmarshaller {

	public static ListIntervalAgentReportResponse unmarshall(ListIntervalAgentReportResponse listIntervalAgentReportResponse, UnmarshallerContext _ctx) {
		
		listIntervalAgentReportResponse.setRequestId(_ctx.stringValue("ListIntervalAgentReportResponse.RequestId"));
		listIntervalAgentReportResponse.setCode(_ctx.stringValue("ListIntervalAgentReportResponse.Code"));
		listIntervalAgentReportResponse.setHttpStatusCode(_ctx.integerValue("ListIntervalAgentReportResponse.HttpStatusCode"));
		listIntervalAgentReportResponse.setMessage(_ctx.stringValue("ListIntervalAgentReportResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListIntervalAgentReportResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setStatsTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].StatsTime"));

			Inbound inbound = new Inbound();
			inbound.setAverageRingTime(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.AverageRingTime"));
			inbound.setCallsHandled(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.CallsHandled"));
			inbound.setTotalWorkTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.TotalWorkTime"));
			inbound.setCallsAttendedTransferOut(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.CallsAttendedTransferOut"));
			inbound.setMaxWorkTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.MaxWorkTime"));
			inbound.setTotalHoldTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.TotalHoldTime"));
			inbound.setAverageWorkTime(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.AverageWorkTime"));
			inbound.setCallsBlindTransferIn(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.CallsBlindTransferIn"));
			inbound.setSatisfactionIndex(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.SatisfactionIndex"));
			inbound.setCallsRinged(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.CallsRinged"));
			inbound.setCallsAttendedTransferIn(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.CallsAttendedTransferIn"));
			inbound.setCallsBlindTransferOut(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.CallsBlindTransferOut"));
			inbound.setTotalRingTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.TotalRingTime"));
			inbound.setMaxTalkTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.MaxTalkTime"));
			inbound.setMaxRingTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.MaxRingTime"));
			inbound.setTotalTalkTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.TotalTalkTime"));
			inbound.setCallsOffered(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.CallsOffered"));
			inbound.setMaxHoldTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.MaxHoldTime"));
			inbound.setAverageTalkTime(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.AverageTalkTime"));
			inbound.setSatisfactionRate(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.SatisfactionRate"));
			inbound.setCallsHold(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.CallsHold"));
			inbound.setSatisfactionSurveysOffered(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.SatisfactionSurveysOffered"));
			inbound.setHandleRate(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.HandleRate"));
			inbound.setSatisfactionSurveysResponded(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.SatisfactionSurveysResponded"));
			inbound.setAverageHoldTime(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.AverageHoldTime"));
			inbound.setAverageFirstResponseTime(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.AverageFirstResponseTime"));
			inbound.setAverageResponseTime(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.AverageResponseTime"));
			inbound.setServiceLevel15(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.ServiceLevel15"));
			inbound.setTotalMessagesSent(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.TotalMessagesSent"));
			inbound.setTotalMessagesSentByAgent(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.TotalMessagesSentByAgent"));
			inbound.setTotalMessagesSentByCustomer(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.TotalMessagesSentByCustomer"));

			List<AccessChannelTypeDetail> accessChannelTypeDetails = new ArrayList<AccessChannelTypeDetail>();
			for (int j = 0; j < _ctx.lengthValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.AccessChannelTypeDetails.Length"); j++) {
				AccessChannelTypeDetail accessChannelTypeDetail = new AccessChannelTypeDetail();
				accessChannelTypeDetail.setAccessChannelType(_ctx.stringValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.AccessChannelTypeDetails["+ j +"].AccessChannelType"));
				accessChannelTypeDetail.setCallsOffered(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.AccessChannelTypeDetails["+ j +"].CallsOffered"));

				accessChannelTypeDetails.add(accessChannelTypeDetail);
			}
			inbound.setAccessChannelTypeDetails(accessChannelTypeDetails);
			dataItem.setInbound(inbound);

			Outbound outbound = new Outbound();
			outbound.setAverageRingTime(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.AverageRingTime"));
			outbound.setCallsDialed(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.CallsDialed"));
			outbound.setCallsAnswered(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.CallsAnswered"));
			outbound.setTotalWorkTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.TotalWorkTime"));
			outbound.setCallsAttendedTransferOut(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.CallsAttendedTransferOut"));
			outbound.setMaxWorkTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.MaxWorkTime"));
			outbound.setTotalDialingTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.TotalDialingTime"));
			outbound.setTotalHoldTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.TotalHoldTime"));
			outbound.setAverageWorkTime(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.AverageWorkTime"));
			outbound.setCallsBlindTransferIn(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.CallsBlindTransferIn"));
			outbound.setSatisfactionIndex(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.SatisfactionIndex"));
			outbound.setCallsRinged(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.CallsRinged"));
			outbound.setCallsAttendedTransferIn(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.CallsAttendedTransferIn"));
			outbound.setCallsBlindTransferOut(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.CallsBlindTransferOut"));
			outbound.setTotalRingTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.TotalRingTime"));
			outbound.setMaxTalkTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.MaxTalkTime"));
			outbound.setMaxRingTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.MaxRingTime"));
			outbound.setTotalTalkTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.TotalTalkTime"));
			outbound.setMaxDialingTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.MaxDialingTime"));
			outbound.setAnswerRate(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.AnswerRate"));
			outbound.setMaxHoldTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.MaxHoldTime"));
			outbound.setAverageTalkTime(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.AverageTalkTime"));
			outbound.setSatisfactionRate(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.SatisfactionRate"));
			outbound.setCallsHold(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.CallsHold"));
			outbound.setSatisfactionSurveysOffered(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.SatisfactionSurveysOffered"));
			outbound.setSatisfactionSurveysResponded(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.SatisfactionSurveysResponded"));
			outbound.setAverageHoldTime(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.AverageHoldTime"));
			outbound.setAverageDialingTime(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.AverageDialingTime"));
			dataItem.setOutbound(outbound);

			Overall overall = new Overall();
			overall.setOccupancyRate(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.OccupancyRate"));
			overall.setTotalWorkTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.TotalWorkTime"));
			overall.setMaxWorkTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.MaxWorkTime"));
			overall.setTotalHoldTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.TotalHoldTime"));
			overall.setAverageWorkTime(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.AverageWorkTime"));
			overall.setMaxBreakTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.MaxBreakTime"));
			overall.setSatisfactionIndex(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.SatisfactionIndex"));
			overall.setMaxReadyTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.MaxReadyTime"));
			overall.setMaxTalkTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.MaxTalkTime"));
			overall.setTotalReadyTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.TotalReadyTime"));
			overall.setLastCheckoutTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.LastCheckoutTime"));
			overall.setLastCheckOutTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.LastCheckOutTime"));
			overall.setTotalCalls(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.TotalCalls"));
			overall.setTotalLoggedInTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.TotalLoggedInTime"));
			overall.setTotalTalkTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.TotalTalkTime"));
			overall.setMaxHoldTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.MaxHoldTime"));
			overall.setAverageBreakTime(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.AverageBreakTime"));
			overall.setAverageTalkTime(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.AverageTalkTime"));
			overall.setSatisfactionRate(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.SatisfactionRate"));
			overall.setSatisfactionSurveysOffered(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.SatisfactionSurveysOffered"));
			overall.setSatisfactionSurveysResponded(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.SatisfactionSurveysResponded"));
			overall.setAverageHoldTime(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.AverageHoldTime"));
			overall.setAverageReadyTime(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.AverageReadyTime"));
			overall.setTotalBreakTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.TotalBreakTime"));
			overall.setTotalOnSiteOnlineTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.TotalOnSiteOnlineTime"));
			overall.setTotalOffSiteOnlineTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.TotalOffSiteOnlineTime"));
			overall.setTotalOfficePhoneOnlineTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.TotalOfficePhoneOnlineTime"));
			overall.setTotalOutboundScenarioTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.TotalOutboundScenarioTime"));
			overall.setTotalOutboundScenarioReadyTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.TotalOutboundScenarioReadyTime"));
			overall.setFirstCheckInTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.FirstCheckInTime"));
			overall.setTotalOfficePhoneLoggedInTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.TotalOfficePhoneLoggedInTime"));
			overall.setTotalOffSiteLoggedInTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.TotalOffSiteLoggedInTime"));
			overall.setTotalOnSiteLoggedInTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.TotalOnSiteLoggedInTime"));
			overall.setTotalOutboundScenarioLoggedInTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.TotalOutboundScenarioLoggedInTime"));

			List<BreakCodeDetail> breakCodeDetailList = new ArrayList<BreakCodeDetail>();
			for (int j = 0; j < _ctx.lengthValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.BreakCodeDetailList.Length"); j++) {
				BreakCodeDetail breakCodeDetail = new BreakCodeDetail();
				breakCodeDetail.setBreakCode(_ctx.stringValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.BreakCodeDetailList["+ j +"].BreakCode"));
				breakCodeDetail.setCount(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.BreakCodeDetailList["+ j +"].Count"));
				breakCodeDetail.setDuration(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.BreakCodeDetailList["+ j +"].Duration"));

				breakCodeDetailList.add(breakCodeDetail);
			}
			overall.setBreakCodeDetailList(breakCodeDetailList);
			dataItem.setOverall(overall);

			Back2Back back2Back = new Back2Back();
			back2Back.setCallsDialed(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Back2Back.CallsDialed"));
			back2Back.setAnswerRate(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Back2Back.AnswerRate"));
			back2Back.setCallsAnswered(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Back2Back.CallsAnswered"));
			back2Back.setTotalTalkTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Back2Back.TotalTalkTime"));
			back2Back.setMaxTalkTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Back2Back.MaxTalkTime"));
			back2Back.setAverageTalkTime(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Back2Back.AverageTalkTime"));
			back2Back.setTotalRingTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Back2Back.TotalRingTime"));
			back2Back.setMaxRingTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Back2Back.MaxRingTime"));
			back2Back.setAverageRingTime(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Back2Back.AverageRingTime"));
			back2Back.setTotalCustomerRingTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Back2Back.TotalCustomerRingTime"));
			back2Back.setMaxCustomerRingTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Back2Back.MaxCustomerRingTime"));
			back2Back.setAverageCustomerRingTime(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Back2Back.AverageCustomerRingTime"));
			back2Back.setCallsAgentHandled(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Back2Back.CallsAgentHandled"));
			back2Back.setAgentHandleRate(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Back2Back.AgentHandleRate"));
			back2Back.setCallsCustomerAnswered(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Back2Back.CallsCustomerAnswered"));
			back2Back.setCustomerAnswerRate(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Back2Back.CustomerAnswerRate"));
			dataItem.setBack2Back(back2Back);

			Internal internal = new Internal();
			internal.setAverageTalkTime(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Internal.AverageTalkTime"));
			internal.setCallsAnswered(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Internal.CallsAnswered"));
			internal.setCallsDialed(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Internal.CallsDialed"));
			internal.setCallsHandled(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Internal.CallsHandled"));
			internal.setCallsOffered(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Internal.CallsOffered"));
			internal.setCallsTalked(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Internal.CallsTalked"));
			dataItem.setInternal(internal);

			data.add(dataItem);
		}
		listIntervalAgentReportResponse.setData(data);
	 
	 	return listIntervalAgentReportResponse;
	}
}