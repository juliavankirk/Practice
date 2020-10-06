package com.julia.dart.model;

class DartAlbum extends DartProduct {
    public String mArtist;
    public Integer mReleaseYear;

    DartAlbum(String artist, Integer releaseYear, String title, Double dailyRentFee, DartProduct productType) {
        super(title, dailyRentFee, DartProductType.Album);
        mArtist = artist;
        mReleaseYear = releaseYear;
    }

    public String getArtist() { return mArtist; }

    public Integer getReleaseYear() { return mReleaseYear; }

}