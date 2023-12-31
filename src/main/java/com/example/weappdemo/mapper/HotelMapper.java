package com.example.weappdemo.mapper;

import com.example.weappdemo.bean.Hotel;
import com.example.weappdemo.bean.HotelExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
@Mapper
public interface HotelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hotel_list
     *
     * @mbg.generated Fri Aug 04 10:51:59 CST 2023
     */
    long countByExample(HotelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hotel_list
     *
     * @mbg.generated Fri Aug 04 10:51:59 CST 2023
     */
    int deleteByExample(HotelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hotel_list
     *
     * @mbg.generated Fri Aug 04 10:51:59 CST 2023
     */
    int deleteByPrimaryKey(String hotelId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hotel_list
     *
     * @mbg.generated Fri Aug 04 10:51:59 CST 2023
     */
    int insert(Hotel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hotel_list
     *
     * @mbg.generated Fri Aug 04 10:51:59 CST 2023
     */
    int insertSelective(Hotel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hotel_list
     *
     * @mbg.generated Fri Aug 04 10:51:59 CST 2023
     */
    List<Hotel> selectByExampleWithRowbounds(HotelExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hotel_list
     *
     * @mbg.generated Fri Aug 04 10:51:59 CST 2023
     */
    List<Hotel> selectByExample(HotelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hotel_list
     *
     * @mbg.generated Fri Aug 04 10:51:59 CST 2023
     */
    Hotel selectByPrimaryKey(String hotelId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hotel_list
     *
     * @mbg.generated Fri Aug 04 10:51:59 CST 2023
     */
    int updateByExampleSelective(@Param("record") Hotel record, @Param("example") HotelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hotel_list
     *
     * @mbg.generated Fri Aug 04 10:51:59 CST 2023
     */
    int updateByExample(@Param("record") Hotel record, @Param("example") HotelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hotel_list
     *
     * @mbg.generated Fri Aug 04 10:51:59 CST 2023
     */
    int updateByPrimaryKeySelective(Hotel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hotel_list
     *
     * @mbg.generated Fri Aug 04 10:51:59 CST 2023
     */
    int updateByPrimaryKey(Hotel record);
}