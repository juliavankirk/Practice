package DART.models;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.UUID;

public class Game {
    private UUID Id;
    private String title;
    private String genre;
    private double dailyRentFee;
    private boolean available;
    private LocalDate rentDate;
    private LocalDate returnDate;

    public Game(String title, String genre, double dailyRentFee, LocalDate rentDate, LocalDate returnDate) {
        this.Id = UUID.randomUUID();
        this.title = title;
        this.genre = genre;
        this.dailyRentFee = dailyRentFee;
        this.available = true;
        this.rentDate = rentDate;
        this.returnDate = returnDate;
    }

    public UUID getId() {
        return Id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() { return genre; }

    public double getDailyRentFee() {
        return dailyRentFee;
    }

    public boolean getAvailable() {
        return this.available;
    }

    public LocalDate getRentDate() { return this.rentDate = LocalDate.now(); }

    public LocalDate getReturnDate() { return this.returnDate = LocalDate.now(); }

    public LocalDate setRentDate() { return this.rentDate = LocalDate.now(); }

    public LocalDate setReturnDate() { return this.returnDate = LocalDate.now(); }

    public void setAvailable(boolean available) { this.available = available; }
    // in controller, you do setAvailable(false) to set availability of product to false.

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDailyRentFee(double dailyRentFee) {
        this.dailyRentFee = dailyRentFee;
    }

    public Double totalRentFee() {
        LocalDate endDate = returnDate == null ? LocalDate.now() : returnDate; //
        long daysBetween = Duration.between(rentDate, endDate).toDays();
        double fee = daysBetween * getDailyRentFee();
        return fee;
    }

    @Override
    public String toString() {
        return getId() + " : " + getTitle() + " (" + getGenre() + ") " + getDailyRentFee() +
                " SEK/day. - " + Boolean.toString(this.available);
    }

    public HashMap<UUID, Game> games;

    public Game() {
        new HashMap<UUID, Game>();
    }

    public Collection<Game> getProductList() {
        return games.values();
    }

    public void addGame(Game product) {
        games.put(product.getId(), product);
    }

    public void removeGame(UUID id) {
        games.remove(id);
    }

    public Game findGame(UUID id) {

        Game product = games.get(id);
        if (product == null) {
            System.err.println("Could not find this product with this specific ID! Try again.");
        }
        return product;
    }
}



