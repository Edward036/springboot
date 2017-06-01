## 本例子为一个RESTFUL规范的springboot代码。
---

## RESTful

> URL定位资源，用HTTP动词（GET,POST,DELETE,DETC）描述操作。

+ 看Url就知道要什么
+ 看http method就知道干什么
+ 看http status  code就知道结果如何

## springboot+gradle+Intellij Idea实现热部署
+ CTRL + SHIFT + A --> 查找make project automatically --> 选中 
+ CTRL + SHIFT + A --> 查找Registry --> 找到并勾选compiler.automake.allow.when.app.running 
+ 需要有spring-boot-devtools
