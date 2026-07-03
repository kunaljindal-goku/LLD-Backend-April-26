package com.scaler.bookMyShow.service;

import com.scaler.bookMyShow.Repository.UserRepository;
import com.scaler.bookMyShow.esceptions.UserNotFoundException;
import com.scaler.bookMyShow.model.Booking;
import com.scaler.bookMyShow.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {


    private UserRepository userRepository;

    @Autowired
    public BookingService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Booking bookTicket(int showId,
                              int userId,
                              List<Integer> showSeatsIds) {

        Optional<User> userOptional = userRepository.findById(userId);
        if(userOptional.isEmpty()) {
            throw new UserNotFoundException("Invalid user id: "+userId);
        }
    }
}
