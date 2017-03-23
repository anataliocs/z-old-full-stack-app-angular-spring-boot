package com.linkedin.learning.convertor;

import com.linkedin.learning.entity.RoomEntity;
import com.linkedin.learning.model.Links;
import com.linkedin.learning.model.Self;
import com.linkedin.learning.model.response.ReservableRoomResponse;
import org.springframework.core.convert.converter.Converter;

import static com.linkedin.learning.rest.ResourceConstants.ROOM_RESERVATION_V1;

public class RoomEntityToReservationResponseConverter implements Converter<RoomEntity, ReservableRoomResponse> {

    @Override
    public ReservableRoomResponse convert(RoomEntity source) {

        ReservableRoomResponse reservableRoomResponse = new ReservableRoomResponse();
        reservableRoomResponse.setId(source.getId());
        reservableRoomResponse.setPrice(Integer.parseInt(source.getPrice()));
        reservableRoomResponse.setRoomNumber(source.getRoomNumber());

        Links links = new Links();
        Self self = new Self();
        self.setRef(ROOM_RESERVATION_V1 + "/" + source.getId());
        links.setSelf(self);

        reservableRoomResponse.setLinks(links);

        return reservableRoomResponse;
    }
}
