package com.yangqisport.dal.mapper;

import com.yangqisport.dal.dataobject.CommAttachment;
import com.yangqisport.dal.dataobject.CommAttachmentExample;
import com.yangqisport.framework.dal.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommAttachmentMapper extends BaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMM_ATTACHMENT
     *
     * @mbggenerated
     */
    int countByExample(CommAttachmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMM_ATTACHMENT
     *
     * @mbggenerated
     */
    int deleteByExample(CommAttachmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMM_ATTACHMENT
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMM_ATTACHMENT
     *
     * @mbggenerated
     */
    int insert(CommAttachment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMM_ATTACHMENT
     *
     * @mbggenerated
     */
    int insertSelective(CommAttachment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMM_ATTACHMENT
     *
     * @mbggenerated
     */
    List<CommAttachment> selectByExample(CommAttachmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMM_ATTACHMENT
     *
     * @mbggenerated
     */
    CommAttachment selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMM_ATTACHMENT
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") CommAttachment record, @Param("example") CommAttachmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMM_ATTACHMENT
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") CommAttachment record, @Param("example") CommAttachmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMM_ATTACHMENT
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CommAttachment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMM_ATTACHMENT
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CommAttachment record);
}