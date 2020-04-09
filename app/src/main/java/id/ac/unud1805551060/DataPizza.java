package id.ac.unud1805551060;

import java.util.ArrayList;

public class DataPizza {
    public static String[][] data = new String[][]{
            {"Meat Lovers", "Irisan sosis sapi, daging sapi cincang, burger sapi, sosis ayam.", "https://static.phdvasia.com/sg1/menu/single/desktop_thumbnail_7d0052b8-8dab-4883-8648-10b0df87f912.png"},
            {"Deluxe Cheese", "100% keju mozzarella dengan saus pizza kaya rasa.","https://static.phdvasia.com/sg1/menu/single/desktop_thumbnail_fb86e007-494b-43a2-8765-ec9fc2a4ab03.png"},
            {"Chicken Lovers", "Irisan sosis ayam, potongan daging ayam, dan daging ayam asap.","https://static.phdvasia.com/sg1/menu/single/desktop_thumbnail_6f4ab33f-8a5c-40ee-b1a9-351ef9fda6bd.png"},
            {"Cheeseburger Pizza", "Daging sapi cincang, daging sapi dan daging ayam asli yang berbumbu, keju cheddar, mozzarella, bawang bombay, tomat, saus tomat, mustard dan mayonnaise.", "https://static.phdvasia.com/sg1/menu/single/desktop_thumbnail_d4fc0242-1418-4ebd-aed5-243d52bff29e.png"},
            {"Black Meat Monsta","Sosis Frankfurter, Daging Asap, Daging Sapi Cincang, Jamur, Keju Mozzarella, Saus Keju, Beef Bits","https://static.phdvasia.com/sg1/menu/single/desktop_thumbnail_f0e05e3a-d005-4dbd-b51d-759c510682eb.png"},
            {"Pepperoni","Pizza dengan topping pepperoni sapi, saus tomat, dan keju mozzarella.","https://static.phdvasia.com/sg1/menu/single/desktop_thumbnail_53f7db05-5686-40d7-9433-4262109980ed.png"},
            {"Tuna Melt","Irisan daging ikan tuna, butiran jagung, saus mayonnaise.","https://static.phdvasia.com/sg1/menu/single/desktop_thumbnail_9f78d3d7-cda3-4433-b5e1-7b6f6fb0e9b7.png"},
            {"Splitza","Dua topping pizza pilihan dalam satu loyang pizza.","https://static.phdvasia.com/sg1/menu/single/desktop_thumbnail_9ac629cd-e950-4ca9-8b60-b704a624d740.png"},
            {"Frankfurter BBQ","Sosis sapi Frankfurter, potongan daging sapi, honey BBQ, mustard, keju Mozarella.","https://static.phdvasia.com/sg1/menu/single/desktop_thumbnail_d320853b-2be1-4c94-a361-a384dad09119.png"},
            {"American Favourite","Pepperoni sapi, daging sapi cincang, jamur.","https://static.phdvasia.com/sg1/menu/single/desktop_thumbnail_6e0ead56-64e9-4b8b-afa5-e1d95d84bf44.pngD"},
    };
    public static ArrayList<Pizza_Menu> getListPizza() {
        Pizza_Menu pizza = null;
        ArrayList<Pizza_Menu> list = new ArrayList<>();
        for(int i=0; i<data.length; i++) {
            pizza = new Pizza_Menu();
            pizza.setName(data[i][0]);
            pizza.setDesc(data[i][1]);
            pizza.setPhoto(data[i][2]);

            list.add(pizza);
        }
        return list;
    }
}
