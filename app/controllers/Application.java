package controllers;

import data.MockData;
import models.CallForIdea;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.homepage;
import views.html.index;
import views.html.issue;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result homepage() {
        return ok(homepage.render(getIdea(), MockData.getInstance().getIssues()));
    }

    public static Result issue() {
        return ok(issue.render());
    }

    private static CallForIdea getIdea() {
        return new CallForIdea("Víte o rozbitých lavičkách?\nOpravme je!", "http://brno.idnes.cz/brnan-opravil-v-masarykove-ctvrti-sest-lavicek-frt-/brno-zpravy.aspx?c=A121114_134614_brno-zpravy_bor");
    }
}
