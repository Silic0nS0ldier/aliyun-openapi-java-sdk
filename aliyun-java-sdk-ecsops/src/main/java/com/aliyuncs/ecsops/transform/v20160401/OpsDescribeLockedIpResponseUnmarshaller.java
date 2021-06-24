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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeLockedIpResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeLockedIpResponse.LockedIp;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeLockedIpResponseUnmarshaller {

	public static OpsDescribeLockedIpResponse unmarshall(OpsDescribeLockedIpResponse opsDescribeLockedIpResponse, UnmarshallerContext _ctx) {
		
		opsDescribeLockedIpResponse.setRequestId(_ctx.stringValue("OpsDescribeLockedIpResponse.RequestId"));
		opsDescribeLockedIpResponse.setPageSize(_ctx.stringValue("OpsDescribeLockedIpResponse.PageSize"));
		opsDescribeLockedIpResponse.setTotal(_ctx.stringValue("OpsDescribeLockedIpResponse.Total"));
		opsDescribeLockedIpResponse.setPageNo(_ctx.stringValue("OpsDescribeLockedIpResponse.PageNo"));

		List<LockedIp> lockedIps = new ArrayList<LockedIp>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeLockedIpResponse.LockedIps.Length"); i++) {
			LockedIp lockedIp = new LockedIp();
			lockedIp.setLockType(_ctx.stringValue("OpsDescribeLockedIpResponse.LockedIps["+ i +"].LockType"));
			lockedIp.setIpType(_ctx.stringValue("OpsDescribeLockedIpResponse.LockedIps["+ i +"].IpType"));
			lockedIp.setLockReason(_ctx.stringValue("OpsDescribeLockedIpResponse.LockedIps["+ i +"].LockReason"));
			lockedIp.setIP(_ctx.stringValue("OpsDescribeLockedIpResponse.LockedIps["+ i +"].IP"));

			lockedIps.add(lockedIp);
		}
		opsDescribeLockedIpResponse.setLockedIps(lockedIps);
	 
	 	return opsDescribeLockedIpResponse;
	}
}