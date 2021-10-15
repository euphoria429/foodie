package com.imooc.my.mapper;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author huangcaixia
 * @create 2021-10-15 10:17
 * @since 1.0.0
 */

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 继承自己的MyMapper
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
