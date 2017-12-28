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
package de.hybris.platform.commercefacades.order.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.order.data.CartData;

public  class CommerceSaveCartResultData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CommerceSaveCartResultData.savedCartData</code> property defined at extension <code>commercefacades</code>. */
		
	private CartData savedCartData;
	
	public CommerceSaveCartResultData()
	{
		// default constructor
	}
	
		
	
	public void setSavedCartData(final CartData savedCartData)
	{
		this.savedCartData = savedCartData;
	}

		
	
	public CartData getSavedCartData() 
	{
		return savedCartData;
	}
	


}
