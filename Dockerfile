# Version : 1.0
# Author  : Hox <h@hooox.io>

# 使用 Oracle JDK 1.8
FROM dockette/jdk8

# 将打包后的项目添加到容器中指定目录
ADD target/dubbo-demo-server-1.0.0-prd.tar.gz /opt/java/dubbo

# 切换动作目录
WORKDIR /opt/java/dubbo/dubbo-demo-server-1.0.0

# 运行启动脚本
CMD ["bin/start.sh"]