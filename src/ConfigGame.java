public class ConfigGame {

    public  int gameLv;
    public int numPlayers;

    public int getGameLv() {
        return gameLv;
    }

    public void setGameLv(int gameLv) {
        this.gameLv = gameLv;
    }

    public int getNumPlayers() {
        return numPlayers;
    }

    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    public ConfigGame(int gameLv, int numPlayers) {
        this.gameLv = gameLv;
        this.numPlayers = numPlayers;
    }

    public void configPlayers(){

    }

}
