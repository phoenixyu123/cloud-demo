package cn.itcast.feign.pojo;

import lombok.Data;

/**
 * @author Yang YiGang
 * @version 1.0
 * @date 2021/10/24 16:13
 */
@Data
public class User {
    private Long id;
    private String username;
    private String address;
}