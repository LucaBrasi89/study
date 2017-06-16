package UI;

import BL.Flight;
import DL.FetchFlights;

import javax.swing.*;

/**
 * Created by andrew on 16.06.17.
 */


public class ArrivalInformationBoard extends JTable {

    String[] columnNames = {"Flight",
            "Destination",
            "Depature",
            "Status"};


    Flight[][] data = FetchFlights.getArrivals();

    public ArrivalInformationBoard() {

        final JTable table = new JTable(data, columnNames);


    }
}
