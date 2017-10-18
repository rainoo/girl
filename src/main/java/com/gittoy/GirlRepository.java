package com.gittoy;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Create by GaoYu
 * 2017/10/17 21:01
 */
public interface GirlRepository extends JpaRepository<Girl, Integer> {

    // 增加接口：通过年龄来查询
    public List<Girl> findByAge(Integer age);
}
