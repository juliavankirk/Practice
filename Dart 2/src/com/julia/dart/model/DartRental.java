package com.julia.dart.model;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class DartRental {
    private DartCustomer mCustomer;
    private DartProduct mProduct;
    private LocalDate mRentDate;
    private LocalDate mReturnDate;

    public DartRental(DartCustomer customer, DartProduct product, LocalDate rentDate) {
        mCustomer = customer;
        mProduct = product;
        mProduct.rentProduct();
        mRentDate = rentDate;
        mReturnDate = null;

    }

    public void returnRental(LocalDate returnDate) {
        mProduct.returnProduct();
        mReturnDate = returnDate;
    }

    public Double totalRentFee() {
        LocalDate endDate = mReturnDate == null ? LocalDate.now() : mReturnDate; //
        long daysBetween = Duration.between(mRentDate, endDate).toDays();
        Double fee = daysBetween * mProduct.getDailyRentFee();
        return fee;
    }

    public DartCustomer getCustomer() { return mCustomer;}

}

