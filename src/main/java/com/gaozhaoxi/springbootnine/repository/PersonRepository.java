package com.gaozhaoxi.springbootnine.repository;

import com.gaozhaoxi.springbootnine.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

/**
 * @author Leon
 */

//@RepositoryRestResource(path = "people")  //该设置可以更改默认的访问路径
public interface PersonRepository extends JpaRepository<Person,Long>{
    //将该方法设为Rest资源，暴露出来
    @RestResource(path="nameStartsWith",rel = "nameStartsWith")
    List<Person> findByNameStartsWith(@Param("name") String name);
}
