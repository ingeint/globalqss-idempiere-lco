/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.globalqss.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Model for LCO_WithholdingType
 *  @author iDempiere (generated) 
 *  @version Release 10 - $Id$ */
@org.adempiere.base.Model(table="LCO_WithholdingType")
public class X_LCO_WithholdingType extends PO implements I_LCO_WithholdingType, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20230324L;

    /** Standard Constructor */
    public X_LCO_WithholdingType (Properties ctx, int LCO_WithholdingType_ID, String trxName)
    {
      super (ctx, LCO_WithholdingType_ID, trxName);
      /** if (LCO_WithholdingType_ID == 0)
        {
			setIsOverrideDateOnAllocation (false);
// N
			setIsSOTrx (false);
// N
			setLCO_WithholdingType_ID (0);
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_LCO_WithholdingType (Properties ctx, int LCO_WithholdingType_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, LCO_WithholdingType_ID, trxName, virtualColumns);
      /** if (LCO_WithholdingType_ID == 0)
        {
			setIsOverrideDateOnAllocation (false);
// N
			setIsSOTrx (false);
// N
			setLCO_WithholdingType_ID (0);
			setName (null);
        } */
    }

    /** Load Constructor */
    public X_LCO_WithholdingType (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 2 - Client 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuilder sb = new StringBuilder ("X_LCO_WithholdingType[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** Set Counter.
		@param Counter Count Value
	*/
	public void setCounter (int Counter)
	{
		throw new IllegalArgumentException ("Counter is virtual column");	}

	/** Get Counter.
		@return Count Value
	  */
	public int getCounter()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Counter);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Description.
		@param Description Optional short description of the record
	*/
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription()
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set Override Date On Allocation.
		@param IsOverrideDateOnAllocation Override Date On Allocation
	*/
	public void setIsOverrideDateOnAllocation (boolean IsOverrideDateOnAllocation)
	{
		set_Value (COLUMNNAME_IsOverrideDateOnAllocation, Boolean.valueOf(IsOverrideDateOnAllocation));
	}

	/** Get Override Date On Allocation.
		@return Override Date On Allocation	  */
	public boolean isOverrideDateOnAllocation()
	{
		Object oo = get_Value(COLUMNNAME_IsOverrideDateOnAllocation);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Sales Transaction.
		@param IsSOTrx This is a Sales Transaction
	*/
	public void setIsSOTrx (boolean IsSOTrx)
	{
		set_Value (COLUMNNAME_IsSOTrx, Boolean.valueOf(IsSOTrx));
	}

	/** Get Sales Transaction.
		@return This is a Sales Transaction
	  */
	public boolean isSOTrx()
	{
		Object oo = get_Value(COLUMNNAME_IsSOTrx);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Withholding Type.
		@param LCO_WithholdingType_ID Withholding Type
	*/
	public void setLCO_WithholdingType_ID (int LCO_WithholdingType_ID)
	{
		if (LCO_WithholdingType_ID < 1)
			set_ValueNoCheck (COLUMNNAME_LCO_WithholdingType_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_LCO_WithholdingType_ID, Integer.valueOf(LCO_WithholdingType_ID));
	}

	/** Get Withholding Type.
		@return Withholding Type	  */
	public int getLCO_WithholdingType_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LCO_WithholdingType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set LCO_WithholdingType_UU.
		@param LCO_WithholdingType_UU LCO_WithholdingType_UU
	*/
	public void setLCO_WithholdingType_UU (String LCO_WithholdingType_UU)
	{
		set_Value (COLUMNNAME_LCO_WithholdingType_UU, LCO_WithholdingType_UU);
	}

	/** Get LCO_WithholdingType_UU.
		@return LCO_WithholdingType_UU	  */
	public String getLCO_WithholdingType_UU()
	{
		return (String)get_Value(COLUMNNAME_LCO_WithholdingType_UU);
	}

	/** Set Name.
		@param Name Alphanumeric identifier of the entity
	*/
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName()
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), getName());
    }
}