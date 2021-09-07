package com.seyo.tests;

public class Roomba {

    private int roomSize;
    private int coordinates;
    private int patches;
    private String instructions ;


    public Roomba(int roomSize, int coordinates, String instructions) {
        this.roomSize = roomSize;
        this.coordinates = coordinates;
        this.instructions = instructions;
        this.patches = patches;
    }

    public void setRoomSize(int roomSize) {this.roomSize = roomSize;    }

    public void setCoordinates(int coordinates) {
        this.coordinates = coordinates;
    }

    public void setPatches (int patches) {this.patches = patches;    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }


    public int getRoomSize() {
        return roomSize;
    }

    public int getCoordinates() {
        return coordinates;
    }

    public int getPatches() {
        return patches;
    }

    public String getInstructions() {
        return instructions;
    }

}
