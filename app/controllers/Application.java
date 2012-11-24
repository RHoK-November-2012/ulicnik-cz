package controllers;

import models.CallForIdea;
import models.Issue;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.homepage;
import views.html.index;

import java.util.ArrayList;
import java.util.List;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result homepage() {
        return ok(homepage.render(getIdea(), getIssues()));
    }

    private static CallForIdea getIdea() {
        return new CallForIdea("Víte o rozbitých lavičkách?\nOpravme je!", "http://brno.idnes.cz/brnan-opravil-v-masarykove-ctvrti-sest-lavicek-frt-/brno-zpravy.aspx?c=A121114_134614_brno-zpravy_bor");
    }

    private static List<Issue> getIssues() {

        List<Issue> issues = new ArrayList<Issue>();

        issues.add(new Issue(
                "Nějáký problém",
                "Blaaah",
                "",
                "Ulice, Město"
        ));
        issues.add(new Issue(
                "Betonové květináče na Smíchově",
                "Blaaah",
                "",
                "Smíchovská, Praha 5"));
        issues.add(new Issue(
                "Psí exkrementy na chodníku",
                "Blaaah",
                "",
                "Balbínova, Praha 2"
        ));
        issues.add(new Issue(
                "Proč je ta zelená tak krátká?",
                "Blaaah",
                "",
                "Všude"));
        return issues;
    }
}
