/**
 * Copyright 2016 Welab, Inc. All rights reserved.
 * WELAB PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.welab.mongodb;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.welab.mongodb.persistence.Member;
import com.welab.mongodb.service.IMemberService;

/**
 * @author <a href="mailto:Jason@wolaidai.com">Jason</a>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/META-INF/conf/*/spring/customer.service.xml"})
public class MemberServiceTest
{
    /**
     * 课件目录服务接口类
     */
    @Resource(name = IMemberService.SERVICE_ID)
    private IMemberService memberService;
    
    /**
     * 保存一个新对象
     */
    @Test
    public void testSave()
    {
        for (int i = 1; i <= 1; i++)
        {
            Member member = new Member();
            member.setAddress("address" + i);
            member.setMobile("mobile" + i);
            member.setName("name" + i);
            memberService.save(member);
        }
    }
    
    @Test
    public void testQueryById()
    {
        Member member = memberService.queryById("56f1fe6c4913de1e680a71a4");
        System.out.println(member);
    }
    
    @Test
    public void testQueryList()
    {
        Member member = new Member();
        member.setName("name2");
        System.out.println(memberService.queryList(member));
    }
}
