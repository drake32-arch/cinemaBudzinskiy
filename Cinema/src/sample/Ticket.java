package sample;

public class Ticket {
    private Buyer[] buyers;
    private Film film;
    private String hall;
    private String time;
    private int price;
    private int [] places;

    public Buyer[] getBuyers() {
        return buyers;
    }

    public void setBuyers(Buyer[] buyers) {
        this.buyers = buyers;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public String getHall() {
        return hall;
    }

    public void setHall(String hall) {
        this.hall = hall;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int[] getPlaces() {
        return places;
    }

    public void setPlaces(int[] places) {
        this.places = places;
    }
}
