package org.assertj.examples.data;

public class Player {
    String name;
    int pointsPerGame;
    int assistsPerGame;
    int reboundsPerGame;

    public Player(String name, int pointsPerGame, int assistsPerGame, int reboundsPerGame) {
        this.name = name;
        this.pointsPerGame = pointsPerGame;
        this.assistsPerGame = assistsPerGame;
        this.reboundsPerGame = reboundsPerGame;
    }

    public String getName() {
        return name;
    }

    public int getPointsPerGame() {
        return pointsPerGame;
    }

    public int getAssistsPerGame() {
        return assistsPerGame;
    }

    public int getReboundsPerGame() {
        return reboundsPerGame;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", pointsPerGame=" + pointsPerGame +
                ", assistsPerGame=" + assistsPerGame +
                ", reboundsPerGame=" + reboundsPerGame +
                '}';
    }
}
