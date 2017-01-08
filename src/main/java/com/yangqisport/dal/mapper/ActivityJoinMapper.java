package com.yangqisport.dal.mapper;

import com.yangqisport.dal.dataobject.ActivityJoin;
import com.yangqisport.dal.dataobject.ActivityJoinExample;
import com.yangqisport.framework.dal.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityJoinMapper extends BaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACTIVITY_JOIN
     *
     * @mbggenerated
     */
    int countByExample(ActivityJoinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACTIVITY_JOIN
     *
     * @mbggenerated
     */
    int deleteByExample(ActivityJoinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACTIVITY_JOIN
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACTIVITY_JOIN
     *
     * @mbggenerated
     */
    int insert(ActivityJoin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACTIVITY_JOIN
     *
     * @mbggenerated
     */
    int insertSelective(ActivityJoin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACTIVITY_JOIN
     *
     * @mbggenerated
     */
    List<ActivityJoin> selectByExample(ActivityJoinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACTIVITY_JOIN
     *
     * @mbggenerated
     */
    ActivityJoin selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACTIVITY_JOIN
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ActivityJoin record, @Param("example") ActivityJoinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACTIVITY_JOIN
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ActivityJoin record, @Param("example") ActivityJoinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACTIVITY_JOIN
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ActivityJoin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACTIVITY_JOIN
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ActivityJoin record);
}