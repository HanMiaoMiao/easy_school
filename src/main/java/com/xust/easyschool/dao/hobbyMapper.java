package com.xust.easyschool.dao;

import com.xust.easyschool.bean.hobby;
import com.xust.easyschool.bean.hobbyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface hobbyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hobby
     *
     * @mbg.generated Wed Apr 18 21:28:42 CST 2018
     */
    long countByExample(hobbyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hobby
     *
     * @mbg.generated Wed Apr 18 21:28:42 CST 2018
     */
    int deleteByExample(hobbyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hobby
     *
     * @mbg.generated Wed Apr 18 21:28:42 CST 2018
     */
    int deleteByPrimaryKey(Integer hobbyId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hobby
     *
     * @mbg.generated Wed Apr 18 21:28:42 CST 2018
     */
    int insert(hobby record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hobby
     *
     * @mbg.generated Wed Apr 18 21:28:42 CST 2018
     */
    int insertSelective(hobby record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hobby
     *
     * @mbg.generated Wed Apr 18 21:28:42 CST 2018
     */
    List<hobby> selectByExample(hobbyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hobby
     *
     * @mbg.generated Wed Apr 18 21:28:42 CST 2018
     */
    hobby selectByPrimaryKey(Integer hobbyId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hobby
     *
     * @mbg.generated Wed Apr 18 21:28:42 CST 2018
     */
    int updateByExampleSelective(@Param("record") hobby record, @Param("example") hobbyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hobby
     *
     * @mbg.generated Wed Apr 18 21:28:42 CST 2018
     */
    int updateByExample(@Param("record") hobby record, @Param("example") hobbyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hobby
     *
     * @mbg.generated Wed Apr 18 21:28:42 CST 2018
     */
    int updateByPrimaryKeySelective(hobby record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hobby
     *
     * @mbg.generated Wed Apr 18 21:28:42 CST 2018
     */
    int updateByPrimaryKey(hobby record);
}