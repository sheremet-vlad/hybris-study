/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jul 8, 2019 3:29:07 PM                      ---
 * ----------------------------------------------------------------
 */
package cleanup.jalo;

import cleanup.constants.CleanUpConstants;
import de.hybris.platform.cronjob.jalo.CleanUpCronJob;
import de.hybris.platform.cronjob.jalo.CronJob;
import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.extension.ExtensionManager;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>CleanUpManager</code>.
 */
@SuppressWarnings({"unused","cast","PMD"})
@SLDSafe
public class CleanUpManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("dirPath", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.cronjob.jalo.CleanUpCronJob", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CleanUpCronJob.dirPath</code> attribute.
	 * @return the dirPath
	 */
	public String getDirPath(final SessionContext ctx, final CleanUpCronJob item)
	{
		return (String)item.getProperty( ctx, CleanUpConstants.Attributes.CleanUpCronJob.DIRPATH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CleanUpCronJob.dirPath</code> attribute.
	 * @return the dirPath
	 */
	public String getDirPath(final CleanUpCronJob item)
	{
		return getDirPath( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CleanUpCronJob.dirPath</code> attribute. 
	 * @param value the dirPath
	 */
	public void setDirPath(final SessionContext ctx, final CleanUpCronJob item, final String value)
	{
		item.setProperty(ctx, CleanUpConstants.Attributes.CleanUpCronJob.DIRPATH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CleanUpCronJob.dirPath</code> attribute. 
	 * @param value the dirPath
	 */
	public void setDirPath(final CleanUpCronJob item, final String value)
	{
		setDirPath( getSession().getSessionContext(), item, value );
	}
	
	public static final CleanUpManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (CleanUpManager) em.getExtension(CleanUpConstants.EXTENSIONNAME);
	}
	
	@Override
	public String getName()
	{
		return CleanUpConstants.EXTENSIONNAME;
	}
	
}
