package org.example.test;

import org.assertj.SoftAssertions;
import org.assertj.core.api.Condition;
import org.assertj.examples.AbstractAssertionsExamples;
import org.assertj.examples.data.Mansion;
import org.assertj.examples.data.Player;
import org.assertj.examples.data.TolkienCharacter;
import org.assertj.examples.data.WesterosHouse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.AssertionsForClassTypes.in;
import static org.assertj.core.api.AssertionsForClassTypes.notIn;
import static org.assertj.examples.data.Race.*;

public class AssertTest extends AbstractAssertionsExamples {

    @Test
    @DisplayName("describe as")
    void testInit() {
        TolkienCharacter frodo = new TolkienCharacter("Frodo", 33, HOBBIT);
        assertThat(frodo.getAge()).as("check %s's age", frodo.getName()).isEqualTo(100);
    }

    @Test
    @DisplayName("combining filtering")
    void combiningFiltering() {
        assertThat(fellowshipOfTheRing).filteredOn(character -> character.getName().contains("o"))
                .containsOnly(aragorn, frodo, legolas, boromir);
    }

    @Test
    @DisplayName("combining filtering support not, in, notIn")
    void combiningFilteringList() {
        assertThat(fellowshipOfTheRing).filteredOn("race", HOBBIT)
                .containsOnly(sam, frodo, pippin, merry);

        assertThat(fellowshipOfTheRing).filteredOn("race.name", "Man")
                .containsOnly(aragorn, boromir);

        // different comparison
        assertThat(fellowshipOfTheRing).filteredOn("race", notIn(HOBBIT, MAN))
                .containsOnly(gandalf, gimli, legolas);

        assertThat(fellowshipOfTheRing).filteredOn("race", in(MAIA, MAN))
                .containsOnly(gandalf, boromir, aragorn);

        assertThat(fellowshipOfTheRing).filteredOn("race", not(HOBBIT))
                .containsOnly(gandalf, boromir, aragorn, gimli, legolas);

        // chaining comparison
        assertThat(fellowshipOfTheRing).filteredOn("race", MAN)
                .filteredOn("name", not("Boromir"))
                .containsOnly(aragorn);
    }

    @Test
    @DisplayName("Custom Condition Test")
    void customConditionTest() {
        Condition<Player> mvpStats = new Condition<Player>() {
            @Override
            public boolean matches(Player player) {
                return player.getPointsPerGame() > 20 && (player.getAssistsPerGame() >= 8 || player.getReboundsPerGame() >= 8);
            }
        };

        List<Player> players = new ArrayList<>();
        Player rose = new Player("rose", 25, 8, 5);
        Player james = new Player("James", 27, 6, 9);
        Player noah = new Player("Noah", 8, 5, 11);
        players.add(rose);
        players.add(james);
        players.add(noah);

        assertThat(players).filteredOn(mvpStats)
                .containsOnly(rose, james);
    }

    @Test
    @DisplayName("extract property or field")
    void extractField() {
        assertThat(fellowshipOfTheRing).extracting("name")
                .contains("Boromir", "Gandalf", "Frodo", "Legolas")
                .doesNotContain("Sauron", "Elrond");

        // 타입 명시 가능
        assertThat(fellowshipOfTheRing).extracting("name", String.class)
                .contains("Boromir", "Gandalf", "Frodo", "Legolas")
                .doesNotContain("Sauron", "Elrond");
    }

    @Test
    @DisplayName("extract Tuple")
    void extractTuple() {
        assertThat(fellowshipOfTheRing).extracting("name", "age", "race.name")
                .contains(tuple("Boromir", 37, "Man"),
                        tuple("Sam", 38, "Hobbit"),
                        tuple("Legolas", 1000, "Elf"));
    }

