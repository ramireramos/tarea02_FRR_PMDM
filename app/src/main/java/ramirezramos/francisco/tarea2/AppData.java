package ramirezramos.francisco.tarea2;

public class AppData {

    private final String image;
    private final String name;
    private final String description;

    public AppData(String image, String name, String description) {
        this.image = image;
        this.name = name;
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

