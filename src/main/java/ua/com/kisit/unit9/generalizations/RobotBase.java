package ua.com.kisit.unit9.generalizations;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public abstract class RobotBase {

    private double x;
    private double y;
    private double width;
    private double height;

    public abstract void forward();

}
