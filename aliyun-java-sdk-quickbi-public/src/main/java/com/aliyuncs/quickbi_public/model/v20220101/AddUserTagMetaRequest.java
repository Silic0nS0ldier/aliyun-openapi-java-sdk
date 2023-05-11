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

package com.aliyuncs.quickbi_public.model.v20220101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddUserTagMetaRequest extends RpcAcsRequest<AddUserTagMetaResponse> {
	   

	private String tagDescription;

	private String tagName;
	public AddUserTagMetaRequest() {
		super("quickbi-public", "2022-01-01", "AddUserTagMeta", "2.2.0");
		setMethod(MethodType.POST);
	}

	public String getTagDescription() {
		return this.tagDescription;
	}

	public void setTagDescription(String tagDescription) {
		this.tagDescription = tagDescription;
		if(tagDescription != null){
			putQueryParameter("TagDescription", tagDescription);
		}
	}

	public String getTagName() {
		return this.tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
		if(tagName != null){
			putQueryParameter("TagName", tagName);
		}
	}

	@Override
	public Class<AddUserTagMetaResponse> getResponseClass() {
		return AddUserTagMetaResponse.class;
	}

}
