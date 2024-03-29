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
package de.hybris.platform.core.model.order;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.enums.QuoteState;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Date;

/**
 * Generated model class for type Quote first defined at extension core.
 */
@SuppressWarnings("all")
public class QuoteModel extends AbstractOrderModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "Quote";
	
	/** <i>Generated constant</i> - Attribute key of <code>Quote.version</code> attribute defined at extension <code>core</code>. */
	public static final String VERSION = "version";
	
	/** <i>Generated constant</i> - Attribute key of <code>Quote.state</code> attribute defined at extension <code>core</code>. */
	public static final String STATE = "state";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public QuoteModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public QuoteModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _currency initial attribute declared by type <code>AbstractOrder</code> at extension <code>core</code>
	 * @param _date initial attribute declared by type <code>AbstractOrder</code> at extension <code>core</code>
	 * @param _state initial attribute declared by type <code>Quote</code> at extension <code>core</code>
	 * @param _user initial attribute declared by type <code>Quote</code> at extension <code>core</code>
	 * @param _version initial attribute declared by type <code>Quote</code> at extension <code>core</code>
	 */
	@Deprecated
	public QuoteModel(final CurrencyModel _currency, final Date _date, final QuoteState _state, final UserModel _user, final Integer _version)
	{
		super();
		setCurrency(_currency);
		setDate(_date);
		setState(_state);
		setUser(_user);
		setVersion(_version);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _currency initial attribute declared by type <code>AbstractOrder</code> at extension <code>core</code>
	 * @param _date initial attribute declared by type <code>AbstractOrder</code> at extension <code>core</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _state initial attribute declared by type <code>Quote</code> at extension <code>core</code>
	 * @param _user initial attribute declared by type <code>Quote</code> at extension <code>core</code>
	 * @param _version initial attribute declared by type <code>Quote</code> at extension <code>core</code>
	 */
	@Deprecated
	public QuoteModel(final CurrencyModel _currency, final Date _date, final ItemModel _owner, final QuoteState _state, final UserModel _user, final Integer _version)
	{
		super();
		setCurrency(_currency);
		setDate(_date);
		setOwner(_owner);
		setState(_state);
		setUser(_user);
		setVersion(_version);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Quote.state</code> attribute defined at extension <code>core</code>. 
	 * @return the state - Current state of the quote
	 */
	@Accessor(qualifier = "state", type = Accessor.Type.GETTER)
	public QuoteState getState()
	{
		return getPersistenceContext().getPropertyValue(STATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Quote.version</code> attribute defined at extension <code>core</code>. 
	 * @return the version - The version of the quote. Along with code it makes a quote instance unique.
	 */
	@Accessor(qualifier = "version", type = Accessor.Type.GETTER)
	public Integer getVersion()
	{
		return getPersistenceContext().getPropertyValue(VERSION);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Quote.state</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the state - Current state of the quote
	 */
	@Accessor(qualifier = "state", type = Accessor.Type.SETTER)
	public void setState(final QuoteState value)
	{
		getPersistenceContext().setPropertyValue(STATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>Quote.version</code> attribute defined at extension <code>core</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the version - The version of the quote. Along with code it makes a quote instance unique.
	 */
	@Accessor(qualifier = "version", type = Accessor.Type.SETTER)
	public void setVersion(final Integer value)
	{
		getPersistenceContext().setPropertyValue(VERSION, value);
	}
	
}
