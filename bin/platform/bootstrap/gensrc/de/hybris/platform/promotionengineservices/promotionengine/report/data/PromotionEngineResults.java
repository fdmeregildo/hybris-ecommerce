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
package de.hybris.platform.promotionengineservices.promotionengine.report.data;

import java.io.Serializable;
import de.hybris.platform.promotionengineservices.promotionengine.report.data.OrderEntryLevelPromotionEngineResults;
import de.hybris.platform.promotionengineservices.promotionengine.report.data.OrderLevelPromotionEngineResults;
import java.util.List;

public  class PromotionEngineResults  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>PromotionEngineResults.orderLevelPromotionEngineResults</code> property defined at extension <code>promotionengineservices</code>. */
		
	private OrderLevelPromotionEngineResults orderLevelPromotionEngineResults;

	/** <i>Generated property</i> for <code>PromotionEngineResults.orderEntryLevelPromotionEngineResults</code> property defined at extension <code>promotionengineservices</code>. */
		
	private List<OrderEntryLevelPromotionEngineResults> orderEntryLevelPromotionEngineResults;
	
	public PromotionEngineResults()
	{
		// default constructor
	}
	
		
	
	public void setOrderLevelPromotionEngineResults(final OrderLevelPromotionEngineResults orderLevelPromotionEngineResults)
	{
		this.orderLevelPromotionEngineResults = orderLevelPromotionEngineResults;
	}

		
	
	public OrderLevelPromotionEngineResults getOrderLevelPromotionEngineResults() 
	{
		return orderLevelPromotionEngineResults;
	}
	
		
	
	public void setOrderEntryLevelPromotionEngineResults(final List<OrderEntryLevelPromotionEngineResults> orderEntryLevelPromotionEngineResults)
	{
		this.orderEntryLevelPromotionEngineResults = orderEntryLevelPromotionEngineResults;
	}

		
	
	public List<OrderEntryLevelPromotionEngineResults> getOrderEntryLevelPromotionEngineResults() 
	{
		return orderEntryLevelPromotionEngineResults;
	}
	


}
