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
package de.hybris.platform.cmsfacades.data;

import java.io.Serializable;

public  class SyncRequestData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SyncRequestData.catalogId</code> property defined at extension <code>cmsfacades</code>. */
		
	private String catalogId;

	/** <i>Generated property</i> for <code>SyncRequestData.sourceVersionId</code> property defined at extension <code>cmsfacades</code>. */
		
	private String sourceVersionId;

	/** <i>Generated property</i> for <code>SyncRequestData.targetVersionId</code> property defined at extension <code>cmsfacades</code>. */
		
	private String targetVersionId;
	
	public SyncRequestData()
	{
		// default constructor
	}
	
		
	
	public void setCatalogId(final String catalogId)
	{
		this.catalogId = catalogId;
	}

		
	
	public String getCatalogId() 
	{
		return catalogId;
	}
	
		
	
	public void setSourceVersionId(final String sourceVersionId)
	{
		this.sourceVersionId = sourceVersionId;
	}

		
	
	public String getSourceVersionId() 
	{
		return sourceVersionId;
	}
	
		
	
	public void setTargetVersionId(final String targetVersionId)
	{
		this.targetVersionId = targetVersionId;
	}

		
	
	public String getTargetVersionId() 
	{
		return targetVersionId;
	}
	


}
