package com.springBoot.helisa.pruebaHelisa;

import com.springBoot.helisa.pruebaHelisa.logic.MinimumSwapsLogic;
import com.springBoot.helisa.pruebaHelisa.logic.TwoStringsLogic;
import com.springBoot.helisa.pruebaHelisa.model.MinimumSwapsModel;
import com.springBoot.helisa.pruebaHelisa.model.StringsModel;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.AssertTrue;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PruebaHelisaApplicationTests {
    
    @Autowired
    MinimumSwapsLogic minimumSwapsLogic;
    
    @Autowired
    private TwoStringsLogic stringsLogic;
    
	@Test
	public void minimumSwapsLogicTest() {
            MinimumSwapsModel data= new MinimumSwapsModel();
            data.setSize(5);
            int numbers[] = new int[5];
            numbers[0]=2;
            numbers[1]=3;
            numbers[2]=4;
            numbers[3]=1;
            numbers[4]=5;
            data.setArrayNumbers(numbers);
            String result =minimumSwapsLogic.resolvMinimumSwaps(data);
            Assert.assertTrue("3".equalsIgnoreCase(result));
	}
        
        @Test
	public void twoStringsLogicTest() {
            StringsModel data= new StringsModel();
            data.setNumber(2);
            List<String> strings = new ArrayList<>();
           strings.add("hello");
           strings.add("world");
           strings.add("hi");
           strings.add("world");
            data.setListStrings(strings);
            List<String> result =stringsLogic.resolveStrings(data);
            Assert.assertNotNull(result);
            Assert.assertTrue("YES".equalsIgnoreCase(result.get(0)));
            Assert.assertTrue("NO".equalsIgnoreCase(result.get(1)));
            
	}

}

