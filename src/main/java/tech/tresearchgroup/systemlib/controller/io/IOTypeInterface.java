package tech.tresearchgroup.systemlib.controller.io;

public interface IOTypeInterface {
    Object serialize(Object object);
    Object deserialize(Object object, Class theClass);
}
