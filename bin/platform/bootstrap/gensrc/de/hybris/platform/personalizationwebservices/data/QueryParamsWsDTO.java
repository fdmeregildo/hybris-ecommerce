/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 28/12/2017 02:25:04 PM
 * ----------------------------------------------------------------
 *
 * [y] hybris Platform
 * 
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of SAP 
 * Hybris ("Confidential Information"). You shall not disclose such 
 * Confidential Information and shall use it only in accordance with the 
 * terms of the license agreement you entered into with SAP Hybris.
 */
package de.hybris.platform.personalizationwebservices.data;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Map;

/**
 * Generic parameters for query endpoint
 */
@ApiModel(value="queryParams", description="Generic parameters for query endpoint")
public  class QueryParamsWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** Parameters map<br/><br/><i>Generated property</i> for <code>QueryParamsWsDTO.params</code> property defined at extension <code>personalizationwebservices</code>. */
	@ApiModelProperty(name="params", value="Parameters map") 	
	private Map<String,String> params;
	
	public QueryParamsWsDTO()
	{
		// default constructor
	}
	
		
	
	public void setParams(final Map<String,String> params)
	{
		this.params = params;
	}

		
	
	public Map<String,String> getParams() 
	{
		return params;
	}
	


}