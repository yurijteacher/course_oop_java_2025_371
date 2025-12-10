package ua.com.kisit.unit9.interface_realization;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Robot implements RobotBase {

    private double x;
    private double y;

    @Override
    public void forward() {
        System.out.println("DANCE");
    }
}
