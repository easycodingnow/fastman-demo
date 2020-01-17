fastman 是一个开发工具，提供idea插件帮助我们在开发阶段对代码进行快速调试

# 使用效果展示
![alt tag](https://github.com/jsdman/fastman-demo/blob/master/fastman-demo1.gif)
![alt tag](https://github.com/jsdman/fastman-demo/blob/master/fasman-demo2.gif)


# 使用方法
* idea安装fastman插件 [下载](https://github.com/jsdman/fastman-intellij/blob/master/fastman-intellij.zip)
* 配置插件的agent path,ip一般为本机ip，端口号是自己的web项目的端口
![alt tag](https://github.com/jsdman/fastman-demo/blob/master/agent-path.png)
* spring web项目引入agent jar包
```xml
      <dependency>
            <groupId>com.easycodingnow</groupId>
            <artifactId>fastman-agent</artifactId>
            <version>1.0-SNAPSHOT</version>
       </dependency>
```
* 配置spring项目的扫描包，添加com.easycodingnow.fastman.agent包的扫描
```java
    @SpringBootApplication(scanBasePackages = {"com.easycodingnow.fastman.demo", "com.easycodingnow.fastman.agent"})
    public class Application {
    
        public static void main(String[] args) {
            SpringApplication.run(Application.class, args);
        }
    }
```
* 启动项目
* 在要允许的方法上面添加@test注解，例如:
```java
  /**
     * @test
     * [
     *  {"a":null, "b":1, "c":1.2, "d":2.3},
     *  "2"
     * ]
     */
    public Object test(DemoRequest demoRequest, String a);
```
* 右键选择fastrun, 快速运行方法


# fastrunRecent
右键还会有一个fastrunRecent选项，这个选项的作用是快速运行最近一次的执行，主要使用场景是，我们
对一个方法进行反复调试，可以用此选项进行快速的运行，结合快捷键会更加快捷

# 快捷键 (结合快捷键使用更加顺滑)
fastRun快捷键：
* windows: shift + ctrl + 1
* mac:  shift + command + 1

fastrunRecent快捷键：
* windows: shift + ctrl + 2
* mac:  shift + command + 2

