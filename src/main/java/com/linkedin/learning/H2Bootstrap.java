package com.linkedin.learning;

import com.linkedin.learning.entity.RoomEntity;
import com.linkedin.learning.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by chris.anatalio on 3/7/17.
 */
@Component
public class H2Bootstrap implements CommandLineRunner {

    @Autowired
    RoomService roomService;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Bootstrapping Rooms data Rooms database...");
        roomService.save(new RoomEntity(405, "200"));
        roomService.save(new RoomEntity(406, "215"));
        roomService.save(new RoomEntity(407, "218"));
        System.out.println("Bootstrapping Rooms data complete.");

        Iterable<RoomEntity> rooms = roomService.listAllRooms();

        System.out.println("Display all rooms:");
        for (RoomEntity room : rooms) {
            System.out.println("room = " + room);
        }
    }
}
