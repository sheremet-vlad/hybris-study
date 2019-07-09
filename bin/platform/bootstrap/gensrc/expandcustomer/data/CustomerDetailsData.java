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
package expandcustomer.data;

import java.io.Serializable;

public  class CustomerDetailsData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CustomerDetailsData.name</code> property defined at extension <code>expandcustomer</code>. */
		
	private String name;

	/** <i>Generated property</i> for <code>CustomerDetailsData.code</code> property defined at extension <code>expandcustomer</code>. */
		
	private String code;

	/** <i>Generated property</i> for <code>CustomerDetailsData.sportCount</code> property defined at extension <code>expandcustomer</code>. */
		
	private Integer sportCount;

	/** <i>Generated property</i> for <code>CustomerDetailsData.uid</code> property defined at extension <code>expandcustomer</code>. */
		
	private String uid;
	
	public CustomerDetailsData()
	{
		// default constructor
	}
	
		
	
	public void setName(final String name)
	{
		this.name = name;
	}

		
	
	public String getName() 
	{
		return name;
	}
	
		
	
	public void setCode(final String code)
	{
		this.code = code;
	}

		
	
	public String getCode() 
	{
		return code;
	}
	
		
	
	public void setSportCount(final Integer sportCount)
	{
		this.sportCount = sportCount;
	}

		
	
	public Integer getSportCount() 
	{
		return sportCount;
	}
	
		
	
	public void setUid(final String uid)
	{
		this.uid = uid;
	}

		
	
	public String getUid() 
	{
		return uid;
	}
	


}
