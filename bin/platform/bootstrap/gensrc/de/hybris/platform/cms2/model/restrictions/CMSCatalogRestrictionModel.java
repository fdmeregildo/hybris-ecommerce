/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 28/12/2017 02:24:58 PM                      ---
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
 *  
 */
package de.hybris.platform.cms2.model.restrictions;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.catalog.model.CatalogModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.cms2.model.restrictions.AbstractRestrictionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;

/**
 * Generated model class for type CMSCatalogRestriction first defined at extension cms2.
 */
@SuppressWarnings("all")
public class CMSCatalogRestrictionModel extends AbstractRestrictionModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CMSCatalogRestriction";
	
	/** <i>Generated constant</i> - Attribute key of <code>CMSCatalogRestriction.catalogs</code> attribute defined at extension <code>cms2</code>. */
	public static final String CATALOGS = "catalogs";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CMSCatalogRestrictionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CMSCatalogRestrictionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public CMSCatalogRestrictionModel(final CatalogVersionModel _catalogVersion, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public CMSCatalogRestrictionModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSCatalogRestriction.catalogs</code> attribute defined at extension <code>cms2</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the catalogs
	 */
	@Accessor(qualifier = "catalogs", type = Accessor.Type.GETTER)
	public Collection<CatalogModel> getCatalogs()
	{
		return getPersistenceContext().getPropertyValue(CATALOGS);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CMSCatalogRestriction.catalogs</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the catalogs
	 */
	@Accessor(qualifier = "catalogs", type = Accessor.Type.SETTER)
	public void setCatalogs(final Collection<CatalogModel> value)
	{
		getPersistenceContext().setPropertyValue(CATALOGS, value);
	}
	
}
