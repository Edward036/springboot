package org.springboot.core.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @author meisen
 *         2017-05-19
 */
@Configuration
public class DataSourceConfig {

    /**
     * 配置数据源
     * @return dataSource
     */
    @Bean(name = "devDataSource")
    @Qualifier("devDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.dev")
    public DataSource devDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "devJdbcTemplate")
    public JdbcTemplate devJdbcTemplate(@Qualifier("devDataSource") DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }

}


