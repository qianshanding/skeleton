package com.qsd.skeleton.model;

import com.qsd.skeleton.utils.ConfigUtils;

import java.util.List;
import java.util.Set;

public class Table {

    private static String     doPackage         = ConfigUtils.getConfig("groupId") + ".dal.dataobject"; // DO包名称
    private static String     mapperPackage     = ConfigUtils.getConfig("groupId") + ".dal.mapper"; // mapper包名称
    private static String     boPackage         = ConfigUtils.getConfig("groupId") + ".model"; // BO包名称
    private static String     transferPackage   = ConfigUtils.getConfig("groupId") + ".transfer"; // transfer包名称
    private static String     prefix         = "#{";                                   // myibatis变量前缀

    private String            className;                                               // 原表名称
    private String            className_d;                                             // 大写表名称
    private String            className_x;                                             // 小写表名称
    private String            className_ml;                                            // 小写表名称
    private String            className_Java;
    private List<TableCarray> tableCarrays;                                            // 表字段
    private List<TableIndex>  tableIndexs;                                             // 表索引
    private List<TableBind>   tableBinds;                                              // 表主外键

    private Set<String>       importPojos;                                             // 需要导入的POJO

    private String            stringCarrayNames1;                                      // ","拼接大写字段
    private String            stringCarrayNames2;                                      // int id ,String userCord ,..
    private String            stringCarrayNames3;                                      // ","拼接原字段
    private String            stringCarrayNames4;                                      // "#%s#,"拼接小写字段
    private String            stringCarrayNames5;                                      // "%s=#%s#,"拼接原字段-小写字段
    private String            tableComment;                                            // 表注释
    private String            createDate;                                              // 创建日期
    private String            author;                                                  // 生成者

    public Table(String className, String classNameD, String classNameX, String classNameMl, String className_Java,
                 List<TableCarray> tableCarrays, List<TableIndex> tableIndexs, List<TableBind> tableBinds,
                 Set<String> importPojos, String stringCarrayNames1, String stringCarrayNames2,
                 String stringCarrayNames3, String stringCarrayNames4, String stringCarrayNames5, String tableComment,
                 String createDate, String author) {
        super();
        this.className = className;
        className_d = classNameD;
        className_x = classNameX;
        className_ml = classNameMl;
        this.className_Java = className_Java;
        this.tableCarrays = tableCarrays;
        this.tableIndexs = tableIndexs;
        this.tableBinds = tableBinds;
        this.importPojos = importPojos;
        this.stringCarrayNames1 = stringCarrayNames1;
        this.stringCarrayNames2 = stringCarrayNames2;
        this.stringCarrayNames3 = stringCarrayNames3;
        this.stringCarrayNames4 = stringCarrayNames4;
        this.stringCarrayNames5 = stringCarrayNames5;
        this.tableComment = tableComment;
        this.createDate = createDate;
        this.author = author;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassName_d() {
        return className_d;
    }

    public void setClassName_d(String classNameD) {
        className_d = classNameD;
    }

    public String getClassName_ml() {
        return className_ml;
    }

    public void setClassName_ml(String classNameMl) {
        className_ml = classNameMl;
    }

    public String getClassName_x() {
        return className_x;
    }

    public void setClassName_x(String classNameX) {
        className_x = classNameX;
    }

    public String getDoPackage() {
        return doPackage;
    }
    public String getBoPackage() {
        return boPackage;
    }
    public String getTransferPackage() {
        return transferPackage;
    }

    public String getMapperPackage() {
        return mapperPackage;
    }

    public List<TableCarray> getTableCarrays() {
        return tableCarrays;
    }

    public void setTableCarrays(List<TableCarray> tableCarrays) {
        this.tableCarrays = tableCarrays;
    }

    public List<TableIndex> getTableIndexs() {
        return tableIndexs;
    }

    public void setTableIndexs(List<TableIndex> tableIndexs) {
        this.tableIndexs = tableIndexs;
    }

    public List<TableBind> getTableBinds() {
        return tableBinds;
    }

    public void setTableBinds(List<TableBind> tableBinds) {
        this.tableBinds = tableBinds;
    }

    public Set<String> getImportPojos() {
        return importPojos;
    }

    public void setImportPojos(Set<String> importPojos) {
        this.importPojos = importPojos;
    }

    public String getStringCarrayNames1() {
        return stringCarrayNames1;
    }

    public void setStringCarrayNames1(String stringCarrayNames1) {
        this.stringCarrayNames1 = stringCarrayNames1;
    }

    public String getStringCarrayNames2() {
        return stringCarrayNames2;
    }

    public void setStringCarrayNames2(String stringCarrayNames2) {
        this.stringCarrayNames2 = stringCarrayNames2;
    }

    public String getStringCarrayNames3() {
        return stringCarrayNames3;
    }

    public void setStringCarrayNames3(String stringCarrayNames3) {
        this.stringCarrayNames3 = stringCarrayNames3;
    }

    public String getStringCarrayNames4() {
        return stringCarrayNames4;
    }

    public void setStringCarrayNames4(String stringCarrayNames4) {
        this.stringCarrayNames4 = stringCarrayNames4;
    }

    public String getStringCarrayNames5() {
        return stringCarrayNames5;
    }

    public void setStringCarrayNames5(String stringCarrayNames5) {
        this.stringCarrayNames5 = stringCarrayNames5;
    }

    public String getClassName_Java() {
        return className_Java;
    }

    public void setClassName_Java(String className_Java) {
        this.className_Java = className_Java;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getTableComment() {
        return tableComment;
    }

    public void setTableComment(String tableComment) {
        this.tableComment = tableComment;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
