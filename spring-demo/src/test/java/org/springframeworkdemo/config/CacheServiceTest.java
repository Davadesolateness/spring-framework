package org.springframeworkdemo.config;

import org.jetbrains.annotations.TestOnly;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframeworkdemo.context.cache.CacheService;

/**
 * @description: 做缓存相关的测试
 * @author dongzhibo
 * @date 2024/5/13 16:08
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class CacheServiceTest {


	@Autowired
	private CacheService cacheService ;

	@Test
	public void getCacheListTest(){
		cacheService.getCacheList("111");
		cacheService.getCacheList("111");
		cacheService.getCacheList("2222");
		cacheService.getCacheList("2222");
	}

	public CacheService getCacheService() {
		return cacheService;
	}

	public void setCacheService(CacheService cacheService) {
		this.cacheService = cacheService;
	}
}
