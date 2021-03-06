/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 09/01/2018 05:47:47 PM
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
package concerttours.data;

import java.io.Serializable;

/**
 * Data object for a tour summary which has no equivalent on the type system
 */
public  class TourSummaryData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>TourSummaryData.id</code> property defined at extension <code>concerttours</code>. */
		
	private String id;

	/** <i>Generated property</i> for <code>TourSummaryData.tourName</code> property defined at extension <code>concerttours</code>. */
		
	private String tourName;

	/** <i>Generated property</i> for <code>TourSummaryData.numberOfConcerts</code> property defined at extension <code>concerttours</code>. */
		
	private String numberOfConcerts;
	
	public TourSummaryData()
	{
		// default constructor
	}
	
		
	
	public void setId(final String id)
	{
		this.id = id;
	}

		
	
	public String getId() 
	{
		return id;
	}
	
		
	
	public void setTourName(final String tourName)
	{
		this.tourName = tourName;
	}

		
	
	public String getTourName() 
	{
		return tourName;
	}
	
		
	
	public void setNumberOfConcerts(final String numberOfConcerts)
	{
		this.numberOfConcerts = numberOfConcerts;
	}

		
	
	public String getNumberOfConcerts() 
	{
		return numberOfConcerts;
	}
	


}
