package ua.com.kisit.unit9.generalizations;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Robot extends RobotBase{

    private Long id;
    private String model;


    public Robot(double x, double y, double width, double height, Long id, String model) {
        super(x, y, width, height);
        this.id = id;
        this.model = model;
    }

    public Robot(Long id, String model) {
        this.id = id;
        this.model = model;
    }

    @Override
    public void forward() {
        System.out.println("dance");
    }
}
