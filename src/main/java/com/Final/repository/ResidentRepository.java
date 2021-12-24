package com.Final.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Final.models.Resident;
@Repository
public interface ResidentRepository extends CrudRepository<Resident,Integer>{

}
