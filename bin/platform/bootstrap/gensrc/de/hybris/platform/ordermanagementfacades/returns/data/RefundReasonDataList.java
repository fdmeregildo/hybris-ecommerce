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
package de.hybris.platform.ordermanagementfacades.returns.data;

import java.io.Serializable;
import de.hybris.platform.basecommerce.enums.RefundReason;
import java.util.List;

public  class RefundReasonDataList  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>RefundReasonDataList.refundReasons</code> property defined at extension <code>ordermanagementfacades</code>. */
		
	private List<RefundReason> refundReasons;
	
	public RefundReasonDataList()
	{
		// default constructor
	}
	
		
	
	public void setRefundReasons(final List<RefundReason> refundReasons)
	{
		this.refundReasons = refundReasons;
	}

		
	
	public List<RefundReason> getRefundReasons() 
	{
		return refundReasons;
	}
	


}