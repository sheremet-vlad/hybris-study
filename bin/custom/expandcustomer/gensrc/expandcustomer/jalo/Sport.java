/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 14.06.2019 1:51:06                          ---
 * ----------------------------------------------------------------
 */
package expandcustomer.jalo;

import de.hybris.platform.constants.CoreConstants;
import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type Sport.
 */
@SLDSafe
@SuppressWarnings({"unused","cast","PMD"})
public class Sport extends GenericItem
{
	/** Qualifier of the <code>Sport.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Sport.sportType</code> attribute **/
	public static final String SPORTTYPE = "sportType";
	/** Qualifier of the <code>Sport.product</code> attribute **/
	public static final String PRODUCT = "product";
	/**
	* {@link OneToManyHandler} for handling 1:n PRODUCT's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Product> PRODUCTHANDLER = new OneToManyHandler<Product>(
	CoreConstants.TC.PRODUCT,
	false,
	"sport",
	null,
	false,
	true,
	CollectionType.LIST
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(SPORTTYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Sport.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "code".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Sport.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Sport.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "code".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Sport.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Sport.product</code> attribute.
	 * @return the product
	 */
	public List<Product> getProduct(final SessionContext ctx)
	{
		return (List<Product>)PRODUCTHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Sport.product</code> attribute.
	 * @return the product
	 */
	public List<Product> getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Sport.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final SessionContext ctx, final List<Product> value)
	{
		PRODUCTHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Sport.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final List<Product> value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to product. 
	 * @param value the item to add to product
	 */
	public void addToProduct(final SessionContext ctx, final Product value)
	{
		PRODUCTHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to product. 
	 * @param value the item to add to product
	 */
	public void addToProduct(final Product value)
	{
		addToProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from product. 
	 * @param value the item to remove from product
	 */
	public void removeFromProduct(final SessionContext ctx, final Product value)
	{
		PRODUCTHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from product. 
	 * @param value the item to remove from product
	 */
	public void removeFromProduct(final Product value)
	{
		removeFromProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Sport.sportType</code> attribute.
	 * @return the sportType
	 */
	public EnumerationValue getSportType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, "sportType".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Sport.sportType</code> attribute.
	 * @return the sportType
	 */
	public EnumerationValue getSportType()
	{
		return getSportType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Sport.sportType</code> attribute. 
	 * @param value the sportType
	 */
	public void setSportType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, "sportType".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Sport.sportType</code> attribute. 
	 * @param value the sportType
	 */
	public void setSportType(final EnumerationValue value)
	{
		setSportType( getSession().getSessionContext(), value );
	}
	
}
