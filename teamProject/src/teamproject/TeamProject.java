/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamproject;

import byui.cit260.teamProject.model.Player;

/**
 *
 * @author Darren
 */
public class TeamProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flintstone");
        
        String playerOneName = playerOne.getName();
        
        System.out.println(playerOne.toString());
        
    }
    
}
