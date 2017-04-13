package cn.gaoyuexiang.api.demo.repositories;

import cn.gaoyuexiang.api.demo.model.Clazz;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClazzRepo extends CrudRepository<Clazz, String> {

  Clazz findById(String id);

}
