import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @description: Converter 相关测试
 * @author dongzhibo
 * @date 2023/11/15 10:24
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class ConverterTest {

	@Autowired
	private ConversionService conversionService ;

	@Test
	public void ConverterMethdoTest(){
		Assertions.assertEquals("false",conversionService.convert(false,String.class));

		Assertions.assertTrue(conversionService.convert("true",Boolean.class));

	}

	public ConversionService getConversionService() {
		return conversionService;
	}

	public void setConversionService(ConversionService conversionService) {
		this.conversionService = conversionService;
	}
}
