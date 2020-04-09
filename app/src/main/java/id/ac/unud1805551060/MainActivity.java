package id.ac.unud1805551060;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
        private RecyclerView rvCategory;
        private ArrayList<Pizza_Menu> list = new ArrayList<>();
        private String title = "Mode List";
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            rvCategory = findViewById(R.id.recycler_view);
            rvCategory.setHasFixedSize(true);

            list.addAll(DataPizza.getListPizza());
            showRecyclerList();
        }

        private void showRecyclerList() {
            rvCategory.setLayoutManager(new LinearLayoutManager(this));
            PizzaAdapter pizzaAdapter = new PizzaAdapter(this);
            pizzaAdapter.setListPizza(list);
            rvCategory.setAdapter(pizzaAdapter);
        }
    }

