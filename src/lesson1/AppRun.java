package lesson1;

import lesson1.Actions.TakeBarrier;
import lesson1.model.*;

/*
    1.Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
        Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).

    2.Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять
        соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).

    3.Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.

    4* У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
        Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
 */
public class AppRun {
    public static void main(String[] args) {
        Barrier[] barriers = new Barrier[3];
        Object[] participants = new Object[3];

        barriers[0] = new Wall(0.5f);
        barriers[1] = new Treadmill(2000);
        barriers[2] = new Wall(1f);

        participants[0] = new Human("Alexandr", 1500, 1f);
        participants[1] = new Cat("Barsik", 2000, 1.5f);
        participants[2] = new Robot("Joe", 5000, 0.5f);

        for (Object participant : participants)
            TakeBarrier.takeBarriers(participant, barriers);
    }
}
