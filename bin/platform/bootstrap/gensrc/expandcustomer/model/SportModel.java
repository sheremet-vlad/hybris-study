/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 16.06.2019 18:41:57                         ---
 * ----------------------------------------------------------------
 */
package expandcustomer.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import expandcustomer.enums.SportTypeEnum;
import java.util.List;

/**
 * Generated model class for type Sport first defined at extension expandcustomer.
 */
@SuppressWarnings("all")
public class SportModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "Sport";
	
	/** <i>Generated constant</i> - Attribute key of <code>Sport.code</code> attribute defined at extension <code>expandcustomer</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>Sport.sportType</code> attribute defined at extension <code>expandcustomer</code>. */
	public static final String SPORTTYPE = "sportType";
	
	/** <i>Generated constant</i> - Attribute key of <code>Sport.product</code> attribute defined at extension <code>expandcustomer</code>. */
	public static final String PRODUCT = "product";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SportModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SportModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>Sport</code> at extension <code>expandcustomer</code>
	 * @param _product initial attribute declared by type <code>Sport</code> at extension <code>expandcustomer</code>
	 */
	@Deprecated
	public SportModel(final String _code, final List<ProductModel> _product)
	{
		super();
		setCode(_code);
		setProduct(_product);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>Sport</code> at extension <code>expandcustomer</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _product initial attribute declared by type <code>Sport</code> at extension <code>expandcustomer</code>
	 */
	@Deprecated
	public SportModel(final String _code, final ItemModel _owner, final List<ProductModel> _product)
	{
		super();
		setCode(_code);
		setOwner(_owner);
		setProduct(_product);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Sport.code</code> attribute defined at extension <code>expandcustomer</code>. 
	 * @return the code
	 */
	@Accessor(qualifier = "code", type = Accessor.Type.GETTER)
	public String getCode()
	{
		return getPersistenceContext().getPropertyValue(CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Sport.product</code> attribute defined at extension <code>expandcustomer</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the product
	 */
	@Accessor(qualifier = "product", type = Accessor.Type.GETTER)
	public List<ProductModel> getProduct()
	{
		return getPersistenceContext().getPropertyValue(PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Sport.sportType</code> attribute defined at extension <code>expandcustomer</code>. 
	 * @return the sportType
	 */
	@Accessor(qualifier = "sportType", type = Accessor.Type.GETTER)
	public SportTypeEnum getSportType()
	{
		return getPersistenceContext().getPropertyValue(SPORTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Sport.code</code> attribute defined at extension <code>expandcustomer</code>. 
	 *  
	 * @param value the code
	 */
	@Accessor(qualifier = "code", type = Accessor.Type.SETTER)
	public void setCode(final String value)
	{
		getPersistenceContext().setPropertyValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Sport.product</code> attribute defined at extension <code>expandcustomer</code>. 
	 *  
	 * @param value the product
	 */
	@Accessor(qualifier = "product", type = Accessor.Type.SETTER)
	public void setProduct(final List<ProductModel> value)
	{
		getPersistenceContext().setPropertyValue(PRODUCT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Sport.sportType</code> attribute defined at extension <code>expandcustomer</code>. 
	 *  
	 * @param value the sportType
	 */
	@Accessor(qualifier = "sportType", type = Accessor.Type.SETTER)
	public void setSportType(final SportTypeEnum value)
	{
		getPersistenceContext().setPropertyValue(SPORTTYPE, value);
	}
	
}
