package DL;

import BL.Flight;
import BL.Passenger;
import BL.TypeOfFlight;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrew on 05.07.17.
 */
public class FetchPassengers {

    private CRUD crud;
    private List<Passenger> passengerList;

    public FetchPassengers() {

        this.crud = new CRUD();

        try {
            crud.createConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public List<Passenger> getAllPassengers() {

        passengerList = new ArrayList<Passenger>();

        try {
            ResultSet rs = crud.doQuery("SELECT * FROM `passengers`");
            while (rs.next()) {

                passengerList.add(new Passenger(rs.getString("flightNumber"),
                        rs.getString("firstName"),
                        rs.getString("lastName"),
                        rs.getString("nationality"),
                        rs.getString("passport"),
                        rs.getString("birthday"),
                        rs.getString("gender"),
                        rs.getString("classOfFlight")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return passengerList;

    }

    public List<Passenger> getFilteredPassengers(String name, String gender, String passport) {

        List<Passenger> filtredPassList = new ArrayList<Passenger>();
        for (Passenger passenger : passengerList) {


            if (passenger.getFullName().equals(name) && gender == null && passport == null) {
                filtredPassList.add(passenger);

            } else if (passenger.getFullName().equals(name) && passenger.getGender().equals(gender) && passport == null) {
                filtredPassList.add(passenger);

            } else if (passenger.getFullName().equals(name) && passenger.getGender().equals(gender) && passenger.getPassport().equals(passport)) {
                filtredPassList.add(passenger);
            }


            if (passenger == null && gender == null && passport == null) {
                filtredPassList.add(passenger);

            } else if (passenger.getFullName().equals(name) && passenger.getGender().equals(gender) && passport == null) {
                filtredPassList.add(passenger);

            } else if (passenger.getFullName().equals(name) && passenger.getGender().equals(gender) && passenger.getPassport().equals(passport)) {
                filtredPassList.add(passenger);
            }

        }

        return filtredPassList;

    }


    @Override
    protected void finalize() throws Throwable {

        crud.closeConnection();
        super.finalize();
    }


}
