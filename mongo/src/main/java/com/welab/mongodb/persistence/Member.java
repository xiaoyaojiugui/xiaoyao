/**
 * Copyright 2016 Welab, Inc. All rights reserved.
 * WELAB PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.welab.mongodb.persistence;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * @author <a href="mailto:Jason@wolaidai.com">Jason</a>
 */
public class Member
{
	private String name;
	private String address;
	private String mobile;

	/**
	 * @return Returns the name.
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param name
	 *            The name to set.
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @return Returns the address.
	 */
	public String getAddress()
	{
		return address;
	}

	/**
	 * @param address
	 *            The address to set.
	 */
	public void setAddress(String address)
	{
		this.address = address;
	}

	/**
	 * @return Returns the mobile.
	 */
	public String getMobile()
	{
		return mobile;
	}

	/**
	 * @param mobile
	 *            The mobile to set.
	 */
	public void setMobile(String mobile)
	{
		this.mobile = mobile;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return ReflectionToStringBuilder.toString(this);
	}

}
