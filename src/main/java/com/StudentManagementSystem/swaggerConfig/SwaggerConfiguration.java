
  package com.StudentManagementSystem.swaggerConfig;
  
  
  import static springfox.documentation.builders.PathSelectors.regex;
  
  import org.springframework.context.annotation.Bean; import
  org.springframework.context.annotation.Configuration;
  
  import springfox.documentation.builders.ApiInfoBuilder; import
  springfox.documentation.builders.RequestHandlerSelectors; import
  springfox.documentation.service.ApiInfo; import
  springfox.documentation.spi.DocumentationType; import
  springfox.documentation.spring.web.plugins.Docket; import
  springfox.documentation.swagger2.annotations.EnableSwagger2;
  
  @Configuration
  
  @EnableSwagger2 public class SwaggerConfiguration {
  
  @Bean public Docket productApi() { return new
  Docket(DocumentationType.SWAGGER_2).groupName("com.StudentManagementSystem").
  select() .apis(
  RequestHandlerSelectors.basePackage("com.StudentManagementSystem")).paths(
  regex("/student.*")) .build();
  
  }
  
  private ApiInfo apiInfo() { return new
  ApiInfoBuilder().title("StoreManagement")
  .description("documentation using swager")
  .termsOfServiceUrl("www.google .com").version("1.0").build();
  
  }
  
  }
 