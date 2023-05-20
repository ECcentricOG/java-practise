class Football{

        static String ball = "At Center";
        String playerName = "Messi";
        int jerNo = 10;

        void matchInfo(){

                System.out.println("Ball at : "+ball);
                System.out.println("Player Name : "+playerName);
                System.out.println("Jer No : "+jerNo);
        }
}

class TV{

        public static void main(String [] args){

                Football fc1 = new Football();
                Football fc2 = new Football();

                fc1.matchInfo();
                fc2.matchInfo();

                System.out.println("---------------------------------------------");

                fc2.ball = "In Goal Post";
                fc2.playerName = "Iniesta";
                fc2.jerNo = 8;

                fc1.matchInfo();
                fc2.matchInfo();
        }
}

