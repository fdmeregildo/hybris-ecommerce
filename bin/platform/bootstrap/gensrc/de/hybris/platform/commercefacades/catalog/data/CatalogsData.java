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
package de.hybris.platform.commercefacades.catalog.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.catalog.data.CatalogData;
import java.util.List;

public  class CatalogsData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CatalogsData.catalogs</code> property defined at extension <code>commercefacades</code>. */
		
	private List<CatalogData> catalogs;
	
	public CatalogsData()
	{
		// default constructor
	}
	
		
	
	public void setCatalogs(final List<CatalogData> catalogs)
	{
		this.catalogs = catalogs;
	}

		
	
	public List<CatalogData> getCatalogs() 
	{
		return catalogs;
	}
	


}
