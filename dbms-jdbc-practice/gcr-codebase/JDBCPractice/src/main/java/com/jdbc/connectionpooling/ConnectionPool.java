package com.jdbc.connectionpooling;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.Connection;
import java.sql.SQLException;

	public class ConnectionPool {
		private static HikariDataSource dataSource;

		static {
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl("jdbc:mysql://localhost:3306/student_db");
		config.setUsername("root");
		config.setPassword("your_password");

		// Pool configuration
		config.setMaximumPoolSize(10);
		config.setMinimumIdle(5);

		config.setConnectionTimeout(30000); // 30 seconds
		config.setIdleTimeout(600000); // 10 minutes
		config.setMaxLifetime(1800000); // 30 minutes

		// Performance tuning
		config.addDataSourceProperty("cachePrepStmts", "true");
		config.addDataSourceProperty("prepStmtCacheSize", "250");
		config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

		dataSource = new HikariDataSource(config);
		}

		public static Connection getConnection() throws SQLException {
		return dataSource.getConnection();
		}

		public static void closePool() {
		if (dataSource != null) {
		dataSource.close();
		}
		}
	
}
