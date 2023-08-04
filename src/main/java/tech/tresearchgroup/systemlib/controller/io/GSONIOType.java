package tech.tresearchgroup.systemlib.controller.io.types;

import com.google.gson.Gson;
import tech.tresearchgroup.systemlib.controller.io.IOTypeInterface;

public class GSONIOType implements IOTypeInterface {
    private final Gson gson = new Gson();
    public Object serialize(Object object) {
        return gson.toJson(object);
    }

    public Object deserialize(Object object, Class theClass) {
        return gson.fromJson((String) object, theClass);
    }
}
