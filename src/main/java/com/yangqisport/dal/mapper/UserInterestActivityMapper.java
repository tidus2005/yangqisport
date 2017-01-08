package com.yangqisport.dal.mapper;

import com.yangqisport.dal.dataobject.UserInterestActivity;
import com.yangqisport.dal.dataobject.UserInterestActivityExample;
import com.yangqisport.framework.dal.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInterestActivityMapper extends BaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_INTEREST_ACTIVITY
     *
     * @mbggenerated
     */
    int countByExample(UserInterestActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_INTEREST_ACTIVITY
     *
     * @mbggenerated
     */
    int deleteByExample(UserInterestActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_INTEREST_ACTIVITY
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_INTEREST_ACTIVITY
     *
     * @mbggenerated
     */
    int insert(UserInterestActivity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_INTEREST_ACTIVITY
     *
     * @mbggenerated
     */
    int insertSelective(UserInterestActivity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_INTEREST_ACTIVITY
     *
     * @mbggenerated
     */
    List<UserInterestActivity> selectByExample(UserInterestActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_INTEREST_ACTIVITY
     *
     * @mbggenerated
     */
    UserInterestActivity selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_INTEREST_ACTIVITY
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UserInterestActivity record, @Param("example") UserInterestActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_INTEREST_ACTIVITY
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UserInterestActivity record, @Param("example") UserInterestActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_INTEREST_ACTIVITY
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserInterestActivity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_INTEREST_ACTIVITY
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserInterestActivity record);
}