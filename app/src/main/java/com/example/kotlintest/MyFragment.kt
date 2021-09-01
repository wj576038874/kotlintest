package com.example.kotlintest

import android.Manifest
import android.content.ComponentName
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import kotlin.math.log

/**
 * author: wenjie
 * date: 2021-08-13 10:52
 * descption:
 */
class MyFragment : Fragment() {

    private lateinit var btn: Button

    private val myVIewModel: MyVIewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("asd", "onCreate")
        myVIewModel.asd("11111")
        myVIewModel.intData.observe(this) {
            Log.e("asd", it.toString())
            btn.text = it.toString()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e("asd", "onCreateView")
        return inflater.inflate(R.layout.my_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn = view.findViewById(R.id.btn)
        btn.setOnClickListener {
            requestPermissions(arrayOf("co.runner.app.activity.dev.permission.DeveloperActivity") , 1)
//            startActivity(Intent().also {
////                it.component = ComponentName("co.runner.app","co.runner.app.activity.dev.DeveloperActivity")
//                it.action = "co.runner.app.intent.action.SHORTCUT"
////                it.addCategory(Intent.CATEGORY_DEFAULT)
//                it.flags = Intent.FLAG_ACTIVITY_NEW_TASK
////                it.data = Uri.parse("rong://co.runner.app/conversationsetting")
//            })
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        startActivity(Intent().also {
//                it.component = ComponentName("co.runner.app","co.runner.app.activity.dev.DeveloperActivity")
            it.action = "co.runner.app.intent.action.SHORTCUT"
//                it.addCategory(Intent.CATEGORY_DEFAULT)
            it.flags = Intent.FLAG_ACTIVITY_NEW_TASK
//                it.data = Uri.parse("rong://co.runner.app/conversationsetting")
        })
    }

}