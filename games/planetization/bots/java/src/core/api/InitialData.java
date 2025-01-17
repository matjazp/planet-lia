package core.api;

import core.MatchDetails;

import java.util.ArrayList;

public class InitialData {
    public int __uid;
    public MatchDetails __matchDetails;

    public int mapWidth;
    public int mapHeight;
    public float unitSize;
    public int planetDiameter;
    public float unitSpeed;
    public float unitRotationSpeed;
    public int numberOfWorkersOnStart;
    public int unitResourcesCost;
    public int resourceGenerationSpeed;
    public int maxActiveWorkersPerPlanet;
    public float maxNumberOfUnitsPerTeam;
    public float maxMatchDuration;
    public float workerHealth;
    public float workerAttack;
    public float warriorHealth;
    public float warriorAttack;
    public float damageReductionRatioOnDefence;

    public ArrayList<PlanetData> yourPlanets;
    public ArrayList<PlanetData> freePlanets;
    public ArrayList<PlanetData> opponentPlanets;
    public ArrayList<UnitData> yourWorkers;
    public ArrayList<UnitData> opponentWorkers;
    public ArrayList<UnitData> yourWarriors;
    public ArrayList<UnitData> opponentWarriors;
}
