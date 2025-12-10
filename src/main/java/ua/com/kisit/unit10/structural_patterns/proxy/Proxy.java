package ua.com.kisit.unit10.structural_patterns.proxy;

public class Proxy implements Image {

    String file;

    public Proxy(String file) {
        this.file = file;
    }

    MyImage myImage;

    @Override
    public void display() {
        if(myImage == null) {
            myImage = new MyImage(file);
        }
        copyFile();
    }

    private void copyFile() {
        System.out.println("Copying file " + file);
    }
}
