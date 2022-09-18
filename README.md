# RMI学习

本项目主要是对java rmi的学习

IDE: idea

8u241之后对RMI反序列化攻击就基本无了

### DEMO示例

文件夹**RMI-Client** 为客户端，获取服务名，调用方法

文件夹**RMI-Server** 为服务端，注册服务名，绑定端口

客户端远程调用的方法接口包名需与服务端一致

所用环境为 `jdk1.8`

## JEP290 bypass

(存疑) 不能通过远程修改注册中心，必须在同一主机进行操作

环境jdk == 1.8u181

`ysoserial`执行`java -cp ysoserial-0.0.6-all.jar ysoserial.exploit.JRMPListener 3333 CommonsCollections5 "calc"`

**RMI-Client** 下的`ExploitClient.java` 加载`ysoserial`的`JRMPListener`

**RMI-Server** 下的`RMIServer.java`中导入`commons-collections`