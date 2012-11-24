package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;
import views.html.homepage;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result homepage() {
        String callForIdeaText = "Máte nápad jak změnit veřejný prostor?";

        return ok(homepage.render(callForIdeaText));
    }
}
