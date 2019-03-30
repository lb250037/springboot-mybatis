# springboot-mybatis
springboot和mybatis 整合
配置文件
配置数据库参数：
spring.datasource.url=jdbc:mysql://localhost:3306/jd?characterEncoding=utf-8&serverTimezone=UTC
spring.datasource.name=boot
spring.datasource.password=
spring.datasource.username=root
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
#spring.datasource.type=com.alibaba.druid.pool.DruidDataSource
server.port=8081

server.servlet.context-path=/boot
#启动时加载dispatchservlet
spring.mvc.servlet.load-on-startup=1

#配置mybatis XXXmapper.xml 文件所在路径
mybatis.mapper-locations=classpath:mybatis_mappers/*.xml  


pom文件添加依赖
1》
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <scope>runtime</scope>
</dependency>

2》
<dependency>
    <groupId>org.mybatis.spring.boot</groupId>
    <artifactId>mybatis-spring-boot-starter</artifactId>
    <version>2.0.0</version>
</dependency>
