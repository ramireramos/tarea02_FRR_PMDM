package ramirezramos.francisco.tarea2;

public class AppData {

    private final String image;
    private final String character;
    public final String description;

    public AppData(String image, String character, String description) {
        this.image = image;
        this.character = character;
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public String getName() {
        return character;
    }

    public String getDescription() {
        return description;
    }
}

