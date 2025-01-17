package com.planet_lia.match_generator.libs;

/**
 * Match details data sent to each bot
 */
public class MatchDetails {
    BotDetails[] botsDetails;

    // Index of the bot in botsDetails to which
    // this instance of MatchDetails was sent to
    int yourBotIndex;

    public MatchDetails(BotDetails[] botsDetails, int yourBotIndex) {
        this.botsDetails = botsDetails;
        this.yourBotIndex = yourBotIndex;
    }
}
