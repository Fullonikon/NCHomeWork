package ru.homework;

public class Main {

        public static void main(String[] args) {


            Ball ball = new Ball(5, 5, 2, 1, 0);
            Container container = new Container(0, 0, 15, 15);

            while (!container.collides(ball))
            {
                ball.move();
            }

            System.out.println(ball + " collides with " + container);

        }
    }


