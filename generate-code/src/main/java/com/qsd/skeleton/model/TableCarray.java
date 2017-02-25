package com.qsd.skeleton.model;

/**
 * 表字段
 * 
 * @author Administrator
 * 
 */
public class TableCarray {
	private String carrayName;// 原名称
	private String carrayName_d;// 首字母大写
	private String carrayName_x;// 首字母小写
	private String carrayName_Java;//Java语法规范的命名规则
	private String carrayType;// 字段类型
	private String carrayType_d;// 大写字段类型
	private String comment;

	public TableCarray(String carrayName, String carrayNameD,
			String carrayNameX, String carrayName_Java,String carrayType,String carrayType_d,String comment) {
		super();
		this.carrayName = carrayName;
		carrayName_d = carrayNameD;
		carrayName_x = carrayNameX;
		this.carrayName_Java = carrayName_Java;
		this.carrayType = carrayType;
		this.carrayType_d = carrayType_d;
		this.comment = comment;
	}

	public String getCarrayName() {
		return carrayName;
	}

	public void setCarrayName(String carrayName) {
		this.carrayName = carrayName;
	}

	public String getCarrayName_d() {
		return carrayName_d;
	}

	public void setCarrayName_d(String carrayNameD) {
		carrayName_d = carrayNameD;
	}

	public String getCarrayName_x() {
		return carrayName_x;
	}

	public void setCarrayName_x(String carrayNameX) {
		carrayName_x = carrayNameX;
	}

	public String getCarrayType() {
		return carrayType;
	}

	public void setCarrayType(String carrayType) {
		this.carrayType = carrayType;
	}

    public String getCarrayName_Java() {
        return carrayName_Java;
    }

    public void setCarrayName_Java(String carrayName_Java) {
        this.carrayName_Java = carrayName_Java;
    }

    public String getCarrayType_d() {
        return carrayType_d;
    }

    public void setCarrayType_d(String carrayType_d) {
        this.carrayType_d = carrayType_d;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}