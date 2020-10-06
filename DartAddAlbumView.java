package com.julia.dart.views;
import com.julia.dart.Utilities;
import com.julia.dart.model.DartProduct;
import com.julia.dart.model.DartProductType;

public class DartAddAlbumView {
    public DartProduct getProductData() {
        String title, artist;
        Double releaseYear, dailyRentFee;

        System.out.println(Utilities.line() + "Creating a Song Album. Please type the album's:\n " +
                "Title\n");
        title = Utilities.stringInput();
        System.out.println(Utilities.line() + "Artist:\n");
        artist = Utilities.stringInput();
        System.out.println(Utilities.line() + "Release year:\n");
        releaseYear = Utilities.doubleInput();
        System.out.println(Utilities.line() + "Daily rent fee\n");
        dailyRentFee = Utilities.doubleInput();

        DartProduct product = new DartProduct( title, dailyRentFee, DartProductType.Album );

        return product;
    }

    public void renderSuccess() {
        System.out.println("Successfully registered a product!");
    }
}
