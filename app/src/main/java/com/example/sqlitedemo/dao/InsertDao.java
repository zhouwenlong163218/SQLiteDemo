package com.example.sqlitedemo.dao;

import com.example.sqlitedemo.entity.Insert;

import java.util.List;

public interface InsertDao {
    List<Insert> selectAll();
    void insert(Insert insert);
    void update(Insert insert);
    void delete(String name);
}
