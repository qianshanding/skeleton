package ${mapperPackage};

import ${doPackage}.${className_Java}DO;

import org.apache.ibatis.annotations.Param;

/**
 * ${tableComment} Mapper接口
 * 
 * @Author ${author}
 * @Date ${createDate}
 */
public interface ${className_Java}Mapper {

    /**
     * 
     * 方法insert的功能描述：新增${tableComment}
     * 
     * @param record
     * @return int
     * @since v1.3.0
     * <PRE>
     * author ${author} 
     * Date ${createDate}
     * </PRE>
     */
    int insert(${className_Java}DO record);

    /**
     * 
     * 方法deleteById的功能描述：根据Id删除${tableComment}
     * 
     * @param id
     * @return int
     * @since v1.3.0
     * <PRE>
     * author ${author} 
     * Date ${createDate}
     * </PRE>
     */
    int deleteById(@Param("id") Long id);

    /**
     * 
     * 方法updateById的功能描述：根据Id更新${tableComment}
     * 
     * @param ${className_Java}DO
     * @return int
     * @since v1.3.0
     * <PRE>
     * author ${author} 
     * Date ${createDate}
     * </PRE>
     */
    int updateById(${className_Java}DO record);

    /**
     * 
     * 方法findById的功能描述：根据Id查询${tableComment}
     * 
     * @param id
     * @return ${className_Java}DO
     * @since v1.3.0
     * <PRE>
     * author ${author} 
     * Date ${createDate}
     * </PRE>
     */
    ${className_Java}DO findById(@Param("id") Long id);
}