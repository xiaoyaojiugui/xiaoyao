/**
 * Copyright 2016 Welab, Inc. All rights reserved.
 * WELAB PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.welab.mongodb.dao;

import org.springframework.stereotype.Repository;

import com.welab.mongodb.persistence.Member;

/**
 * @author <a href="mailto:Jason@wolaidai.com">Jason</a>
 */
@Repository
public class MemberDao extends MongoGenDao<Member>
{
	/** 
	 * @see com.welab.mongodb.dao.MongoGenDao#getEntityClass()
	 */
	@Override
	protected Class<Member> getEntityClass()
	{
		return Member.class;
	}

}