    @Test
    @DisplayName("result of a method call")
    void resultOfMethodCall() {
        List<WesterosHouse> greatHouses = new ArrayList<>();
        greatHouses.add(new WesterosHouse("Stark", "Winter is Coming"));
        greatHouses.add(new WesterosHouse("Lannister", "Hear Me Roar!"));
        greatHouses.add(new WesterosHouse("Greyjoy", "We Do Not Sow"));
        greatHouses.add(new WesterosHouse("Baratheon", "Our is the Fury"));
        greatHouses.add(new WesterosHouse("Martell", "Unbowed, Unbent, Unbroken"));
        greatHouses.add(new WesterosHouse("Tyrell", "Growing Strong"));

        assertThat(greatHouses).extractingResultOf("sayTheWords")
                .contains("Winter is Coming", "We Do Not Sow", "Hear Me Roar!")
                .doesNotContain("Lannisters always pay their debts");
    }

    // 오류 발생 하나만 수집
    @Test
    @DisplayName("error collect One")
    void host_dinner_party_where_nobody_dies() {
        Mansion mansion = new Mansion();
        mansion.hostPotentiallyMurderousDinnerParty();
        assertThat(mansion.guests()).as("Living Guests").isEqualTo(7);
        assertThat(mansion.kitchen()).as("Kitchen").isEqualTo("clean");
        assertThat(mansion.library()).as("Library").isEqualTo("clean");
        assertThat(mansion.revolverAmmo()).as("Revolver Ammo").isEqualTo(6);
        assertThat(mansion.candlestick()).as("Candlestick").isEqualTo("pristine");
        assertThat(mansion.colonel()).as("Colonel").isEqualTo("well kempt");
        assertThat(mansion.professor()).as("Professor").isEqualTo("well kempt");
    }

    // 오류 발생 모두 수집
    @Test
    @DisplayName("error collect All")
    void host_dinner_party_where_nobody_dies_error_collect() {
        Mansion mansion = new Mansion();
        mansion.hostPotentiallyMurderousDinnerParty();
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(mansion.guests()).as("Living Guests").isEqualTo(7);
        softly.assertThat(mansion.kitchen()).as("Kitchen").isEqualTo("clean");
        softly.assertThat(mansion.library()).as("Library").isEqualTo("clean");
        softly.assertThat(mansion.revolverAmmo()).as("Revolver Ammo").isEqualTo(6);
        softly.assertThat(mansion.candlestick()).as("Candlestick").isEqualTo("pristine");
        softly.assertThat(mansion.colonel()).as("Colonel").isEqualTo("well kempt");
        softly.assertThat(mansion.professor()).as("Professor").isEqualTo("well kempt");
        // 이걸 무조건 실행해주어야 테스트가 돌아간다 주의!
        /*
        @Rule
        final JUnitSoftAssertions softly = new JUnitSoftAssertions(); // assertAll() 을 사용하지 않아도 기본적으로 수행된다.
         */
        softly.assertAll();
    }

    @Test
    @DisplayName("error collect All Auto")
    void host_dinner_party_where_nobody_dies_error_collect_two() {
        Mansion mansion = new Mansion();
        mansion.hostPotentiallyMurderousDinnerParty();
        org.assertj.core.api.SoftAssertions.assertSoftly(softly -> { // assertAll() 을 하지 않아도 자동 수행
            softly.assertThat(mansion.guests()).as("Living Guests").isEqualTo(7);
            softly.assertThat(mansion.kitchen()).as("Kitchen").isEqualTo("clean");
            softly.assertThat(mansion.library()).as("Library").isEqualTo("clean");
            softly.assertThat(mansion.revolverAmmo()).as("Revolver Ammo").isEqualTo(6);
            softly.assertThat(mansion.candlestick()).as("Candlestick").isEqualTo("pristine");
            softly.assertThat(mansion.colonel()).as("Colonel").isEqualTo("well kempt");
            softly.assertThat(mansion.professor()).as("Professor").isEqualTo("well kempt");
        });
    }

}
