package org.shiftplanner;

import org.springframework.boot.SpringApplication;

public class TestShiftPlannerBeApplication {

    public static void main(String[] args) {
        SpringApplication.from(ShiftPlannerBeApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
