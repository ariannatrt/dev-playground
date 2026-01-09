package com.projectorchid.project_orchid.service;

import com.projectorchid.project_orchid.entity.Booking;
import com.projectorchid.project_orchid.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingServiceImpl implements BookingService {

    private BookingRepository bookingRepository;

    @Autowired
    BookingServiceImpl(BookingRepository bookingRepository){
        this.bookingRepository=bookingRepository;
    }

    @Override
    public List<Booking> findAll() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking findById(int theId) {
        Optional<Booking> result = bookingRepository.findById(theId);

        Booking theBooking = null;

        if(result.isPresent()){
            theBooking= result.get();
        }else{
            throw new RuntimeException("Did not find employee id - " + theId);
        }
        return theBooking;
    }

    @Override
    public void save(Booking booking) {
        bookingRepository.save(booking);
    }

    @Override
    public void deleteById(int theId) {
        bookingRepository.deleteById(theId);
    }
}
