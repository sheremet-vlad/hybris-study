/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jul 8, 2019 3:29:07 PM                      ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.core.model.user;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import expandcustomer.model.SportModel;
import java.util.Collection;
import java.util.Set;

/**
 * Generated model class for type Customer first defined at extension core.
 */
@SuppressWarnings("all")
public class CustomerModel extends UserModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "Customer";
	
	/** <i>Generated constant</i> - Attribute key of <code>Customer.customerID</code> attribute defined at extension <code>core</code>. */
	public static final String CUSTOMERID = "customerID";
	
	/** <i>Generated constant</i> - Attribute key of <code>Customer.previewCatalogVersions</code> attribute defined at extension <code>catalog</code>. */
	public static final String PREVIEWCATALOGVERSIONS = "previewCatalogVersions";
	
	/** <i>Generated constant</i> - Attribute key of <code>Customer.customerSport</code> attribute defined at extension <code>expandcustomer</code>. */
	public static final String CUSTOMERSPORT = "customerSport";
	
	/** <i>Generated constant</i> - Attribute key of <code>Customer.sportCount</code> attribute defined at extension <code>expandcustomer</code>. */
	public static final String SPORTCOUNT = "sportCount";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CustomerModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CustomerModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _loginDisabled initial attribute declared by type <code>User</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>Principal</code> at extension <code>core</code>
	 */
	@Deprecated
	public CustomerModel(final boolean _loginDisabled, final String _uid)
	{
		super();
		setLoginDisabled(_loginDisabled);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _loginDisabled initial attribute declared by type <code>User</code> at extension <code>core</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>Principal</code> at extension <code>core</code>
	 */
	@Deprecated
	public CustomerModel(final boolean _loginDisabled, final ItemModel _owner, final String _uid)
	{
		super();
		setLoginDisabled(_loginDisabled);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.customerID</code> attribute defined at extension <code>core</code>. 
	 * @return the customerID
	 */
	@Accessor(qualifier = "customerID", type = Accessor.Type.GETTER)
	public String getCustomerID()
	{
		return getPersistenceContext().getPropertyValue(CUSTOMERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.customerSport</code> attribute defined at extension <code>expandcustomer</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the customerSport
	 */
	@Accessor(qualifier = "customerSport", type = Accessor.Type.GETTER)
	public Set<SportModel> getCustomerSport()
	{
		return getPersistenceContext().getPropertyValue(CUSTOMERSPORT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.previewCatalogVersions</code> attribute defined at extension <code>catalog</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the previewCatalogVersions
	 */
	@Accessor(qualifier = "previewCatalogVersions", type = Accessor.Type.GETTER)
	public Collection<CatalogVersionModel> getPreviewCatalogVersions()
	{
		return getPersistenceContext().getPropertyValue(PREVIEWCATALOGVERSIONS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.sportCount</code> dynamic attribute defined at extension <code>expandcustomer</code>. 
	 * @return the sportCount
	 */
	@Accessor(qualifier = "sportCount", type = Accessor.Type.GETTER)
	public Integer getSportCount()
	{
		return getPersistenceContext().getDynamicValue(this,SPORTCOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Customer.customerID</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the customerID
	 */
	@Accessor(qualifier = "customerID", type = Accessor.Type.SETTER)
	public void setCustomerID(final String value)
	{
		getPersistenceContext().setPropertyValue(CUSTOMERID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Customer.customerSport</code> attribute defined at extension <code>expandcustomer</code>. 
	 *  
	 * @param value the customerSport
	 */
	@Accessor(qualifier = "customerSport", type = Accessor.Type.SETTER)
	public void setCustomerSport(final Set<SportModel> value)
	{
		getPersistenceContext().setPropertyValue(CUSTOMERSPORT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Customer.previewCatalogVersions</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the previewCatalogVersions
	 */
	@Accessor(qualifier = "previewCatalogVersions", type = Accessor.Type.SETTER)
	public void setPreviewCatalogVersions(final Collection<CatalogVersionModel> value)
	{
		getPersistenceContext().setPropertyValue(PREVIEWCATALOGVERSIONS, value);
	}
	
}
