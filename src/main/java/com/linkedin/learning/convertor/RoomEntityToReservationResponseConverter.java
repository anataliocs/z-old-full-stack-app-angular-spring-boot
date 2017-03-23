package com.linkedin.learning.convertor;

import com.linkedin.learning.entity.RoomEntity;
import com.linkedin.learning.model.Links;
import com.linkedin.learning.model.Self;
import com.linkedin.learning.model.response.ReservationResponse;
import org.springframework.core.convert.converter.Converter;

import static com.linkedin.learning.rest.ResourceConstants.ROOM_RESERVATION_V1;

public class RoomEntityToReservationResponseConverter implements Converter<RoomEntity, ReservationResponse> {

    @Override
    public ReservationResponse convert(RoomEntity source) {

        ReservationResponse reservationResponse = new ReservationResponse();
        reservationResponse.setId(source.getId());
        reservationResponse.setPrice(Integer.parseInt(source.getPrice()));
        reservationResponse.setRoomNumber(source.getRoomNumber());

        Links links = new Links();
        Self self = new Self();
        self.setRef(ROOM_RESERVATION_V1 + "/" + source.getId());
        links.setSelf(self);

        reservationResponse.setLinks(links);

        return reservationResponse;
    }
}
