// Write your code here
package com.example.player;
import java.util.*;
import com.example.player.Player;



public interface PlayerRepository{
    ArrayList<Player>getPlayers();
    Player addPlayer(Player playerDetails);
    Player getPlayerById(int playerId);

    Player updatePlayerInfo(int playerId, Player playerDetails);

    void deletePlayerInfo(int playerId);
}
