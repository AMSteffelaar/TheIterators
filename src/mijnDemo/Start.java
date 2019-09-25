package mijnDemo;

public class Start {

    public static void main(String[] args) {
        MijnStack mijnStack = new MijnStack();
        mijnStack.vulStack();

        System.out.println(mijnStack.cursusStapel.pop());
        System.out.println(mijnStack.cursusStapel.pop());
        System.out.println(mijnStack.cursusStapel.pop());
    }
}
