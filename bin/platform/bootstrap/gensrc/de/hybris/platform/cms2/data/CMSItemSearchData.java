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
package de.hybris.platform.cms2.data;

import java.io.Serializable;
import java.util.Map;

public  class CMSItemSearchData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CMSItemSearchData.mask</code> property defined at extension <code>cms2</code>. */
		
	private String mask;

	/** <i>Generated property</i> for <code>CMSItemSearchData.typeCode</code> property defined at extension <code>cms2</code>. */
		
	private String typeCode;

	/** <i>Generated property</i> for <code>CMSItemSearchData.catalogId</code> property defined at extension <code>cms2</code>. */
		
	private String catalogId;

	/** <i>Generated property</i> for <code>CMSItemSearchData.catalogVersion</code> property defined at extension <code>cms2</code>. */
		
	private String catalogVersion;

	/** <i>Generated property</i> for <code>CMSItemSearchData.itemSearchParams</code> property defined at extension <code>cms2</code>. */
		
	private Map<String, String> itemSearchParams;
	
	public CMSItemSearchData()
	{
		// default constructor
	}
	
		
	
	public void setMask(final String mask)
	{
		this.mask = mask;
	}

		
	
	public String getMask() 
	{
		return mask;
	}
	
		
	
	public void setTypeCode(final String typeCode)
	{
		this.typeCode = typeCode;
	}

		
	
	public String getTypeCode() 
	{
		return typeCode;
	}
	
		
	
	public void setCatalogId(final String catalogId)
	{
		this.catalogId = catalogId;
	}

		
	
	public String getCatalogId() 
	{
		return catalogId;
	}
	
		
	
	public void setCatalogVersion(final String catalogVersion)
	{
		this.catalogVersion = catalogVersion;
	}

		
	
	public String getCatalogVersion() 
	{
		return catalogVersion;
	}
	
		
	
	public void setItemSearchParams(final Map<String, String> itemSearchParams)
	{
		this.itemSearchParams = itemSearchParams;
	}

		
	
	public Map<String, String> getItemSearchParams() 
	{
		return itemSearchParams;
	}
	


}
