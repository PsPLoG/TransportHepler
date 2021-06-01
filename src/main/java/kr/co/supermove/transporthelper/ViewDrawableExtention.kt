package kr.co.supermove.transporthelper

import android.graphics.drawable.GradientDrawable
import android.view.View

object ViewDrawableExtention {
    fun View.tintStroke(color: Int) {
        this.resources.displayMetrics.density.let {

        }
        this.background?.constantState?.let {
            val origin = (it.newDrawable().mutate()) as? GradientDrawable
            origin?.setStroke(4, color)
            this.background = origin
        }
    }

    fun View.tintStroke(color: Int, widthDp: Int) {
        this.resources.displayMetrics.density.let { scale ->
            this.background?.constantState?.let {
                val origin = (it.newDrawable().mutate()) as? GradientDrawable
                origin?.setStroke((widthDp * scale).toInt(), color)
                this.background = origin
            }
        }

    }

    fun View.tintSolid(color: Int) {
        this.background?.constantState?.let {
            val origin = (it.newDrawable().mutate()) as GradientDrawable
            origin.setColor(color)
            this.background = origin
        }
    }
}