package com.example.confirmTkt.booking;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bookings")
public class BookingController {

    @GetMapping
    public List<String> findAllStudents() {
        return List.of(
                "Gunjan",
                "Hello world"
        );
    }

}
