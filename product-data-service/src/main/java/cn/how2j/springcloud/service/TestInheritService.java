package cn.how2j.springcloud.service;

import org.springframework.web.bind.annotation.RestController;
import test.api.TestInherit;

/**
 * @description: 从关联的项目里面的接口继承来继承接口的注解
 * @author: congquan
 * @time: 2020/3/12 20:11
 */

@RestController
public class TestInheritService implements TestInherit {

    /**
     *
     *
     * @description:
     * @param null
     * @return:
     * @author: congquan
     * @time: 2020/3/12 20:16
     */

    @Override
    public void testInheritAction()
    {
        double a = 0;
    }
}
