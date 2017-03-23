package com.linkedin.learning.rest;

import com.linkedin.learning.convertor.RoomEntityToReservationResponseConverter;
import com.linkedin.learning.entity.RoomEntity;
import com.linkedin.learning.model.request.ReservationRequest;
import com.linkedin.learning.model.response.ReservationResponse;
import com.linkedin.learning.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

import static com.linkedin.learning.rest.ResourceConstants.ROOM_RESERVATION_V1;

/**
 * Implements CRUD functionality for Reservation resources.
 *
 * @author Chris Anatalio
 */
@RestController
@RequestMapping(ROOM_RESERVATION_V1)
public class ReservationResource {

    @Autowired
    RoomService roomService;

    @RequestMapping(path = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Page<ReservationResponse> getAvailableRooms(
            @RequestParam(value = "checkin")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate checkin,
            @RequestParam(value = "checkout")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate checkout, Pageable pageable) {

        Page<RoomEntity> reservationEntityList = roomService.listAllRooms(pageable);

        return reservationEntityList.map(new RoomEntityToReservationResponseConverter());
    }

    @RequestMapping(path = "/{roomId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<RoomEntity> getAvailableRooms(
            @PathVariable Long roomId) {

        RoomEntity roomById = roomService.getRoomById(roomId);

        return new ResponseEntity<RoomEntity>(roomById, HttpStatus.OK);
    }

    @RequestMapping(path = "", method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<ReservationResponse> createReservation(
            @RequestBody ReservationRequest comment) {

        //TODO Implement reservationRepository.save(conversionService.convert(reservation, ReservationEntity.class));
        //ReservationEntity created = reservationRepository.save(conversionService.convert(reservation, ReservationEntity.class));

        //TODO Implement conversionService.convert(created, ReservationResponse.class)
        //ReservationResponse response = conversionService.convert(created, ReservationResponse.class);

        return new ResponseEntity<>(new ReservationResponse(), HttpStatus.CREATED);
    }

    @RequestMapping(path = "", method = RequestMethod.PUT,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<ReservationResponse> updateReservation(
            @RequestBody ReservationRequest comment) {

        //TODO implement reservationRepository.save(conversionService.convert(reservation, ReservationEntity.class));
        //ReservationEntity created = reservationRepository.save(conversionService.convert(reservation, ReservationEntity.class));

        //TODO implement conversionService.convert(created, ReservationResponse.class);
        //ReservationResponse response = conversionService.convert(created, ReservationResponse.class);

        return new ResponseEntity<>(new ReservationResponse(), HttpStatus.OK);
    }

    @RequestMapping(path = "/{reservationId}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteComments(
            @PathVariable long reservationId) {

        //TODO implement reservationRepository.deleteById(commentId);
        //int modifiedRows = reservationRepository.deleteById(commentId);
        //if (modifiedRows == 1)
        //    return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
