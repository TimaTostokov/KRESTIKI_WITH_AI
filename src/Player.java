public class Player extends AGamer {

    MainGameField gameField;

    int isShotReady = 1;

    public Player(String sign) {
        this.sign = sign;
    }

    @Override
    boolean shot(int x, int y) {
        gameField = MainGameField.getInstance();
        if (!gameField.isCellBusy(x, y)) {
            gameField.cell[x][y] = sign;
            return true;
        }
        return false;
    }

    // Проверка победы
    boolean win() {
        gameField = MainGameField.getInstance();
        return gameField.checkWin(this.sign);
    }

}