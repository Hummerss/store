package com.uxian.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {
    //不打包使用这个，正常在IDEA运行
    public static void main(String[] args) {
        SpringApplication.run(StoreApplication.class, args);
    }


    //打包命令
//mvn clean package

    //打包使用下面的代码
//    public class DemoApplication extends SpringBootServletInitializer {
//        public static void main(String[] args) {
//            SpringApplication.run(DemoApplication.class,args);
//        }
//        @Override
//        protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//            return builder.sources(DemoApplication.class);
//        }

}
