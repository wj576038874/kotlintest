package com.example.kotlintest

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.WebView
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import com.google.gson.Gson
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import org.json.JSONArray
import org.json.JSONObject
import java.net.URI
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatDelegate


class MainActivity : AppCompatActivity() {

    private val myVIewModel by viewModels<MyVIewModel>()
    private lateinit var textView: TextView
    private lateinit var button: Button
    private lateinit var webView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.fl_container)
        button = findViewById(R.id.btn)
        webView = findViewById(R.id.WebView)

        webView.settings.javaScriptEnabled = true
        webView.settings.javaScriptCanOpenWindowsAutomatically = true

        webView.loadUrl("file:///android_asset/test.html")


        val str = """/asdsad/dfgdfg/tyu/df/123/test.mp4"""

        val s = str.substringAfterLast("/" ).substringBefore(".mp4")
        Log.e("asd" , s)
        val path = ""
        val data = ""
        button.setOnClickListener {
//            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
//            webView.post {
//                webView.loadUrl("""javascript:post_json("$path","$data")""")
//            }
            startActivity(Intent(this , MainActivity2::class.java))
        }

        myVIewModel.intData.observe(this) {
            textView.text = it
        }

        webView.setWebViewClient(object : WebViewClient() {
            override fun onPageFinished(view: WebView, url: String) {
                //Toast.makeText(BoatsActivity.this, "加载完成", Toast.LENGTH_SHORT).show();
                super.onPageFinished(view, url)
            }
        })

        myVIewModel.asd("11111111")


        val url = Uri.parse("https://janos-test.thejoyrun.com/activity/vip-weipinhui")
//        Log.e("asd", url.path.toString())
//        Log.e("asd", url.scheme.toString())
//        Log.e("asd", url.host.toString())
//        Log.e("asd", url.authority.toString())

//        Log.e("asd", url.queryParameterNames.toString())
        val q = url.query
        Log.e("asd", q.toString())
        if (q == null) {
            Log.e("asd", "${url}?bbb=1")
        } else {
            Log.e("asd", "${url}&bbb=1")
        }

//        supportFragmentManager.beginTransaction()
//            .add(R.id.fl_container , MyFragment())
//            .commit()
//
//        val json = """{"goodsId":"1","iosGoodsId":"Joyrun_monthly_expend","price":"168","type":"7","iOSGoodId":"Joyrun_monthly_expend","redirectURL":"redirectURL"}"""
//
//        val jsonObject = JSONObject(json)
//
//        Log.e("asd" , jsonObject.toString())
//        val s = jsonObject.get("price")
//        Log.e("asd" , s.toString())
//        val price = jsonObject.getString("price").toLong()
//        val type = jsonObject.getString("type").toInt()
////        jsonObject.remove("price")
////        jsonObject.remove("type")
//        jsonObject.put("price" ,price)
//        jsonObject.put("type" , type)
//        Log.e("asd" , jsonObject.toString())


//        val jsonObject = JSONObject()

//        val labels = listOf("11", "22", "33")
//        val users = listOf(User(1, "111"), User(2, "2222"))
//        jsonObject.put("name", JSONArray(Gson().toJson(null)))

//        Log.e("asd", jsonObject.toString())


//        lifecycleScope.launchWhenResumed {
//            flow {
//                (0..10).forEach {
//                    emit(it)
//                    delay(1000)
//                    Log.e("asd", "发射数据${Thread.currentThread().name}$it")
//                }
//            }.flowOn(Dispatchers.IO).onCompletion {
//                Log.e("asd", "完成")
//            }.catch { e ->
//                Log.e("asd", e.message.toString())
//            }.collect {
//                Log.e("asd", "接收数据${Thread.currentThread().name}$it")
//            }
//        }
//
//        GlobalScope.launch {
//            val a = async { 1 + 2 }
//            val b = async { 1 + 3 }
//            val c = a.await() + b.await()
//            Log.e("asd" , c.toString())
//        }
    }

}


//
//data class User(val age: Int, val name: String) {
//    operator fun plus(that: User ) = User(that.age + age, (that.name + name))
//}
//
//
//inline fun <reified T> startActivity(context: Context, block: Intent.() -> Unit) {
//    val intent = Intent(context, T::class.java)
//    block.invoke(intent)
//    block(intent)
//    intent.block()
//    context.startActivity(intent)
//}

