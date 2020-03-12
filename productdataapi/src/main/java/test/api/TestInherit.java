package test.api;

import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping(value = "/test")
public interface TestInherit {

        @RequestMapping(value = "/testinheritaction")
    public void testInheritAction();
}
