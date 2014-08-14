package com.xasecure.entity;
/*
 * Copyright (c) 2014 XASecure
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * XASecure ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with XASecure
 */

/**
 * Group
 * 
 */

import java.util.*;
import javax.persistence.*;
import javax.xml.bind.annotation.*;
import com.xasecure.common.*;
import com.xasecure.entity.*;


@Entity
@Table(name="x_group")
@XmlRootElement
public class XXGroup extends XXDBBase implements java.io.Serializable {
	private static final long serialVersionUID = 1L;



	/**
	 * Name
	 * <ul>
	 * <li>The maximum length for this attribute is <b>1024</b>.
	 * </ul>
	 *
	 */
	@Column(name="GROUP_NAME"  , nullable=false , length=1024)
	protected String name;

	/**
	 * Description
	 * <ul>
	 * <li>The maximum length for this attribute is <b>4000</b>.
	 * </ul>
	 *
	 */
	@Column(name="DESCR"  , nullable=false , length=4000)
	protected String description;

	/**
	 * Status
	 * <ul>
	 * <li>This attribute is of type enum CommonEnums::ActiveStatus
	 * </ul>
	 *
	 */
	@Column(name="STATUS"  , nullable=false )
	protected int status = XAConstants.STATUS_DISABLED;

	/**
	 * Type of group
	 * <ul>
	 * <li>This attribute is of type enum CommonEnums::XAGroupType
	 * </ul>
	 *
	 */
	@Column(name="GROUP_TYPE"  , nullable=false )
	protected int groupType = AppConstants.XA_GROUP_UNKNOWN;
	
	@Column(name="GROUP_SRC"  , nullable=false )
	protected int groupSource = XACommonEnums.GROUP_INTERNAL;

	/**
	 * Id of the credential store
	 * <ul>
	 * </ul>
	 *
	 */
	@Column(name="CRED_STORE_ID"   )
	protected Long credStoreId;


	/**
	 * Default constructor. This will set all the attributes to default value.
	 */
	public XXGroup ( ) {
		status = XAConstants.STATUS_DISABLED;
		groupType = AppConstants.XA_GROUP_UNKNOWN;
		groupSource = XACommonEnums.GROUP_INTERNAL;
	}

	@Override
	public int getMyClassType( ) {
	    return AppConstants.CLASS_TYPE_XA_GROUP;
	}

	@Override
	public String getMyDisplayValue() {
		return getDescription( );
	}

	/**
	 * This method sets the value to the member attribute <b>name</b>.
	 * You cannot set null to the attribute.
	 * @param name Value to set member attribute <b>name</b>
	 */
	public void setName( String name ) {
		this.name = name;
	}

	/**
	 * Returns the value for the member attribute <b>name</b>
	 * @return String - value of member attribute <b>name</b>.
	 */
	public String getName( ) {
		return this.name;
	}

	/**
	 * This method sets the value to the member attribute <b>description</b>.
	 * You cannot set null to the attribute.
	 * @param description Value to set member attribute <b>description</b>
	 */
	public void setDescription( String description ) {
		this.description = description;
	}

	/**
	 * Returns the value for the member attribute <b>description</b>
	 * @return String - value of member attribute <b>description</b>.
	 */
	public String getDescription( ) {
		return this.description;
	}

	/**
	 * This method sets the value to the member attribute <b>status</b>.
	 * You cannot set null to the attribute.
	 * @param status Value to set member attribute <b>status</b>
	 */
	public void setStatus( int status ) {
		this.status = status;
	}

	/**
	 * Returns the value for the member attribute <b>status</b>
	 * @return int - value of member attribute <b>status</b>.
	 */
	public int getStatus( ) {
		return this.status;
	}

	/**
	 * This method sets the value to the member attribute <b>groupType</b>.
	 * You cannot set null to the attribute.
	 * @param groupType Value to set member attribute <b>groupType</b>
	 */
	public void setGroupType( int groupType ) {
		this.groupType = groupType;
	}

	/**
	 * Returns the value for the member attribute <b>groupType</b>
	 * @return int - value of member attribute <b>groupType</b>.
	 */
	public int getGroupType( ) {
		return this.groupType;
	}

	/**
	 * This method sets the value to the member attribute <b>credStoreId</b>.
	 * You cannot set null to the attribute.
	 * @param credStoreId Value to set member attribute <b>credStoreId</b>
	 */
	public void setCredStoreId( Long credStoreId ) {
		this.credStoreId = credStoreId;
	}

	/**
	 * Returns the value for the member attribute <b>credStoreId</b>
	 * @return Long - value of member attribute <b>credStoreId</b>.
	 */
	public Long getCredStoreId( ) {
		return this.credStoreId;
	}



	/**
	 * This return the bean content in string format
	 * @return formatedStr
	*/
	@Override
	public String toString( ) {
		String str = "XXGroup={";
		str += super.toString();
		str += "name={" + name + "} ";
		str += "description={" + description + "} ";
		str += "status={" + status + "} ";
		str += "groupType={" + groupType + "} ";
		str += "credStoreId={" + credStoreId + "} ";
		str += "groupSrc={" + groupSource + "} ";
		str += "}";
		return str;
	}
	
	public int getGroupSource() {
		return groupSource;
	}

	public void setGroupSource(int groupSource) {
		this.groupSource = groupSource;
	}

	/**
	 * Checks for all attributes except referenced db objects
	 * @return true if all attributes match
	*/
	@Override
	public boolean equals( Object obj) {
		if ( !super.equals(obj) ) {
			return false;
		}
		XXGroup other = (XXGroup) obj;
        	if ((this.name == null && other.name != null) || (this.name != null && !this.name.equals(other.name))) {
            		return false;
        	}
        	if ((this.description == null && other.description != null) || (this.description != null && !this.description.equals(other.description))) {
            		return false;
        	}
		if( this.status != other.status ) return false;
		if( this.groupType != other.groupType ) return false;
        	if ((this.credStoreId == null && other.credStoreId != null) || (this.credStoreId != null && !this.credStoreId.equals(other.credStoreId))) {
            		return false;
        	}
		return true;
	}
	public static String getEnumName(String fieldName ) {
		if( fieldName.equals("status") ) {
			return "CommonEnums.ActiveStatus";
		}
		if( fieldName.equals("groupType") ) {
			return "CommonEnums.XAGroupType";
		}
		//Later TODO
		//return super.getEnumName(fieldName);
		return null;
	}

}