public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper); //Задача 1

        dog = dog + 4;
        cat = cat + 4;
        paper = paper +4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);//Задача 2

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);//Задача 3

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);//Задание 4

        var frog = 3.5;
        System.out.println(friend);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);//Задание 5

        var oneBoxer = 78.2;
        var twoBoxer = 82.7;
        var totalWeight = oneBoxer + twoBoxer;
        System.out.println("Общий вес двух бойцов " + totalWeight + " кг");
        var differenceWeight = twoBoxer - oneBoxer;
        System.out.println("Разница между весами бойцов " + differenceWeight + " кг"); // Задание 6

        var oneDifferenceWeight = twoBoxer - oneBoxer;
        System.out.println("Разница весов между спортсменами " + oneDifferenceWeight + " кг");
        var twoDifferenceWeight = twoBoxer % oneBoxer;
        System.out.println("Разница весов между спортсменами " + twoDifferenceWeight + " кг"); //Задание 7

        var workTime = 640;
        var normTime = 8;
        var workers = workTime / normTime;
        System.out.println("Всего работников в компании - " + workers + " человек");
        workers = workers + 94;
        var workHours = normTime * workers;
        System.out.println("Если в компании работает " + workers + " человек, то всего " + workHours + " часов работы может быть проделанно между сотрудниками");
    }
}