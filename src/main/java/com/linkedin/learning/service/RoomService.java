package com.linkedin.learning.service;

import com.linkedin.learning.entity.RoomEntity;

public interface RoomService {

    Iterable<RoomEntity> listAllRooms();

    RoomEntity save(RoomEntity roomEntity);
}
