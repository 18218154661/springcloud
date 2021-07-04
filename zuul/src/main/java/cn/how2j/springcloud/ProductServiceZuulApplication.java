package cn.how2j.springcloud;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import cn.hutool.core.util.NetUtil;

/**
 * description:
 *
 * @return
 * @author quancong
 * @time 2020/4/22 16:48
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
@EnableDiscoveryClient
public class ProductServiceZuulApplication
{
    public static void main( String[] args )
    {

        int port = 8040;
        if(!NetUtil.isUsableLocalPort(port)) {
            System.err.printf("端口%d被占用了，无法启动%n", port );
            System.exit(7);
        }
        new SpringApplicationBuilder(ProductServiceZuulApplication.class).properties("server.port=" + port).run(args);
    }

    public void test()
    {

    }

    public void test2()
    {

    }
}
