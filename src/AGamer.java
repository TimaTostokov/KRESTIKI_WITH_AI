public abstract class AGamer {
    protected String sign;

    // выстрел в координаты x и y
    abstract boolean shot(int x, int y);

    // проверка победы
    abstract boolean win();
}
