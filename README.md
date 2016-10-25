# About
ixshare的第一个项目, 千万别流产啊.

# 环境
* JDK-1.8.0或更高版本
* gradle-3.1或更高版本

# 编译运行
进入到该项目根目录用gradle编译

    $ gradle build

运行

    $ java -jar build/libs/datashare-rest-service-0.1.0.jar

部署

使用Tomcat或Systemd, see [部署Spring Boot应用](https://www.tianmaying.com/tutorial/deploy-spring-boot-application)

# TODO
* 尝试加入docker支持,使用docker一键部署
* 项目框架还不完善,需要优化
* 数据库连接
* 登录机制
* 具体业务逻辑
