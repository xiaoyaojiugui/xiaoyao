/**
 * Copyright 2016 Welab, Inc. All rights reserved.
 * WELAB PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.welab.mongodb.service;

import java.util.List;

import com.welab.mongodb.persistence.Member;

/**
 * @author <a href="mailto:Jason@wolaidai.com">Jason</a>
 */
public interface IMemberService
{
	/**
	 * 此接口实现类的beanId
	 */
	String SERVICE_ID = "mongo.memberService";

	/**
	 * 保存成员
	 * 
	 * @param customer
	 * @return 增加客户的个数
	 */
	void save(Member member);

	/**
	 * 查询成员
	 * 
	 * @param id
	 * @return
	 */
	Member queryById(String id);

	List<Member> queryList(Member member);
}
