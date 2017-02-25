package com.qsd.skeleton.factory;

import com.qsd.skeleton.model.DataSourceConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private static Connection conn;

	private ConnectionFactory() {
		super();
	}

	public static Connection getConnection() {
		if (conn == null) {
			try {
				Class.forName(DataSourceConfig.DRIVER);
				try {
					conn = DriverManager.getConnection(DataSourceConfig.URL, DataSourceConfig.USER,
					    DataSourceConfig.PASSWORD);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
}
