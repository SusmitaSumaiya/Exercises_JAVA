public class Main {

    public class Football {
        public String Team;
        public String Field;
        private String Gametime;
        private String Referee;
    
        public Football(String team, String field, String gametime, String referee) {
            this.Team = team;
            this.Field = field;
            this.Gametime = gametime;
            this.Referee = referee;
        }
    
        public static void main(String[] args) {
            Football gamePlan = new Football("Team A", "Field X", "12:00 PM", "John Doe");
            System.out.println("Team: " + gamePlan.Team);
            System.out.println("Field: " + gamePlan.Field);
            // System.out.println("Gametime: " + gamePlan.Gametime); // This will give compile-time error since Gametime is private
            // System.out.println("Referee: " + gamePlan.Referee); // This will give compile-time error since Referee is private
        }
    }
    
}