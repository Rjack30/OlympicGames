package main.java.com.solvd.olympicgames.Classes;

import java.util.Random;

public class BaseBall {

    abstract public class Baseball {
        public void main(String[] arga){

        }
        private int pstrike;

        private int pball;

        private int count = 0;

        private int runnerAdvance = 0;

        private int outs = 0;

        private int runsScored = 0;

        private int runner = 0;

        private int score = 0;

        private int single = 0;

        private int doubleD = 0;

        private int triple = 0;


        {

        }

        public void loopUntilThree()

        {

            while (outs < 3)

            {

                Random randThrows = new Random();

                int mix;

                mix = randThrows.nextInt(3);

                switch (mix) {

                    case 0:

                        strike();


                        break;

                    case 1:

                        ball();

                        break;

                    case 2:

                        Hits();

                        break;

                }

            }

        }


        public void Hits()

        {

            Random randHits = new Random();

            int hits;

            hits = randHits.nextInt(7);

            switch (hits)

            {

                case 0:

                    System.out.println("Single");

                    count++;

                    countReset();

                    single = runner++;

                    break;

                case 1:

                    System.out.println("Double");

                    countReset();

                    count++;

                    runner = runner + 2;

                    break;

                case 2:

                    System.out.println("Triple");

                    countReset();

                    count++;

                    runner = runner + 3;

                    break;

                case 3:

                    System.out.println("Home Run!");

                    countReset();

                    count++;

                    runner = 0;

                    runsScored++;

                    break;

                case 4:

                    System.out.println("pop-up out");

                    outs++;

                    count++;

                    countReset();

                    break;

                case 5:

                    System.out.println("ground out");

                    outs++;

                    count++;

                    countReset();

                    break;

                case 6:

                    System.out.println("double play");

                    if (outs == 2)

                    {

                        outs++;

                    }

                    else

                    {

                        outs++;

                        outs++;

                    }

                    count++;

                    countReset();

                    break;

            }

            if (outs == 3)

            {

                System.out.println("3 outs [Switch sides]" + "\n");

                System.exit(0);

                count = 0;

            }

        }

        public void countReset()

        {

            pstrike = 0;

            pball = 0;

        }

        public void strike()

        {

            if (pstrike < 3)

            {

                System.out.println("Strike");

                pstrike++;

                count++;

            }

            if (pstrike == 3)

            {

                System.out.println("Strikeout!");


                countReset();

                outs++;

                if (outs == 3)

                {

                    System.out.println("3 outs [Switch sides]" + "\n");

                    System.exit(0);

                    count = 0;

                }

            }

        }

        public void ball()

        {

            if (pball < 4)

            {

                System.out.println("Ball");

                pball++;

                count++;

            }

            if (pball == 4)

            {

                System.out.println("Walk!");

                runnerAdvance++;

                countReset();

            }

            else if (outs == 3)

            {

                System.out.println("3 outs [Switch sides]" + "\n");

                System.exit(0);

                count = 0;

            }

        }

        public String displayPitches()

        {

            return "Ball count: " + pball + "\n" + "Strike count: " + pstrike + "\n" + "Outs: " + outs + "\n"

                    + "Pitch Count: " + count + "\n" + "Runner on " + runner + "\n";

        }

    }









}
