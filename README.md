脚手架使用说用：

在Terminal输入命令，创建项目：
mvn archetype:generate -DgroupId=com.qsd.test -DartifactId=test -Dversion=1.0.0 -DarchetypeGroupId=com.qsd.maven.archetypes -DarchetypeArtifactId=maven-archetype-soa -DarchetypeVersion=1.0.0 -DinteractiveMode=false
     红色标记为要创建项目的groupId，artifactId，version
     archetypeGroupId      ：原型GroupId，值为：com.qsd.maven.archetypes
     archetypeArtifactId   ：原型ArtifactId，值为：maven-archetype-soa／maven-archetype-web
     archetypeVersion      ：原型Version，默认：1.0.0
     interactiveMode       ：交互模式设置为false
     等待一会，test项目就创建好了。项目结构为：
     test
     ├─test-api
     ├─test-core
     ├─test-dal
     ├─test-deploy
     ├─test-service
二、自动生成mybatis代码
     首先配置auto-generate-code项目resources/config.properties文件：

#数据库配置
db.driverUrl=jdbc\:mysql\://10.9.34.172\:3306/test?useUnicode\=true&characterEncoding\=utf8&allowMultiQueries\=true
db.driver=com.mysql.jdbc.Driver
db.user=test
db.password=test

#自动生成类作者名称
author=zhengyu

#是否生成DAL
create.dal=true
#是否生成BO
create.bo=true

#artifactId，和创建项目的artifactId对应
artifactId=test
#groupId，和创建项目的groupId对应
groupId=com.youzan.test

#表名，如果为“*”，则生成所有表
tables=ump_present,ump_present_user_receive

     运行：com.qsd.Main
     运行之后。
     DO和Mapper在test-dal子项目中!
     BO和Transfer在test-service子项目中!
三、打包项目
#打包test工程
zhengyudeMacBook-Pro:test zhengyu$ mvn clean install