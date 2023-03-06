/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here.
package com.example.player;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import com.example.player.Player;
import com.example.player.PlayerService;



@RestController
public class PlayerController{

    PlayerService playerService = new PlayerService();
    
    @GetMapping("/players")
    public ArrayList<Player> getPlayers(){
        
        return playerService.getPlayers();
    }
    
    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player playerDetails){
        return playerService.addPlayer(playerDetails);
    }

    @GetMapping("/players/{playerId}")
    public Player getPlayerById(@PathVariable("playerId") int playerId){
        return playerService.getPlayerById(playerId);
    }

    @PutMapping("/players/{playerId}")
    public Player updatePlayerInfo(@PathVariable("playerId") int playerId, @RequestBody Player playerDetails){
        return playerService.updatePlayerInfo(playerId, playerDetails);
    }

    @DeleteMapping("/players/{playerId}")
    public void deletePlayerInfo(@PathVariable("playerId") int playerId){
        playerService.deletePlayerInfo(playerId);
    }
}
