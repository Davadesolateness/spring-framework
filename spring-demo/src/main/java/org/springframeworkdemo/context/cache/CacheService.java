package org.springframeworkdemo.context.cache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 用于进行缓存的相关测试
 * @author dong
 */
@Service
public class CacheService {

	/**
	 * 测试spring如何进行实现缓存操作
	 * @param key  缓存名字
	 * @return 要缓存的list数据
	 * @author dongzhibo
	 * @date 2024/5/11 16:39
	 */
	@Cacheable(cacheManager = "cacheManager",value = "myCache",key = "#key")
	public List<String> getCacheList(String key){
		List<String> list = new ArrayList<>();
		list.add(key);
		return list;
	}

	/**
	 * 测试spring如何进行实现缓存操作
	 * @param key  缓存名字
	 * @return 要缓存的list数据
	 * @author dongzhibo
	 * @date 2024/5/11 16:39
	 */
	@Cacheable(cacheManager = "cacheManager",value = "myCache1",key = "#key")
	public List<String> getCacheList1(String key){
		List<String> list = new ArrayList<>();
		list.add(key);
		return list;
	}
}
