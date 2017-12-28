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
package de.hybris.platform.commercewebservicescommons.dto.search;

import java.io.Serializable;
import de.hybris.platform.commercewebservicescommons.dto.search.SearchQueryWsDTO;

public  class SearchStateWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SearchStateWsDTO.url</code> property defined at extension <code>commercewebservicescommons</code>. */
		
	private String url;

	/** <i>Generated property</i> for <code>SearchStateWsDTO.query</code> property defined at extension <code>commercewebservicescommons</code>. */
		
	private SearchQueryWsDTO query;
	
	public SearchStateWsDTO()
	{
		// default constructor
	}
	
		
	
	public void setUrl(final String url)
	{
		this.url = url;
	}

		
	
	public String getUrl() 
	{
		return url;
	}
	
		
	
	public void setQuery(final SearchQueryWsDTO query)
	{
		this.query = query;
	}

		
	
	public SearchQueryWsDTO getQuery() 
	{
		return query;
	}
	


}
