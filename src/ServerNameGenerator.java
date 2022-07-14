public class ServerNameGenerator {
    //Setting up arrays to grab from to generate server names.

    public static String[] adjectives = {
            "adorable", "bloody", "bored", "brainy", "brave",
            "calm", "clean", "clumsy", "defiant", "depressed"
    };

    public static String[] nouns = {
            "actor", "animal", "answer", "boat", "box",
            "chapter", "chicken", "coffee", "diamond", "dirt"
    };

    //method to grab a random index

    public static int randomIndex(String[] array){
        return (int)(Math.random() * array.length);
    }

    public static void main(String[] args){

        String serverAdjective = adjectives[randomIndex(adjectives)];
        String serverNoun = nouns[randomIndex(nouns)];
        System.out.printf("Your server name is %s-%s%n",serverAdjective,serverNoun);
    }

}
