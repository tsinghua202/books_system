package com.domebook.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.domebook.domain.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookDao extends BaseMapper<Book> {
}
