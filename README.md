# 第三节 Spring Boot使用thymeleaf模板
## 1、按照第一节的内容新建一个Spring Boot项目，然后添加thymeleaf的依赖
```
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-thymeleaf</artifactId>
</dependency>
```
## 2、修改@Controller中注解，将@RestControlle改为@Controller
```java
@Controller
public class HelloController {

    
    @RequestMapping("/")
    public String hello(){
        return "hello";
    }

}

```

## 3、在src/main/resources/template下新建hello.html,如下
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title></title>
</head>
<body>
<h1>thymeleaf测试页</h1>
</body>
</html>
```

## 4、访问http://localhost:8080即可访问到hello.html



