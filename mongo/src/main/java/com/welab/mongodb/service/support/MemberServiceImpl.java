/**
 * Copyright 2016 Welab, Inc. All rights reserved.
 * WELAB PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.welab.mongodb.service.support;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.welab.mongodb.dao.MemberDao;
import com.welab.mongodb.persistence.Member;
import com.welab.mongodb.service.IMemberService;

/**
 * @author <a href="mailto:Jason@wolaidai.com">Jason</a>
 */
@Service(IMemberService.SERVICE_ID)
public class MemberServiceImpl implements IMemberService
{
	@Resource
	private MemberDao memberDao;

	/**
	 * @see com.welab.mongodb.service.IMemberService#save(com.welab.mongodb.persistence.Member)
	 */
	@Override
	public void save(Member member)
	{
		memberDao.save(member);
	}

	/**
	 * @see com.welab.mongodb.service.IMemberService#queryById(java.lang.String)
	 */
	@Override
	public Member queryById(String id)
	{
		return memberDao.queryById(id);
	}

	/**
	 * @see com.welab.mongodb.service.IMemberService#queryList(com.welab.mongodb.persistence.Member)
	 */
	@Override
	public List<Member> queryList(Member member)
	{
		Query query = new Query();
		Criteria criteria = Criteria.where("name").is(member.getName());
		query.addCriteria(criteria);
		return memberDao.queryList(query);
	}

}
