/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 28/12/2017 02:25:03 PM
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
package de.hybris.platform.cmswebservices.data;

import java.io.Serializable;

public  class PageRestrictionData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>PageRestrictionData.pageId</code> property defined at extension <code>cmswebservices</code>. */
		
	private String pageId;

	/** <i>Generated property</i> for <code>PageRestrictionData.restrictionId</code> property defined at extension <code>cmswebservices</code>. */
		
	private String restrictionId;
	
	public PageRestrictionData()
	{
		// default constructor
	}
	
		
	
	public void setPageId(final String pageId)
	{
		this.pageId = pageId;
	}

		
	
	public String getPageId() 
	{
		return pageId;
	}
	
		
	
	public void setRestrictionId(final String restrictionId)
	{
		this.restrictionId = restrictionId;
	}

		
	
	public String getRestrictionId() 
	{
		return restrictionId;
	}
	


}
