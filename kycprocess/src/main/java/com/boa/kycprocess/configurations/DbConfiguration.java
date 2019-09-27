package com.boa.kycprocess.configurations;




import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

@Configuration
public class DbConfiguration {
	@Value("${db_url}")
	private String url;
	@Value("${db_username}")
	private String userName;
	@Value("${db_password}")
	private String password;
	@Value("${db_driver}")
	private String driver;	
	@Value("${mongodb_url}")
	private String mongoUrl;
	
	
	@Bean
	@ConditionalOnClass(DataSource.class)
	
	public DataSource getInstance()
	{
		DataSourceBuilder dataSourceBuilder=DataSourceBuilder.create();
		dataSourceBuilder.url(url);
		dataSourceBuilder.driverClassName(driver);
		dataSourceBuilder.password(password);
		dataSourceBuilder.username(userName);
		return dataSourceBuilder.build();
		
	}
	
	@Bean
	public MongoDbFactory getMongoInstance()
	{
		return new SimpleMongoDbFactory(new MongoClientURI(mongoUrl));
	}
	
	
	
	@Bean
    @Conditional(SQLConfiguration.class)
    public TransactionData jdbcTransactions(){
	 System.out.println("Entering jdbc....");
        return new JDBCTransactionImpl();
    }
 
    @Bean
    @Conditional(NoSQLConfiguration.class)
    public TransactionData mongoTransactions(){
    	 System.out.println("Entering mongodb....");
        return new MongoTransactionImpl();
    }
}
