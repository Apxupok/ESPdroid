package com.example.espdroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.loopj.android.http.AsyncHttpClient
import com.loopj.android.http.AsyncHttpResponseHandler
import cz.msebera.android.httpclient.Header


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val client = AsyncHttpClient()
        client.get("http://192.168.1.217/led1on", object : AsyncHttpResponseHandler() {
            override fun onStart() {
                // called before request is started
            }

            override fun onSuccess(statusCode: Int, headers: Array<Header?>?, response: ByteArray?) {
                // called when response HTTP status is "200 OK"
            }

            override fun onFailure(
                statusCode: Int,
                headers: Array<Header?>?,
                errorResponse: ByteArray?,
                e: Throwable?
            ) {
                // called when response HTTP status is "4XX" (eg. 401, 403, 404)
            }

            override fun onRetry(retryNo: Int) {
                // called when request is retried
            }
        })


    }
}