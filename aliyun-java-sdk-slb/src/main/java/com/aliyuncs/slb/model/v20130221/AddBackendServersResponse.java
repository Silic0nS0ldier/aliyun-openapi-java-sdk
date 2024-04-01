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

package com.aliyuncs.slb.model.v20130221;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.slb.transform.v20130221.AddBackendServersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AddBackendServersResponse extends AcsResponse {

	private String loadBalancerId;

	private String requestId;

	private List<BackendServer> backendServers;

	public String getLoadBalancerId() {
		return this.loadBalancerId;
	}

	public void setLoadBalancerId(String loadBalancerId) {
		this.loadBalancerId = loadBalancerId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<BackendServer> getBackendServers() {
		return this.backendServers;
	}

	public void setBackendServers(List<BackendServer> backendServers) {
		this.backendServers = backendServers;
	}

	public static class BackendServer {

		private String weight;

		private String serverId;

		public String getWeight() {
			return this.weight;
		}

		public void setWeight(String weight) {
			this.weight = weight;
		}

		public String getServerId() {
			return this.serverId;
		}

		public void setServerId(String serverId) {
			this.serverId = serverId;
		}
	}

	@Override
	public AddBackendServersResponse getInstance(UnmarshallerContext context) {
		return	AddBackendServersResponseUnmarshaller.unmarshall(this, context);
	}
}
