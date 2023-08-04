package tech.tresearchgroup.systemlib.controller.io;

import tech.tresearchgroup.systemlib.controller.io.types.ActiveJIOType;
import tech.tresearchgroup.systemlib.controller.io.types.CSVIOType;
import tech.tresearchgroup.systemlib.controller.io.types.GSONIOType;
import tech.tresearchgroup.systemlib.controller.io.types.TextIOType;
import tech.tresearchgroup.systemlib.controller.io.types.XMLIOType;
import tech.tresearchgroup.systemlib.model.io.IOTypeEnum;

public class GenericIO implements GenericIOInterface {
    private final IOTypeInterface ioType;

    public GenericIO(IOTypeEnum ioTypeEnum) {
        if(ioTypeEnum.equals(IOTypeEnum.ACTIVE_J)) {
            this.ioType = new ActiveJIOType();
        } else if(ioTypeEnum.equals(IOTypeEnum.CSV)) {
            this.ioType = new CSVIOType();
        } else if(ioTypeEnum.equals(IOTypeEnum.JSON)) {
            this.ioType = new TextIOType();
        } else if(ioTypeEnum.equals(IOTypeEnum.XML)) {
            this.ioType = new XMLIOType();
        } else {
            this.ioType = new GSONIOType();
        }
    }

    public Object serialize(Object object) {
        return ioType.serialize(object);
    }

    public Object deserialize(Object object, Class theClass) {
        return ioType.deserialize(object, theClass);
    }
}
