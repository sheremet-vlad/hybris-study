package expandcustomer.enums;

import de.hybris.platform.core.HybrisEnumValue;

/**
 * Generated enum SportTypeEnum declared at extension expandcustomer.
 */
@SuppressWarnings("PMD")
public enum SportTypeEnum implements HybrisEnumValue
{
	/**
	 * Generated enum value for SportTypeEnum.football declared at extension expandcustomer.
	 */
	FOOTBALL("football"),
	/**
	 * Generated enum value for SportTypeEnum.volleyball declared at extension expandcustomer.
	 */
	VOLLEYBALL("volleyball"),
	/**
	 * Generated enum value for SportTypeEnum.basketball declared at extension expandcustomer.
	 */
	BASKETBALL("basketball");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SportTypeEnum";
	
	/**<i>Generated simple class name constant.</i>*/
	public final static String SIMPLE_CLASSNAME = "SportTypeEnum";
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private SportTypeEnum(final String code)
	{
		this.code = code.intern();
	}
	
	
	/**
	 * Gets the code of this enum value.
	 *  
	 * @return code of value
	 */
	@Override
	public String getCode()
	{
		return this.code;
	}
	
	/**
	 * Gets the type this enum value belongs to.
	 *  
	 * @return code of type
	 */
	@Override
	public String getType()
	{
		return SIMPLE_CLASSNAME;
	}
	
}
