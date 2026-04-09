package co.edu.uptc.cruds.model;
import co.edu.uptc.cruds.data.*;

import javax.swing.JOptionPane;

import co.edu.uptc.cruds.data.CrudVideoGame;
import co.edu.uptc.cruds.data.CrudIndieGame;
import co.edu.uptc.cruds.data.CrudPlayer;
import co.edu.uptc.cruds.data.CrudSoundtrack;

public class IndieGame {
    public static void main(String[] args) {
        CrudVideoGame  videoGameRepository  = new CrudVideoGame();
        CrudIndieGame  indieGameRepository  = new CrudIndieGame();
        CrudPlayer     playerRepository     = new CrudPlayer();
        CrudSoundtrack soundtrackRepository = new CrudSoundtrack();

        boolean flag = true;
        while (flag) {
            int option = Integer.parseInt(JOptionPane.showInputDialog(
                    null,
                    "[1] CRUD VideoGame\n" +
                    "[2] CRUD IndieGame\n" +
                    "[3] CRUD Player\n" +
                    "[4] CRUD Soundtrack\n" +
                    "[5] Exit",
                    "MAIN MENU",
                    JOptionPane.INFORMATION_MESSAGE));

            switch (option) {
                case 1:
                    videoGameRepository.menu();
                    break;
                case 2:
                    indieGameRepository.menu();
                    break;
                case 3:
                    playerRepository.menu();
                    break;
                case 4:
                    soundtrackRepository.menu();
                    break;
                case 5:
                    flag = false;
                    break;
            }
        }
    }
}
