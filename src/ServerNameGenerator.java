import java.util.Random;

public class ServerNameGenerator {
            private String adjective;
            private String noun;
            private String serverName;

            public void setAdjective(String[] adjectives){
                int arrayIndex = randomNumGen(adjectives.length);
                this.adjective = adjectives[arrayIndex];
            }

            public void setNoun(String[] nouns){
                int arrayIndex = randomNumGen(nouns.length);
                this.noun = nouns[arrayIndex];
            }

            public void setServerName(String[] adjectives, String[] nouns) {
                setAdjective(adjectives);
                setNoun(nouns);
                this.serverName = this.adjective +"-"+ this.noun;
            }

            public String getServerName(){
                return this.serverName;
            }

    public int randomNumGen(int arrayLength){
        Random num = new Random();
        return num.nextInt(arrayLength);
    }

    public static void main(String[] args) {
        String[] adjectives = {
                "marked",
                "impossible",
                "rhetorical",
                "bitter",
                "concerned",
                "purring",
                "angry",
                "half",
                "lively",
                "righteous"
        };
        String[]nouns = {
                "nose",
                "apparel",
                "silk",
                "cushion",
                "grade",
                "hot",
                "profit",
                "loaf",
                "substance",
                "skirt",
                "pie",
                "wax"
        };

        ServerNameGenerator server = new ServerNameGenerator();
        server.setServerName(adjectives, nouns);
        System.out.println("Here is your server name: ");
        System.out.println(server.getServerName());
    }
}
