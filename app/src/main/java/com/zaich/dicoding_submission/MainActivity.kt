package com.zaich.dicoding_submission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private lateinit var rvAim: RecyclerView
    private var list: ArrayList<IemModel> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.setDisplayShowTitleEnabled(false)

        rvAim = findViewById(R.id.rv_Iem)
        rvAim.setHasFixedSize(true)

        list.addAll(IemData.listData)
        showRecyclerList()

    }

    private fun showRecyclerList(){
        val listIemAdapter = iemAdapter(list,this)
        rvAim.layoutManager = LinearLayoutManager(this)
        rvAim.adapter = listIemAdapter
    }

     override fun onCreateOptionsMenu(menu: Menu?):Boolean {
         menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.about){
            val intent = Intent(application,AboutActivity::class.java)
            startActivity(intent)
        }else{
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}