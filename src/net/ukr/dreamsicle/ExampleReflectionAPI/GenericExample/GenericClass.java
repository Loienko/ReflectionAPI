package net.ukr.dreamsicle.ExampleReflectionAPI.GenericExample;

/**
 * Created by Yura on 02.05.2017.
 */
public class GenericClass<T>  {

    private T field;

    public GenericClass(T field) {
        super();
        this.field = field;
    }
    public T getField() {
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return "GenericClass [field=" + field + "]";
    }

    public <V extends Number> V plus(V a, V b) {
        Number c;
        c = a.doubleValue() + b.doubleValue();
        return (V) c;
    }
}
