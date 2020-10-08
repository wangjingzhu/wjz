package cn.test.service;

import cn.test.domain.Province;

import java.util.List;

public interface ProvinceService {

    public List<Province> findAll();

    public String findAllJson();
}
