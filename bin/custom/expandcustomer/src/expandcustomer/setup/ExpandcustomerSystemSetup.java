/*
 * [y] hybris Platform
 *
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package expandcustomer.setup;

import static expandcustomer.constants.ExpandcustomerConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import expandcustomer.constants.ExpandcustomerConstants;
import expandcustomer.service.ExpandcustomerService;


@SystemSetup(extension = ExpandcustomerConstants.EXTENSIONNAME)
public class ExpandcustomerSystemSetup
{
	private final ExpandcustomerService expandcustomerService;

	public ExpandcustomerSystemSetup(final ExpandcustomerService expandcustomerService)
	{
		this.expandcustomerService = expandcustomerService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		expandcustomerService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return ExpandcustomerSystemSetup.class.getResourceAsStream("/expandcustomer/sap-hybris-platform.png");
	}
}
