读取配置文件的三种方式：

  1.使用@Value("${key}")注解来获取  
     @Value("${message}")
     private String msg;
  2.Environment获取
     @Autowired
     private Environment env;
     env.getProperty("message");
  3.使用Properties获取
    通过类加载器获取文件路径。然后使用Properties的方法获取
    
  
