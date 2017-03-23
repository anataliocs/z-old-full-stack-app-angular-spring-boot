package com.linkedin.learning.service;

import com.linkedin.learning.entity.RoomEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface RoomService {

    RoomEntity getRoomById(Long Id);

    Iterable<RoomEntity> listAllRooms();

    Page<RoomEntity> listAllRooms(Pageable page);

    RoomEntity save(RoomEntity roomEntity);
}
