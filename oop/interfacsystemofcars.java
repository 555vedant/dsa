package oop;
// //this will implement the system of cars.
// /**
//  * vehical 
//  */

import java.util.Scanner;

// abstract class model{
//      public String name;

//     abstract void brand(String name);
// }
//  interface vehical  {
    
//     void start();
//     void stop();
//     void accelerate(int speed);


    
// }
  
// class Car implements vehical{
//     String modelname;
//     public void OpenTrunk() {
        
//     }

//     @Override
//     public void start () {
        
//         // TODO Auto-generated method stub
//         class whichcar extends model{

//             @Override
//             void brand(String name) {
//                 // TODO Auto-generated method stub
//                 super.name=name;
//                 System.out.println("the model of your car is " +super.name );
//             }
            
//         }
//         System.out.println("engine started ");
       
//     }

//     @Override
//     public void stop() {
//         System.out.println("engine stoped ");
      
//     }

//     @Override
//     public void accelerate(int accspeed) {
        
       
//         int a = Currentspeed(100);
//             accspeed = accspeed+a;
          

       
       
//     }

    
    
// }
//     class Motercycle implements vehical{
//         public void wheellie() {
//             System.out.println("motercycle has a 2 wheels");
            
//         }

//         @Override
//         public void start() {
//             System.out.println("motecycle starts");
            
//         }

//         @Override
//         public void stop() {
//           System.out.println("motecycle stoped");
//         }

//         @Override
//         public void accelerate(int speed) {
//             System.out.println("motercycle is accelarate with a speed of " +speed);
            
//         }
        
//     }
    
  
    




// public class interfacsystemofcars {
    
//     static int Currentspeed(int speed){
       
//        System.out.println("the current speed is " +speed);
//        return speed;
//     }
//     public static void main(String[] args) {
//        Car c1 = new Car();
//        c1.start();
//        c1.stop();
//        c1.accelerate(100);

        
       

//     }

    
// }

// modified code


// Remove the "package oop;" line for simplicity

// Define the abstract class model
abstract class Model {
    public String name;

    abstract void brand(String name);
}

// Define the interface vehical (typo corrected to "vehicle")
interface Vehicle {
    void start();
    void stop();
    void accelerate(int speed);
}

// Implement the Car class
class Car implements Vehicle {
    String modelname;

    // Implementing the start method from the Vehicle interface
    @Override
    public void start() {
        class WhichCar extends Model {
            // Implementing the brand method from the Model abstract class
            @Override
            void brand(String name) {
                super.name = name;
                System.out.println("The model of your car is " + super.name);
            }
        }

        System.out.println("Car engine started");
        // Creating an object of the nested class WhichCar
        WhichCar whichCar = new WhichCar();
        whichCar.brand("XYZ Model");
    }

    // Implementing the stop method from the Vehicle interface
    @Override
    public void stop() {
        System.out.println("Car engine stopped");
    }

    // Implementing the accelerate method from the Vehicle interface
    @Override
    public void accelerate(int accSpeed) {
        int a = currentSpeed(100);
        accSpeed = accSpeed + a;
        System.out.println("Car is accelerating with a speed of " + accSpeed);
    }

     int currentSpeed(int i) {
        // TODO Auto-generated method stub
      return i;
        // throw new UnsupportedOperationException("Unimplemented method 'currentSpeed'");
    }

    // Additional method specific to Car class
    public void openTrunk() {
        System.out.println("Car trunk opened");
    }
}

// Implement the Motorcycle class
class Motorcycle implements Vehicle {
    // Implementing the start method from the Vehicle interface
    @Override
    public void start() {
        System.out.println("Motorcycle engine started");
    }

    // Implementing the stop method from the Vehicle interface
    @Override
    public void stop() {
        System.out.println("Motorcycle engine stopped");
    }

    // Implementing the accelerate method from the Vehicle interface
    @Override
    public void accelerate(int speed) {
        System.out.println("Motorcycle is accelerating with a speed of " + speed);
    }

    // Additional method specific to Motorcycle class
    public void wheelie() {
        System.out.println("Motorcycle doing a wheelie");
    }
}

// Main class
public class interfacsystemofcars {
    
    // Static method to demonstrate current speed
    static int currentSpeed(int speed) {
        System.out.println("The current speed is " + speed);
        return speed;
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("how much speed you wanted");
        Scanner sc =new Scanner(System.in);
        int v = sc.nextInt();
        // Create objects of Car and Motorcycle classes
        Car car1 = new Car();
        Motorcycle motorcycle1 = new Motorcycle();
        int ans =interfacsystemofcars.currentSpeed(v);

        // Demonstrate Car functionalities
        car1.start();
        System.out.println("Current speed of your car is" + ans);
        car1.accelerate(100);
        car1.openTrunk();
        car1.stop();

        System.out.println(); // Add a separator line

        // Demonstrate Motorcycle functionalities
        motorcycle1.start();
        motorcycle1.accelerate(80);
        motorcycle1.wheelie();
        motorcycle1.stop();
       
}
}
