package com.qsd.skeleton;

import com.qsd.skeleton.factory.CodeFactory;
import com.qsd.skeleton.factory.ConnectionFactory;
import com.qsd.skeleton.model.Table;
import com.qsd.skeleton.utils.ConfigUtils;
import com.qsd.skeleton.utils.TableUtils;
import freemarker.template.Configuration;

import java.sql.Connection;
import java.util.List;

/**
 * Created by zhengyu on 2016/10/17.
 */
public class GenerateCode {
    public void generate() {
        Connection conn = ConnectionFactory.getConnection();
        try {
            List<Table> tables = TableUtils.getTables(conn);
            Configuration configuration = CodeFactory.getConfiguration();
            for (Table table : tables) {
                if (Boolean.valueOf(ConfigUtils.getConfig("create.dal"))) {
                    outDO(table, configuration);
                    outMapperClass(table, configuration);
                    outMapperXml(table, configuration);
                    outBeansDaoXml(table, configuration);
                }
                if (Boolean.valueOf(ConfigUtils.getConfig("create.bo"))) {
                    outBO(table, configuration);
                    outTransfer(table, configuration);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 生成DO对象
     *
     * @param table
     */
    public void outDO(Table table, Configuration configuration) {
        String packageName = table.getDoPackage();
        packageName = packageName.replace(".", "/");
        String filePath = System.getProperty("user.dir") + "/" + ConfigUtils.getConfig("artifactId")
                + "/" + ConfigUtils.getConfig("artifactId") + "-dal"
                + "/src/main/java/" + packageName;
        CodeFactory.dataSourceOut(configuration, "do.ftl", table, table.getClassName_Java() + "DO.java", filePath);
    }

    /**
     * 生成Mapper类
     *
     * @param table
     */
    public void outMapperClass(Table table, Configuration configuration) {
        String packageName = table.getMapperPackage();
        packageName = packageName.replace(".", "/");
        String filePath = System.getProperty("user.dir") + "/" + ConfigUtils.getConfig("artifactId")
                + "/" + ConfigUtils.getConfig("artifactId") + "-dal"
                + "/src/main/java/" + packageName;
        CodeFactory.dataSourceOut(configuration, "mapper_class.ftl", table, table.getClassName_Java() + "Mapper.java", filePath);
    }

    /**
     * 生成mybatis xml
     *
     * @param table
     */
    public void outMapperXml(Table table, Configuration configuration) {
        String filePath = System.getProperty("user.dir") + "/" + ConfigUtils.getConfig("artifactId")
                + "/" + ConfigUtils.getConfig("artifactId") + "-dal"
                + "/src/main/resources/dal/mapper/";
        CodeFactory.dataSourceOut(configuration, "mapper_xml.ftl", table, "sqlmap-" + table.getClassName_ml() + ".xml", filePath);
    }

    /**
     * 生成bean dao xml
     *
     * @param table
     */
    public void outBeansDaoXml(Table table, Configuration configuration) {
        String filePath = System.getProperty("user.dir") + "/" + ConfigUtils.getConfig("artifactId")
                + "/" + ConfigUtils.getConfig("artifactId") + "-dal"
                + "/src/main/resources/dal/biz/";
        CodeFactory.dataSourceOut(configuration, "beans_dao.ftl", table, "beans-" + table.getClassName().toLowerCase() + "-dao.xml", filePath);
    }


    /**
     * 生成BO
     *
     * @param table
     */
    public void outBO(Table table, Configuration configuration) {
        String packageName = table.getBoPackage();
        packageName = packageName.replace(".", "/");
        String filePath = System.getProperty("user.dir") + "/" + ConfigUtils.getConfig("artifactId")
                + "/" + ConfigUtils.getConfig("artifactId") + "-web"
                + "/src/main/java/" + packageName;
        CodeFactory.dataSourceOut(configuration, "bo.ftl", table, table.getClassName_Java() + "BO.java", filePath);
    }

    /**
     * 生成Transfer
     *
     * @param table
     */
    public void outTransfer(Table table, Configuration configuration) {
        String packageName = table.getTransferPackage();
        packageName = packageName.replace(".", "/");
        String filePath = System.getProperty("user.dir") + "/" + ConfigUtils.getConfig("artifactId")
                + "/" + ConfigUtils.getConfig("artifactId") + "-web"
                + "/src/main/java/" + packageName;
        CodeFactory.dataSourceOut(configuration, "transfer.ftl", table, table.getClassName_Java() + "Transfer.java", filePath);
    }
}
