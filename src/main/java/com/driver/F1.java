package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        // Use arbitrary values for parameters which are not mentioned
        // Car(String name, int seats, int wheels, int maxSpeed, boolean isManual, String type, int currentSpeed)
        super(name, 2, 4, 300, isManual, "F1", 0);
    }

    public void accelerate(int rate) {
        int newSpeed = this.getCurrentSpeed() + rate; // Calculate new speed
        newSpeed = Math.max(newSpeed, 0);
        //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1 speed 1-50: gear 1 speed 51-100: gear 2 speed
         * 101-150: gear 3 speed 151-200: gear 4 speed 201-250: gear 5 speed
         * more than 250: gear 6
         */

        if (newSpeed == 0) {
            this.stop();
            this.changeGear(1);
            //Stop the car, set gear as 1
        }else if (newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
            if (newSpeed <= 50) {
                this.changeGear(1);
            } else if (newSpeed <= 100) {
                this.changeGear(2);
            } else if (newSpeed <= 150) {
                this.changeGear(3);
            } else if (newSpeed <= 200) {
                this.changeGear(4);
            } else if (newSpeed <= 250) {
                this.changeGear(5);
            } else {
                this.changeGear(6);
            }
        }
    }
}
