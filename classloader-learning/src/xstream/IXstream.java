package xstream;

import data.Unit;

public interface IXstream {

    public String toXML(Object obj);

    public Unit fromXML(String str);
}
