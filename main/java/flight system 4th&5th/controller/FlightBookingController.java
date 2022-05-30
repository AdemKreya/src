package FlightBooking.controller;


import FlightBooking.model.Flight;
import FlightBooking.model.Passenger;
import FlightBooking.model.BookedFlight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import FlightBooking.service.BookedFlight_service;
import FlightBooking.service.Flight_service;
import FlightBooking.service.PassengerService;


import java.util.List;

@Controller
@RequestMapping("flight-booking/bookedFlight")
public class BookedFlightController {

    private final Flight_service Flight_service;
    private final PassengerService passengerService;
    private final BookedFlight_service bookedFlight_service;
    @Autowired
    public BookedFlightController(PassengerService passengerService, Flight_service Flight_service, BookedFlight_service bookedFlight_service) {
        this.passengerService = passengerService;
        this.Flight_service = Flight_service;
        this.bookedFlight_service = bookedFlight_service;
    }
    @GetMapping
    public ResponseEntity<List<BookedFlight>>findALlBookedFlight(){
        return new ResponseEntity<>(bookedFlight_service.getAllBookedFlight(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<BookedFlight> bookFlight(@RequestBody List<Passenger> passengers, @RequestParam(defaultValue="1790") String flightNumber){

        Integer flightNumberInt = Integer.parseInt(flightNumber);
        return new ResponseEntity<>(bookedFlight_service.saveBookedFlight(passengers,flightNumberInt), HttpStatus.OK);
    }



}
