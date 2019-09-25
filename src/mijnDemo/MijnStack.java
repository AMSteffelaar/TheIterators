package mijnDemo;

import java.util.Stack;

public class MijnStack {

    String cursusBeginner = "indoor naklimmen";
    String cursusGevorderde = "outdoor voorklimmen";
    String cursusExpert = "adventure climbing" ;

    Stack<String> cursusStapel = new Stack<>();

    public MijnStack() {
        super();
    }

     public Stack<String> vulStack() {
        cursusStapel.push(cursusBeginner);
        cursusStapel.push(cursusGevorderde);
        cursusStapel.push(cursusExpert);
     return cursusStapel ;
     }

}
