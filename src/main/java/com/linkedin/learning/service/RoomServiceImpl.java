package com.linkedin.learning.service;

import com.linkedin.learning.entity.RoomEntity;
import com.linkedin.learning.repository.PageableRoomRepository;
import com.linkedin.learning.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by chris.anatalio on 3/8/17.
 */
@Service
@Transactional
public class RoomServiceImpl implements RoomService {

    @Autowired
    RoomRepository roomRepository;

    @Autowired
    PageableRoomRepository pageableRoomRepository;

    @Override
    public RoomEntity getRoomById(Long roomId) {
        return roomRepository.findById(roomId);
    }

    @Override
    public Iterable<RoomEntity> listAllRooms() {
        return roomRepository.findAll();
    }

    @Override
    public Page<RoomEntity> listAllRooms(Pageable page) {
        return pageableRoomRepository.findAll(page);
    }

    @Override
    public RoomEntity save(RoomEntity roomEntity) {
        return roomRepository.save(roomEntity);
    }
}
