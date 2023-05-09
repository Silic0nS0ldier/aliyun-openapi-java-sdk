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

package com.aliyuncs.iot.model.v20180120;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.GetDownloadFileResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDownloadFileResponse extends AcsResponse {

	private String code;

	private String errorMessage;

	private String requestId;

	private Boolean success;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer status;

		private String longJobId;

		private Long beginTime;

		private Boolean asyncExecute;

		private Long totalCount;

		private Long endTime;

		private Integer previewSize;

		private Integer pageNo;

		private Integer pageSize;

		private String csvUrl;

		private String csvFileName;

		private String datasetId;

		private String resultDataInString;

		private List<HeaderItem> header;

		private List<Map<Object,Object>> result;

		private QuerySetting querySetting;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getLongJobId() {
			return this.longJobId;
		}

		public void setLongJobId(String longJobId) {
			this.longJobId = longJobId;
		}

		public Long getBeginTime() {
			return this.beginTime;
		}

		public void setBeginTime(Long beginTime) {
			this.beginTime = beginTime;
		}

		public Boolean getAsyncExecute() {
			return this.asyncExecute;
		}

		public void setAsyncExecute(Boolean asyncExecute) {
			this.asyncExecute = asyncExecute;
		}

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public Integer getPreviewSize() {
			return this.previewSize;
		}

		public void setPreviewSize(Integer previewSize) {
			this.previewSize = previewSize;
		}

		public Integer getPageNo() {
			return this.pageNo;
		}

		public void setPageNo(Integer pageNo) {
			this.pageNo = pageNo;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public String getCsvUrl() {
			return this.csvUrl;
		}

		public void setCsvUrl(String csvUrl) {
			this.csvUrl = csvUrl;
		}

		public String getCsvFileName() {
			return this.csvFileName;
		}

		public void setCsvFileName(String csvFileName) {
			this.csvFileName = csvFileName;
		}

		public String getDatasetId() {
			return this.datasetId;
		}

		public void setDatasetId(String datasetId) {
			this.datasetId = datasetId;
		}

		public String getResultDataInString() {
			return this.resultDataInString;
		}

		public void setResultDataInString(String resultDataInString) {
			this.resultDataInString = resultDataInString;
		}

		public List<HeaderItem> getHeader() {
			return this.header;
		}

		public void setHeader(List<HeaderItem> header) {
			this.header = header;
		}

		public List<Map<Object,Object>> getResult() {
			return this.result;
		}

		public void setResult(List<Map<Object,Object>> result) {
			this.result = result;
		}

		public QuerySetting getQuerySetting() {
			return this.querySetting;
		}

		public void setQuerySetting(QuerySetting querySetting) {
			this.querySetting = querySetting;
		}

		public static class HeaderItem {

			private String typeClass;

			private String fieldName;

			private String geoClass;

			private String fieldType;

			private String timeClass;

			private String dimDateClass;

			private String alias;

			public String getTypeClass() {
				return this.typeClass;
			}

			public void setTypeClass(String typeClass) {
				this.typeClass = typeClass;
			}

			public String getFieldName() {
				return this.fieldName;
			}

			public void setFieldName(String fieldName) {
				this.fieldName = fieldName;
			}

			public String getGeoClass() {
				return this.geoClass;
			}

			public void setGeoClass(String geoClass) {
				this.geoClass = geoClass;
			}

			public String getFieldType() {
				return this.fieldType;
			}

			public void setFieldType(String fieldType) {
				this.fieldType = fieldType;
			}

			public String getTimeClass() {
				return this.timeClass;
			}

			public void setTimeClass(String timeClass) {
				this.timeClass = timeClass;
			}

			public String getDimDateClass() {
				return this.dimDateClass;
			}

			public void setDimDateClass(String dimDateClass) {
				this.dimDateClass = dimDateClass;
			}

			public String getAlias() {
				return this.alias;
			}

			public void setAlias(String alias) {
				this.alias = alias;
			}
		}

		public static class QuerySetting {

			private List<SelectedHeadersItem> selectedHeaders;

			private List<AstExprItem> astExpr;

			public List<SelectedHeadersItem> getSelectedHeaders() {
				return this.selectedHeaders;
			}

			public void setSelectedHeaders(List<SelectedHeadersItem> selectedHeaders) {
				this.selectedHeaders = selectedHeaders;
			}

			public List<AstExprItem> getAstExpr() {
				return this.astExpr;
			}

			public void setAstExpr(List<AstExprItem> astExpr) {
				this.astExpr = astExpr;
			}

			public static class SelectedHeadersItem {

				private String fieldName;

				private String geoClass;

				private String fieldType;

				private String timeClass;

				private String alias;

				private String dimDateClass;

				public String getFieldName() {
					return this.fieldName;
				}

				public void setFieldName(String fieldName) {
					this.fieldName = fieldName;
				}

				public String getGeoClass() {
					return this.geoClass;
				}

				public void setGeoClass(String geoClass) {
					this.geoClass = geoClass;
				}

				public String getFieldType() {
					return this.fieldType;
				}

				public void setFieldType(String fieldType) {
					this.fieldType = fieldType;
				}

				public String getTimeClass() {
					return this.timeClass;
				}

				public void setTimeClass(String timeClass) {
					this.timeClass = timeClass;
				}

				public String getAlias() {
					return this.alias;
				}

				public void setAlias(String alias) {
					this.alias = alias;
				}

				public String getDimDateClass() {
					return this.dimDateClass;
				}

				public void setDimDateClass(String dimDateClass) {
					this.dimDateClass = dimDateClass;
				}
			}

			public static class AstExprItem {

				private String exprType;

				private String expr;

				public String getExprType() {
					return this.exprType;
				}

				public void setExprType(String exprType) {
					this.exprType = exprType;
				}

				public String getExpr() {
					return this.expr;
				}

				public void setExpr(String expr) {
					this.expr = expr;
				}
			}
		}
	}

	@Override
	public GetDownloadFileResponse getInstance(UnmarshallerContext context) {
		return	GetDownloadFileResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
