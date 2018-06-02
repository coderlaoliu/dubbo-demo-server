### Dubbo 服务部署演示项目
关于项目中的一些插件与脚本介绍，可以看这篇文章 [Dubbo 服务部署解决方案：基于 Assembly 拆包部署](https://www.jianshu.com/p/f0939d91f06f)

**部署流程**  
1. 使用 `mvn package -Pdev` 进行打包（选择你自己的环境）
2. 将 `target` 中的 `dubbo-demo-server-1.0.0.tar.gz` 上传至你的服务器
3. 执行命令 `tar -zxvf dubbo-demo-server-1.0.0.tar.gz` 解压你的项目
4. 进入解压后的目录，并启动你的项目  
    `cd dubbo-demo-server-1.0.0/`  
    `bin/start.sh # 启动项目`  
5. 使用 telnet 工具验证服务是否启动成功  
    `telnet localhost 20880`  
    `dubbo>ls -l # 查看服务详细信息`  

**注意事项**  
你可以使用很简单的方式将本项目修改为你自身的项目，但需要注意修改以下几个地方：

1. start.sh 脚本文件中的 MAIN_CLASS 和 CONFIG_FILE（stop.sh 和 dunp.sh 文件同样也需要修改）
2. logback-spring.xml 文件中的 PROJECT_NAME 与包名  
3. pom.xml 文件中的相关环境配置文件  
