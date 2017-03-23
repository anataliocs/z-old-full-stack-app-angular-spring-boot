package com.linkedin.learning.repository;


import com.linkedin.learning.entity.RoomEntity;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends CrudRepository<RoomEntity, Long> {

    RoomEntity findById(Long id);
}
