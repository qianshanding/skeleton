package com.qsd.skeleton.model;

import com.qsd.skeleton.utils.ConfigUtils;

public class DataSourceConfig {
    public static final String DRIVER    = ConfigUtils.getConfig("db.driver");
    public static final String URL       = ConfigUtils.getConfig("db.driverUrl");
    public static final String USER      = ConfigUtils.getConfig("db.user");
    public static final String PASSWORD  = ConfigUtils.getConfig("db.password");
    public int                 dataSourceType;

    public static final int    MYSQL     = 1;
    public static final int    SQLSERVER = 2;

    public DataSourceConfig(int dataSourceType) {
        this.dataSourceType = dataSourceType;
    }

    public int getDataSourceType() {
        return dataSourceType;
    }

    public void setDataSourceType(int dataSourceType) {
        this.dataSourceType = dataSourceType;
    }
}
