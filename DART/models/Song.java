package DART.models;

import java.time.LocalDate;
import java.util.UUID;

public class Song {
    private UUID Id;
    private String title;
    private String artist;
    private int releaseYear;
    private double dailyRentFee;
    private boolean available;

    public Song(String title, String artist, int releaseYear, double dailyRentFee){
        this.Id = UUID.randomUUID();
        this.title = title;
        this.artist = artist;
        this.releaseYear = releaseYear;
        this.dailyRentFee = dailyRentFee;
        this.available = available;
    }

    public UUID getId() { return Id; }

    public String getTitle() { return title; }

    public String getArtist() { return artist; }

    public int getReleaseYear() { return releaseYear; }

    public double getDailyRentFee() { return dailyRentFee; }

    public boolean getAvailability() { return available; }

   // public


}

