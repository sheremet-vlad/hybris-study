/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jul 8, 2019 3:29:08 PM
 * ----------------------------------------------------------------
 *
 * [y] hybris Platform
 *
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.servicelayer.event.events;

import java.io.Serializable;
import de.hybris.platform.servicelayer.event.events.AbstractEvent;

import de.hybris.platform.util.JspContext;
import java.util.Map;

public  class AfterInitializationEndEvent  extends AbstractEvent {


	/** <i>Generated property</i> for <code>AfterInitializationEndEvent.params</code> property defined at extension <code>core</code>. */
		
	private Map<String, String> params;

	/** <i>Generated property</i> for <code>AfterInitializationEndEvent.ctx</code> property defined at extension <code>core</code>. */
		
	private JspContext ctx;
	
	public AfterInitializationEndEvent()
	{
		super();
	}

	public AfterInitializationEndEvent(final Serializable source)
	{
		super(source);
	}
	
	
	
	public void setParams(final Map<String, String> params)
	{
		this.params = params;
	}
	
	
	
	public Map<String, String> getParams() 
	{
		return params;
	}
	
	
	
	public void setCtx(final JspContext ctx)
	{
		this.ctx = ctx;
	}
	
	
	
	public JspContext getCtx() 
	{
		return ctx;
	}
	


}
