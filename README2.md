# 第四节 Spring Boot热部署
## 1、设置
### 1、command + SHIFT + A --> 查找make project automatically --> 选中 
### 2、command + SHIFT + A --> 查找Registry --> 找到并勾选compiler.automake.allow.when.app.running 

## 2、添加依赖
### 1、在pom的dependencies中添加
```xml
<dependency>  
            <groupId>org.springframework.boot</groupId>  
            <artifactId>spring-boot-devtools</artifactId>  
            <optional>true</optional>  
</dependency>
```

### 2、在pom的plugin中添加
```xml
<configuration>  
       <fork>true</fork>  
</configuration>
```

## 3、可以测试了，无论是修改Java后台的方法还是修改前端的模板都会自动重启
