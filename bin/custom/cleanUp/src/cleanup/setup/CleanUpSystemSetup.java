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
package cleanup.setup;

import static cleanup.constants.CleanUpConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import cleanup.constants.CleanUpConstants;
import cleanup.service.CleanUpService;


@SystemSetup(extension = CleanUpConstants.EXTENSIONNAME)
public class CleanUpSystemSetup
{
	private final CleanUpService cleanUpService;

	public CleanUpSystemSetup(final CleanUpService cleanUpService)
	{
		this.cleanUpService = cleanUpService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		cleanUpService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return CleanUpSystemSetup.class.getResourceAsStream("/cleanUp/sap-hybris-platform.png");
	}
}
