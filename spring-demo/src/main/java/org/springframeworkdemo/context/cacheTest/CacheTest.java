package org.springframeworkdemo.context.cacheTest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframeworkdemo.context.cache.CacheService;

/**
 * @description: 用于测试缓存使用
 * @author dongzhibo
 * @date 2024/5/15 15:35
 * @version 1.0
 */
public class CacheTest {

	public static void cacheableTest(AnnotationConfigApplicationContext context) {
		CacheService cacheService = context.getBean(CacheService.class);
		cacheService.getCacheList("111");
		cacheService.getCacheList("222");
		cacheService.getCacheList1("111");
		cacheService.getCacheList1("333");
		cacheService.getCacheList1("444");
		cacheService.getCacheList1("111");
	}
}
