package com.linkedin.learning.rest;

import com.linkedin.learning.model.response.ReservationResponse;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping(path = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<ReservationResponse> getAvailableRooms(
            @RequestParam(value = "checkin")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate checkin,
            @RequestParam(value = "checkout")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate checkout) {

        //TODO Implement pageableReservationService.listCommentsByItem(itemId, pageable);
        //Page<ReservationEntity> commentEntityList = pageableReservationService.listCommentsByItem(itemId, pageable);

        //TODO Implement ReservationEntityToReservationResponseConverter()
        //return reservationEntityList.map(new ReservationEntityToReservationResponseConverter());

        return new ResponseEntity<>(new ReservationResponse(), HttpStatus.OK);
    }


}
