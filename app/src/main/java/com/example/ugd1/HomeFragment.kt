package com.example.ugd1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ugd1.entity.Pelanggan
import com.example.ugd1.entity.Workout

class HomeFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home,container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val layoutManager = LinearLayoutManager(context)
        val adapter: RVWorkout = RVWorkout(Workout.userWorkout)

        //Menghubungkan rvMahasiswa dengan recycler view yang ada pada layout
        val rvWorkout : RecyclerView = view.findViewById(R.id.rv_workout)

        //Set layout manager dari recycler view
        rvWorkout.layoutManager = layoutManager

        //tidak mengubah size recycler view jika terdapat item ditambahkan atau dikurangkan
        rvWorkout.setHasFixedSize(true)

        //Set Adapter dari recycler view.
        rvWorkout.adapter = adapter
    }
}