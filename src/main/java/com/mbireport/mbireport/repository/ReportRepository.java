package com.mbireport.mbireport.repository;

import com.mbireport.mbireport.entity.ReportObject;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportRepository extends CrudRepository<ReportObject, Long>{
}
