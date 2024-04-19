🔧 **SSM-minimax- employee**

基于SSM+MySQL+ ElementUI的骨架程序部署及运行

0，项目依赖的JDK版本为1.8；确保Maven配置正确（本人的maven版本为Apache Maven 3.9.6，且配置了阿里云mirror）；代码：https://github.com/chenxofhit/SSM-minimax-employee ，请下载至本地！

1，利用MySQL客户端Navicat、SQLoyg或者命令行创建本地数据库 ssmminimax，执行SQL文件夹下的 EMPLOYEE_DEPART.sql 文件初始化表及插入数据；

2，打开IDEA Ultimate导入Maven项目；

![2](https://raw.githubusercontent.com/chenxofhit/picx-images-hosting/master/202404200100076.png)

3，修改数据库配置文件 jdbc.properties，根据你的实际情况修改数据库名、用户名和密码；

4，配置项目：

点击文件（File），项目结构（Project Structure）：

![4.1](https://raw.githubusercontent.com/chenxofhit/picx-images-hosting/master/202404200102349.png)

配置项目的Facet（基本上不用动）

![4.2](https://raw.githubusercontent.com/chenxofhit/picx-images-hosting/master/202404200105072.png)

5，运行项目，有两种方式，推荐第一种方式，比较简单：

第一种，利用pom.xml中已经配置了的tomcat maven插件，点击右侧的maven停靠栏 -> 插件 ->tomcat7 -> tomcat7：run。
![5.1](https://raw.githubusercontent.com/chenxofhit/picx-images-hosting/master/202404200109902.png)

第二种，点击菜单栏：
![5.2.1](https://raw.githubusercontent.com/chenxofhit/picx-images-hosting/master/202404200112874.png)

![5.2.2](https://raw.githubusercontent.com/chenxofhit/picx-images-hosting/master/202404200115742.png)

![5.2.3](https://raw.githubusercontent.com/chenxofhit/picx-images-hosting/master/202404200118775.png)

![5.2.4](https://raw.githubusercontent.com/chenxofhit/picx-images-hosting/master/202404200119656.png)

![5.2.5](https://raw.githubusercontent.com/chenxofhit/picx-images-hosting/master/202404200122274.png)

![5.2.6](https://raw.githubusercontent.com/chenxofhit/picx-images-hosting/master/202404200124388.png)

6，如果数据库配置访问有错误，可能会出现下面的错误图：

![6](https://raw.githubusercontent.com/chenxofhit/picx-images-hosting/master/202404200129869.png)

7，如果正常启动，IDEA上会展示下面的日志：

![7.1](https://raw.githubusercontent.com/chenxofhit/picx-images-hosting/master/202404200130305.png)

访问前端的页面：http://localhost:8090/minimax_war_exploded/

![7.2](https://raw.githubusercontent.com/chenxofhit/picx-images-hosting/master/202404200133393.png)

如果正常展示上面的页面，说明项目部署成功。用户可以在页面上按照条件筛选查询：
![7.3](https://raw.githubusercontent.com/chenxofhit/picx-images-hosting/master/202404200140982.png)

撒花🎉🚀💻，Coffee time Now。

