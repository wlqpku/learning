package xstream.run;

import xstream.IXstream;
import xstream.NewXstream;
import xstream.OldXstream;
import data.Unit;

public class main {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Unit data = new Unit();
        data.setAge(1);
        data.setGender(true);
        data.setId("testId");
        data.setName("wlq");
        data.setDescription(new StringBuilder("descroption"));
        System.out.println(data.toString());

        IXstream xstream1_1_2 = new OldXstream();
        String unit2strWith1_1_2 = xstream1_1_2.toXML(data);
        System.out.println("========show data with oldxstream========");
        System.out.println("unit2strWith1_1_2\t" + unit2strWith1_1_2);

        IXstream xstream1_4_1 = new NewXstream();
        String unit2strWith1_4_1 = xstream1_4_1.toXML(data);
        System.out.println("========show data with newxstream========");
        System.out.println("unit2strWith1_4_1\t" + unit2strWith1_4_1);

        System.out.println("========oldxstream str-> newxstream Unit========");
        Unit newexstreamUnit = xstream1_4_1.fromXML(unit2strWith1_1_2);
        System.out.println(newexstreamUnit.toString());

        System.out.println("========newxstream str ->oldxstream unit========");
        Unit oldsxstreamUnit = xstream1_1_2.fromXML(unit2strWith1_4_1);
        if (oldsxstreamUnit != null) {
            System.out.println(oldsxstreamUnit.toString());
        }

        System.out.println("========newxstream str ->oldxstream unit bug fix========");
        Unit newunit = xstream1_4_1.fromXML(unit2strWith1_4_1);
        if (newunit != null) {
            System.out.println(xstream1_1_2.toXML(newunit));
        }

    }

}
