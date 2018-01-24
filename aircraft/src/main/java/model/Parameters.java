package model;

/**
 * change doc
 Create console application “Airline”:
 Define aircraft class hierarchy. There should be 3 levels of the hierarchy.
 Create an airline company that stores airplanes.
 Calculate total capacity and carrying capacity of all the aircraft in the airline.
 Sort the aircraft by flight range (from smaller to larger) and display it on screen.
 Find aircraft corresponding to the specified range of fuel consumption parameters (liters per hour).
 TODO 6. Console menu should be minimal:
 • Calculate the total capacity and carrying capacity of all the aircraft in the airline.
 • Display the list of aircraft of the company sorted by flight range.
 • Find airplanes corresponding to a given range of fuel consumption parameters.

 Application must meet the requirements:
 1. Stick to javacodeconvention.
 2. Use OOP capabilities: classes, inheritance, polymorphism, encapsulation, interfaces, etc.
 3. Each class must have a meaningful name and informative composition.
 4. Inheritance should only be applied when it makes sense.
 5. Classes must be correctly decomposed into packets.

 Requirements for task design:
 1. Source code must be stored on GitHub, the applicant must provide read access to the repository.
 2. The code should be compiled by Java 8.
 3. The project should be assembled with maven install command or gradle build (optionally).
 4. Repository must contain root file README.MD with instructions for launching the application and any other necessary documentation for the application (in English).
 5. Running the application should not require an application server or installation of any software except for Java and maven / gradle.
 6. Data can be stored in any format.  Files can be (but not necessarily) used to store aircraft.
 7. Opensource libraries and frameworks are allowed.

 What is estimated:
 • functional correctness according to the technical requirements,
 • application usability,
 • readability, maintainability and compliance of the code with OOP and SOLID principles,
 • documentation for the application and  the code,
 • unit tests availability,
 • any non-standard technical solutions,
 • any additional features not specified in the technical requirements, but making the application more functional or convenient,
 • task execution time.
 */
class Parameters {
    private static final String DEF_AIRCRAFT_NAME = "Aircraft";
    private static final String DEF_COMPANY_NAME = "Company";

    public static String getDefAircraftName() {return DEF_AIRCRAFT_NAME;}
    public static String getDefCompanyName() {return DEF_COMPANY_NAME;}
}