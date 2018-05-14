package com.znsd.mybatis.bean;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface VehicleDao {
    List<Vehicle> findAll();
}
