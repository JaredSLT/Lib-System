package tech.tresearchgroup.systemlib.controller.io;

public interface GenericIOInterface {
    Object serialize(Object object);
    Object deserialize(Object object, Class theClass);
}
