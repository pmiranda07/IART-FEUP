package graph;

import elements.People;
import elements.Vehicle;

import java.util.ArrayList;

public class Point {
    private String name;
    private ArrayList<Route> routes = new ArrayList<Route>();
    private boolean has_vehicle = false;
    private boolean has_people = false;
    private Vehicle vehicle;
    private People people;

    public Point(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Route> getRoutes() {
        return routes;
    }

    public boolean has_vehicle() {
        return has_vehicle;
    }

    public void addRoute(Route route){
        this.routes.add(route);
    }

    public void addVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        has_vehicle = true;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void addPeople(People people){
        this.people = people;
        has_people = true;
    }

    public People getPeople() {
        return people;
    }

    public boolean has_people(){
        return has_people;
    }
}