### Dubbo 服务部署演示项目
关于项目中的一些插件与脚本介绍，可以看这篇文章 [Dubbo 服务部署解决方案：基于 Assembly 拆包部署](https://hooox.io)

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
