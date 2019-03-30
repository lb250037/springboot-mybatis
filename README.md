# springboot-mybatis
springboot和mybatis 整合
配置文件
配置数据库参数：
#spring.datasource.url=jdbc:mysql://localhost:3306/jd?characterEncoding=utf-8&serverTimezone=UTC
配置myql url 时一定要指定时区，字符集 characterEncoding=utf-8&serverTimezone=Asia/Shanghai 否则乱码，时间差8小时，不指定时是格林尼治时间。

spring.datasource.url=jdbc:mysql://localhost:3306/jd?characterEncoding=utf-8&serverTimezone=Asia/Shanghai
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

前端日期字符串型——>java.util.Date 需要指定如下：
    MySQL数据库要存储精确到时分秒 类型选择 datetime|timestamp， date类型只能存储 年月日
    1》 可以配置 spring.mvc.date-format=yyyy-MM-dd HH:mm:ss 跟@dateformat("yyyy-MM-dd HH:mm:ss") 使用
    2》 可以配置格式装换类 public class Myconvert implements Converter<String, Date> 如果配置了转换类则 1配置失效。
    3》mybatis 	insert into table(date) values(STR_TO_DATE('${date}', '%W %M %d %H:%i:%S CST %Y')) str_to_date()函数可以把Java Date 转换为MySQL 指定的格式 yyyy-MM-dd HH:mm:ss ，也可以在插入表是格式化好
    


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
