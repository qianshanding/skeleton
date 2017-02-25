package com.qsd;

import com.qsd.skeleton.GenerateCode;
import com.qsd.skeleton.utils.ConfigUtils;

/**
 * Created by zhengyu on 2016/10/17.
 */
public class Main {

    /**
     * 自动生成:
     * mapper.xml;<br />
     * DO;<br />
     * BO;<br />
     * transfer
     *
     * @param args
     */
    public static void main(String args[]) {
        GenerateCode gc = new GenerateCode();
        gc.generate();
        System.out.println("代码已生成！");
        System.out.println("DO和Mapper在《" + ConfigUtils.getConfig("artifactId") + "-dal》子项目中!");
        System.out.println("BO和Transfer在《" + ConfigUtils.getConfig("artifactId") + "-web》子项目中!");
    }
}
