package com.julia.dart.model;

class DartGame extends DartProduct {
    public String mGenre;

    DartGame(String genre, String title, Double dailyRentFee, DartProduct productType) {
        super(title, dailyRentFee, DartProductType.Game);
        mGenre = genre;
    }

    public String getGenre() {
        return mGenre;
    }

}