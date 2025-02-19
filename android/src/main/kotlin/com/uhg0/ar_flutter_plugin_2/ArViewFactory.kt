package com.uhg0.ar_flutter_plugin_2

import android.app.Activity
import android.content.Context
import io.flutter.plugin.common.BinaryMessenger
import io.flutter.plugin.common.StandardMessageCodec
import io.flutter.plugin.platform.PlatformView
import io.flutter.plugin.platform.PlatformViewFactory
import androidx.lifecycle.Lifecycle
import android.content.ContextWrapper
import android.view.SurfaceHolder
import androidx.lifecycle.LifecycleOwner

class ArViewFactory(
    private val messenger: BinaryMessenger,
    private val activity: Activity,
    private val lifecycle: Lifecycle
) : PlatformViewFactory(StandardMessageCodec.INSTANCE) {

    override fun create(context: Context, viewId: Int, args: Any?): PlatformView {
        val wrappedContext = ContextWrapper(context)
        return ArView(wrappedContext, activity, lifecycle, messenger, viewId)
    }
}