/*______________________________________________________________________________________________________________________
Author: [Md Nasimuzzaman]
Created On: [December 27, 2024]
GitHub: [https://github.com/dev-nasimuzzaman]

Description:
[This program defines a car class in the package com.example.car. The class has two private instance variables: make and
model, which represent the make and model of a car. A constructor is provided to initialize these variables when
creating a car object. The displayinfo method is used to print the car's make and model to the console.]

Modification History:
Date           Author            Description
------------   ---------------   ---------------------------------------------------------------------------------------
[12/27/2024]   Md Nasimuzzaman   Initial version of the code.
________________________________________________________________________________________________________________________
*/
package com.example.car;

public class car {
    private String make;
    private String model;

    public car(String make, String model){
        this.make = make;
        this.model = model;
    }

    public void displayinfo(){
        System.out.println("Make : " + make);
        System.out.println("Model : " + model);
    }
}
