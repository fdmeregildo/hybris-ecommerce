/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 28/12/2017 02:25:05 PM
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
package de.hybris.platform.ycommercewebservices.auth.data;

import java.io.Serializable;

public  class LogoutResponse  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>LogoutResponse.success</code> property defined at extension <code>ycommercewebservices</code>. */
		
	private boolean success;
	
	public LogoutResponse()
	{
		// default constructor
	}
	
		
	
	public void setSuccess(final boolean success)
	{
		this.success = success;
	}

		
	
	public boolean isSuccess() 
	{
		return success;
	}
	


}