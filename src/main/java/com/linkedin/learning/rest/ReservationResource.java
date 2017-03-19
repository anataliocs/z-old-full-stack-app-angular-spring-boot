package com.linkedin.learning.rest;

import com.linkedin.learning.model.request.ReservationRequest;
import com.linkedin.learning.model.response.ReservationResponse;
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
