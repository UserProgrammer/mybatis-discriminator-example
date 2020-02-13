package com.example;

import com.example.dao.ICarDao;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@Configuration
public class DataSourceConfig {
  @Value("${database.url}")
  private String url;

  @Value("${database.username}")
  private String username;

  @Value("${database.password}")
  private String password;

  @Bean
  public DataSource dataSource() {
    DataSource dataSource = new DataSource();

    dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
    dataSource.setUrl(url);
    dataSource.setUsername(username);
    dataSource.setPassword(password);

    return dataSource;
  }

  @Bean
  public SqlSessionFactory sqlSessionFactory() throws Exception {
    SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
    factoryBean.setDataSource(dataSource());
    factoryBean.setConfigLocation(new ClassPathResource("mybatis-config.xml"));
    return factoryBean.getObject();
  }

  @Bean
  public MapperFactoryBean<ICarDao> carDao() throws Exception {
    MapperFactoryBean<ICarDao> factoryBean = new MapperFactoryBean<>(ICarDao.class);
    factoryBean.setSqlSessionFactory(sqlSessionFactory());
    return factoryBean;
  }
}
