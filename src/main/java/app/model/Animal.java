package app.model;

public abstract class Animal {
    @Override
    public String toString(){
        return this.getClass().getSimpleName();
    }
}
