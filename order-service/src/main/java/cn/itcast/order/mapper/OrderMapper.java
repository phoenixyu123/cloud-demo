package cn.itcast.order.mapper;

import cn.itcast.order.pojo.Order;
import org.apache.ibatis.annotations.Select;

/**
 * @author Yang YiGang
 * @version 1.0
 * @date 2021/10/24 16:13
 */
public interface OrderMapper {

    /**
     * 该方法实现了通过id查询订单信息
     * @param id 订单id
     * @return 返回Order对象
     */
    @Select("select * from tb_order where id = #{id}")
    Order findById(Long id);
}
