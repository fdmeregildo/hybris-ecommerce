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
package de.hybris.platform.personalizationfacades.data;

import java.io.Serializable;
import de.hybris.platform.personalizationfacades.data.VariationData;
import de.hybris.platform.personalizationfacades.enums.ItemStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.List;

/**
 * Customization
 */
@ApiModel(value="customization", description="Customization")
public  class CustomizationData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CustomizationData.code</code> property defined at extension <code>personalizationfacades</code>. */
	@ApiModelProperty(name="code") 	
	private String code;

	/** <i>Generated property</i> for <code>CustomizationData.name</code> property defined at extension <code>personalizationfacades</code>. */
	@ApiModelProperty(name="name") 	
	private String name;

	/** <i>Generated property</i> for <code>CustomizationData.description</code> property defined at extension <code>personalizationfacades</code>. */
	@ApiModelProperty(name="description") 	
	private String description;

	/** <i>Generated property</i> for <code>CustomizationData.rank</code> property defined at extension <code>personalizationfacades</code>. */
	@ApiModelProperty(name="rank") 	
	private Integer rank;

	/** <i>Generated property</i> for <code>CustomizationData.active</code> property defined at extension <code>personalizationfacades</code>. */
	@ApiModelProperty(name="active") 	
	private boolean active;

	/** <i>Generated property</i> for <code>CustomizationData.status</code> property defined at extension <code>personalizationfacades</code>. */
	@ApiModelProperty(name="status", allowableValues="ENABLED,DISABLED,DELETED") 	
	private ItemStatus status;

	/** <i>Generated property</i> for <code>CustomizationData.enabledStartDate</code> property defined at extension <code>personalizationfacades</code>. */
	@ApiModelProperty(name="enabledStartDate") 	
	private Date enabledStartDate;

	/** <i>Generated property</i> for <code>CustomizationData.enabledEndDate</code> property defined at extension <code>personalizationfacades</code>. */
	@ApiModelProperty(name="enabledEndDate") 	
	private Date enabledEndDate;

	/** <i>Generated property</i> for <code>CustomizationData.variations</code> property defined at extension <code>personalizationfacades</code>. */
	@ApiModelProperty(name="variations") 	
	private List<VariationData> variations;
	
	public CustomizationData()
	{
		// default constructor
	}
	
		
	
	public void setCode(final String code)
	{
		this.code = code;
	}

		
	
	public String getCode() 
	{
		return code;
	}
	
		
	
	public void setName(final String name)
	{
		this.name = name;
	}

		
	
	public String getName() 
	{
		return name;
	}
	
		
	
	public void setDescription(final String description)
	{
		this.description = description;
	}

		
	
	public String getDescription() 
	{
		return description;
	}
	
		
	
	public void setRank(final Integer rank)
	{
		this.rank = rank;
	}

		
	
	public Integer getRank() 
	{
		return rank;
	}
	
		
	
	public void setActive(final boolean active)
	{
		this.active = active;
	}

		
	
	public boolean isActive() 
	{
		return active;
	}
	
		
	
	public void setStatus(final ItemStatus status)
	{
		this.status = status;
	}

		
	
	public ItemStatus getStatus() 
	{
		return status;
	}
	
		
	
	public void setEnabledStartDate(final Date enabledStartDate)
	{
		this.enabledStartDate = enabledStartDate;
	}

		
	
	public Date getEnabledStartDate() 
	{
		return enabledStartDate;
	}
	
		
	
	public void setEnabledEndDate(final Date enabledEndDate)
	{
		this.enabledEndDate = enabledEndDate;
	}

		
	
	public Date getEnabledEndDate() 
	{
		return enabledEndDate;
	}
	
		
	
	public void setVariations(final List<VariationData> variations)
	{
		this.variations = variations;
	}

		
	
	public List<VariationData> getVariations() 
	{
		return variations;
	}
	


}
