package BehavioralPatterns.Visitor.MyOwnExample;

interface Graphic {
    void print(int i);

    String accept(Visitor visitor);
}
