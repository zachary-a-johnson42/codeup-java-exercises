package movies;

public class Movie {
    private String name;
    private String category;

    Movie(String movieName, String movieCategory){
        name = movieName;
        category = movieCategory;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
       return this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public String setCategory(String category) {
        return this.category = category;
    }
}