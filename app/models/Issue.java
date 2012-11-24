package models;

public class Issue {

    public String title;

    public String description;

    public String imageHref;

    public String place;

    public Issue(String title, String description, String imageHref, String place) {
        this.title = title;
        this.description = description;
        this.imageHref = imageHref;
        this.place = place;
    }
}
