package self.aub.study.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import self.aub.study.provider.DemoService;

/**
 * Created by liujinxin on 16/8/9.
 */
public class ConsumerLauncher {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
        context.start();

        DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
        String hello = demoService.sayHello("world"); // 执行远程方法

        System.out.println( hello ); // 显示调用结果
        System.out.println( hello ); // 显示调用结果
        System.out.println( hello ); // 显示调用结果
        System.out.println( hello ); // 显示调用结果
    }
}
