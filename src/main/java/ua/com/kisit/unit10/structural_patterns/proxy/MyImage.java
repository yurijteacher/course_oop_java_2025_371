package ua.com.kisit.unit10.structural_patterns.proxy;

public class MyImage implements Image{

    String file;

    public MyImage(String file) {
        this.file = file;
        loadFile();
    }

    private void loadFile() {
        System.out.println("Loading file: " + file);
    }

    @Override
    public void display() {
        System.out.println("Open " + file);
    }
}
