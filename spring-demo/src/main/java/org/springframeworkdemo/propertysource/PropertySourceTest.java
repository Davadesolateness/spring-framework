package org.springframeworkdemo.propertysource;

import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.StandardEnvironment;

import java.util.HashMap;

public class PropertySourceTest {

	public static void testStandardEnvironment(){
		StandardEnvironment environment = new StandardEnvironment();

		MutablePropertySources mutablePropertySources = environment.getPropertySources();
		MapPropertySource mapPropertySource = new MapPropertySource("diy", new HashMap<String, Object>() {{
			put("app.name", "fsx");
			put("app.key", "${user.home1}"); // 注意这里是user.home1 特意让系统属性里不存在的
			put("app.full", "${app.key} + ${app.name}");
		}});
		mutablePropertySources.addFirst(mapPropertySource);


		// 正常使用
		String s = environment.resolvePlaceholders("${app.full}");
		System.out.println(s);

		s = environment.getProperty("app.full");
		System.out.println(s);
	}
}
