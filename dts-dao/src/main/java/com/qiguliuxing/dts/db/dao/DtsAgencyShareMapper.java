package com.qiguliuxing.dts.db.dao;

import com.qiguliuxing.dts.db.domain.DtsAgencyShare;
import com.qiguliuxing.dts.db.domain.DtsAgencyShareExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DtsAgencyShareMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_agency_share
     *
     * @mbg.generated
     */
    long countByExample(DtsAgencyShareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_agency_share
     *
     * @mbg.generated
     */
    int deleteByExample(DtsAgencyShareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_agency_share
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_agency_share
     *
     * @mbg.generated
     */
    int insert(DtsAgencyShare record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_agency_share
     *
     * @mbg.generated
     */
    int insertSelective(DtsAgencyShare record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_agency_share
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    DtsAgencyShare selectOneByExample(DtsAgencyShareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_agency_share
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    DtsAgencyShare selectOneByExampleSelective(@Param("example") DtsAgencyShareExample example, @Param("selective") DtsAgencyShare.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_agency_share
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<DtsAgencyShare> selectByExampleSelective(@Param("example") DtsAgencyShareExample example, @Param("selective") DtsAgencyShare.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_agency_share
     *
     * @mbg.generated
     */
    List<DtsAgencyShare> selectByExample(DtsAgencyShareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_agency_share
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    DtsAgencyShare selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") DtsAgencyShare.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_agency_share
     *
     * @mbg.generated
     */
    DtsAgencyShare selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_agency_share
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DtsAgencyShare record, @Param("example") DtsAgencyShareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_agency_share
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DtsAgencyShare record, @Param("example") DtsAgencyShareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_agency_share
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DtsAgencyShare record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_agency_share
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DtsAgencyShare record);
}