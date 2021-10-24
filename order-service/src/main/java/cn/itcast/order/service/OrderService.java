package cn.itcast.order.service;

import cn.itcast.feign.clients.UserClient;
import cn.itcast.feign.pojo.User;
import cn.itcast.order.mapper.OrderMapper;
import cn.itcast.order.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/**
 * @author Yang YiGang
 * @version 1.0
 * @date 2021/10/24 16:13
 */
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private UserClient userClient;

    /**
     * 用Feign远程调用
     */
    public Order queryOrderById(Long orderId) {
        //1.查询订单
        Order order = orderMapper.findById(orderId);
        //2.Feign远程调用
        User user = userClient.findById(order.getUserId());
        //3.封装User至Order
        order.setUser(user);
        //4.返回
        return order;
    }


//    @Autowired
//    private RestTemplate restTemplate;
//
//    public Order queryOrderById(Long orderId) {
//        // 1.查询订单
//        Order order = orderMapper.findById(orderId);
//        // 【硬编码】2.利用RestTemplate发起http请求，查询用户
////        String url = "http://localhost:8081/user/"+order.getUserId();
//        // 【Eureka远程调用】
//        String url = "http://userservice/user/"+order.getUserId();
//        User user = restTemplate.getForObject(url, User.class);
//        order.setUser(user);
//        // 4.返回
//        return order;
//    }
}
