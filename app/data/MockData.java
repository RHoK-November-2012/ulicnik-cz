package data;

import models.Issue;

import java.util.ArrayList;
import java.util.List;

public class MockData {

    private static MockData instance;

    private List<Issue> issues;

    private MockData() {
        issues = generateIssues();
    }

    public static MockData getInstance() {
        if(instance == null) {
            instance = new MockData();
        }
        return instance;
    }

    private List<Issue> generateIssues() {
        List<Issue> issues = new ArrayList<Issue>();

        issues.add(new Issue(
                "Smíchovští truhlíci: jak na ně?",
                "Po celém Smíchově rostou, mizí, přemisťují se a ne a ne zmizet. Udělejme s tím něco!",
                "images/issues/1-kvetinace",
                "Praha 5"
        ));
        issues.add(new Issue(
                "Ode (hnusné) zdi k (mluvící) zdi",
                "Okolí metra Strašnická budí hrůzu už dálky, natož z blízka. Přitom by stačila barva, štětce a pár rukou. Kdo se přidá?",
                "images/issues/2-zed",
                "Metro Strašnická, Praha"));
        issues.add(new Issue(
                "Za farou skládka za hranou",
                "Černé skládky vznikají, aniž by si toho někdo všiml. A pak už nezbývá něž to uklidit, aby se skládka nekupila ještě více.",
                "images/issues/3-skladka",
                "Strašnice, Praha"
        ));
        issues.add(new Issue(
                "Živá zeď: mechujeme",
                "Mech na zdi? Může to být zábavné, vtipné a také pěkné. Přidat se mohou i malé děti. Našli jsme zeď, které bude mech slušet.",
                "images/issues/4-mech",
                "Sokolovská, Praha 8"));
        return issues;
    }

    public List<Issue> getIssues() {
        return issues;
    }
}
