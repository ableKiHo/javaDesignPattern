package CH4.CREATE_PATTERN.Proxy.caching;

public class PorxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public PorxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
