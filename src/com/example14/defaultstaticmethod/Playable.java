package com.example14.defaultstaticmethod;

public interface Playable {
    void sing(String songName);
    default void playGame(String gameName) {
        System.out.println(gameName);
    }
}
