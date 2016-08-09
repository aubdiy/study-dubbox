package self.aub.study.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liujinxin on 16/8/9.
 */
public class ProviderLauncher {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"provider.xml"});
        context.start();

        System.in.read(); // 按任意键退出
    }

}
